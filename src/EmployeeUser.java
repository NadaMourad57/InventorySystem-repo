public class EmployeeUser {
    private String name;
    private String employeeId;
    private String email;
    private String address;
    private String phoneNumber;

    public EmployeeUser(String name, String employeeId, String email, String address, String phoneNumber) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String lineRepresentation(){
        String s = this.employeeId + "," + this.name + "," + this.email + "," + this.address + "," + this.phoneNumber;
        return s;
    }
    public String getSearchKey(){
        return this.employeeId;
    }

}
