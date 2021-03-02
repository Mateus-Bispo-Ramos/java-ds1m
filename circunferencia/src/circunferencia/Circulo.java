package circunferencia;

public class Circulo {
	
	public static void main (String[] args) {
		
		//Cálculo do Circunferência//
		
		final float PI;
		float raio;
		float circunferência;
		
		PI = 3.14f;
		raio = 3f;
				
		circunferência = (raio * raio) * PI;
		
		System.out.print("a CIRCUNFERÊNCIA do Círculo é igual a " + circunferência);
		
	}

}