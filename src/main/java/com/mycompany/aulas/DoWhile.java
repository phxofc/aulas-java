/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do {

            System.out.print("Digite a temperatura em Celsius:");
            double C = sc.nextDouble();
            double F = (9 * C) / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheint: " + F);

            System.out.print("Deseja repetir?");
            resp = sc.next().charAt(0);

        } while (resp != 'n');

        sc.close();

    }

}
