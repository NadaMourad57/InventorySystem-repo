import java.time.LocalDate;

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
            CustomerProduct customerProduct=new CustomerProduct(customer[0],customer[1], LocalDate.parse(customer[2]));

        return customerProduct;
    }

    @Override
    protected String recordToLine(CustomerProduct record) {
        String s= record.getCustomerSSN()+","+record.getProductID()+","+record.getPurchaseDate();
        return s;
    }
}
