/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Backend;

/**
 *
 * @author nadamourad
 */



 class EmployeeUserDatabase extends AbstractDatabase <EmployeeUser>{

    public EmployeeUserDatabase(String filename) {
        super(filename);

    }

    @Override
    public String getSearchKey(EmployeeUser record) {
        return record.getSearchKey();
    }

    @Override
    public EmployeeUser createRecordFrom(String line) {
        String[]employee=line.split(",");
        EmployeeUser emp=new EmployeeUser(employee[0],employee[1],employee[2],employee[3],employee[4]);
        return emp;
    }

    @Override
    public String recordToLine(EmployeeUser record) {
      return record.lineRepresentation();
    }
}

