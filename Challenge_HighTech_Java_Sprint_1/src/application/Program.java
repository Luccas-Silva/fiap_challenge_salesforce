package application;

import java.util.Scanner;

import entities.PageSalesforce;
import entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PageSalesforce psf = new PageSalesforce();
		
		User Luccas = new User("Luccas Silva", "Luccas.@gmail.com", "Developer", "99999999999", "RM:552890");
		User Burno = new User("Burno Burian", "Burno.@gmail.com", "Developer", "99999999999", "RM:552863");
		User Nathalia = new User("Nathalia Freire", "Nathalia.@gmail.com", "Developer", "99999999999", "RM:553233");
		
		User user = new User();
		
		System.out.println("\n # Salesforce X HighTech #");
		System.out.println("  ----------------------- ");
		System.out.println("     Cadastre-se.\n");
		
		System.out.print("  Nome: ");
		String catastro = sc.nextLine();
		user.setName(catastro);
		
		do {
			System.out.print("  Email: ");
			catastro = sc.nextLine();
			user.setEmail(catastro);
			if(user.validarEmail() == false) {
				System.out.println("  Email Invalido.\n");
			}
		} while (user.validarEmail() != true);
		
		
		System.out.print("  Cargo: ");
		catastro = sc.nextLine();
		user.setCargo(catastro);
		do {
			System.out.print("  Phone: ");
			catastro = sc.nextLine();
			user.setPhone(catastro);
			if(user.validarPhone() == false) {
				System.out.println("  Phone Invalido.\n");
			}
		} while (user.validarPhone() != true);
		
		System.out.print("  Password: ");
		catastro = sc.nextLine();
		user.setPassword(catastro);
	
		char menu = 's';
		do {
			System.out.println("\n # Salesforce X HighTech #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) LandingPage   -");
			System.out.println("  -   (2) Produtos      -");
			System.out.println("  -   (3) Industrias    -");
			System.out.println("  -   (4) Aprendizado   -");
			System.out.println("  -   (5) Suporte       -");
			System.out.println("  -   (6) Empresa       -");
			System.out.println("  -   (7) Meus Dados    -");
			System.out.println("  -   (0) Sair          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			if(menu == '1') {
				System.out.println("\n"+ psf.LandingPage());
			}
			else if(menu == '2') {
				System.out.println("\n"+ psf.Produtos());
			}
			else if(menu == '3') {
				System.out.println("\n"+ psf.Industrias());
			}
			else if(menu == '4') {
				System.out.println("\n"+ psf.Aprendizado());
			}
			else if(menu == '5') {
				System.out.println("\n"+ psf.Suporte());
			}
			else if(menu == '6') {
				System.out.println("\n"+ psf.Empresa());
			}
			else if(menu == '7') {
				System.out.println("\n"+ user.toString());	
			}
			else if(menu == '0') {
				System.out.print("\n     Continuar(s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
			
		} while (menu != 's');
		System.out.println("\n Obrigado por usar o nosso Sistema.\n");
		System.out.println("    #        Dev Team       #");
		System.out.println("    -------------------------");
		System.out.printf("    # %s %s #\n",Luccas.getName(), Luccas.getPassword());
		System.out.printf("    # %s %s #\n",Burno.getName(), Burno.getPassword());
		System.out.printf("    # %s %s #\n",Nathalia.getName(), Nathalia.getPassword());
		

		sc.close();
	}

}
