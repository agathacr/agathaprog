package praticadefixacao3;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente ();
		
		c.nomeTitular = "Agatha";
		c.cpf = 123456789l;
		c.numero_conta = 987654321l;
		c.saldo = 15935.7;
		
		c.mostrarDados();
		
		c.depositar(108.0);
		c.sacar (3.0);
		
		c.mostrarDados();

	}

}
