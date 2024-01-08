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
    @ManyToOne
    @JoinColumn(name = "autor")
    private Autor autor;
    private String portada;
    private String anyo;
    private Long isbn;
    @ManyToOne
    @JoinColumn(name = "editorial")
    private Editorial editorial;
    @ManyToOne
    @JoinColumn(name = "genero")
    private Genero genero;
}
