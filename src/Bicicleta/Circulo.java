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
public class Circulo extends Figura {
    private double radio;
    public Circulo(String color, double radio){
        super(color);
        this.radio=radio;
       
    }
    @Override
    public double area(){
        return Math.PI*this.radio*this.radio;
    }
    } 
