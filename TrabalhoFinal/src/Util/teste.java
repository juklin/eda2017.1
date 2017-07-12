package Util;

import java.util.ArrayList;

import ArvRubNeg.RubroNegra;
//import ArvRubNeg.NodeRB;
import Veiculo.Veiculo;

public class teste {

	public static void main(String[] args) {
	EDAUtil m = new EDAUtil();
	ArrayList<Veiculo> lista = m.carregar();
	
	Veiculo a = new Veiculo();
	Veiculo b = new Veiculo();
	Veiculo c = new Veiculo();
	Veiculo d = new Veiculo();

	a.setMarca("Mercedez");
	a.setRenavam("15");
	
	b.setMarca("Toyota");
	b.setRenavam("55");
	
	c.setMarca("Fiat");
	c.setRenavam("100");
	
	d.setMarca("Wolkswagen");
	d.setRenavam("36");
	
	/*Node node = new Node(a, null, false);
	RubroNegra rb = new RubroNegra(node);
	rb.insert(a,node);
	rb.insert(b,node);
	rb.insert(c,node);
	rb.insert(d,node);
	rb.imprimirEmOrdem(node);
	}
	 */	
	}	
}