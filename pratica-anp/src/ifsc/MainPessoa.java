package ifsc;

import java.util.ArrayList;

public class MainPessoa {
	public static void main(String[] args) {
		
		ArrayList<Aluno> encrenqueiro = new ArrayList<>();

		//Criando atributos
		
		Aluno alunoI = new Aluno();
		alunoI.setNome("Nome Aluno: Agatha Cristine Onofre Ribeiro");
		alunoI.setCpf(963258740l);
		
		encrenqueiro.add(alunoI);
		
		System.out.println(alunoI.getNome());
		System.out.println(alunoI.getCpf());
	}

}
