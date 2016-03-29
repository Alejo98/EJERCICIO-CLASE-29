/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicicleta;

/**
 *
 * @author Usuario4
 */
public class Triangulo extends Figura {
    private double lado;

    public Triangulo(String color, double lado) {
        super(color);
         this.lado=lado;
    }
    
    public double area(){
        return 1;
    }
}
