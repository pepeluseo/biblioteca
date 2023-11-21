package com.accenture.biblioteca.models;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "editoriales")

public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEditorial;
    private String nombre;
    private String direccion;
    private String contacto;

}
