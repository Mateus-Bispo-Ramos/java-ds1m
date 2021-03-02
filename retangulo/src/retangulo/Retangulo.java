package retangulo;

public class Retangulo {

	public static void main (String[] args) {
		
		float área;
		float base;
		float altura;
		float perímetro;
		
		base = 10f;
		altura = 5f;
		
		área = base * altura;
		perímetro = 2 * (base + altura);
		
		System.out.println("a ÁREA do Retângulo é igual a " + área);
		
		System.out.println("o PERÍMETRO do Retângulo é igual a "  + perímetro);
		
	}
	
}