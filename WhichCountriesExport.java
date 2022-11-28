import edu.duke.*;
import org.apache.commons.csv.*;

/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class WhichCountriesExport 
{
    
    public void listExports(CSVParser parser, String exportOfInterest)
    {
        String country;
        
        for(CSVRecord record: parser)
        {
            String exports = record.get("Exports");
            
            if(exports.contains(exportOfInterest))
            {
                country = record.get("Country");
                System.out.println(country);
            }
        }
    }
    
    public void testListExports()
    {
        FileResource file   = new FileResource("exportdata.csv");
        CSVParser    parser = file.getCSVParser();
        
        listExports(parser, "coffee");
    }
}
