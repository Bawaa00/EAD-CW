/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bill;
import Model.Book;
import Model.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bawantha
 */
public class SaveBill {
    Bill bill;
    Book book;
    
    public SaveBill(){
        
    }
    public SaveBill(Bill bill,Book book){
        this.bill = bill;
        this.book = book;
    }
    
    public void saveToDatabase(){
         try{
            Connection con = DB.createConnection();
            String sql1 = "INSERT INTO billing VALUES ('"+bill.billID+"','"+book.bookID+"','"+bill.billDate+"','"+bill.billAmount+"','"+bill.advPay+"',"+bill.finalBill+")";
            PreparedStatement statement = con.prepareStatement(sql1);
            int i = statement.executeUpdate();
            if(i>=1)
            {
                JOptionPane.showMessageDialog(null,"Bill Saved Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Could not save bill","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something Went Wrong With BIlling."+e.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
