package praticadefixacao3;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numero_conta;
	public Double saldo;
	
	public Double sacar (Double valorSaque) {
		double retorno_saque = 0;
		
		if (valorSaque > saldo) {
			System.out.println("saldo insuficiente");
		}
		else {
			saldo = saldo - valorSaque;
			retorno_saque =  valorSaque;
		}
		return retorno_saque;
	}
	
	public void depositar (Double valordepositado) {
		saldo = saldo + valordepositado;
	}
	
	public void mostrarDados () {
		System.out.println("titular:"+"nomeTitular");
		System.out.println("cpf:"+ "cpf");
		System.out.println("conta:"+ "numero_conta");
		System.out.println("saldo da conta:"+ "saldo");
	}

}
