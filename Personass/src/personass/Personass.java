/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personass;

/**
 *
 * @author usuario
 */
public class Personass{
    String nombre;//atributo
    int edad;//atributo

    // constructor
    public Personass(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //metodo
    public void saltar(){
        System.out.println(this.nombre + " "  + this.edad +" Empezo a saltar");
     
    }
    public void comer(){
        System.out.println(this.nombre + " "  + this.edad +" Empezo a comer");
    }
    public void escribir(){
        System.out.println(this.nombre + " "  + this.edad +"Empezo a escribir");
    }
   
 }