package com.via.nextlevel.buscafilialporcep.api.repository;

import com.via.nextlevel.buscafilialporcep.api.model.FilialModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilialRepository extends JpaRepository<FilialModel, Long> {
    Optional<FilialModel> findByCnpj(Long cnpj);
}
