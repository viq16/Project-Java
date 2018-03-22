package def;

import def.Interface.IGen;

public class Test {

	public void wypisz(){
		System.out.print("Test");
	}
	//()->System.out.print("Test");
	public void wypiszTekst(String tekst){
		System.out.print(tekst);
	}
	//t->System.out.print(tekst);
	public boolean czyParzysta(int x){
		return x%2==0;
	}
	//x->x%2==0;
	public double suma(double a, double b){
		return a+b;
	}
	//(a,b)->a+b;
	public int getLiczba(){
		return 1;
	}
	//()->1
	public int maks(int[] tab){
		int tmp=tab[0];
		for(int i=0; i<tab.length;i++){
			if(tmp<tab[i]){
				tmp=tab[i];
			}
		}
		return tmp;
	}
	/*
	 tab->{
	 int tmp=tab[0];
		for(int i=0; i<tab.length;i++){
			if(tmp<tab[i]){
				tmp=tab[i];
			}
		}
		return tmp;
	 }
	 */
	public static void foo(IGen<Integer, String> i, String p1, String p2){
		System.out.println(i.metoda(p1, p2));
	}
}
