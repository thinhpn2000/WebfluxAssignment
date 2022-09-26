package com.assignment.controller;

import com.assignment.entity.Invoice;
import com.assignment.service.InvoiceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class InvoiceControllerTest {
    @InjectMocks
    private InvoiceController invoiceController;
    @Mock
    private InvoiceService invoiceServiceMock;

    Invoice invoice = new Invoice("id_test",
            "employee_id_test",
            "customer_id_test",
            "detail_product_test",
            12345,
            "status_test");

    @BeforeEach
    void setUp() throws InterruptedException {
        BDDMockito.when(invoiceServiceMock.findAll())
                .thenReturn(Flux.just(invoice));
    }

    @Test
    void getAllInvoice() throws InterruptedException {
        StepVerifier.create(invoiceController.getAllInvoice())
                .expectSubscription()
                .expectNext(invoice)
                .verifyComplete();
    }
}