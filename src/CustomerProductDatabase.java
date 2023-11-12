import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerProductDatabase extends AbstractDatabase<CustomerProduct>{
    public CustomerProductDatabase(String filename) {
        super(filename);
    }

    @Override
    protected String getSearchKey(CustomerProduct record) {
        return record.getSearchKey();
    }

    @Override
    protected CustomerProduct createRecordFrom(String line) {
        String[]customer=line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(customer[2], formatter);

        CustomerProduct customerProduct=new CustomerProduct(customer[0],customer[1],date);

        return customerProduct;
    }

    @Override
    protected String recordToLine(CustomerProduct record) {
        String s= record.getCustomerSSN()+","+record.getProductID()+","+record.getPurchaseDate();
        return s;
    }
}
