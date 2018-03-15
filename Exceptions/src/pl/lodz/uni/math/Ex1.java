package pl.lodz.uni.math;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	private static Scanner odczyt;

	public static void main(String[] args) {
		  int tab[] = {1,2,3,4,5};
	      odczyt = new Scanner(System.in);
	      int index = -1;
	      boolean success = false;
	      BufferedReader br = null;
	      System.out.println("Podaj indeks tablicy, który chcesz zobaczyæ: ");
	      while(success!=true){
	      try{
	    	  index = odczyt.nextInt(); 
	    	  success = true;
	    	  break;
	      }
	      catch(InputMismatchException e){
	    	  System.err.println("InputMissmatchException: " + e.getMessage());
	      }
	      }
	     
	      
	      try {
	          br = new BufferedReader(new FileReader(new File("plik.txt")));
	      } catch (FileNotFoundException e) {  
	          //e.printStackTrace();
	          System.err.println("FileNotFoundException: " + e.getMessage());
	      }
	      
	 
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
