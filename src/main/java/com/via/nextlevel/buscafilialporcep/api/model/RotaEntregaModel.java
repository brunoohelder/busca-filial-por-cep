package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RotaEntregaModel {

    private String siglaEstado;
    private Integer rota;
    private String nome;
    private Status status;
    private Integer empresa;
    private Integer fil;
    private Integer prazoExpedicao;

}
