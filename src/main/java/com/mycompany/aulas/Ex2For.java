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
public class Ex2For {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int in =0;
        int out=0;
        
        
        for(int i =0; i<N; i++){
            int X = sc.nextInt();
            
            if(X >=10 && X<=20){
                in++;
            }else{
                out++;
            }
            
        }
        System.out.println(in+" dentro");
        System.out.println(out+" fora");
    }
}
