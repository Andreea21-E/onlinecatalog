package com.andreea.onlinecatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int professorId;

    private String firstName;
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Discipline discipline;

}
