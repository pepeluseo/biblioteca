package com.accenture.biblioteca.models;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "libros")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;
    private String titulo;
    private Long autor;
    private String portada;
    private String anyo;
    private Long isbn;
    private Long editorial;
    private Long genero;
}
