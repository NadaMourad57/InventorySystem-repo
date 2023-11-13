/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Backend;

/**
 *
 * @author nadamourad
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerProduct {
    private String customerSSN;
    private String productID;
    private LocalDate purchaseDate;

    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate) {
        this.customerSSN = customerSSN;
        this.productID = productID;
        this.purchaseDate= purchaseDate;

    }
    public String getCustomerSSN(){
        return this.customerSSN;

    }
    public String getProductID(){
        return this.productID;
    }
     public LocalDate getPurchaseDate(){
        return this.purchaseDate;
     }
    public String lineRepresentation(){

        String date=this.purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String s=this.customerSSN+","+this.productID+","+date;
        return s;


    }
    public String getSearchKey(){

        return this.lineRepresentation();
    }


}


