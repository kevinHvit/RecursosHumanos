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
public class PayRoll {
    
    private ControllerP p1;
    private boolean exit = false;

    public void menu() throws IOException{
        String opcc;
        String ide;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(this.exit){
            
            System.out.println("1. Pagar a una persona");  
            System.out.println("2. Ver pago de una persona");  
            System.out.println("3. Ver Panilla");  
            System.out.println("4. Salir");
            System.out.println("<----------------------------------------------->"); 
            
            opcc= br.readLine();

            

            switch(opcc){
                case "1":
                System.out.println("Digite la identificacion de la persona");
                ide = br.readLine();
                p1.pay(ide);
                
                break;
                
                case "2":
                    System.out.println("Digite la identificacion de la persona");
                    ide = br.readLine();
                    p1.viewP(ide);
                    
                    break;


                case "3":
                    System.out.println(" ");
                    System.out.println("Mostrando Datos de la planilla ");
                    System.out.println(" ");
                    p1.viewAllPay();
                    
                    break;

                case "4":
                    
                    System.out.println("Saliendo del Programa");
                    this.exit = true;
                    break;
                default :
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }
    }
}
