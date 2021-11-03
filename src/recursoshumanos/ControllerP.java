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
    private int tamP=0;
    private Pay pays [] = new Pay [20];
   

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
    
        for(int i=0;i<this.tam;i++){
            if(this.persons[i].getWorkStation().equals(workStation)){
                System.out.println(this.persons[i].toString());
            
            }
        }
    }
    
       
    public void viewAllPerson(){
    
        for(int i=0 ;i<this.tam;i++){
            System.out.println(this.persons[i].toString());
        
        }
        
    }
    
    public int searchPerson(String ide) {

        for (int i = 0; i < this.tam; i++) {
            
            if (this.persons[i].getIde().equals(ide)) {

                return i;
            }
        }

        return -1;

    }
    public int searchP(String ide) {

        for (int i = 0; i < this.tamP; i++) {
            
            if (this.pays[i].getIde().equals(ide)) {

                return i;
            }
        }

        return -1;

    }
    public void viewP(String ide){
        int pos = searchP(ide);
        for(int i=0;i<this.tamP;i++){
            if(pos!=-1){
                this.pays[pos].toString();
            
            }else{
                System.out.println("No existe");
            }
        }
    }
    
    public void viewPerson(String ide){
    int pos = searchPerson(ide);
    
        if(pos!= -1){
            System.out.println(this.persons[pos].toString());

        }else{
            System.out.println("No se encontro alguna persona con ese numero de cedula.");
            
        }

    }
    
    public void deletePerson(String ide){
    int j = searchPerson(ide);
        for(int i=j;i<this.tam-1;i++){
            this.persons[i] = this.persons[i+1];
            
        }
        System.out.println("La persona se ha elimanado Correctamente");
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
    
    
    public double payHour(int horaT, double price){
    
    return horaT*price; 
    }
    
    
    public double payHourExtra(int horaT, double price){
    
    
    return  horaT*price; 
    }

    public double payVale(double vale, int interesVale ){
        double res=0;
        
        res = vale/10000;
        

        return vale+(res * interesVale);
    }
    
    
    public void pay(String ide)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("aqui");
        int pos = searchPerson(ide);
        System.out.println("aqui");
        int horaT=0;
        double price;
        
        double settHour=0;
        double settVale=0;
        double settExtra=0;
        double brutSalary=0;
        double netSalary=0;
        double vale=0;
        double ccss = 0.12;
        double sure=0;
        
        if(pos!=-1){
            
            System.out.println("Digite las horas trabajadas");
            horaT = Integer.parseInt(br.readLine());
            System.out.println("Digite el precio por hora para el puesto asignado");
            price = Double.parseDouble(br.readLine());
            
            settHour = payHour(horaT,price);
            
            System.out.println(this.persons[pos].getName()+" "+this.persons[pos].getLastName()+ " Registro otras Horas Extras? N/S ");
            String  decision = br.readLine();

            if(decision.equals("S")){
                System.out.println("Digite las horas extras trabajadas en 2 semanas");
                horaT = Integer.parseInt(br.readLine());
                System.out.println("Digite el precio por hora extra para el puesto asignado");
                price = Double.parseDouble(br.readLine());
                
                settExtra = payHourExtra(horaT,price);
            } else{
                System.out.println("No se registro horas extras");
                settExtra=0;
            }

            System.out.println(this.persons[pos].getName()+" "+this.persons[pos].getLastName()+ " Solicito Vale? N/S ");
            decision = br.readLine();  
            
            if(decision.equals("S")){
                System.out.println("Digite el monto del vale");
                vale = Double.parseDouble(br.readLine());
                System.out.println("Digite el interes del vale por cada 10 mil colones");
                int interesVale = Integer.parseInt(br.readLine());
                
                settVale = payVale(vale,interesVale);
                
                System.out.println("El vale es de: "+ payVale(vale,interesVale));
            } else{
                System.out.println("No se registro vale");
                settVale =0;
            }
            
            brutSalary = settHour + settExtra + vale ;
            sure = (brutSalary * ccss);
            netSalary = brutSalary - settVale - sure;
            Pay newPay = new Pay(ide,brutSalary,netSalary,settHour,settExtra,settVale);
            this.pays[tamP] = newPay;
            this.tamP++;
        }
        

    }
    public void viewPayPerson(String ide){
        int pos = searchPerson(ide);
        int posP = searchP(ide);
        if((pos!= -1)&&(posP!= -1)){
            System.out.println(this.persons[pos].toString() + "\n" + this.pays[posP].toString()); 
        }else{
            System.out.println("No se encontro alguna persona con ese numero de cedula.");
        }
    }
    
    public void viewAllPay(){

        for(int i =0;i<this.persons.length;i++){
            for(int j=0;j<this.pays.length;j++){
                if(this.persons[i].getIde().equals(this.pays[j].getIde())){
                    System.out.println(this.persons[i].toString() + "\n" + this.pays[j].toString()); 
                }
            }
        }
    }

    
    
    
}
