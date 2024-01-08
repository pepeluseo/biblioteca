package com.accenture.biblioteca.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "prestamos")

public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;
    @ManyToOne
    @JoinColumn(name = "libro")
    private Libro libro;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
}
