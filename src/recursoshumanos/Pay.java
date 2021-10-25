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
    
    private double hours;
    private double extraHours;
    private double vale;

    public Pay() {
        
        this.hours = 0.0;
        this.extraHours = 0.0;
        this.vale = 0.0;
        
    }

    public Pay(double hours, double extraHours, double vale) {
        this.hours = hours;
        this.extraHours = extraHours;
        this.vale = vale;
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
    
    
    
    
    
    
    
}
