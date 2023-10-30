package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;

import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

public interface PersonaService {
    /**
     * regresa una lista de tipo Persona
     * 
     * return List <Persona>
     */
    List<Persona> getBolsa();
    
    /**
     * calcula el factorial de un entero
     * @return
     */
    int fact(int n);    
}
