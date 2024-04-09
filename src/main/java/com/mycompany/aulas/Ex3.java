/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulas;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int n1;
        int n2;
        int multi = 0;
        
        System.out.println("Digite um numero");
        n1 = leia.nextInt();
        System.out.println("Digite outro numero");
        n2 = leia.nextInt();
        
        if(n1 % 2 == 0 && n2 % 2 ==0){
            System.out.println("são multiplos");
        }else{
            System.out.println("nao são multiplos");
        }
       
       
    }
}
