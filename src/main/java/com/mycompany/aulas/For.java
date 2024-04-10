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
public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            soma += X;
        }
        System.out.println(soma);
        sc.close();

        //contagem regressiva
        for (int i = 10; i >= 0; i--) {
            System.out.println("Valor de i:" + i);
        }
    }

}
