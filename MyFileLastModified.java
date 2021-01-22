package com.java2novice.files;
 
import java.io.File;
 
public class MyFileLastModified {
     
    public static void main( String args[] ) {
         
        if ( args.length == 0 ){
            System.out.println( "ERROR: no file name");
            System.exit(8);
        }    
         
        File file = new File( args[0] );
        System.out.println( "file " + args[0] + " last modified " + file.lastModified() );
    }
 
}