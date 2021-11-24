public class Cirurgia {

	private Medico Medico;
	private Paciente Paciente;
	private String DataProcedimento;
	private String NomeProcedimento;
	private boolean Urgencia;
	private double ValorFaturado;
	private Contrato contrato;
	
	////____MEDICO____////
	
	public void SetMedico(Medico medico) 
	{
		this.Medico = medico;
	}
	public Medico GetMedico() 
	{
		return this.Medico;	
	}
	
	////____ PACIENTE ____////
	public void SetPaciente(Paciente paciente) 
	{
		this.Paciente = paciente;
	}
	public Paciente GetPaciente() 
	{
		return this.Paciente;	
	}
	
	////____ DATA PROCEDIMENTO ____////	
	public void SetDataProcedimento(String dataProcedimento) 
	{
		this.DataProcedimento = dataProcedimento;
	}
	public String GetDataProcedimento() 
	{
		return this.DataProcedimento;	
	}
	
	////____ NOME PROCEDIMENTO ____////	
	public void SetNomeProcedimento(String nomeProcedimento) 
	{
		this.NomeProcedimento = nomeProcedimento;
	}
	public String GetNomeProcedimento() 
	{
		return this.NomeProcedimento;	
	}
	
	////____ URGENCIA ____////	
	public void SetUrgencia(Boolean urgencia) 
	{
		this.Urgencia = urgencia;
	}
	public Boolean GetUrgencia() 
	{
		return this.Urgencia;	
	}
	
	////____ VALOR FATURADO ____////	
	public void SetValorFaturado(double valorFaturado) 
	{
		this.ValorFaturado = valorFaturado;
	}
	public double GetValorFaturado() 
	{
		return this.ValorFaturado;	
	}
	
	public void SetContrato(Contrato contrato) 
	{
		this.contrato = contrato;
	}
	public Contrato GetContrato() 
	{
		return this.contrato;	
	}
	
	
	
}
