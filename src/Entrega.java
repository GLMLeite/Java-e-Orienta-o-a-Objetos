import java.util.ArrayList;
import java.util.Scanner;

public class Entrega{	
	public char i='s';
	public String nome;
	public String cdgproduto;
	static Scanner leitor = new Scanner (System.in);
	
	public static Funcionario cadastrar() {
		Funcionario cadfunc = new Funcionario();
		
		System.out.println("Digite sua login funcion�rio");
		cadfunc.loginfunc = leitor.nextLine();
		System.out.println("Digite sua senha funcion�rio");
		cadfunc.senhafunc = leitor.nextLine();	
		return cadfunc;
	}
	
	
	
	void entregas() {
		
		ArrayList<String> Pendentes = new ArrayList<>();
		ArrayList<String> Entregues = new ArrayList<>();		 
        
        while(i=='s' || i=='S'){

        	System.out.println("Informe o c�digo do produto a ser entregue ");
        	cdgproduto = leitor.nextLine();
        	Entregues.add(cdgproduto);        	
        	System.out.println("Escreva s ou S para continuar registrando");
        	i = leitor.next().charAt(0);
        }
        
        i= 's';      
        while(i=='s' || i=='S'){
      	System.out.println("Informe os c�digos dos produtos pendentes");
      	cdgproduto = leitor.nextLine();
      	
      	Pendentes.add(cdgproduto);
      	
      	System.out.println("Escreva s ou S para continuar registrando");
      	i = leitor.next().charAt(0);
        }
        
        System.out.println("C�digos de pedidos pendentes : " + Pendentes);
        System.out.println("C�digos de pedidos pendentes : " + Entregues);    
	}
}
