import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pontos = 0;
		
		String jogador ;
		
		String [] perguntas = {"Qual a montanha mais alta do Brasil?",
				"Qual o número mínimo de jogadores numa partida de futebol?",
				"A que temperatura a água ferve? (ºC) ",
				"Quantos ossos temos no nosso corpo?",
				"Qual a personagem mais famosa de Maurício de Sousa?",
				"Qual o metal cujo símbolo químico é o Au?",
				"Qual é a cor das famosas cabines telefônicas de Londres?",
				"Qual é o país mais populoso do mundo?",
				"Qual animal dorme de cabeça para baixo?",
				"Em que ano o Rio de Janeiro sediou os Jogos Olímpicos?"};
		
		
		String [] respostas = {"pico da neblina",
				"7",
				"100",
				"206",
				"monica",
				"ouro",
				"vermelho",
				"china",
				"morcego",
				"2016"};
		
		
		System.out.println("  ************************************** ");
		System.out.println("");
		System.out.println("          Seja bem vindo ao Quiz!          ");
		System.out.println("           Conhecimentos Gerais            ");
		System.out.println("");
		System.out.println("  ************************************** ");
		System.out.println("");
		
		System.out.println("Digite o seu nome:");
		jogador = sc.nextLine();
		for (int i = 0 ; i < perguntas.length ;i++ ) {
			System.out.println(perguntas[i]);
			System.out.println("Digita a resposta :");
			String solucao = sc.nextLine().toLowerCase();
			if (solucao.equals(respostas[i])) {
				pontos += 1;
			}
		}
		System.out.println("jogador : " + jogador);
		System.out.println("Acertos : " + pontos);
		System.out.println("Erros: " + (10-pontos));
	}
}
