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
public class Ex2While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0) {

            if ((x >= 1 && x <= 8) && (y >= 1 && y <= 8)) {
                System.out.println("PRIMEIRO QUADRANTE");

            }else if((x >= -8 && x <= -1) && (y >= 1 && y <= 8)){
                System.out.println("SEGUNDO QUADRANTE");
            }
            else if((x >= -8 && x <= -1) && (y >= -8 && y <= -1)){
                System.out.println("TERCEIRO QUADRANTE");
            }
            else if((x >= 1 && x <= 8) && (y >= -8 && y <= -1)){
                System.out.println("QUARTO QUADRANTE");
            } else{
                
               
            }
          
            x = sc.nextInt();
            y = sc.nextInt();

        }
        System.out.println("terminou");
        
        sc.close();

    }

}
