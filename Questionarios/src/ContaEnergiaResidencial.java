
public class ContaEnergiaResidencial extends ContaEnergia {

	@Override
	public Double getValorTotal() {
		double acresc = 0.00;
		
		if ((leituraFim - leituraInicio) >= 25 && (leituraFim - leituraInicio) <= 49) {
			
			acresc = 1.1;
			return getConsumo() * valorKwH * acresc;
			
		}
		
		if ((leituraFim - leituraInicio) > 50 && (leituraFim - leituraInicio) < 74) {
			acresc = 1.2;
			return getConsumo() * valorKwH * acresc;
		}
		
		if ((leituraFim - leituraInicio) > 75){
			acresc = 1.3;
			return getConsumo() * valorKwH * acresc;
		}
			return getConsumo();
	}

	public static void main(String[] args) {
		ContaEnergiaResidencial conta = new ContaEnergiaResidencial();
		conta.leituraInicio = 0.0;
		conta.leituraFim = 100.0;		
		System.out.println(conta.getValorTotal());
	}
}