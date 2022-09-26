package com.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER")
public class User {
    @Id
    private String id;
    public String fullname;
    public String email;
    public String pswd;
    private String roles;

    public String getId() {
        return id;
    }
    public String getPswd() {
        return pswd;
    }

    public String getEmail() {
        return email;
    }

    public String getRoles() {
        return roles;
    }

    public User() {}

    public User(String id, String fullname, String email, String pswd, String roles) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.pswd = pswd;
        this.roles = roles;
    }
}
