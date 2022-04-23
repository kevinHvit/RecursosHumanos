/*
 * 
 * Patron de de diseño: mediator
 * 
 * En este clase  se esta utilizando el patron de diseño mediator para que el controlador pueda interactuar con la clase employee y la clase pay.
 * 
 * 
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
    /**
     *En este apartado se esta utilizando el patron de diseño bridge 
     * @employee
     * @Pay
     */
    private Employee persons [] = new Employee [20];
    private int tam=0;
    private int tamP=0;
    private Pay pays [] = new Pay [20];
   
   
    public Employee createPerson()throws IOException {

    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
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
            String sal = br.readLine();
            double salary = Double.parseDouble(sal);
            System.out.println("Fecha de inicio laboral: ");
            String startJob = br.readLine();

            Employee nuevo = new Employee(salary, startJob, workStation, age, ide, name, lastName, location, celphone);

            return nuevo;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    /**
     * agrega una persona al vector
     * @param persons
     * @param tam
     * @param pays
     * @param tamP
     */
    public void addPerson() throws IOException{
        
        this.persons[this.tam]= createPerson();
        this.tam++;
    }    
    
    /**
     * agrega una persona al vector
     * @param persons
     * @param tam
     * @param pays
     * @param tamP
     */
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
    public int searchPay(String ide) {

        for (int i = 0; i < this.tamP; i++) {
            
            if (this.pays[i].getIde().equals(ide)) {

                return i;
            }
        }

        return -1;

    }

    public void viewP(String ide){
        
        try{
            int pos = searchPay(ide);
            for (int i = 0; i < this.tamP; i++) {
                if (pos != -1) {
                    this.pays[pos].toString();

                } else {
                    System.out.println("No existe");
                }
            }
        
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void viewPerson(String ide){
        
        try{
            int pos = searchPerson(ide);

            if (pos != -1) {
                System.out.println(this.persons[pos].toString());
            } else {
                System.out.println("No se encontro alguna persona con ese numero de cedula.");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    

    }
    
    public void deletePerson(String ide){
        
        try {
            int j = searchPerson(ide);
            for (int i = j; i < this.tam - 1; i++) {
                this.persons[i] = this.persons[i + 1];

            }
            this.tam--;
            System.out.println("La persona se ha elimanado Correctamente");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public void modifyPerson(String ide, String opc)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        try {
            int pos = searchPerson(ide);

            switch (opc) {

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

                default:
                    System.out.println("Opcion Incorrecta");

                    break;

            }
        
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
    public double payHour(int horaT, double price){
    
    return horaT*price; 
    }
    
    
    public double payHourExtra(int horaT, double price){
    
    
    return  horaT*price; 
    }


    public void pay(String ide)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int pos = searchPerson(ide);
        
        int horaT=0;
        int horaE=0;
        double price;
        
        double settHour=0;
        //double settVale=0;
        double settExtra=0;
        double brutSalary=0;
        double netSalary=0;
        double vale=0;
        double ccss = 0.12;
        double sure=0;
        try{
            if (pos != -1) {

                System.out.println("Digite las horas trabajadas en esta Quincena");
                horaT = Integer.parseInt(br.readLine());
                System.out.println("Digite el precio por hora para el puesto asignado");
                price = Double.parseDouble(br.readLine());

                settHour = payHour(horaT, price);

                System.out.println(this.persons[pos].getName() + " " + this.persons[pos].getLastName() + " Registro otras Horas Extras? N/S ");
                String decision = br.readLine().toUpperCase();

                if (decision.equals("S")) {
                    System.out.println("Digite las horas extras trabajadas en 2 semanas");
                    horaE = Integer.parseInt(br.readLine());
                    price *= 2;
                    System.out.println("El precio de la hora Extra es: " + price);

                    settExtra = payHourExtra(horaE, price);

                } else {
                    System.out.println("No se registro horas extras");
                    settExtra = 0;
                }

                System.out.println(this.persons[pos].getName() + " " + this.persons[pos].getLastName() + " Solicito Vale? N/S ");
                decision = br.readLine().toUpperCase();

                if (decision.equals("S")) {
                    System.out.println("Digite el monto del vale");
                    vale = Double.parseDouble(br.readLine());
//                System.out.println("Digite el interes del vale por cada 10 mil colones");
//                int interesVale = Integer.parseInt(br.readLine());

                    //settVale = payVale(vale,interesVale);
                } else {
                    System.out.println("No se registro vale");
                }

                brutSalary = settHour + settExtra + vale;
                sure = (brutSalary * ccss);
                netSalary = brutSalary - vale - sure;

                Pay newPay = new Pay(ide, brutSalary, netSalary, horaT, horaE, vale);

                this.pays[tamP] = newPay;
                this.tamP++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
 
    public void viewPayPerson(String ide){
        try {
        
            for (int j = 0; j < this.tamP; j++) {
                if (this.persons[j].getIde().equals(ide)) {
                    System.out.println(this.pays[j].toString());
                    System.out.println("<--------------------------------------->");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void viewAllPay(){

        for(int i =0;i<this.tam;i++){
            for(int j=0;j<this.tamP;j++){
                if(this.persons[i].getIde().equals(this.pays[j].getIde())){
                    System.out.println(this.persons[i].toString() + "\n" + this.pays[j].toString()); 
                    System.out.println("<--------------------------------------->");
                }
            }
        }
    }
}
