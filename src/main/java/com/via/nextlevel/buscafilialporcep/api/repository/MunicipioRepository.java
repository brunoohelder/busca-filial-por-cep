package com.via.nextlevel.buscafilialporcep.api.repository;


import com.via.nextlevel.buscafilialporcep.api.model.MunicipioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<MunicipioModel, Long> {
}
