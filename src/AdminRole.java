
public class AdminRole {
    private EmployeeUserDatabase database;

    public AdminRole() {

        database=new EmployeeUserDatabase("Employee.txt");
    }

    public void addEmployee(String name,String Id,String email,String address,String phone){
        EmployeeUser user=new EmployeeUser(name,Id,email,address,phone);
        database.insertRecord(user);

    }
   public EmployeeUser[] getListOfEmployees()  {
           return database.returnAllRecords().toArray(new EmployeeUser[database.returnAllRecords().size()]);

   }
public void removeRecord(String key){
        database.deleteRecord(key);

}
public void logout(){
        database.saveToFile();
}
}
