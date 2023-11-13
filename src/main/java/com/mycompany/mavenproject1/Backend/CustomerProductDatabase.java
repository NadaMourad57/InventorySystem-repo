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

 class CustomerProductDatabase extends AbstractDatabase<CustomerProduct>{
    public CustomerProductDatabase(String filename) {
        super(filename);
    }

    @Override
    public String getSearchKey(CustomerProduct record) {
        return record.getSearchKey();
    }

    @Override
    public CustomerProduct createRecordFrom(String line) {
        String[]customer=line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       LocalDate date = LocalDate.parse(customer[2], formatter);
        System.out.println(date);

       CustomerProduct customerProduct=new CustomerProduct(customer[0],customer[1],date);

        return customerProduct;
    }

    @Override
    public String recordToLine(CustomerProduct record) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date =(record.getPurchaseDate().format(formatter));
        String s= record.getCustomerSSN()+","+record.getProductID()+","+date;
        return s;
    }
}
