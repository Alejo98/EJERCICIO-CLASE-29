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
public class Bicicleta {
 private Circulo[] llanta;
 private Circulo plato;
 private Triangulo[] marco;

    public Bicicleta(Circulo[] llanta, Circulo plato, Triangulo[] marco) {
        this.llanta = llanta;
        this.plato = plato;
        this.marco = marco;
    }
 
    public double area(){
        double resultado=0;
        resultado+=this.plato.area();
        for(Circulo c: this.llanta){
            resultado+=c.area();
        }
        for(Triangulo t:this.marco){
        resultado+=t.area();
        }
        return resultado;
    }  
}
