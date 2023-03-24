import java.util.Scanner;


public class Funcionario {

	 public static ArrayList<Funcionario> database = new ArrayList<>();
	public String empresa;
	
	public Funcionario loginafunc(String nome, String email, String empresa, String senha) {
        this.setPassword(senha);
        this.email = email;
        this.nome = nome;
        this.empresa = empresa;
          

        database.add(this); 

        return this;
    }
	
	   public void getClientes() {
	        ArrayList<Cliente> clientes = Cliente.database;

	        for(Cliente client : clientes) {
	            System.out.println();
	            System.out.println("Nome: " + client.nome);
	            System.out.println("Email: " + client.email);
	           }
	    }
	
	
	
	
}
