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

public class EmployeeRole {
    private ProductDatabase productDatabase;
    private CustomerProductDatabase customerProductDatabase;

    public EmployeeRole() {
        this.productDatabase=new ProductDatabase("Products.txt");
        this.customerProductDatabase=new CustomerProductDatabase("CustomerProducts.txt");

    }
    public void addProduct(String productID, String productName, String manufacturerName, String supplierName, int quantity,float price){
        Product product=new Product(productID,productName,manufacturerName,supplierName,quantity,price);
        this.productDatabase.insertRecord(product);

    }
    public Product[] getListOfProducts(){
        return this.productDatabase.returnAllRecords().toArray(new Product[productDatabase.returnAllRecords().size()]);
    }
    public CustomerProduct[] getListOfPurchasingOperations(){
        return this.customerProductDatabase.returnAllRecords().toArray(new CustomerProduct[customerProductDatabase.returnAllRecords().size()]);
    }

public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate){
        int quantity=this.productDatabase.getRecord(productID).getQuantity();
        if(quantity==0)
            return false;
        else {
            this.productDatabase.getRecord(productID).setQuantity(quantity-1);
            CustomerProduct customerProduct=new CustomerProduct(customerSSN,productID,purchaseDate);
            this.customerProductDatabase.insertRecord(customerProduct);
            this.customerProductDatabase.saveToFile();
            this.productDatabase.saveToFile();
            return true;

        }
}
public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate,LocalDate returnDate) {
    CustomerProduct customerProduct = new CustomerProduct(customerSSN, productID, purchaseDate);

    if (returnDate.isBefore(purchaseDate) || !(this.customerProductDatabase.containsRecord(customerProduct.getSearchKey())) || purchaseDate.plusDays(14).isBefore(returnDate)) {
        return -1;
    } else {
        Product product = this.productDatabase.getRecord(productID);
        product.setQuantity(product.getQuantity() + 1);
        this.customerProductDatabase.deleteRecord(customerProduct.getSearchKey());
        this.customerProductDatabase.saveToFile();
        this.productDatabase.saveToFile();
        return product.getPrice();
    }
}

    public void logout(){
            this.productDatabase.saveToFile();
            this.customerProductDatabase.saveToFile();
    }


}

