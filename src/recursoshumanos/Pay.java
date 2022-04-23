/*
 * Patron de diseño: Bridge
 *Se divido el problema de la clase employee en dos clases, una Employee para trabajar las personas y esta otra para trabajar los salarios
 * Se dividio el problema en dos clases estrechamente relacionadas
 * 
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
    /**
     * @return the netSalary
     */
    public double getNetSalary(){

        return netSalary;
    }
    /**
     * @param netSalary the netSalary to set
     */
    public void setNetSalary(double netSalary){


        this.netSalary = netSalary;
    }
    /**
     * @return the brutSalary
     */
    public double getBrutSalary(){

        return brutSalary;
    }
    /**
     * @param brutSalary the brutsalary to set
     */
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
    //ToString para la seccion de pago
     @Override
    public String toString() {
        double ccss=this.getBrutSalary()*0.12;
        //String val=(this.getVale()>1) ? "\nVale: "+this.getVale() : "\n";
    return "\nSalario Bruto: "+this.getBrutSalary()+"\nCCSS: "+ccss+
            "\nSalario Neto: "+ this.getNetSalary()+"\nHoras Trabajadas: " 
            + this.getHours()+ "\nHoras extras: " + this.getExtraHours() +
         (   (this.getVale()>1) ? "\nVale: "+this.getVale() : "\n");
   }

}
