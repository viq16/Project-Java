package def;

public class Interface {
	interface InterfWypisz{
		void wypiszMetoda();
	}
	interface InterfWypiszTekst{
		void wypiszTekstMetoda(String t);
	}
	interface InterfCzyParzysta{
		boolean czyParzysteMetoda(int x);
	}
	interface InterfSuma{
		int sumaMetoda(int a, int b);
	}
	interface InterfGetLiczba{
		int getLiczbaMetoda();
	}
	interface IGen<R,P>{
		R metoda(P param1, P param2);
	}
	/* Interfejsy funkcjonalne
	 * UnaryOperator<T>		(T apply(T))
	 * BinaryOperator<T>	(T apply(T,T))
	 * ConsumerOperator<T>	(void accept (T))
	 */
}
