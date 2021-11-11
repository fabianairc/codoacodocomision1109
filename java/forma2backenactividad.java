/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaback;

import java.util.Scanner;

/**
 *
 * @author FabianaUsuario
 */
public class Javaback {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
       
    System.out.println("Bienvenido al sitema:");
    
     Scanner scanner= new Scanner (System.in);
     
     System.out.println("Tu Usuario:");
     String nombre= scanner.nextLine();
    
     System.out.println("Tu CLave:");
     String pass= scanner.nextLine();
     
     System.out.println(pass);
     System.out.println(nombre);
     
     if (nombre != "User2020" || pass != "12345")System.out.println("error");
     else {System.out.println("bienvienido");}
          
    }
 }
      

                                       
        // TODO code application logic here
    
    
