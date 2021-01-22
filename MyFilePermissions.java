package com.java2novice.files;
 
import java.io.File;
 
public class MyFilePermissions {
 
    public static void main( String args[] ){
         
        if ( args.length == 0 ){
            System.out.println( "ERROR: no file provided");
            System.exit(8);
        }    
 
        File scriptFile = new File( args[0] );
        System.out.println("Current file permissions:");
        System.out.println("Can Execute? "+scriptFile.canExecute());
        System.out.println("Can Read? "+scriptFile.canRead());
        System.out.println("Can Write? "+scriptFile.canWrite());
    }
}