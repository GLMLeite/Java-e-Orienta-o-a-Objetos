import java.util.ArrayList;


public class Sistemaentrega {
	public ArrayList <Funcionario> funcionarios = new ArrayList <>();
	public String nome; 
	
	public static void main(String[] args) {
	 Sistemaentrega entrega = new Sistemaentrega ();
	 entrega.nome = "sedex";
	Funcionario funcionario = new Funcionario ();
	 funcionario.nome = "carlinhos";
	 entrega.funcionarios.add(funcionario);
	 funcionario.loja = entrega; 
	 System.out.println (entrega.funcionarios.get(0).nome);
	System.out.println (funcionario.loja.nome);
		
		
		
		Funcionario logf = Entrega.cadastrar();
	 logf.imprimir();
	 
	 Logcliente logc = Cliente.loginc();
	 
	 logc.imprimir();
	 
	 Menuadm logadm = Administrador.cadastrar();
	 logadm.imprimir();
	 
	}

}
