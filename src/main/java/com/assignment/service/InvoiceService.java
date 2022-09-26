package com.assignment.service;

import com.assignment.entity.Invoice;
import reactor.core.publisher.Flux;

public interface InvoiceService {
    Flux<Invoice> findAll() throws InterruptedException;

//    Flux<String> find();
}
