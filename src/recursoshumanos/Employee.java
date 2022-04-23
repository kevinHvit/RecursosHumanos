/*
 * Patron de diseño: Bridge
 *Se divido el problema de la clase employee en dos clases, una Employee para trabajar las personas y la otra para trabajar los salarios
 * Se dividio el problema en dos clases estrechamente relacionadas.
 */
package recursoshumanos;

import java.util.Date;

/**
 *
 * @author Kevin Castrillo
 */
public class Employee extends Person{
    
    private double salary;
    private String startJob;
    private String workStation;

    
    //se inicializa el Constructor de la clase 
    public Employee() {
        this.salary = 0;
        this.startJob = "Undefined";
        this.workStation = "Undefined";
        
    }
    //constructor de la clase
    public Employee(double salary, String startJob, String workStation) {
        this.salary = salary;
        this.startJob = startJob;
        this.workStation = workStation;
    }

    //constructor de la clase mas la herencia de la clase persona
    public Employee(double salary, String startJob, String workStation, int age, String ide, String name, String lastName, String location, String celphone) {
        super(age, ide, name, lastName, location, celphone);
        this.salary = salary;
        this.startJob = startJob;
        this.workStation = workStation;
    }
    
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the startJob
     */
    public String getStartJob() {
        return startJob;
    }

    /**
     * @param startJob the startJob to set
     */
    public void setStartJob(String startJob) {
        this.startJob = startJob;
    }

    /**
     * @return the workStation
     */
    public String getWorkStation() {
        return workStation;
    }

    /**
     * @param workStation the workStation to set
     */
    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }
    
    //toString heredado de persona mas caracteristicas propias de la clase
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + this.workStation;
    }
    
    
}
