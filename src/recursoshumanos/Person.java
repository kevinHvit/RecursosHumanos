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
public class Person {
   
   private int age;
   private String ide;
   private String name;
   private String lastName;
   private String location;
   private String celphone;

    public Person() {
        this.age = 0;
        this.ide = "Undefined";
        this.name = "Undefined";
        this.lastName = "Undefined";
        this.location = "Undefined";
        this.celphone = "Undefined";
        
    }

    public Person(int age, String ide, String name, String lastName, String location, String celphone) {
        this.age = age;
        this.ide = ide;
        this.name = name;
        this.lastName = lastName;
        this.location = location;
        this.celphone = celphone;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the ide
     */
    public String getIde() {
        return ide;
    }

    /**
     * @param ide the ide to set
     */
    public void setIde(String ide) {
        this.ide = ide;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the celphone
     */
    public String getCelphone() {
        return celphone;
    }

    /**
     * @param celphone the celphone to set
     */
    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }
    @Override
   public String toString() {
    return "\nCédula: "+this.getIde()+ "\nNombre: "+this.getName()+ "\nApellido: " + this.getLastName() + "\nCelular: " + this.getCelphone();
   }

    
    
   

}
