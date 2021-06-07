package com.cognizant.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//communicates this should be database entity
@Entity
@JsonIgnoreProperties
@Table(name = "magic8ball")
public class Magic8Ball {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //this will not be stored into the database
    @Transient
    private String question;

    //Every value in this column must be unique
    @Column(unique = true)
    private String answer;
}
