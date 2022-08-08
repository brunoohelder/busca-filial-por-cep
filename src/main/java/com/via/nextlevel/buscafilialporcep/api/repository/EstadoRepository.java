package com.via.nextlevel.buscafilialporcep.api.repository;

import com.via.nextlevel.buscafilialporcep.api.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, String> {
}
