package com.java2novice.files;
 
import java.io.File;
 
public class FileListFromFolder {
     
    public static void main( String args[] ){
        
        if ( args.length == 0 ){
            System.out.println( "ERROR: missing directory");
            System.exit(8);
        }   
        
        File file = new File( args[0] );
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}