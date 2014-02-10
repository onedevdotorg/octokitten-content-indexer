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

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class DocumentIndexSearch {

    private static String directoryToTraverse;  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get all the files for directory
        if (args.length > 0) {
            directoryToTraverse = args[0];
        } else System.out.println("-help for more information");
     
        //Create a new FilingCabinet to grab files
        
        //Parse files from FilingCabinet
    }
    
    public void parseFile(File f) {
    
}
    
}
