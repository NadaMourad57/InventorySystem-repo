/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Backend;

/**
 *
 * @author nadamourad
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class Main {
    public static void main(String[] args) {
        AdminRole admin=new AdminRole();
        admin.addEmployee("Ahmed","8413","hossam@gmail.com","8 khalil hassan khalil","01274745623");
        admin.removeEmployee("8413");
        admin.logout();
        admin.database.saveToFile();
    }
}