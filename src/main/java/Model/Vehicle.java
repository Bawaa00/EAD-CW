/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bawantha
 */
public class Vehicle {
    public String lPlate;
    public int year;
    public String make;
    public String model;
    public String category;
    public int costPerMonth;
    public String vPath;
    
    public Vehicle(){
        
    }
    public Vehicle(String lPlate,int year,String make,String model,String category,int costPerMonth,String vPath)
    {
        this.lPlate = lPlate;
        this.year = year;
        this.make = make;
        this.model = model;
        this.category = category;
        this.costPerMonth = costPerMonth;
        this.vPath = vPath;
    }
    public void setID(String lPlate){
        this.lPlate = lPlate;
    }
    
}
