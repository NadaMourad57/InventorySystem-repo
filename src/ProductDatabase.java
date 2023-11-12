
public class ProductDatabase extends AbstractDatabase<Product> {
    public ProductDatabase(String filename) {
        super(filename);

    }

    @Override
    protected String getSearchKey(Product record) {
        return record.getSearchKey();
    }

    @Override
    protected Product createRecordFrom(String line) {
        String[] productdata = line.split(",");
        Product product = new Product(productdata[0], productdata[1], productdata[2], productdata[3], Integer.parseInt(productdata[4]), Float.parseFloat(productdata[5]));
        return product;
    }

    @Override
    protected String recordToLine(Product record) {
    return record.lineRepresenation();
    }
}