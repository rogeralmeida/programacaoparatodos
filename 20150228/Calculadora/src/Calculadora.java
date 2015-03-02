import java.util.ArrayList;


public class Calculadora {

	public int somar(int i, int j, int a) {
		int resultadoDasoma = i+j+a;
		return resultadoDasoma;
    
	}

	public int subtrair(int i, int j) {
	    int resultadoDasubtracao = i-j;
	    return resultadoDasubtracao;
	}

	public int dividir(int i, int j) {
		 int resultadoDaDivisao = i/j;
	    return resultadoDaDivisao;
	}

	public int multiplicar(int i, int j) {
		 int resultadoDaMultiplicacao = i*j;
		 return resultadoDaMultiplicacao;
	}	
}