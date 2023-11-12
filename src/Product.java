public class Product {
    private String productID;
    private String productName;
    private String manufacturerName;
    private String SupplierName;
    private int quantity;
    private float price;

    public Product(String productID, String productName, String manufacturerName, String supplierName, int quantity, float price) {
        this.productID = productID;
        this.productName = productName;
        this.manufacturerName = manufacturerName;
        this.SupplierName = supplierName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public String lineRepresenation(){
        String s = this.productID + ", " + this.productName + ", " + this.manufacturerName + "," + this.SupplierName + "," + this.quantity+","+this.price;
        return s;
    }
    public String getSearchKey(){
        return this.productID;
    }

}
