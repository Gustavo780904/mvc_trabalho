package com.dutra.mvc.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Controle {
	/*@RequestMapping("/")
	public String inicio() {
		return "modelo";
	}
*/
	@RequestMapping("/")
	public String pg1() {
		return "pagina1";
	}
	@RequestMapping("pagina2")
	public String pg2() {
		return "pagina2";
	}
}