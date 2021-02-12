/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
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
public class SaveBooking {
    Book book;
    Vehicle vehicle;
    
    public SaveBooking(){
    }
    public SaveBooking(Book book,Vehicle vehicle){
        this.book = book;
        this.vehicle = vehicle;
    }
    public void saveToDatabase(){
         try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO booking VALUES ('"+book.bookID+"','"+vehicle.lPlate+"','"+book.bookDate+"','"+book.bookMonths+"','"+book.cusName+"','"+book.cusAddress+"',"+book.cusContact+",'"+book.cusImage+"')";
            PreparedStatement statement = con.prepareStatement(sql);
            int i = statement.executeUpdate();
            if(i>=1)
            {
                JOptionPane.showMessageDialog(null,"Booking Saved Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Could not save booking to the database","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Database Error","Error",JOptionPane.ERROR_MESSAGE); 
        }         
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something Went Wrong with booking."+e.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
