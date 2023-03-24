import java.util.Scanner;

public class Administrador{
	
	public static Scanner leitor = new Scanner(System.in); 
	public char escolha;
	public String user = "ADM";
	public String senhaesp = "12345";
	public String senhafunc, loginfunc, sac;
	public String login, senha;
	
	
	public static Menuadm cadastrar() {
		Menuadm cadadm = new Menuadm();
		
		System.out.println("Digite sua login ADM");
		cadadm.loginadm = leitor.nextLine();
		System.out.println("Digite sua senha ADM");
		cadadm.senhaadm = leitor.nextLine();	
		return cadadm;
	}
}

	
	//void Admin(){
	
	//System.out.println("Informe usuario");
	//login = leitor.nextLine();
	//System.out.println("Digite a senha por favor");
	//senha = leitor.nextLine();
	
	//if(login.equals(user) && senha.equals(senhaesp)){
    //    System.out.printf("Usuário logado com sucesso.\n");
     //   Menuadm menu = new Menuadm();
     //   menu.menu2();        
   // }else {
    //	System.out.println("Login ou senha inválidos!");
   // }
	//}
	    
	
	//void alteradados() {
	//    	System.out.println("Digite sua nova senha: ");
	 //   	senhaesp = leitor.nextLine();
	    	
	    //	System.out.println("Digite sua novo user: ");
	    //	user = leitor.nextLine();
	    //	Menu a = new Menu(); a.menu1();
	  //  }
	//public void sac() {
	//	System.out.println("Informe um número para contato");
		//sac = leitor.nextLine();
		//Menu a = new Menu(); a.menu1();	
	//}
	
	//public void printsac() {
	//	System.out.println(sac);
	//}
	//void dadosfunc() {
		//System.out.println("Informe seu login: ");
		//loginfunc = leitor.nextLine();
		//System.out.println("Informe seu senha: ");
		//senhafunc = leitor.nextLine();
		
	//	Menu a = new Menu(); a.menu1();
	//}
	
	//}
	


	

	

