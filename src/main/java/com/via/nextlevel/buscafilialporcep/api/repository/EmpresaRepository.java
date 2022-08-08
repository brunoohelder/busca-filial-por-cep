package com.via.nextlevel.buscafilialporcep.api.repository;

import com.via.nextlevel.buscafilialporcep.api.model.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long> {
    Optional<EmpresaModel> findByRaizcnpj(Long raizcnpj);
}
