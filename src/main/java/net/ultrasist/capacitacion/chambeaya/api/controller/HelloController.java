package net.ultrasist.capacitacion.chambeaya.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaService;
/*
 * estas son anotaciones
 */
@RestController
@RequestMapping(value = "/api/")
public class HelloController {
    private PersonaService persona;
    
    /**
     * se está instanciando la variable de arriva en el constructor
     * @param persona
     */
    public HelloController (PersonaService persona) {
        this.persona = persona;
    }
	@ApiOperation(value = "HelloController::helloWorld", notes = "Saluda")
	@GetMapping(value = "hello", produces = "application/json; charset=utf-8")
	public List <Persona> helloWorld() {
	    return persona.getBolsa();
	}
	
	//este método sólo es de prueba
	/*public static int fact(int n) {
	    return (n<2)?1:n*fact(n-1);
	}*/
}
