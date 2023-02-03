package com.registro.usuarios.service;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.model.Usuario;

public interface UsuarioService {

	public Usuario save(UsuarioRegistroDTO registroDTO);
}
