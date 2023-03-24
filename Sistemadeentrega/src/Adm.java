import java.util.ArrayList;
import java.util.Scanner;

public class Adm extends Usuario {

	static Scanner leitor = new Scanner(System.in);
	public static ArrayList<Adm> databaseadmin = new ArrayList<>();

	public static Adm admPadrao() {
		Adm adm = new Adm();

		adm.nome = "ADM";

		adm.senha = "admin123";

		adm.email = "admin@admin.com";

		databaseadmin.add(adm);
		return adm;
	}

	public static void loginAdm(String email, String senha) {
		for (Adm admin : databaseadmin) {
			if (admin.email.equals(email) && admin.senha.equals(senha)) {
				Menus.menuADM();
			}
		}

	}

	public Funcionario cadastrofunc() {

		Funcionario funcionario = new Funcionario();

		System.out.println("***Cadastre um novo Funcionario***");
		System.out.println("Digite o nome do Funcionario");
		funcionario.nome = leitor.nextLine();

		System.out.println("Digite a senha do Funcionario");
		funcionario.senha = leitor.nextLine();

		System.out.println("Digite o Email do Funcionario");
		funcionario.email = leitor.nextLine();

		Funcionario.databasefuncionarios.add(funcionario);

		return funcionario;
	}

	public void listafunc() {
		for (int i = 0; i < Funcionario.databasefuncionarios.size(); i++) {
			System.out.println("Lista de Funcionarios ");
			System.out.println("---------------------");
			System.out.println(Funcionario.databasefuncionarios.get(i));
		}

	}

	public static void verCliente() {
		System.out.println("Lista de Clientes ");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < Cliente.database.size(); i++) {

			System.out.println(Cliente.database.get(i).nome + " " + Cliente.database.get(i).email + ", CPF: " + Cliente.database.get(i).cpf +"\n");

		}

	}

	public static void verProdutos() {
		System.out.println("		TODOS OS PRODUTOS 		");
		for (int i = 0; i < Produto.estoques.size(); i++) {
			System.out.println("----------------------------------------------");
			System.out.print("ID: " + Produto.estoques.get(i).id +  ", Produto: " + Produto.estoques.get(i).nomeproduto
					+ "\n");

		}

	}

	public static void verfuncionario() {
		System.out.println("Lista de Funcionarios ");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < Funcionario.databasefuncionarios.size(); i++) {

			System.out.println(Funcionario.databasefuncionarios.get(i).nome + " " + Funcionario.databasefuncionarios.get(i).email + "\n");
			
		}

	}

	public static void criarfunc() {
		Funcionario func = new Funcionario();
		System.out.println("\n");
		System.out.println("Digite um nome:");
		func.nome = leitor.next();

		System.out.println("Digite uma senha:");
		func.senha = leitor.next();

		System.out.println("Digite um email:");
		func.email = leitor.next();

		Funcionario.databasefuncionarios.add(func);
	}

}
