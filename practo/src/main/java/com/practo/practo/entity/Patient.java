package com.practo.practo.entity;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String disease;
    private  int age;
}
