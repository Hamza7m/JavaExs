package _20670310030HAMZA_ALMAHMOUD;
import _20670310030HAMZA_ALMAHMOUD._20670310030_ReadingFile;
import _20670310030HAMZA_ALMAHMOUD.Dogurlik_TB;
import java.util.ArrayList;

public class _20670310030_Fonctiion {

    static ArrayList<Integer> IndexOfMin = new ArrayList<Integer>();
    static ArrayList<Integer> IndexOfMax = new ArrayList<Integer>();
    
    static int Size = _20670310030_ReadingFile.Diygram.length;
	
	static void ifadeler() {
		System.out.println("fonksiyon ifadeleri:");
		
		
	}
	
	static void minCounter () {
		int[] Outer = _20670310030_ReadingFile.Diygram;
		for(int i = 0 ; i<= Outer.length ; i++) {
			if(Outer[i] == 0) {
				IndexOfMax[i]=i;
			}if(Outer[i]== 1) {
				IndexOfMin[i]=i;
			}
		}
	}
	
	static void dis(int[]arr) {
		for(int data : arr) {
			System.out.println(" " + data );
		}
	}
	
//	
//	static String[] Mintremler (int []IndexOfMin) {
//		String[] mTRM   = new String [IndexOfMin.length]; 		
//		return mTRM; 
//	}
//	static String[] Maxtremler (int []IndexOfMax) {
//		String[] mTRM   = new String [IndexOfMax.length]; 		
//		return mTRM; 
//	}
//	
}
