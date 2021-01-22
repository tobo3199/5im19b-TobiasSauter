package com.java2novice.files;
 
import java.io.File;
 
public class MyFileOperations {
 
    public static void main( String args[] ){
         
        if ( args.length == 0 ){
            System.out.println( "ERROR: no file");
            System.exit(8);
        }    
         
        try{
            File file = new File( args[0] );
            //Tests whether the application can read the file 
            System.out.println( "File " + args[0] + " can read : " + file.canRead());
            //Tests whether the application can modify the file
            System.out.println( "File " + args[0] + " can write : " + file.canWrite());
            //Tests whether the application can modify the file 
            System.out.println( "File " + args[0] + " can create : " + file.createNewFile());
            //Tests whether the file or directory exists.
            System.out.println("File " + args[0] + " exists : " + file.exists());
            //Returns the absolute pathname string.
            System.out.println( "File " + args[0] + " path : " + file.getAbsolutePath());
            //Tests whether the file is a directory or not.
            System.out.println("File " + args[0] + " is directory : " + file.isDirectory());
            //Tests whether the file is a hidden file or not.
            System.out.println("File " + args[0] + " is hidden: " + file.isHidden());
            //Returns an array of strings naming the 
            //files and directories in the directory.
            System.out.println( "File " + args[0] + " list files: " + file.list());
        } catch(Exception ex){
             System.exit( 16 );
        }
    }
}