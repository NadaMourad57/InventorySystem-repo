import java.io.*;
import java.util.ArrayList;

public abstract class AbstractDatabase<T> {
    protected ArrayList<T> records ;

    protected String filename;

    public AbstractDatabase(String filename) {
        this.records=new ArrayList<T>();
        this.filename = filename;
        this.readFromFile();
    }

    protected abstract String getSearchKey(T record);

    protected abstract T createRecordFrom(String line) ;
    protected abstract String recordToLine(T record);



    public boolean contains(String key) {
        return this.records.stream().anyMatch(record->this.getSearchKey(record).equals(key));

    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }


    public void readFromFile() {
        {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));


                String line;
                while ((line = reader.readLine()) != null) {
                    T t = createRecordFrom(line);
                    this.records.add(t);
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }



    public ArrayList<T>returnAllRecords() {

        return this.records;
    }


    public  T getRecord(String Key){
        return this.records.stream().filter((record->this.getSearchKey(record).equals(Key))).findFirst().orElse(null);

    }
    public void insertRecord(T record){

        this.records.add(record);
//        System.out.println("number of records is "+records.size());
    }
    public  void deleteRecord(String Key){
        this.records.removeIf(record->this.getSearchKey(record).equals(Key));
    }

    public void saveToFile (){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
            for(T t :this.records){
//                System.out.println(this.recordToLine(t));
//                System.out.println(filename);
                writer.write(this.recordToLine(t));
                writer.write('\n');

            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
