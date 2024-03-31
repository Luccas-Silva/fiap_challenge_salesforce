package application;

import java.util.Scanner;

import controller.UserController;
import dao.UserDAOImpl;
import entities.Aprendizado;
import entities.Empresa;
import entities.Industrias;
import entities.LandingPage;
import entities.Produtos;
import entities.Suporte;
import model.User;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*		Credenciais para Login:
		 * Nome:Luccas Silva	Senha:RM-552890
		 */
		
		UserController userController = new UserController(new UserDAOImpl());
		
		User user = new User();
		
		LandingPage landingpage = new LandingPage();
		Produtos produtos = new Produtos();
		Industrias industrias = new Industrias();
		Aprendizado aprendizado = new Aprendizado();
		Suporte suporte = new Suporte();
		Empresa empresa = new Empresa();
		
		
		
		char menu = 's';
		do {
			System.out.println("\n # Salesforce X HighTech #");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (1) Login         -");
			System.out.println("  -   (2) Cadastrar-se  -");
			System.out.println("  -   (3) Meus Dados    -");
			System.out.println("  ----------------------- ");
			System.out.println("  -   (4) LandingPage   -");
			System.out.println("  -   (5) Produtos      -");
			System.out.println("  -   (6) Industrias    -");
			System.out.println("  -   (7) Aprendizado   -");
			System.out.println("  -   (8) Suporte       -");
			System.out.println("  -   (9) Empresa       -");
			System.out.println("  -   (0) Sair          -");
			System.out.println("  ----------------------- ");
			
			System.out.print("    Escolha uma Opção: ");
			menu = sc.next().toLowerCase().charAt(0);
			
			if(menu == '1') {
				sc.nextLine();
				System.out.print("\n  Digitar Nome: ");
				String nome = sc.nextLine();
				System.out.print("  Digitar Senha: ");
				String senha = sc.nextLine();
				boolean flag = false;
				for (User users : userController.listarUsers()) {
					if (users.getName().equals(nome) && users.getPassword().equals(senha)) {
						user = users;
						flag = true;
					}
				}
				if(flag != true) {
					System.err.println("  Erro em efetuar o Login.");
				}
				else {
					System.out.println("  Login efetuado com sucesso.");
				}
				
			}
			
			else if(menu == '2') {
				user.validarNome();
				user.validarEmail();
				user.validarCPF();
				user.validarCargo();
				user.validarPhone();
				user.validarSenha();
				userController.salvarUser(user);
			}
			
			else if(menu == '3') {
				if(user.getName() != null) {
					System.out.print(user.toString()+"\n");	
				}
				else {
					System.err.print("\n    Erro de Cadastro não Realizado.\n");	
				}
			}
			
			else if(menu == '4') {
				System.out.print("\n"+ landingpage.conteudo());
			}
			
			else if(menu == '5') {
				System.out.print("\n"+ produtos.conteudo());
				
			}
			
			else if(menu == '6') {
				System.out.print("\n"+ industrias.conteudo());
				
			}
			
			else if(menu == '7') {
				System.out.print("\n"+ aprendizado.conteudo());	
			}
			
			else if(menu == '8') {
				System.out.print("\n"+ suporte.conteudo());
			}
			
			else if(menu == '9') {
				System.out.print("\n"+ empresa.conteudo());
			}
			
			else if(menu == '0') {
				System.out.print("\n     Continuar(s/n): ");
				menu = sc.next().toLowerCase().charAt(0);
			}
			
		} while (menu != 's');
		
		
		System.out.println("\n Obrigado por usar o nosso Sistema.\n");
		System.out.println("            	Dev Team       ");
		System.out.println("  #------------------------------------#");
		System.out.println("  | Nome: Luccas Silva    | RM: 552890 | ");
		System.out.println("  | Nome: Burno Burian    | RM: 552863 |");
		System.out.println("  | Nome: Nathalia Freire | RM: 553233 |");
		System.out.println("  #------------------------------------#");
		
		sc.close();
	}
}
