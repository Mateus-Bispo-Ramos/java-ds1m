package imc;

public class Imc {
	
	public static void main (String[] args) {
		
		//C�lculo do IMC//
		
		float peso;
		float altura;
		float imc;
		
		peso  = 63f;
		altura = 1.70f;
		imc = peso / (altura * altura);
		
		System.out.print("o IMC � igual a " +imc);
	}
	
}