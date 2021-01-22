package com.java2novice.files;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadLinesFromFile {
 
    public static void main(String args[] ){
        
        if ( args.length == 0 ){
            System.out.println( "ERROR: no file provided");
            System.exit(8);
        }    
        
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader( args[0] ) );
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: " + args[0] );
            System.exit( 16 );
        } catch (IOException e) {
            System.err.println("Unable to read the file: " + args[0] );
            System.exit( 16 );
        }
    }
}