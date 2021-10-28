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
public class ControllerP {
    
    private Employee persons [] = new Employee [20];
    private int tam=0;
    private Pay pays;
   

    public Employee createPerson()throws IOException {
            
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Edad: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Cedula: ");
        String ide = br.readLine();
        System.out.println("Nombre: ");
        String name = br.readLine();
        System.out.println("Apellido: ");
        String lastName = br.readLine();
        System.out.println("Dirección: ");
        String location = br.readLine();
        System.out.println("Teléfono: ");
        String celphone = br.readLine();
        System.out.println("Puesto: ");
        String workStation = br.readLine();
        System.out.println("Salario: ");
        String sal  = br.readLine();
        double salary = Double.parseDouble(sal);
        System.out.println("Fecha de inicio laboral: ");
        String  startJob  = br.readLine();
        
        Employee nuevo = new Employee( salary,startJob, workStation,age, ide,name,lastName, location, celphone );
        
        return nuevo;
    }
    
    public void addPerson() throws IOException{
        
        this.persons[this.tam]= createPerson();
        this.tam++;
    }    
        
    public void viewPuesto(String workStation){
    
        for(int i=0;i<this.persons.length;i++){
            if(this.persons[i].getWorkStation().equals(workStation)){
                this.persons[i].toString();
            
            }
        }
    }    
    public void viewAllPerson(){
    
        for(int i=0 ;i<this.persons.length;i++){
            System.out.println(this.persons[i].toString());
        
        }
    
    }
    
    public int searchPerson(String ced) {

        for (int i = 0; i < this.persons.length; i++) {
            
            if (this.persons[i].getIde().equals(ced)) {

                return i;
            }
        }

        return -1;

    }
    public void viewPerson(String ide){
    int pos = searchPerson(ide);
    
        if(pos!= 1){
            this.persons[pos].toString();

        }else{
            System.out.println("No se encontro alguna persona con ese numero de cedula.");
            
        }

    }
    
    public void deletePerson(String ide){
    int j = searchPerson(ide);
        for(int i=j;i<this.persons.length-1;i++){
            this.persons[i] = this.persons[i+1];
            
        }
        ;
    }
    
    public void modifyPerson(String ide, String opc)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pos = searchPerson(ide);
        
        switch(opc){
        
            case "1"://name
                System.out.println("Digite el nuevo Nombre: ");
                String rename = br.readLine();
                this.persons[pos].setName(rename);
                System.out.println("\nEl nombre se cambio correctamente...");
                this.persons[pos].toString();
                break;
        
            case "2"://lastName
                System.out.println("Digite el nuevo Apellido: ");
                String reLastName = br.readLine();
                this.persons[pos].setLastName(reLastName);
                System.out.println("\nEl Apellido se cambio correctamente...");
                this.persons[pos].toString();
                break;
            
            case "3"://celphone
                
                System.out.println("Digite el nuevo numero: ");
                String recelphone = br.readLine();
                this.persons[pos].setCelphone(recelphone);
                System.out.println("\nEl numero se cambio correctamente...");
                this.persons[pos].toString();
                break;    
            case "4"://WorkStation
                
                System.out.println("Digite el nuevo Puesto: ");
                String reworkStation = br.readLine();
                this.persons[pos].setCelphone(reworkStation);
                System.out.println("\nEl puesto se cambio correctamente...");
                this.persons[pos].toString();
                break;
            
            default :
                System.out.println("Opcion Incorrecta");
                
                break;
                
        }
    }
    
    public void payH(String ide)throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pos = searchPerson(ide);
        double res=0;
        double price;
        int horaT;
        if(pos!= -1){
            
            System.out.println("Digite las horas trabajadas");
            horaT = Integer.parseInt(br.readLine());
            System.out.println("Digite el precio por hora para el puesto asignado");
            price = Double.parseDouble(br.readLine());
            
            res = payHour(horaT,price);
            this.pays.setHours(res);
        }
          
      }
    
    public double payHour(int horaT, double price){
    double result=0;
    
    return result = horaT*price; 
    }
    
    public void payExtras(String ide)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pos = searchPerson(ide);
        double res=0;
        double price;
        int horaT;
        if(pos!= -1){
            
            System.out.println("Digite las horas extras trabajadas en 2 semanas");
            horaT = Integer.parseInt(br.readLine());
            System.out.println("Digite el precio por hora extra para el puesto asignado");
            price = Double.parseDouble(br.readLine());
            
            res = payHourExtra(horaT,price);
            this.pays.setExtraHours(res);
    
    
        }
    
    }
    public double payHourExtra(int horaT, double price){
    double result=0;
    
    return result = horaT*price; 
    }
    
    
    
    
}
