package com.everton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everton.models.UsuarioModel;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

}
