package com.via.nextlevel.buscafilialporcep.api.services;

import com.via.nextlevel.buscafilialporcep.api.model.EstadoModel;
import com.via.nextlevel.buscafilialporcep.api.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class EstadoService {

    EstadoRepository estadoRepository;

    @Transactional
    public EstadoModel salvar(EstadoModel estado) {

        boolean estadoExiste = estadoRepository.findById(estado.getSigla())
                .stream()
                .anyMatch(estadoExistente -> !estadoExistente.equals(estado));

        if (estadoExiste) {
            throw new RuntimeException("Estado já existente !!");
        }

        return estadoRepository.save(estado);

    }

}
