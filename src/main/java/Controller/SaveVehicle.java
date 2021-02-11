/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.Vehicle;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Bawantha
 */
public class SaveVehicle {
    Vehicle vehicle;
    
    public SaveVehicle(){
    
    }
    public SaveVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    
    public void saveVehicleToDatabase(){
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO vehicles VALUES ('"+vehicle.lPlate+"',"+vehicle.year+",'"+vehicle.make+"','"+vehicle.model+"','"+vehicle.category+"',"+vehicle.costPerMonth+",'"+vehicle.vPath+"')";
        
            PreparedStatement statement = con.prepareStatement(sql);
            int i = statement.executeUpdate();
            
            if(i>=1)
            {
                JOptionPane.showMessageDialog(null,"Data Saved Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Could not save data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something Went Wrong."+e.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
