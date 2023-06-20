/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto7;

/**
 *
 * @author Ignacio Gaynor
 */
public class Division {
   
    public float dividir(float dividendo,float divisor){
        if(divisor == 0){
         
            throw new ArithmeticException("NO SE PUEDE DIVIDIR UN NUMERO POR 0");
    }
        return dividendo / divisor;
    
}
}
