import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.SetNome("Paciente 1");
		paciente1.SetDataNascimento("30/07/2013");
		
		Paciente paciente2 = new Paciente();
		paciente2.SetNome("Paciente 2");
		paciente2.SetDataNascimento("28/01/1960");
		
		Paciente paciente3 = new Paciente();
		paciente3.SetNome("Paciente 3");
		paciente3.SetDataNascimento("10/11/1987");
		
		Medico medico1 	  = new Medico();
		medico1.SetNome("Medico 1");
		medico1.SetFatorMultiplicacao(1);
		
		Medico medico2 	  = new Medico();
		medico2.SetNome("Medico 2");
		medico2.SetFatorMultiplicacao(3);
		
	
		
		
		Cirurgia cirurgia1 = new Cirurgia();
		
		cirurgia1.SetMedico(medico1);
		cirurgia1.SetPaciente(paciente2);
		cirurgia1.SetDataProcedimento("01/10/2021");
		cirurgia1.SetNomeProcedimento("CIRURGIA CARDIOVASCULAR");
		cirurgia1.SetUrgencia(true);
		cirurgia1.SetValorFaturado(25000);
		
		System.out.println(GetInformacoesCirurgia(cirurgia1));
		
		
		
		Cirurgia cirurgia2 = new Cirurgia();
				
		cirurgia2.SetMedico(medico1);
		cirurgia2.SetPaciente(paciente1);
		cirurgia2.SetDataProcedimento("01/10/2021");
		cirurgia2.SetNomeProcedimento("CIRURGIA DISCECTOMIA\r\n"
										+ "TOTALMENTE ENDOSCÓPICA");
		cirurgia2.SetUrgencia(false);
		cirurgia2.SetValorFaturado(13750);
		
		System.out.println(GetInformacoesCirurgia(cirurgia2));
		
		
		Cirurgia cirurgia3 = new Cirurgia();
		
		cirurgia3.SetMedico(medico2);
		cirurgia3.SetPaciente(paciente3);
		cirurgia3.SetDataProcedimento("01/10/2021");
		cirurgia3.SetNomeProcedimento("CIRURGIA VITRECTOMIA");
		cirurgia3.SetUrgencia(false);
		cirurgia3.SetValorFaturado(25000);
		
		System.out.println(GetInformacoesCirurgia(cirurgia2));
		
		
		
	}
	
	
	public static String GetInformacoesCirurgia(Cirurgia cirurgia) {
		CalculadoraHonorariosMedicos calculadora = new CalculadoraHonorariosMedicos();
		calculadora.CalcularHonorarioMedico(cirurgia);
		DecimalFormat df = new DecimalFormat("#.##");
		

		
		return "Medico Responsavel: "+cirurgia.GetMedico().GetNome()+
				"\nPaciente: "+cirurgia.GetPaciente().GetNome()+
				"\nData de Nascimento: "+cirurgia.GetPaciente().GetDataNascimento()+
				"\nData do Procedimento: "+ cirurgia.GetDataProcedimento() +
				"\nProcedimento: "+ cirurgia.GetNomeProcedimento() +
				"\nValor Total Faturado: R$ "+ df.format(cirurgia.GetValorFaturado()) +
				"\n Total de Honorários dos Medicos: R$ "+ df.format(calculadora.GetValorHonorarioMedicos()) +
				"\n Total de Honorários dos Enfermeiros: R$ "+ df.format(calculadora.GetValorHonorarioEnfermeiros()) +
				"\n Total de Honorários dos Auxiliares: R$ "+ df.format(calculadora.GetValorHonorarioAuxiliares())+
				"\n\n\n";
	}
	

}