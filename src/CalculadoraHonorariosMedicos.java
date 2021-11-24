
public class CalculadoraHonorariosMedicos {

	
	private double ValorHonorariosMedicos = 0;
	private double ValorHonorariosAuxiliar = 0;
	private double ValorHonorariosEnfermeiros = 0;
	
	public void CalcularHonorarioMedico(Cirurgia cirurgiaP) {
		
		Cirurgia cirurgia = new Cirurgia();
		cirurgia = cirurgiaP;
		
		Medico medico = new Medico();
		medico = cirurgia.GetMedico();
		
		double valorFaturado = cirurgia.GetValorFaturado();
		valorFaturado = valorFaturado*medico.GetFatorMultiplicacao();
		
		valorFaturado -= valorFaturado*0.10;
		
		if(cirurgia.GetUrgencia() == true) {
			valorFaturado += valorFaturado*0.15;
		}
		
		
		ValorHonorariosMedicos = valorFaturado;
		
		CalcularHonorarioAuxiliar();
		CalcularHonorarioEnfermeiro();
		
	}
	
	private void CalcularHonorarioAuxiliar() {
		this.ValorHonorariosAuxiliar = this.ValorHonorariosMedicos * 0.15;
	}
	
	private void CalcularHonorarioEnfermeiro() {
		this.ValorHonorariosEnfermeiros = this.ValorHonorariosMedicos * 0.30;
	}
	
	
	
	public double GetValorHonorarioMedicos() {
		return this.ValorHonorariosMedicos;
	}
	public double GetValorHonorarioEnfermeiros() {
		return this.ValorHonorariosEnfermeiros;
	}
	public double GetValorHonorarioAuxiliares() {
		return this.ValorHonorariosAuxiliar;
	}
	

	
	
	
	
}
