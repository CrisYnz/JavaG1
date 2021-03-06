package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {// <objeto,tipoDato_PK>
	/* las interface solo definen los metodos, no los implementamos */
	/* Querys y usar metodos que se conectan a la base de datos */
}
