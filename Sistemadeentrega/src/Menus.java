import java.util.Scanner;

public class Menus {
	String email, emaildigt;
	String senha;
	String nome;
	static Scanner leitor = new Scanner(System.in);

	public static void menuprinc() {

		System.out.println("             MENU!     ");
		System.out.println("      ---------------------");
		System.out.println("      ---------------------");
		System.out.println("      1- Cliente           ");
		System.out.println("      2- Funcionário       ");
		System.out.println("      3- ADM               ");
		System.out.println("      4- Cadastrar-se      ");
		System.out.println("      5- Fechar Programa   ");
		int escolha = leitor.nextInt();

		System.out.println(escolha);

		switch (escolha) {
		case 5:
			System.exit(0);
			break;
		case 4:
			Cliente c1 = new Cliente();
			c1.registro();

			break;

		case 3:

			System.out.println("Digite seu email:");
			String email = leitor.next();
			System.out.println("Digite sua senha:");
			String senha = leitor.next();

			Adm.loginAdm(email, senha);
			break;
		case 2:
			System.out.println("Digite seu email:");
			email = leitor.next();
			System.out.println("Digite sua senha:");
			senha = leitor.next();

			Funcionario.loginFunc(email, senha);
			;
			break;

		case 1:
			System.out.println("Digite seu email:");
			email = leitor.next();
			System.out.println("Digite sua senha:");
			senha = leitor.next();
			Cliente.loginCliente(email, senha);
			break;
		}
	}

	public static void menuADM() {

		System.out.println("*****************ADM*****************");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("1- Visualizar Funcionarios       ");
		System.out.println("2- Visualizar Clientes      ");
		System.out.println("3- Criar Funcionarios            ");
		System.out.println("4- Visualizar todos os produtos/estoque  ");
		System.out.println("5- Alterar dados funcionario ");
		System.out.println("6- Alterar dados próprios ");
		System.out.println("7- Sair ");

		int escolha = leitor.nextInt();

		System.out.println(escolha);

		switch (escolha) {
		case 7:
			Menus.menuprinc();
			break;
		case 6:
			System.out.println("Digite um novo nome:");
			String nome = leitor.next();
			Adm.databaseadmin.get(0).nome = nome;

			System.out.println("Digite uma nova senha:");
			String senha = leitor.next();
			Adm.databaseadmin.get(0).senha = senha;

			System.out.println("Digite um novo email:");
			String email = leitor.next();
			Adm.databaseadmin.get(0).email = email;

			Menus.menuADM();

			break;
		case 5:

			System.out.println("Digite um nome:");
			nome = leitor.next();
			System.out.println("Digite uma nova senha:");
			senha = leitor.next();

			Funcionario.databasefuncionarios.get(0).nome = nome;
			Funcionario.databasefuncionarios.get(0).senha = senha;

			Menus.menuADM();
			break;
		case 4:
			Adm.verProdutos();
			Menus.menuADM();

			break;

		case 3:
			Adm.criarfunc();
			Menus.menuADM();
			break;
		case 2:

			Adm.verCliente();
			Menus.menuADM();

			;
			break;

		case 1:
			Adm.verfuncionario();
			Menus.menuADM();
			break;
		}

	}

