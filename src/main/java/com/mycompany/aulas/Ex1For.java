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
public class Ex1For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
