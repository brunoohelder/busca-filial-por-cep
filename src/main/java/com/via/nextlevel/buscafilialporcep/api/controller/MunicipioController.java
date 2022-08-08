package com.via.nextlevel.buscafilialporcep.api.controller;

import com.via.nextlevel.buscafilialporcep.api.model.MunicipioModel;
import com.via.nextlevel.buscafilialporcep.api.services.MunicipioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/municipio")
@AllArgsConstructor
@RestController
public class MunicipioController {

    MunicipioService municipioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@Valid @RequestBody MunicipioModel municipio) {
        municipioService.salvar(municipio);
    }
}
