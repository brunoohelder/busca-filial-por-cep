package com.via.nextlevel.buscafilialporcep.api.controller;


import com.via.nextlevel.buscafilialporcep.api.model.EmpresaModel;
import com.via.nextlevel.buscafilialporcep.api.services.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/empresa")
@AllArgsConstructor
@RestController
public class EmpresaController {

    EmpresaService empresaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@Valid @RequestBody EmpresaModel empresa) {
        empresaService.salvar(empresa);
    }

}
