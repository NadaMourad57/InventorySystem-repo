import java.time.LocalDate;

public class CustomerProduct {
    private String customerSSN;
    private String productID;
    private LocalDate purchaseDate;

    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate) {
        this.customerSSN = customerSSN;
        this.productID = productID;
        this.purchaseDate = purchaseDate;
    }
    public String getCustomerSSN(){
        return customerSSN;

    }
    public String getProductID(){
        return productID;
    }
     public LocalDate getPurchaseDate(){
        return purchaseDate;
     }
    public String lineRepresentation(){
        String s=this.customerSSN+", "+this.productID+", "+this.purchaseDate.getDayOfMonth()+"-"+this.purchaseDate.getMonth()+"- "+this.purchaseDate.getYear();
        return s;


    }
    public String getSearchKey(){
        return this.lineRepresentation();
    }


}
