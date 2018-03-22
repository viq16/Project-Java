package def;

import def.Interface.InterfCzyParzysta;
import def.Interface.InterfGetLiczba;
import def.Interface.InterfSuma;
import def.Interface.InterfWypisz;
import def.Interface.InterfWypiszTekst;

import java.sql.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import def.Interface.IGen;
public class MainClass {

	public static void main(String[] args) {
		InterfWypisz ref1= ()->System.out.println("Test");
		ref1.wypiszMetoda();
		
		InterfWypiszTekst ref2= t->System.out.println(t);
		ref2.wypiszTekstMetoda("Wow");
		
		InterfCzyParzysta ref3=  (x)->x%2==0;
		System.out.println(ref3.czyParzysteMetoda(6));
		
		InterfSuma ref4= (a,b)->a+b;
		System.out.println(ref4.sumaMetoda(2, 7));
		
		InterfGetLiczba ref5= ()->1;
		System.out.println(ref5.getLiczbaMetoda());
		
		IGen<Double, Double> ref6= (a,b)-> a-b; 
		System.out.println(ref6.metoda(10.3, 9.5));
		
		Test.foo((p,q)-> p.length()+q.length(), "Emil", "ma kota");
		
		Function <Byte, Long> r7= x->1000*(long)x;
		System.out.println(r7.apply((byte) 123));
		
		Supplier<String> ref8  = ()-> "facebook.com";
		System.out.println(ref8.get());
		
		Predicate<String> ref9  = (s)-> s.length() > 5;
		System.out.println(ref9.test("dlugosc naszego lancucha"));
	}

}
