package com.example.allanimals.domain.model.entities;

import com.example.allanimals.domain.model.objectValue.Email;
import com.example.allanimals.domain.model.objectValue.Telefone;

import java.util.Date;

public class Tutor {

    private String name;
    private String password;
    private Telefone phone;
    private Date birthday;
    private Email email;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Telefone getPhone() {
        return phone;
    }

    public void setPhone(Telefone phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Tutor(String name, String password, Date birthday, Email email) {
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.email = email;
    }
}
