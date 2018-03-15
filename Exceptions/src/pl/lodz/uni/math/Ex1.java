package pl.lodz.uni.math;

import java.util.Scanner;

public class Ex1 {

	private static Scanner odczyt;

	public static void main(String[] args) {
		  int tab[] = {1,2,3,4,5};
	      odczyt = new Scanner(System.in);
	      int index = -1;
	 
	      System.out.println("Podaj indeks tablicy, który chcesz zobaczyæ: ");
	      index = odczyt.nextInt();
	 
	      try {
	          System.out.println(tab[index]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	          System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	          System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
	      } finally {
	    	  System.out.println("Sekcja wywo³ania finally");
	      }
	}

}
