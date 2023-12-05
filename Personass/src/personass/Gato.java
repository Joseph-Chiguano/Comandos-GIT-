/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personass;

/**
 *
 * @author usuario
 */
public class Gato {
     String raza;//atributo
    int edad;//atributo

    // constructor
    public Gato (String raza, int edad){
        this.raza=raza;
        this.edad=edad;
    }
    //metodo
    public void maullar(){
        System.out.println(this.raza + " "  + this.edad +" Empezo a maullar");
    }
    public void comer(){
        System.out.println(this.raza + " "  + this.edad +" Empezo a comer");
    }
    public void lamerse (){
        System.out.println(this.raza + " "  + this.edad +"Empezo a lamerse");
    }
}
