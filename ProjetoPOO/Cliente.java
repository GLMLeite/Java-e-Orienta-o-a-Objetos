import java.util.Scanner;
public class Cliente extends User {

	 public Cliente register() {
		 	public static ArrayList<Client> database = new ArrayList<>();
		 
	        Scanner scanner = new Scanner(System.in);

	        Cliente user = new Cliente();
	        System.out.println("------------ Cadastro ------------");
	        System.out.println("Digite seu nome: ");
	        user.nome = scanner.nextLine();
	        System.out.println("Digite seu email: ");
	        user.email = scanner.nextLine();
	        System.out.println("Digite sua senha: ");
	        String senha;
	        senha = scanner.nextLine();
	        
	        user.setsenha(senha);
	         
	        
	        database.add(user);

	        return user;
	    }
	 	public Cliente getCliente(String email) {
	        Cliente user = new Cliente();
	        
	        for(Cliente client : database) {
	            if(client.email == email) {
	                user = client;
	            }
	        }
	        return user;
	 	}
	 
	
}
