import java.util.Scanner;

public class Logcliente {
	String login, senha, cpf;
	
	Scanner leitor = new Scanner(System.in);
	
	public void imprimir(){
		System.out.println(this.login);
		System.out.println(this.senha);
		System.out.println(this.cpf);
	}
	
	void logincliente() {
		
		System.out.println("Cliente por favor insira seu nome");
		login = leitor.nextLine();
		System.out.println("Cliente por favor insira sua senha");
		senha = leitor.nextLine();
		Cliente c2 = new Cliente();
		
		
		//if(login.equals(c2.nome) && senha.equals(c2.senha)){
	      //  System.out.printf("Usu�rio logado com sucesso.\n");
	    //	System.out.println("             MENU!                           ");
	    	//System.out.println("      ---------------------                  ");
	    	//System.out.println("      ---------------------                  ");
	    	//System.out.println("      1- Editar dados pessoais               ");
	    	//System.out.println("      2- Visualizar seus pedidos             ");
	    	//System.out.println("      3- Visualizar status dos pedidos       ");
	    	//System.out.println("      4- Visualizar sac da empresa           ");
	    	//System.out.println("      5- Visualizar dados pessoais           ");
	    	//System.out.println("      6- Solicitar retirada                  ");
	    	//System.out.println("      7- Cancelar pedido                     ");
	    	//System.out.println("      8- Voltar menu principal               ");
	    	//int operacao = leitor.nextInt();
	    	//switch (operacao) {
	    	//case 8: Menu a = new Menu(); a.menu1();
	    	//	break;
	    	//case 7:
	    	//	break;
	    	//case 6:
	    	//	break;
	        //case 5:System.exit(0);
	        //    break;
	       // case 4:System.out.println("12386786459");
	        //    break;      
	       // case 3:
	       //     break;       
	        //case 2:
	         //   break;             
	        //case 1: 
	           // break;
	    //}
	//}	
}
}
