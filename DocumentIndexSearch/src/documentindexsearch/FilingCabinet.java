/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentindexsearch;

/**
 *
 * @author james
 */

import org.apache.commons.io.FileUtils; 
import java.io.File;
import java.util.ArrayList; 
import java.util.Collection;
       
public class FilingCabinet {
    
    private final String directory;
    private Collection<File> files; 
    
    public FilingCabinet(String dir) {
        this.directory = dir; 
        this.files = new ArrayList();
    }
    
    public void findFiles() {
        System.out.println("Find Files called");
        File dir = new File(this.getDirectory());
        String[] fileExtensions = {
            "txt", "pdf", "pptx", "ppt", "docx", "doc",
            "rtf", "xls", "xlsx", "vsd"
        };  
        this.files = FileUtils.listFiles(dir, fileExtensions, true);
    }  
   public String getDirectory() {
       return this.directory; 
   }
   
   public Collection getFiles() {
       return this.files; 
   }
}
