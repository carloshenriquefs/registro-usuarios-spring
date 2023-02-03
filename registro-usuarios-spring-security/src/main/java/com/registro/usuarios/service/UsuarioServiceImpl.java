package com.registro.usuarios.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.model.Role;
import com.registro.usuarios.model.Usuario;
import com.registro.usuarios.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNome(), registroDTO.getApelido(), registroDTO.getEmail(),
				registroDTO.getSenha(), Arrays.asList(new Role("ROLE_USER")));

		usuarioRepository.save(usuario);

		return usuario;
	}

}
