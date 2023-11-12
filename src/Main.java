// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AdminRole admin=new AdminRole();
        admin.addEmployee("Ahmed","8413","hossam@gmail.com","8 khalil hassan khalil","01274745623");
        admin.logout();
        admin.database.saveToFile();
    }
}