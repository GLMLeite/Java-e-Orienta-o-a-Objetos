
public class Veiculo {
	   public String modelo;
	    public String marca;
	    public String cor;
	    
	    public Veiculo(String modelo, String marca, String cor) {
	        modelo = modelo;
	        cor = cor;
	        marca = marca;
	    }
	public static void main(String[] args) {
	Veiculo v = new Veiculo("Fusca","VW","Roxo");
	
	
	
	System.out.println(v.modelo + v.cor + v.marca);
	}

}
