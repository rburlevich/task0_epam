import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Reader {

    /*
    This method read all lines from a file and receive list of strings
     */
    public LinkedList<String> read(String fileName) {
        LinkedList<String> listOfImportedStrings = new LinkedList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str = null;
            while ((str = br.readLine()) != null){
                listOfImportedStrings.add(str.trim());
            }
            br.close();
            System.out.println("Data successfully imported!");

        } catch (FileNotFoundException e) {
            System.out.println("File '"+fileName+"' is absent.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfImportedStrings;
    }

}
