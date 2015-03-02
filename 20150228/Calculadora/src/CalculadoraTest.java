import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {

	@Test
	public void testSomaUmMaisUm() {
		Calculadora calculadora = new Calculadora();
		int resultadoDaSoma =  calculadora.somar(1, 1);
		assertEquals(2, resultadoDaSoma);
	}
	
	@Test
	public void testSomaUmMaisDois(){
		Calculadora calculadora = new Calculadora();
		int resultadoDaSoma = calculadora.somar(1,2);
		assertEquals(3, resultadoDaSoma);
	}
	@Test
	public void testSubtracaoquatroMenosdois(){
		Calculadora calculadora = new Calculadora();
		int resultadoDasubtracao = calculadora.subtrair(4,2);
		assertEquals(2, resultadoDasubtracao);
	}
	
	@Test
	public void testDivisaoQuatroDivididoDois(){
		Calculadora calculadora = new Calculadora();
		int resultadoDaDivisao = calculadora.dividir(4,2);
		assertEquals(2, resultadoDaDivisao);
	
	}
	
	@Test
	public void testMultiplicacaoQuatroMultiplicaDois(){
		Calculadora calculadora = new Calculadora();
		int resultadoDaMultiplicacao = calculadora.multiplicar(4,2);
		assertEquals(8, resultadoDaMultiplicacao);
	
	}
	
	@Test
	public void testSomaUmMaisUmMais2() {
		Calculadora calculadora = new Calculadora();
		int resultadoDaSoma =  calculadora.somar(1, 1, 2);
		assertEquals(4, resultadoDaSoma);
	}
	
}
