package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
/*Logica de negocios o validaciones del sistema*/
	

@Service
public class UsuarioService {
	/*Llamar al respository*/
	@Autowired
	UsuarioRepository usuarioRepository;
	public void saveUsuario(@Valid Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();	}
	

	
}
