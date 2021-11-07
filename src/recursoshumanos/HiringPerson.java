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
public class HiringPerson {
    ControllerP p1 = new ControllerP();
    
   
    
    public void menu()throws IOException{
        boolean exit = false;
        String opcc;
        String ide;
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(" ");
        
        while(!exit){
            
        System.out.println("1. Contratar a una persona");  
        System.out.println("2. Eliminar una persona");  
        System.out.println("3. Modificar una persona");  
        System.out.println("4. Mostrar todas las personas");
        System.out.println("5. Buscar solamente una persona");  
        System.out.println("6. Mostrar personas por puestos"); 
        System.out.println("7. Salir");
        System.out.println("<----------------------------------------------->"); 
        
        opcc= br.readLine();

            switch(opcc){
                case "1":
                        System.out.println("Digite la informacion que se le solicita para agregar una persona al sistema.");
                        p1.addPerson();
                        
                        break;
                        
                case "2":
                        System.out.println("Digite la identificacion de la persona que desea eliminar");
                        ide = br.readLine();
                        p1.deletePerson(ide);
                        break;       
                        
                case "3":
                        System.out.println("Digite la identificacion de la persona que desea modificar");
                        ide = br.readLine();
                        p1.viewPerson(ide);
                        System.out.println("1. modificar el Nombre");
                        System.out.println("2. modificar el Apellido");        
                        System.out.println("3. modificar el numero Celular");
                        System.out.println("4. modificar el Puesto");
                        String opc = br.readLine();
                        p1.modifyPerson(ide, opc);
                        
                        break;
                case "4":
                        p1.viewAllPerson();
                        
                        break;        
                case "5":
                        System.out.println("Digite la identificacion de la persona que desea buscar");
                        ide=br.readLine();
                        p1.viewPerson(ide);
                        
                        break;
                case "6":
                        System.out.println("Digite un Puesto para ver quien o quienes trabajan en ese puesto");
                        String workStation = br.readLine();
                        p1.viewPuesto(workStation);
                        
                        break;
                case "7":
                        System.out.println("Saliendo del Programa....");
                        exit = true;
                        
                        break;
            
                default :
                        System.out.println("Opcion Incorrecta");
                        break;
            }
        }
    }
    
    
    public void menuP() throws IOException{
        String opcc;
        String ide;
        boolean exit = false;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!exit){
            
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
                    p1.viewPayPerson(ide);
                    
                    break;


                case "3":
                    System.out.println(" ");
                    System.out.println("Mostrando Datos de la planilla ");
                    System.out.println(" ");
                    p1.viewAllPay();
                    
                    break;

                case "4":
                    
                    System.out.println("Saliendo del Programa");
                    exit = true;
                    break;
                default :
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }
    
    
    
    
}
}