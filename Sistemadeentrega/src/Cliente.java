import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Usuario {
	String digitado, digitadocpf;
	String pedido;
	public Produto produto;
	static Scanner leitor = new Scanner(System.in);
	
	public static ArrayList<Cliente> database = new ArrayList<>();
	public static ArrayList<Produto> meupedido = new ArrayList<>();

	public Cliente registro() {
		Cliente cliente = new Cliente();
		System.out.println("***Cadastre-se***");
		System.out.println("Digite seu nome: ");
		cliente.nome = leitor.nextLine();
		System.out.println("Digite sua senha: ");
		cliente.senha = leitor.nextLine();
		System.out.println("Digite seu CPF: ");
		cliente.cpf = leitor.nextLine();
		System.out.println("Digite seu email: ");
		cliente.email = leitor.nextLine();
		database.add(cliente);
		
		
		Menus.menuprinc();
		return cliente;
	}

	public static void loginCliente(String email, String senha) {
		for (Cliente cliente : database) {
			if (cliente.email.equals(email) && cliente.senha.equals(senha)) {
				Menus.menuCliente();
			}
			}

	}
	public static void listarprodutos(){
		for (int i = 0; i < Cliente.database.size(); i++) {
			
		}
	}

	
	
//	public static void verificaCliente() {
//		for (Cliente cliente : database ) {
//			if (cliente.email.equals(cliente.email)){
//				
//			}
//		}
//		
//	}
	
//	public static void pedidocliente() {
//		for ( Cliente cliente: Cliente.database) {
//		System.out.println("Informe seu pedido: ");
//		Cliente.pedido = leitor.nextLine();
//		Pedido.pedidos.add(cliente);
//		}
//		
//		
//	}
//	
	
	
	
	
}
