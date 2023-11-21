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
    private Long libro;
    private Long usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
}
