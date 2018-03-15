package pl.lodz.uni.math;

import java.util.Scanner;
import pl.lodz.uni.math.Ex2;
public class Ex2m {
	private static Scanner odczyt;
	public static void Idk(int index) throws Ex2{
		if(index >= 5)
		{
			throw new Ex2("Za du¿o!");
		}
	}
	public static void main(String[] args) {
	      odczyt = new Scanner(System.in);
	      int index = -1;
		  System.out.println("Podaj indeks tablicy, który chcesz zobaczyæ: ");
	      index = odczyt.nextInt();
	      try {
	    	  Idk(index);
	      }
	      catch(Ex2 e){
	    	  e.printStackTrace();
	      }
	}

}
