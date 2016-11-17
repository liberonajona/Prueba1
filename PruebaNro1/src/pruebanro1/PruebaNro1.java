/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanro1;

import java.util.Scanner;

/**
 *
 * @author Liberona
 */
public class PruebaNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num1 = sc.nextInt();
        System.out.println("ingresa segundo numero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        double mult = num1*num2;
        System.out.println("la suma es : "+suma);
        System.out.println("la multiplicacion es : "+mult);
        
        System.out.println("gracias");
    }
    
}
