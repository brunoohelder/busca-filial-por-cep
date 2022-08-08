package com.via.nextlevel.buscafilialporcep.api.controller;

import com.via.nextlevel.buscafilialporcep.api.model.EstadoModel;
import com.via.nextlevel.buscafilialporcep.api.services.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/estado")
@AllArgsConstructor
@RestController
public class EstadoController {

    EstadoService estadoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@Valid @RequestBody EstadoModel estado) {
        estadoService.salvar(estado);
    }
}
