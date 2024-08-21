package com.roddsantos.homefinances.models;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.UUID;

public class CreditCardModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false, scale = 2)
    private Float limit;
    @Column(nullable = false, scale = 2)
    @Value("${props.invoice:0}")
    private Float invoice;
    @Column(nullable = false)
    @Value("${props.day:1}")
    private Number day;
    @Column(nullable = false)
    private Number month;
    @Column(nullable = false)
    private Number year;
    @Column(nullable = false)
    private Boolean isClosed;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "userId")
    @Column(nullable = false)
    private UserModel user;

    @CreatedDate()
    private String createdAt;
    @LastModifiedDate()
    private String updatedAt;
    private String deletedAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getLimit() {
        return limit;
    }

    public void setLimit(Float limit) {
        this.limit = limit;
    }

    public Float getInvoice() {
        return invoice;
    }

    public void setInvoice(Float invoice) {
        this.invoice = invoice;
    }

    public Number getDay() {
        return day;
    }

    public void setDay(Number day) {
        this.day = day;
    }

    public Number getMonth() {
        return month;
    }

    public void setMonth(Number month) {
        this.month = month;
    }

    public Number getYear() {
        return year;
    }

    public void setYear(Number year) {
        this.year = year;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }
}
