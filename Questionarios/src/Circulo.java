
public class Circulo extends FormaGeometrica{
	   Double raio, area; 

	    public Circulo(Integer id, String cor, double raio) {
	        super(id, cor);
	        this.raio = raio;
	        
	    }
	    public Double getArea() {
	        return area = 3.14159265358979323846*raio*raio;
	        }
	    
	    void imprimir(){
	        System.out.println("O círculo é " +cor+" e tem área de " +getArea()+".");
	    	}
	public static void main(String[] args) {
		Circulo circulo = new Circulo(1,"azul",1.2);
		System.out.println(circulo.getArea());
		circulo.imprimir();
	}

}
