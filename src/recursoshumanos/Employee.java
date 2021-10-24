/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public Employee() {
        this.salary = 0;
        this.startJob = "Undefined";
        this.workStation = "Undefined";
        
    }
    
    public Employee(double salary, String startJob, String workStation) {
        this.salary = salary;
        this.startJob = startJob;
        this.workStation = workStation;
    }

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
    
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + this.workStation;
    }
}
