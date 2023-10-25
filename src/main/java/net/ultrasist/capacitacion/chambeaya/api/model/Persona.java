package net.ultrasist.capacitacion.chambeaya.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@Builder

public class Persona {
     private int id;
     private String nombre;
     private int edad;
     
     
     public Persona() {
         System.out.println("ejecutando constructor");
     }
     
     /*public void setId(int id) {
         this.id = id;
     }
     
     public int getId() {
         return id;
     }
     
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     
     public String getNombre() {
         return this.nombre;
     }*/
}
