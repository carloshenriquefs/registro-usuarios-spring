package com.registro.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.dto.UsuarioRegistroDTO;
import com.registro.usuarios.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNovoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	@GetMapping
	public String mostrarFormularioRegistro() {
		return "registro";
	}

	@PostMapping
	public String registrarContaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO) {
		usuarioService.save(usuarioRegistroDTO);
		return "redirect:/registro?exito";
	}

}
