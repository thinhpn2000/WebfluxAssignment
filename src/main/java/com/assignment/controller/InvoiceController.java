package com.assignment.controller;

import com.assignment.entity.Invoice;
import com.assignment.service.InvoiceService;
import com.assignment.utils.ApiConstant;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(ApiConstant.API_INVOICE)
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PreAuthorize("hasRole('EMPLOYEE')")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Invoice> getAllInvoice() throws InterruptedException {
        return invoiceService.findAll();
    }

//    @GetMapping(value = "/2", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Flux<String> get(){
//        return invoiceService.find();
//    }
}
