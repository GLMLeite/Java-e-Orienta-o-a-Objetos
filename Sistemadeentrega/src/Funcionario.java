import java.util.ArrayList;

public class Funcionario extends Usuario {

	
	public ArrayList<Produto> databaseProdutos = new ArrayList<>();
	public static ArrayList<Funcionario> databasefuncionarios = new ArrayList<>();
	
	public static Funcionario funcionarioPadrao() {
		
		Funcionario func = new Funcionario();

		func.nome = "func1";

		func.senha = "func1234";

		func.email = "func@func.com";

		databasefuncionarios.add(func);
		
		return func;
	}

	public static void verProdutos() {
		if(Produto.estoques.size() == 0) {
			System.out.println("Nenhum produto cadastrado");
		}
		System.out.println("		TODOS OS PRODUTOS 		");
		for (int i = 0; i < Produto.estoques.size(); i++) {
			System.out.println("----------------------------------------------");
			System.out.print("Produto: " + Produto.estoques.get(i).nomeproduto + ", Destnatario: " + Produto.estoques.get(i).destinatario.nome + "\n");

		}

	}
	
	
	public static void loginFunc (String email, String senha) {
		
		for (Funcionario funcionario : databasefuncionarios) {
			if (funcionario.email.equals(email) && funcionario.senha.equals(senha)) {
				
				Menus.menufuncionario();
				
			}
		}

	}
	
	
	
	
	

	public void listaProdutos() {
		for (int i = 0; i < databaseProdutos.size(); i++) {
			System.out.println("Listagem de produtos: ");
			System.out.println("--------------------------- \n");
			System.out.println(databaseProdutos.get(i));
		}
	}

}
