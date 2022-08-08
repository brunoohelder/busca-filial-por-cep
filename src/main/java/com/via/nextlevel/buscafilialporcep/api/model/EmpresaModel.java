package com.via.nextlevel.buscafilialporcep.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity(name = "empresa")
public class EmpresaModel {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa")
    private Long id;

    @NotNull
    @NotBlank
    @NotEmpty
    private String razaosocial;

    @NotNull
    private Long raizcnpj;
    private Date dataabertura;
}