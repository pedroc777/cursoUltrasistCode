package net.ultrasist.capacitacion.chambeaya.api.model;

public class Persona {
     private int id;
     private String nombre;
     
     
     public Persona() {
         System.out.println("ejecutando constructor");
     }
     
     public void setId(int id) {
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
     }
}
