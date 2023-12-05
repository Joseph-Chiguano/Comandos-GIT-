/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;

/**
 *
 * @author usuario
 */
public class Carro {

    String marca; // Atributo
    int placa;    // Atributo

    // Constructor
    public Carro(String marca, int placa) {
        this.marca = marca;
        this.placa = placa;
    }

    // Método
    public void acelerar() {
        int velocidad = 40; // Velocidad inicial

        System.out.println(this.marca + " " + this.placa + " Empezo a acelerar a " + velocidad + " km/h");

        if (velocidad > 50) {
            System.out.println("Multa Excedio el limite de velocidad de 50 km/h");
        }
    }
}

