package org.example;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    private String denominacion;

}