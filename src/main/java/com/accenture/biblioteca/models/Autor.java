package com.accenture.biblioteca.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "autores")


public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;
    private String nombre;
    private Date fechaNac;
    private String nacionalidad;


}
