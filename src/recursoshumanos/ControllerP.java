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
    
    Employee persons [] = new Employee [20];
   
   

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
        
        for(int i=0;i<this.persons.length;i++){
        
            this.persons[i]= createPerson();
        
        }    
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
    
    }
    
    public void modifyPerson(){
    
    
    
    
    }
    
    
}
