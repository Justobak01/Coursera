package StringsFirstAssignments;


/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class Part4 {
    
    public void findingURLs () { 
    URLResource file= new URLResource ("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
    String result = "";
    for (String item : file.words()) {
           String itemLower = item.toLowerCase();
           int pos = itemLower.indexOf("youtube.com");
           if (pos != -1) {
              int beg = itemLower.lastIndexOf("\"",pos);
              int end = itemLower.indexOf("\"", pos+1);
              System.out.println(itemLower.substring(beg+1,end));
              result = item.substring(beg+1, end);
              System.out.println(result);
               }
    }

 }
}
