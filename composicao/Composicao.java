/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;


public class Composicao {
    
   
    public static void main(String[] args) {
        
       /* 
        //primeira forma de chamar os construtores//
       carro carro = new carro();
       carro carro2 = new carro(2000);
       */
       
       /*
       //segunda forma de chamar os construtores//
       carro carro3 = new carro();
       carro.ligarCarro(2000);
       */
       
       
       //terceira forma de chamar os construtores//
       carro carro4 = new carro(0);
       motor motor = new motor();
       motor motor2 = new motor(2000);
       
       carro4.setMotor(motor);
       
       carro4.imprimeDados();
       
    }
    
}
