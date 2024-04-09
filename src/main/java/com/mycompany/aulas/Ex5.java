/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulas;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int codigo;
        int qtd;
     
        
        
        
        System.out.println("Digite o codigo do produto: ");
        codigo = leia.nextInt();
        System.out.println("Digite quantidade: ");
        qtd = leia.nextInt();
        
        
      if(codigo == 1){
          System.out.println("TOTAL: "+4*qtd);
      }else if(codigo == 2){
          System.out.println("TOTAL: "+4.5*qtd);
      }else if(codigo ==3){
          System.out.println("TOTAL: "+5*qtd);
      }else if(codigo ==4){
           System.out.println("TOTAL: "+2*qtd);
      }else{
          System.out.println("TOTAL: "+1.5*qtd);
          }
       
       
       
    }
}
