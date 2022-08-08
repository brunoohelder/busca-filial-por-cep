package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "estado")
public class EstadoModel {

    @EqualsAndHashCode.Include
    @Id
    private String sigla;
    private String nome;
}
