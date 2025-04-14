package org.example.efemerideapi.repository;

import org.example.efemerideapi.entity.Efemeride;
import org.example.efemerideapi.entity.EfemerideDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EfemerideRepo extends JpaRepository<Efemeride, Integer> {

    @Query("SELECT new org.example.efemerideapi.entity.EfemerideDTO(e.date,e.text) " +
            "FROM Efemeride e ORDER BY e.id DESC LIMIT 1")
    EfemerideDTO getLast();
}
