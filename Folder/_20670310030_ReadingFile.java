package _20670310030HAMZA_ALMAHMOUD;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.math.*;
public class _20670310030_ReadingFile {
//  public static char degiskenler[] ; 
  static  String statment[] ; 
  public static int [] Diygram ;
//  static ArrayList<Integer> Diygram = new ArrayList<Integer>();
  public static String []degiskenler;
  public static void okuma(){
	  
	  
    try {
      File myObj = new File("Diyagramlar.txt");
      Scanner myReader = new Scanner(myObj);
      
      myReader.hasNextLine() ;
      String data = myReader.nextLine();
      statment = data.split(":");
      degiskenler = statment[1].split(",");	 
      for(String dat: degiskenler) {
    	  System.out.println(dat);
      }
      
      data = myReader.nextLine() ;
      int i = 0 ;
      int say  = 0;

      Diygram = new int[sqrt(degiskenler.length)];
      while(myReader.hasNext()) {
    	  data = myReader.next();
    	  Diygram [i] =Integer.parseInt(data);
    	  i++;
    	  
      }
      
      for(int dat: Diygram) {
    	  System.out.println(dat);
      }
      
      System.out.println("karnaugh.txt dosyasý okundu");
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static int sqrt (int num) {
	 int result =(int) Math.pow(2, num);
	 return result;
   }
  
  
}