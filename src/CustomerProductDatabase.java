import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerProductDatabase extends AbstractDatabase<CustomerProduct>{
    public CustomerProductDatabase(String filename) {
        super(filename);
    }

    @Override
    public String getSearchKey(CustomerProduct record) {
        return record.getSearchKey();
    }

    @Override
    public CustomerProduct createRecordFrom(String line) {
        String[]customer=line.split(",");
        System.out.println(customer[2]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       LocalDate date = LocalDate.parse(customer[2], formatter);
        System.out.println(date);

       CustomerProduct customerProduct=new CustomerProduct(customer[0],customer[1],date);

        return customerProduct;
    }

    @Override
    public String recordToLine(CustomerProduct record) {
        String s= record.getCustomerSSN()+","+record.getProductID()+","+record.getPurchaseDate();
        return s;
    }
}