	public static void menuCliente() {
		System.out.println("          Seja Bem-Vindo     ");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("      1- Buscar no estoque meu produto          ");
		System.out.println("      2- Alterar proprios dados          ");
		System.out.println("      3- Retirar pedido           ");
		System.out.println("      4- Sair             ");

		int escolha = leitor.nextInt();

		System.out.println(escolha);

		switch (escolha) {

		case 5:
			Menus.menuprinc();
//			for (int i = 0; i < Cliente.database.size(); i++) {
//				System.out.println(Cliente.database.get(i).produto );
//			}
//			System.out.println("O que você deseja retirar?");
//			String digitado = leitor.nextLine();
//			

			break;
		case 4:
			Menus.menuprinc();
//			Menus.pedidocliente();
			break;

		case 3:
//			Menus.pedidocliente();
			if (Produto.estoques.size() == 0) {
				System.out.println("Nenhum produto cadastrado no estoque");
				Menus.menuCliente();
			}
			for (int i = 0; i < Produto.estoques.size(); i++) {
					System.out.print( "Numero do Produto: "+ i +  ", Produto: " + Produto.estoques.get(i).nomeproduto + ", ID: " + Produto.estoques.get(i).id + ", Destinatario :" + Produto.estoques.get(i).destinatario.nome + "\n");
				
//				System.out.print( "Numero do Produto: "+ i +  ", Produto: " + Produto.estoques.get(i).nomeproduto + ", ID: " + Produto.estoques.get(i).id + "Destinatario :" + Produto.estoques.get(i).destinatario.nome + "\n");
			}
			System.out.println("Qual o numero do produto a ser retirado?");
			int retirada = leitor.nextInt();

			for (int i = 0; i < Produto.estoques.size(); i++) {
				if ((retirada == i) && (Cliente.database.get(i).nome.equals(Cliente.database.get(i).produto.destinatario.nome))) {
					Produto.estoques.remove(i);
					System.out.println("Produto retirado!!");
				}else if(!Cliente.database.get(i).nome.equals(Produto.estoques.get(i).destinatario.nome)) {
					System.out.println("Informações não condizem");
					break;
				}
			}
			Menus.menuCliente();

			break;
		case 2:

			System.out.println("Digite um novo email:");
			String emailnovo = leitor.next();
			System.out.println("Digite uma nova senha:");
			String senhanova = leitor.next();

			for (int i = 0; i < Cliente.database.size(); i++) {

				Cliente.database.get(i).email = emailnovo;
				Cliente.database.get(i).senha = senhanova;

			}

			Menus.menuCliente();
			break;

		case 1:
			if (Produto.estoques.size() == 0) {
				System.out.println("Estoque vazio");
				Menus.menuCliente();
			}

			for (int i = 0; i < Produto.estoques.size(); i++) {
				if(Cliente.database.get(i).cpf.equals(Cliente.database.get(i).produto.cpfverify)) {
					System.out.println("Numero do produto: " + i + ", Produto: " + Produto.estoques.get(i).nomeproduto + ", Destinatario: " + Produto.estoques.get(i).destinatario.nome);
				}
//				System.out.println("Numero do produto: " + i + "Produto: " + Produto.estoques.get(i).nomeproduto + ", Destinatario: " + Cliente.database.get(i).produto.destinatario.nome );
			}
			Menus.menuCliente();
			break;
		}

	}

	public static void menufuncionario() {
		System.out.println("*****************Funcionario*****************");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("      1- Listagem de todos os produtos        ");
		System.out.println("      2- Criar produto         ");
		System.out.println("      3- Listagem de pedidos              ");
		System.out.println("      4- Cadastrar email              ");
		System.out.println("      5- Sair              ");

		int escolha = leitor.nextInt();

		System.out.println(escolha);
		switch (escolha) {
		case 5:
			Menus.menuprinc();
			break;
		case 4:
			System.out.println("Digite seu novo email:");
			String email = leitor.next();
			Funcionario.databasefuncionarios.get(0).email = email;
			System.out.println(Funcionario.databasefuncionarios.get(0).email);
			Menus.menufuncionario();

			break;
		case 3:
			
			for (int i = 0; i < Cliente.database.size(); i++) {
				System.out.println("Cliente: " + Cliente.database.get(i).nome + " " + "Produto :"
						+ Cliente.database.get(i).produto);

			}
			
			Menus.menufuncionario();
			break;
		case 2:
			Produto.registroprod();
			Menus.menufuncionario();

			break;
		case 1:
			Funcionario.verProdutos();
			Menus.menufuncionario();
			break;
		}

	}
}
