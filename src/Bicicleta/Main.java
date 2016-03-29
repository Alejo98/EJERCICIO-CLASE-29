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
public class Main {
      public static void main(String[] args) {
        Circulo [] llanta=new Circulo[2];
        llanta[0]=new Circulo("verde",2);
        llanta[1]=new Circulo("roja",2);
        Circulo plato=new Circulo("azul",1);
        Triangulo [] marco=new Triangulo[3];
        marco[0]=new Triangulo("azul",5);
        marco[1]=new Triangulo("azul",5);
        marco[2]=new Triangulo("azul",5);
        Bicicleta bici= new Bicicleta(llanta,plato,marco);
        System.out.println(bici.area());
     
        // TODO code application logic here
    }
    
}
