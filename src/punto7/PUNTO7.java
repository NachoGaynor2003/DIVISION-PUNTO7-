/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto7;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class PUNTO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        float nota1 = leer.nextFloat();
        System.out.println("Ingrese el divisor ");
        float nota2 = leer.nextFloat();
        Division operacion = new Division();
        try{
            float resultado = operacion.dividir(nota1, nota2);
            System.out.println("EL RESULTADO DE LA DIVISION ES DE : " + resultado);
            
        }
        catch (ArithmeticException e){
            System.out.println("LA DIVISION ENTRE CERO NO ES POSIBLE YA QUE ESTA DA UNA INDETERMINACION");
        }
    }
    
}
