import java.util.ArrayList;
import java.util.Scanner;

public class Usuario  {
	public String email;
    public String senha;
    
	public static ArrayList<Usuario> lista = new ArrayList<>();
	public static Scanner leitor = new Scanner(System.in);
	
	public static Usuario cadastrar() {
		Usuario usuario = new Usuario();
		usuario.email = leitor.nextLine();
		usuario.senha = leitor.nextLine();
		lista.add(usuario);
		return usuario;
	}

	public static void main(String[] args) {
		Usuario novo = Usuario.cadastrar();
		System.out.println(novo.email);
		System.out.println(novo.senha);
		System.out.println(Usuario.lista.get(0).email);
		System.out.println(Usuario.lista.get(0).senha);
	}

}
