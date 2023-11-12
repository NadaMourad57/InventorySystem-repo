
public class AdminRole {
    public EmployeeUserDatabase database;

    public AdminRole() {

       this.database=new EmployeeUserDatabase("resources/Employee.txt");
    }

    public void addEmployee(String name,String Id,String email,String address,String phone){
        EmployeeUser user=new EmployeeUser(name,Id,email,address,phone);
        System.out.println("created user "+user.getName());
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
