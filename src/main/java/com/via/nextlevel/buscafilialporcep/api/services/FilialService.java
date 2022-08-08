package com.via.nextlevel.buscafilialporcep.api.services;


import com.via.nextlevel.buscafilialporcep.api.model.EmpresaModel;
import com.via.nextlevel.buscafilialporcep.api.model.FilialModel;
import com.via.nextlevel.buscafilialporcep.api.repository.EmpresaRepository;
import com.via.nextlevel.buscafilialporcep.api.repository.FilialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class FilialService {

    private FilialRepository filialRepository;
    private EmpresaService empresaService;

    @Transactional
    public FilialModel salvar(FilialModel filial) {

        System.out.println(filial.getEmpresa().getId());
        System.out.println(filial.getNome());
        System.out.println(filial.getCnpj());

        boolean filialExiste = filialRepository.findByCnpj(filial.getCnpj())
                .stream()
                .anyMatch(filialExistente -> !filialExistente.equals(filial));

        if (filialExiste) {
            throw new RuntimeException("Filial existente");
        }

        EmpresaModel empresa = empresaService.buscar(filial.getEmpresa().getId());

        return filialRepository.save(filial);
    }

}
