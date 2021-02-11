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
public class Bill {
   public String billID;
   public String billDate;
   public Double finalBill;
   public Double advPay;
   public Double billAmount;
   
   public Bill(String billID,String billDate,Double finalBill,Double advPay,Double billAmount){
       this.billID = billID;
       this.billDate = billDate;
       this.finalBill = finalBill;
       this.advPay = advPay;
       this.billAmount = billAmount;
   }
}
