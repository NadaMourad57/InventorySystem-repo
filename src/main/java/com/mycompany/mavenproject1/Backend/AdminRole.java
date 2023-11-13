/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Backend;


/**
 *
 * @author nadamourad
 */

public class AdminRole {
    public EmployeeUserDatabase database;

    public AdminRole() {

       this.database=new EmployeeUserDatabase("Employee.txt");
    }

    public void addEmployee(String Id,String name,String email,String address,String phone){
        EmployeeUser user=new EmployeeUser(Id,name,email,address,phone);
        this.database.insertRecord(user);

    }
   public EmployeeUser[] getListOfEmployees()  {
           return this.database.returnAllRecords().toArray(new EmployeeUser[0]);

   }
public void removeEmployee(String key){
        this.database.deleteRecord(key);

}
public void logout(){
//    System.out.println("saving");
        this.database.saveToFile();


}
}
