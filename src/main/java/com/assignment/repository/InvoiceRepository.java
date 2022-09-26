package com.assignment.repository;

import com.assignment.entity.Invoice;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends ReactiveCrudRepository<Invoice, String> {
}
