/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.Scanner;

/**
 *
 * @author FabianaUsuario
 */
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.println("Ingresa Nombre");  
     var nombre = scanner.nextLine();
     
     System.out.println("Ingresa Apellido");  
     var apellido = scanner.nextLine();
     
     System.out.println("Ingresa Edad");  
     var edad = scanner.nextLine();
     
     System.out.println("Ingresa Hobbie");  
     var hobbie = scanner.nextLine();
     
     System.out.println("Ingresa Editor de Código Preferido");  
     var editorCodigo = scanner.nextLine();
     
     System.out.println("Ingresa Sistema Operativo que Utilizas");  
     var sistemaOperativo = scanner.nextLine();
     
    
     System.out.println("DATOS INGRESADOS");
     
     System.out.println(nombre);
     System.out.println(apellido);
     System.out.println(edad);
     System.out.println(editorCodigo);
     System.out.println(hobbie);
     System.out.println(sistemaOperativo);
     
     