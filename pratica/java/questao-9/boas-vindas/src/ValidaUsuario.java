import java.util.Scanner;
import java.time.LocalTime;
public class ValidaUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora =LocalTime.now().getHour();
		String usuario;
		String senha;
		
		String[]  meuArray = new String[2];
		meuArray[0] ="dev";
		meuArray[1]= "123";
		System.out.println("  ************************************** ");
		System.out.println("");
		System.out.println("    Seja bem vindo a tela de login!");
		System.out.println("");
		System.out.println("  ************************************** ");
		System.out.println("");
		
		System.out.println("Indique o nome de usuario:");
		usuario = sc.nextLine();
		System.out.println("Indique sua senha:");
		senha = sc.nextLine();
		System.out.println("");
		
		if( usuario.equals(meuArray[0]) == false || senha.equals(meuArray[1]) == false ) {
			System.out.println("Usuário e/ou senha incorretos");
			
		}else {
			if (hora > 6 && hora < 12 ) {
				System.out.println("Bom dia,"+ usuario +" você se logou ao nosso sistema.");
			}
			
			else if(hora >= 12  && hora < 16) {
				System.out.println("Bom tarde,"+ usuario +" você se logou ao nosso sistema.");
			}
			
			else if (hora >=18 && hora < 24 ) {
				System.out.println("Bom noite,"+ usuario +" você se logou ao nosso sistema.");

			}
			
			else if (hora >= 0 && hora <= 6 ) {
				System.out.println("Bom madrugada,"+ usuario +" você se logou ao nosso sistema.");

			}
		}
		
	}
}
