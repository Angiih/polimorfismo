package polimorfismo;

public class polimorfismo {

	public static void main(String[] args) {
	   //animal n = new animal();
		mamiferos m = new mamiferos();
		répteis r = new répteis();
		peixe p = new peixe();
		aves a = new aves();

		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		canguru c = new canguru();
		cachorro k = new cachorro();
		cobra j = new cobra();
		tartaruga t = new tartaruga();
		goldfish g = new goldfish();
		arara e = new arara();
		
		c.locomover();
		j.alimentar();
		g.emitirSom();
		k.locomover();
		k.emitirSom();
	}

}
