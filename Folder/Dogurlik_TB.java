package _20670310030HAMZA_ALMAHMOUD;
import _20670310030HAMZA_ALMAHMOUD._20670310030_ReadingFile;
public class Dogurlik_TB
{
   static int karnaugh3[][] = {
		   
		                       {0,0,0},{0,0,1},{0,1,0},{0,1,1},
		                       {1,0,0},{1,0,1},{1,1,0},{1,1,1}
		                       
                               };
   static int karnaugh4[][] = {
		   
		                      {0,0,0,0},{0,0,0,1},{0,0,1,0},{0,0,1,1},
		                      {0,1,0,0},{0,1,0,1},{0,1,1,0},{0,1,1,1},
		                      {1,0,0,0},{1,0,0,1},{1,0,1,0},{1,0,1,1},
		                      {1,1,0,0},{1,1,0,1},{1,1,1,0},{1,1,1,1}
		                      
                              };
   
   public static void Table() {
	   int [] ciktiler = _20670310030_ReadingFile.Diygram;
	   String [] girdiler = _20670310030_ReadingFile.degiskenler;
	    int x = 0 ; 
	   for(String data : girdiler) {
		   System.out.print(data);
	   }
	   System.out.println(" F");
	   if(girdiler.length == 3) {
		   for(int i = 0 ; i< karnaugh3.length ; i++) {
			   for(int j = 0 ; j< karnaugh3[i].length ; j++) {
				   System.out.print(" " + karnaugh3[i][j]  );
			   } 
			   System.out.println(" " + ciktiler[x]);
			   x++;
		   }
      }if(girdiler.length == 4){
    	  for(int i = 0 ; i< karnaugh4.length ; i++) {
			   for(int j = 0 ; j< karnaugh4[i].length ; j++) {
				   System.out.print(" " + karnaugh4[i][j]);
			   } 
			   System.out.println(" " + ciktiler[x]);
			   x++;
		   }
      }
	   
   }
   
   
   
}
