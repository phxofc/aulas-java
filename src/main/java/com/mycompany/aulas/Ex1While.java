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
public class Ex1While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();

        }
        System.out.println("Senha Correta!!");
        sc.close();
    }
}
