package net.ultrasist.capacitacion.chambeaya.api.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import net.ultrasist.capacitacion.chambeaya.api.service.PersonaService;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaServiceImpl;

public class HelloControllerTest {
    @Test
    void testFactorial() {
        PersonaService hc = new PersonaServiceImpl();
        assertEquals(hc.fact(5),120);
        assertNotEquals(hc.fact(5),12);
    }
}

/*
 * pequeño refactor del proyecto sb-hello para dejarlo en un estado minimal
 * agregar un pojo (completo: con setters y getters)
 * agregar dependencia lombok para eliminar setters y getters de pojo
 * agregar dependencia de sprign boot dev (para reiniciar automátimente)
 * realizar commits
 * */
 