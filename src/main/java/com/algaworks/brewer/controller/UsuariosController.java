package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Usuario;

@Controller
public class UsuariosController {
	
	@RequestMapping(value="/usuarios/novo", method = RequestMethod.GET)
	public String novo(Usuario user) {
		return "usuario/CadastroUsuario";
	}
	
	@RequestMapping(value="/usuarios/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Usuario user, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(user);
		}
		
		attributes.addFlashAttribute("mensagem", "Usuário Salvo com Sucesso");
		System.out.println(">>> nome: " + user.getNome());
		System.out.println(">>> e-mail: " + user.getEmail());
		System.out.println(">>> data de nascimento: " + user.getDataNascimento());
		return "redirect:/usuarios/novo";
	}
}
