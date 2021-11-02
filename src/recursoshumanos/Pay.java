/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

/**
 *
 * @author Kevin Castrillo
 */
public class Pay {
    
    private double brutSalary;
    private double netSalary;
    private double hours;
    private double extraHours;
    private double vale;
    private String ide;

    public Pay() {
        
        double brutSalary=0.0;
        double netSalary = 0.0;
        this.hours = 0.0;
        this.extraHours = 0.0;
        this.vale = 0.0;
        this.ide = " ";
    }

    public Pay(String ide,double brutSalary, double netSalary,double hours, double extraHours, double vale) {
        
        this.ide = ide;
        this.brutSalary = brutSalary;
        this.netSalary =netSalary;
        this.hours = hours;
        this.extraHours = extraHours;
        this.vale = vale;
    }
    public String getIde(){

        return ide;
    }
    public void setIde(String ide){


        this.ide = ide;
    }
    
    public double getNetSalary(){

        return netSalary;
    }
    public void setNetSalary(double netSalary){


        this.netSalary = netSalary;
    }
    public double getBrutSalary(){

        return brutSalary;
    }
    public void setBrutSalary(double brutSalary){


        this.brutSalary = brutSalary;
    }
    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * @return the extraHours
     */
    public double getExtraHours() {
        return extraHours;
    }

    /**
     * @param extraHours the extraHours to set
     */
    public void setExtraHours(double extraHours) {
        this.extraHours = extraHours;
    }

    /**
     * @return the vale
     */
    public double getVale() {
        return vale;
    }

    /**
     * @param vale the vale to set
     */
    public void setVale(double vale) {
        this.vale = vale;
    }
    
     @Override
    public String toString() {
    return "\nSalario Bruto: "+this.getBrutSalary()+"\nSalario Neto: "+ this.getNetSalary()+"\nHoras Trabajadas: " + this.getHours()+ "\nHoras extras: " + this.getExtraHours() + "\nVale: "+ this.getVale();
   }

    
    
    
    
    
}
