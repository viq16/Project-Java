package pl.lodz.uni.math;

import java.util.Scanner;

public class Ex5 extends Exception{
	private static final long serialVersionUID = 1L;
	private Scanner odczyt;
	public Ex5(String message){
		super(message);
	}
	public void f() throws Ex5{
		g();
	}
	public void g() throws Ex5{
		odczyt = new Scanner(System.in);
		int index = -1;
		System.out.println("Podaj indeks tablicy: ");
	      index = odczyt.nextInt();
	      try {
	    	  if(index>=5)
	    	  {
	    		  throw new Ex5 ("Za du¿y indeks");
	    	  }
	      }
	      catch(Ex5 e){
	    	  e.printStackTrace();
	      }
	}
}

