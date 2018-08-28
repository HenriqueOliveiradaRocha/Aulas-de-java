package aula1;

public class Testes {
	public static int div(int d1,int d2) {
		int total = d1 / d2;
		return total;
	}
	public static double subt(int f1, double f2) {
		double total = f1 - f2;
		return total;
	}

	public static void main(String[] args) {
		System.out.println(div(150,2));
		System.out.println(subt(60,30.3));
	}
}
/* double é uma variavel para numeros reais (numeros quebrados 3,1)
* int é só para numeros inteiros (1,2,3)
* public static void main(String[] args) usa-se para imprimir a função
* return usa-se para retorna o valor, substituir as varias pelo desejado
*/