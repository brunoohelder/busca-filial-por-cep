package com.via.nextlevel.buscafilialporcep.api.controller;

import com.via.nextlevel.buscafilialporcep.api.model.FilialModel;
import com.via.nextlevel.buscafilialporcep.api.services.FilialService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


    @RequestMapping("/api/filial")
    @AllArgsConstructor
    @RestController
    public class FilialController {

        FilialService filialService;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void adicionar(@Valid @RequestBody FilialModel filial) {
            filialService.salvar(filial);
        }

    }
