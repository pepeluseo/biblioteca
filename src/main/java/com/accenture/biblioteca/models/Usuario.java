package com.accenture.biblioteca.models;


import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Data
@Table(name = "usuarios")

public class Usuario {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column(unique = true)
    private String email;
    @Column
    private String password;

}
