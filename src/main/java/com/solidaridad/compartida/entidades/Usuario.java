package com.solidaridad.compartida.entidades;

import com.solidaridad.compartida.enums.Rol;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public abstract class Usuario  { 
//es abstract para que no se pueda instanciar, lo pueden hacer sus hijos  benediciario y donante

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String nombre;
    private String email;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;

    
}
