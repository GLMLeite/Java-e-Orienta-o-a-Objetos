import java.util.Scanner;

public class Funcionario {
	
	public String nome;
	public String loginfunc= "func", senhafunc= "12345";
	public String login, senha;
	public Scanner leitor = new Scanner(System.in);
	public Sistemaentrega loja;	
		public void imprimir(){
			System.out.println(this.loginfunc);
			System.out.println(this.senhafunc);
			
		}

	
	//void menufunc() {
		
	//System.out.println("Informe usuario de funcionario");
	//login = leitor.nextLine();
	//System.out.println("Digite a senha por favor");
	//senha = leitor.nextLine();
	//if(login.equals(loginfunc) && senha.equals(senhafunc)){
        //System.out.printf("Usuário logado com sucesso.\n");
    	//System.out.println("             MENU!                           ");
    	//System.out.println("      ---------------------                  ");
    	//System.out.println("      ---------------------                  ");
    	//System.out.println("      1- Visualizar entregas concluidas      ");
    	//System.out.println("      2- Visualizar entregas pendentes       ");
    	//System.out.println("      3- Visualizar códigos entregas         ");
    	//System.out.println("      4- Visualizar cpf clientes             ");
    	//System.out.println("      5- Visualizar retiradas                ");
    	//System.out.println("      6- Mudar status de pedidos             ");
    	//System.out.println("      7- Atribuir entregas                   ");
    	//System.out.println("      8- Informar retirada                   ");
    	//System.out.println("      9- voltar menu principal               ");
    	//int operacao = leitor.nextInt();
    	//switch (operacao) {
    	//case 9: Menu a = new Menu(); a.menu1();
    	//	break;
    	//case 8: 
    	//	break;
    	//case 7:
    	//	break;
    	//case 6:
    	//	break;
        //case 5:System.exit(0);
        //    break;
        //case 4: 
        //    break;      
        //case 3:
         //   break;       
       // case 2:
        //    break;             
        //case 1: 
           // break;
   // }
    	
    	
    //}else {
    	//System.out.println("Login ou senha inválidos!");
    //}
	
//}
            
}
