package net.ultrasist.capacitacion.chambeaya.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;
/*
 * estas son anotaciones
 */
@RestController
@RequestMapping(value = "/api/")
public class HelloController {

	@ApiOperation(value = "HelloController::helloWorld", notes = "Saluda")
	@GetMapping(value = "hello", produces = "application/json; charset=utf-8")
	public Persona helloWorld() {
	    Persona p = new Persona();
	    p.setId(78);
	    p.setNombre("Nombre");
		return p;
	}
	
	//este método sólo es de prueba
	public static int fact(int n) {
	    return (n<2)?1:n*fact(n-1);
	}
}
