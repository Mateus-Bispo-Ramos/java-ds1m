package conversao_de_celsius_para_fahrenheit;

public class Conversao {

	public static void main(String[] args) {
		
		float c;
		float f;

		c = 23f;
		
		f = (9 * c + 160) / 5;
		
		System.out.print(c + " graus Celsius equivalem a " + f + " graus Fahrenheit.");

	}

}