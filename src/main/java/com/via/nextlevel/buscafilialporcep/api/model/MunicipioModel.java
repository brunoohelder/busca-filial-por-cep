package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "municipio")
public class MunicipioModel {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoMunicipio")
    private Long id;

    private String nome;

    @ManyToOne
    private EstadoModel siglaEstado;
}
