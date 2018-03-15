package pl.lodz.uni.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import pl.lodz.uni.math.Ex4;
public class Ex4m {
	//private static Scanner odczyt;
	public static void Idk(String input) throws Ex4{
		if(input == null)
		{
			throw new Ex4("Wprowadzany ³añcuch nie mo¿e byæ pusty");
		}
	}
	public static void main(String[] args) throws IOException{
		//odczyt = new Scanner(System.in);
			System.out.println("Podaj ³añcuch znaków: ");
			//String inputEx = System.console().readLine();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputEx = br.readLine();
	      try {
	    	  Idk(inputEx);
	      }
	      catch(Ex4 e){
	    	  e.printStackTrace();
	      }
	      
	}

}
