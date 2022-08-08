package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MicrozonaModel {

    private Integer codigo;
    private String nome;
    private Status status;
    private String AtendimentoDiario;
    private String atendeSegunda;
    private String atendeTerca;
    private String atendeQuarta;
    private String atendeQuinta;
    private String atendeSexta;
    private String atendeSabado;
    private Integer municipio;
    private String sigla;
    private Integer rota;
}
