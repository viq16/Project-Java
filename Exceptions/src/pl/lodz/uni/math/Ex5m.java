package pl.lodz.uni.math;
import pl.lodz.uni.math.Ex5;
public class Ex5m {

	public static void main(String[] args) {
		Ex5 t = new Ex5("Nothing to say");
		try{
			t.f();
		}
		catch(Ex5 e)
		{
			System.err.println("Ex5: " + e.getMessage());
		}
	}

}
