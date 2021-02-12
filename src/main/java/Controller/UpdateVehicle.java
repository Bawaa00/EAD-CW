/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bawantha
 */
public class UpdateVehicle {
    Vehicle vehicle;
    
    public UpdateVehicle(){
        
    }
    public UpdateVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    
    public void updateVehicleDatabase(){
        try{
            Connection con = DB.createConnection();
            String sql = "Update vehicles set Year="+vehicle.year+",Make='"+vehicle.make+"',Model='"+vehicle.model+"',Category='"+vehicle.category+"',Cost_per_month="+vehicle.costPerMonth+", V_path='"+vehicle.vPath+"' where LPlate = '"+vehicle.lPlate+"'";
        
            PreparedStatement statement = con.prepareStatement(sql);
            int i = statement.executeUpdate();
            if(i>=1)
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Could not update data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Database Error","Error",JOptionPane.ERROR_MESSAGE); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something Went Wrong."+e.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
