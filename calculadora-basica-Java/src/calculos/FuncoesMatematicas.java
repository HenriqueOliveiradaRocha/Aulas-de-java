package calculos;

import view.Calculadora;

public class FuncoesMatematicas {
	
	public double contaporc;
	
	public double soma(double a, double b) {
		double total = a + b;
		return total;
	}
	
	public double subtrair(double a, double b) {
		double total = a - b;
		return total;
	}
	
	public double dividir(double a, double b) {
		double total = a / b;
		return total;
	}
	
	public double multiplicacao(double a, double b) {
		double total = a * b;
		return total;
	}
	
	public void porcCal(double a, double b) {
		Calculadora c = new Calculadora();
		String sinal = c.sinal;
		if(sinal.equals("soma")) {
			contaporc = a + ((a/100)*b);
		}else if(sinal.equals("subtrair")) {
			contaporc = a - ((a/100)*b);
		}else if(sinal.equals("divisao")) {
			contaporc = a /((a/100)*b);
		}else if(sinal.equals("multiplicacao")) {
			contaporc = a * ((a/100)*b);
		}
	}
}
