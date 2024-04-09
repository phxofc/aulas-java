/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulas;

import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int n1;
        System.out.println("Digite um numero");
        n1 = leia.nextInt();
        
        if(n1 <0){
            System.out.println("NEGATIVO");
        }
        if(n1 >=0){
            System.out.println("POSITIVO");
        }
       
    }
}
