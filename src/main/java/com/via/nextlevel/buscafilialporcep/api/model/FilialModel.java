package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "filial")
public class FilialModel {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filial;

    @ManyToOne
    private EmpresaModel empresa;

    private String nome;
    private Long cnpj;

    @ManyToOne
    private MunicipioModel municipio;
}
