package trapezio;

public class Trapezio {

	public static void main (String[] args) {
		
		//C�lculo da �rea do Trap�zio//
		
		float �rea;
		float base_maior;
		float base_menor;
		float altura;
		
		base_maior = 15.5f;
		base_menor = 8f;
		altura = 4.5f;
		
		�rea = (base_maior + base_menor) * altura / 2;
		
		System.out.print("a �REA do Trap�zio � igual a " + �rea);
	}
	
}
