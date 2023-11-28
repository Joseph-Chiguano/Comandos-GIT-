/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personass;

/**
 *
 * @author usuario
 */
public class Perro {
    String raza;//atributo
    int edad;//atributo

    // constructor
    public Perro (String raza, int edad){
        this.raza=raza;
        this.edad=edad;
    }
    //metodo
    public void ladrar(){
        System.out.println(this.raza + " "  + this.edad +" Empezo a ladrar");
    }
    public void comer(){
        System.out.println(this.raza + " "  + this.edad +" Empezo a comer");
    }
    public void morder(){
        System.out.println(this.raza + " "  + this.edad +"Empezo a morder");
    }
}
