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
public class Book {
    public String bookID;
    public String bookDate;
    public int bookMonths;
    public String cusName;
    public String cusAddress;
    public int cusContact;
    public String cusImage;
    
    public Book(String bookID,String bookDate,int bookMonths,String cusName,String cusAddress,int cusContact,String cusImage){
        this.bookID = bookID;
        this.bookDate = bookDate;
        this.bookMonths = bookMonths;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusContact = cusContact;
        this.cusImage = cusImage;
        
    }
}
