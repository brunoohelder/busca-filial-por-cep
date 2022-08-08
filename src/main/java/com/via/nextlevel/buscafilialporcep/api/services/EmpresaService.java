package com.via.nextlevel.buscafilialporcep.api.services;

import com.via.nextlevel.buscafilialporcep.api.model.EmpresaModel;
import com.via.nextlevel.buscafilialporcep.api.repository.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Transactional
    public EmpresaModel salvar(EmpresaModel empresa) {

        boolean empresaExiste = empresaRepository.findByRaizcnpj(empresa.getRaizcnpj())
                .stream()
                .anyMatch(empresaExistente -> !empresaExistente.equals(empresa));

        if (empresaExiste) {
            throw new RuntimeException("Empresa existente");
        }

        return empresaRepository.save(empresa);
    }

    public EmpresaModel buscar(Long empresaId) {
        return empresaRepository.findById(empresaId)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }


}
