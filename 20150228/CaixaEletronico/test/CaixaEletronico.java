import java.util.ArrayList;
import java.util.List;


public class CaixaEletronico {

	public List<Nota> sacar(int valor) {
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(valor));
		return notas;
	}

}
