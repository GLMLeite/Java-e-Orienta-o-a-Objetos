import java.util.ArrayList;

public class Conta  {
	double saldo = 0;
	double soma = 0;
	public static ArrayList<Operacao> operacoes= new ArrayList<>();
	public double getSaldo() {

			for (int j = 0; j < Conta.operacoes.size(); j++) {
				saldo = saldo + Conta.operacoes.get(j).valor;	
			}
		
		return saldo;
	}

	public static void main(String[] args) {
		Conta conta = new Conta();
		Operacao op1 = new Operacao();
		op1.descricao = "Deposito";
		op1.valor = 100.0;

		Operacao op2 = new Operacao();
		op2.descricao = "Ted";
		op2.valor = 50.0;

		Operacao op3 = new Operacao();
		op3.descricao = "Pix";
		op3.valor = 75.0;

		Conta.operacoes.add(op1);
		Conta.operacoes.add(op2);
		Conta.operacoes.add(op3);

		System.out.println(conta.getSaldo());

	}
}
