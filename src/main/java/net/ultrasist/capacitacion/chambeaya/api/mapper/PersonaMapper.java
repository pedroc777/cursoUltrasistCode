package net.ultrasist.capacitacion.chambeaya.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

//finge que va a la base de datos, pero en realidad usa una bolsa de tipo ArrayList esto es master
@Repository
public class PersonaMapper {
    private List<Persona> bolsa = new ArrayList<>();
    
    public PersonaMapper() {
        bolsa.add(new Persona(45,"Aurelio",4656));
        bolsa.add(new Persona(49,"Marco",487));
        bolsa.add(new Persona(49,"Nerón",478));
        bolsa.add(new Persona(47,"Máximo",45));
    }
    
    public void insert(Persona p) {
        bolsa.add(p);
    }
    
    public List<Persona> getAll(){
        return bolsa;
    }
    
    public void deleteAll(Persona p) {
        bolsa.add(p);
    }
}
