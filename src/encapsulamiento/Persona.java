/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author Arana Salazar, Alexandro del Piero
 */
public class Persona {
    
   private String nombre;
   private String dni;
   private String peso;
   
   public String getNombre()
    {
        return this.nombre;
    }
   
   public void setNombre(String nombre)
   {
       this.nombre=nombre;
   }

    public Persona(String nombre, String dni, String peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
   
}
