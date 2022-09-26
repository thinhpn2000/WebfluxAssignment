package com.assignment.entity;

import io.r2dbc.spi.Parameter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoiceWithNoArg = new Invoice();
    Invoice invoiceWithAllArg = new Invoice("invoice_id_test",
                                            "employee_id_test",
                                            "customer_id_test",
                                            "detailProduct_test",
                                            100000,
                                                "status_test");

    @Test
    void getId() {
        assertEquals("invoice_id_test", invoiceWithAllArg.getId());
    }

    @Test
    void getEmployee_id() {
        assertEquals("employee_id_test", invoiceWithAllArg.getEmployee_id());
    }

    @Test
    void getCustomer_id() {
        assertEquals("customer_id_test", invoiceWithAllArg.getCustomer_id());
    }

    @Test
    void getDetailProduct() {
        assertEquals("detailProduct_test", invoiceWithAllArg.getDetailProduct());
    }

    @Test
    void getTotalPrice() {
        assertEquals(100000, invoiceWithAllArg.getTotalPrice());
    }

    @Test
    void getStatus() {
        assertEquals("status_test", invoiceWithAllArg.getStatus());
    }
}