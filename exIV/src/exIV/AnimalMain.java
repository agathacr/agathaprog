package exIV;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Gato> gatinhos = new ArrayList <>();
		
		Gato gato1 = new Gato ();
		gato1.setNome ("Olaf");
		gato1.setNumerodePatas(4);
		gato1.setRaca("Persa");
		gato1.setEcossistema("Apartamento");
		gato1.setCor("Branco");
		gato1.setComprimento(25.0f);
		
		Gato gato2 = new Gato ();
		gato2.setNome ("Kiaro");
		gato2.setNumerodePatas(4);
		gato2.setRaca("Siames");
		gato2.setEcossistema("Casa");
		gato2.setCor("Rajado");
		gato2.setComprimento(30.0f);
		
		Gato gato3 = new Gato ();
		gato3.setNome ("Bob");
		gato3.setNumerodePatas(3);
		gato3.setRaca("Vira-Lata");
		gato3.setEcossistema("Apartamento");
		gato3.setCor("Preto");
		gato3.setComprimento(20.0f);


	ArrayList<Cachorro> cachorrinhos = new ArrayList <>();

	Cachorro cachorro1 = new Cachorro ();
	cachorro1.setNome ("Marshmallow");
	cachorro1.setNumerodePatas(4);
	cachorro1.setRaca("Shih-poo");
	cachorro1.setEcossistema("Apartamento");
	cachorro1.setCor("Branco");
	cachorro1.setComprimento(30.0f);

		Cachorro cachorro2 = new Cachorro ();
		cachorro2.setNome ("Rex");
		cachorro2.setNumerodePatas(4);
		cachorro2.setRaca("Vira-lata");
		cachorro2.setEcossistema("Fazenda");
		cachorro2.setCor("Cinza");
		cachorro2.setComprimento(40.0f);

		Cachorro cachorro3 = new Cachorro ();
		cachorro3.setNome ("Benji");
		cachorro3.setNumerodePatas(4);
		cachorro3.setRaca("Chihuahua");
		cachorro3.setEcossistema("Casa");
		cachorro3.setCor("Branco com laranja");
		gato3.setComprimento(28.0f);

		for (Gato gato : gatinhos) {
			
			System.out.println(gato.getNome());
			System.out.println(gato.getNumerodePatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
		}
			
			for (Cachorro cachorro : cachorrinhos) {
				System.out.println(cachorro.getNome());
				System.out.println(cachorro.getNumerodePatas());
				System.out.println(cachorro.getRaca());
				System.out.println(cachorro.getEcossistema());
				System.out.println(cachorro.getCor());
				System.out.println(cachorro.getComprimento());
			}

}

}


