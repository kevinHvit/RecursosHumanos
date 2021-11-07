/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin Castrillo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
        // TODO code application logic here
        
        boolean select = false;
        HiringPerson p1 = new HiringPerson() ;
        
        
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("<----------------------------------------------->");  
        System.out.println("\tBienvenido al menu principal");    
        System.out.println("<----------------------------------------------->");
        
        while(!select){
            System.out.println("1.Seccion de Contratacion");
            System.out.println("2.Seccion de Pagos y Planilla");
            System.out.println("3.Salir");
            String var = br.readLine();
            switch(var){
                case "1":
                    p1.menu();
                    break;
                case "2":
                    p1.menuP();
                    break;
                case "3":
                    System.out.println("Saliendo el programa");
                    select = true;
                    break;
                default :
                    System.out.println("Opcion Incorrecta");
                    
                    break;
            
            }
            
        }
    }
    
}
