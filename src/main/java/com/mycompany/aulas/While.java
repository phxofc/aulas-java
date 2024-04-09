/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulas;

import java.util.Scanner;

/**
 *
 * @author phdfr
 */
public class While {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        
        while(x != 0){
            soma += x;
            x = sc.nextInt();
            
        }
        System.out.println(soma);
        sc.close();
        
    }
    
}
