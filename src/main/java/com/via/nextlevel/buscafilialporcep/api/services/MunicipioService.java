package com.via.nextlevel.buscafilialporcep.api.services;

import com.via.nextlevel.buscafilialporcep.api.model.MunicipioModel;
import com.via.nextlevel.buscafilialporcep.api.repository.MunicipioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class MunicipioService {

    MunicipioRepository municipioRepository;

    /*commit*/

    @Transactional
    public MunicipioModel salvar(MunicipioModel municipio) {

        System.out.println(municipio.getId());

        boolean municipioExiste = municipioRepository.findById(municipio.getId())
                .stream()
                .anyMatch(municipioExistente -> !municipioExistente.equals(municipio));

        if (municipioExiste) {
            throw new RuntimeException("Municipio já existente !!");
        }

        return municipioRepository.save(municipio);

    }
}
