package com.keepit.teste.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Submission {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private Float resultado;

    @ManyToOne
    private User userId;


}
