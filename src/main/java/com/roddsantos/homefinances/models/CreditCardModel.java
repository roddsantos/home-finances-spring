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
}
