/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulas;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int n1;
        System.out.println("Digite um numero");
        n1 = leia.nextInt();
        
        if(n1 % 2 ==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
       
    }
}
