import java.util.ArrayList;
import java.util.Scanner;

public class Cliente{
	public String nome;
	public String cpf;
	public String sobrenome;
	public String cdgpedido;
	public String tel, login;
	public String senha;
	public char j='s';
	public static Scanner leitor = new Scanner (System.in);	
	
	ArrayList<String> listaclientes = new ArrayList<>();
	
	
	public static Logcliente loginc() {
		Logcliente c1 = new Logcliente();
		
	    System.out.println("Informe seu login: ");
	    c1.login = leitor.nextLine();	
	    
	    System.out.println("Informe seu senha: ");
		c1.senha = leitor.nextLine();	
		System.out.println("Informe seu cpf: ");
		c1.cpf = leitor.nextLine();	
		
   return c1;
		
	}
}

	
	
	
	
	
	
	
	//public void getcad (ArrayList<String> listacliente) {
	//	System.out.println(listacliente);
	//}
	
	//public String getNomeCompleto(){
	//	return nome + " " + sobrenome;
	//}
	//void clientecad() {
	
	
	//Cliente c1 = new Cliente();
	
	
	//while(j=='s' || j=='S'){		
   
    //System.out.println("Informe seu nome: ");
    //c1.nome = leitor.nextLine();	
    
   // System.out.println("Informe seu sobrenome: ");
	//c1.sobrenome = leitor.nextLine();	
	
	//System.out.println("Informe seu senha: ");
	//c1.senha = leitor.nextLine();
	
	//System.out.println("Informe seu Telefone: ");
	//c1.tel = leitor.nextLine();
	
	//System.out.println("Informe seu código do pedido: ");
	//c1.cdgpedido = leitor.nextLine();	
	
	//listaclientes.add(c1.getNomeCompleto());
	//System.out.println(listaclientes.toString());
	
	//System.out.println("Escreva s ou S para continuar registrando");
	//j = leitor.next().charAt(0);
	
	//}
	//c1.getcad(listaclientes);
	
	//System.out.println("Cliente :" +  listaclientes);
	//Menu a = new Menu(); a.menu1();
//}
//}
	

