package br.com.comercial.festa.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.comercial.festa.model.Convidado;
import br.com.comercial.festa.repository.ConvidadoRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosControllers {

	@Autowired
	public ConvidadoRepository convidadoRepository;

	private static final List<Convidado> DADOS = new ArrayList<>(
			Arrays.asList(new Convidado(1L, "Bruce Lee"), new Convidado(2L, "Jimmy Hendrix"),
					new Convidado(3L, "Stepen Hawking"), new Convidado(4L, "Beyonce Prince"),
					new Convidado(5L, "Albert Einstein"), new Convidado(6L, "Shazam"), new Convidado(7L, "Dr. House")));

	@GetMapping
	public ModelAndView listarConvidados(Convidado convidado) {
		ModelAndView model = new ModelAndView("/convidados-lista");
		List<Convidado> lista = convidadoRepository.findAll();
		model.addObject("convidados", DADOS);
		return model;

	}

	@GetMapping(value = "/adicionar")
	public ModelAndView adicionar(Convidado convidado) {
		ModelAndView mv = new ModelAndView("/cadastro");
		mv.addObject(convidado);
		return mv;
	}

	@RequestMapping(value = { "/adicionar", "{\\d+}" }, method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Convidado convidado, BindingResult result, Model model,
			RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return adicionar(convidado);
		}
		convidadoRepository.save(convidado);
		attributes.addFlashAttribute("mensagem", "Registro adicionado com sucesso!");
		return new ModelAndView("redirect:/convidados/adicionar");

	}
	
	@GetMapping(value = "editar/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		Convidado convidado = convidadoRepository.getOne(id);
		ModelAndView mv = adicionar(convidado);
		mv.addObject(convidado);
		return mv;
	}
	
	@GetMapping(value = "excluir/{id}")
	public ModelAndView editar(@PathVariable("id") Long id, RedirectAttributes attributes) {
		convidadoRepository.delete(convidadoRepository.getOne(id));
		attributes.addFlashAttribute("mensagem", "Registro exluído com sucesso!");
		return new ModelAndView("redirect:/convidados");
	}

}
