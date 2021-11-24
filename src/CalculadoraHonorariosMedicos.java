
public class CalculadoraHonorariosMedicos {

	
	private double ValorHonorariosMedicos = 0;
	private double ValorHonorariosAuxiliar = 0;
	private double ValorHonorariosEnfermeiros = 0;
	
	public void CalcularHonorarioMedico(Cirurgia cirurgiaP) {
		
		
		Medico medico = new Medico();
		medico = cirurgiaP.GetMedico();
		
		double valorFaturado = cirurgiaP.GetValorFaturado();
		valorFaturado = valorFaturado*medico.GetFatorMultiplicacao();
		
		double dTaxaAdm = cirurgiaP.GetContrato().GetTaxaAdm();
		double dAcrescimoUrgencia = cirurgiaP.GetContrato().GetAcrescimoUrgencia();
		
		valorFaturado -= valorFaturado*dTaxaAdm;
		
		if(cirurgiaP.GetUrgencia() == true) {
			valorFaturado += valorFaturado*dAcrescimoUrgencia;
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
