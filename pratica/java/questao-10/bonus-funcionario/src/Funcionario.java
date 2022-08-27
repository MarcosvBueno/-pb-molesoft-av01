import java.util.Scanner;

public class Funcionario {	
	public static void main(String[] args) {
		double salario;
		String nome;


		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de funcionarios que terao o bonus calculado: ");
		int quantidade = sc.nextInt();
		System.out.println(" ");

		CalculaBonus[] meuArray = new CalculaBonus[quantidade];

		for (int i = 0; i < quantidade; i++) {

			meuArray[i] = new CalculaBonus();

			System.out.println("Digite o nome do funcionario: ");
			nome = sc.next();
			System.out.println("");
			meuArray[i].setNome(nome);
			
			System.out.println("olá " + nome + ", digite o seu salario : " );
			salario = sc.nextDouble();
			System.out.println("");
			meuArray[i].setSalario(salario);
			
		}
		System.out.println("Resultado do calculo do bônus:");
		System.out.println();
		
		for(int i = 0 ; i < meuArray.length ; i++) {
			System.out.println("Funcionario: " + meuArray[i].getNome());
			System.out.println("Salario : " + meuArray[i].getSalario());
			meuArray[i].bonus();
			
			
		}
	}

}
