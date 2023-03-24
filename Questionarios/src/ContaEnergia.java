
public class ContaEnergia {
	
	public Double leituraInicio = 0.0;
	public Double leituraFim = 0.0;
	public Double valorKwH = 1.0;
	
	public Double getValorTotal() {
		return getConsumo() * valorKwH;
	}
	

	public Double getConsumo() {
		return leituraFim - leituraInicio;
	}

}
