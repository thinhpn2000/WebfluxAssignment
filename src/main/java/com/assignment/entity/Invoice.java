package com.assignment.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("INVOICE")
public class Invoice {
    @Id
    private String id;
    private String employee_id;
    private String customer_id;
    @Column(value = "detailProduct")
    private String detailProduct;
    @Column(value = "totalPrice")
    private int totalPrice;
    private String status;

    public Invoice(){};

    public Invoice(String id, String employee_id, String customer_id, String detailProduct, int totalPrice, String status) {
        this.id = id;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.detailProduct = detailProduct;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getDetailProduct() {
        return detailProduct;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }
}
