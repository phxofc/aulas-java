/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulas;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int h1;
        int h2;
     
        
        
        
        System.out.println("Digite hora do inicio: ");
        h1 = leia.nextInt();
        System.out.println("Digite hora do termino: ");
        h2 = leia.nextInt();
        
        
       int duracao;
       
       if(h1 < h2){
          
           duracao = h2 - h1;
       }else{
           duracao = 24 - h1 + h2;
       }
       
        System.out.println("jogo durou "+duracao+" HORA(S)");
        leia.close();
       
    }
}
