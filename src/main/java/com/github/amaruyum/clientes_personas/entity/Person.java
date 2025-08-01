package com.github.amaruyum.clientes_personas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass // No se mapeara como tabla, pero heredara sus campos

public abstract class Person {

    private String name;
    private String gender;
    private Integer age;

    @Column(unique = true, nullable = false)
    private String identification;
    
    private String address;
    private String phone;
    
}
