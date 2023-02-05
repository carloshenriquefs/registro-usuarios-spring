package com.registro.usuarios.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.model.Usuario;

public interface UsuarioService extends UserDetailsService {

	public Usuario save(UsuarioRegistroDTO registroDTO);
}
