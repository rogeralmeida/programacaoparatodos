import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class CaixaEletronicoTest {

	@Test
	public void testListaCom1Item() {
		//Cria um objeto do tipo CaixaEletronico e armazena isso numa variavel 
		//chamada "caixaEletronico"
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		//Chamando o metodo sacar no objeto caixaEletronico e armazenando o resultado
		//em uma variavel chamada "notas" que e do tipo List<Nota> (ou lista de notas)
		List<Nota> notas = caixaEletronico.sacar(10);
		assertEquals(1, notas.size());
	}
	
	@Test
	public void testListaComUmaNotaDeDezReais() throws Exception {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		List<Nota> notas = caixaEletronico.sacar(10);
		
		Nota nota = notas.get(0);
		assertEquals(10, nota.getValue());
	}
	
	@Test
	public void testListComUmaNotaDeVinteReais() throws Exception {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		List<Nota> notas = caixaEletronico.sacar(20);
		Nota nota = notas.get(0);
		assertEquals(20, nota.getValue());
	}
	
	@Test
	public void testListComUmaNotaDeCinquentaReais() throws Exception {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		List<Nota> notas = caixaEletronico.sacar(50);
		Nota nota = notas.get(0);
		assertEquals(50, nota.getValue());
	}
	
	@Test
	public void testListComUmaNotaDeCemReais() throws Exception {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		List<Nota> notas = caixaEletronico.sacar(100);
		Nota nota = notas.get(0);
		assertEquals(100, nota.getValue());
	}

}
