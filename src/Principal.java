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
		
		Hospital hospital1 = new Hospital();
		hospital1.SetNome("Hospital 1");
		
		Hospital hospital2 = new Hospital();
		hospital2.SetNome("Hospital 2");
		
		Convenio convenio1 = new Convenio();
		convenio1.SetNome("UNIMED");
		
		Convenio convenio2 = new Convenio();
		convenio2.SetNome("SUS");
		
		Contrato contrato1 = new Contrato();
		contrato1.SetHospital(hospital1);
		contrato1.SetConvenio(convenio1);
		contrato1.SetTaxaAdm(7);
		contrato1.SetAcrescimoUrgencia(15);
		
		Contrato contrato2 = new Contrato();
		contrato2.SetHospital(hospital1);
		contrato2.SetConvenio(convenio2);
		contrato2.SetTaxaAdm(10);
		contrato2.SetAcrescimoUrgencia(13);
		
		Contrato contrato3 = new Contrato();
		contrato3.SetHospital(hospital2);
		contrato3.SetConvenio(convenio1);
		contrato3.SetTaxaAdm(8.2);
		contrato3.SetAcrescimoUrgencia(13.5);
		
		Contrato contrato4 = new Contrato();
		contrato4.SetHospital(hospital2);
		contrato4.SetConvenio(convenio2);
		contrato4.SetTaxaAdm(11);
		contrato4.SetAcrescimoUrgencia(14.7);
		
		
		
		
		
		Cirurgia cirurgia1 = new Cirurgia();
		
		cirurgia1.SetMedico(medico1);
		cirurgia1.SetPaciente(paciente2);
		cirurgia1.SetDataProcedimento("01/10/2021");
		cirurgia1.SetNomeProcedimento("CIRURGIA CARDIOVASCULAR");
		cirurgia1.SetUrgencia(true);
		cirurgia1.SetValorFaturado(25000);
		cirurgia1.SetContrato(contrato1);
		
		System.out.println(GetInformacoesCirurgia(cirurgia1));
		
		
		
		Cirurgia cirurgia2 = new Cirurgia();
				
		cirurgia2.SetMedico(medico1);
		cirurgia2.SetPaciente(paciente1);
		cirurgia2.SetDataProcedimento("01/10/2021");
		cirurgia2.SetNomeProcedimento("CIRURGIA DISCECTOMIA\r\n"
										+ "TOTALMENTE ENDOSCÓPICA");
		cirurgia2.SetUrgencia(false);
		cirurgia2.SetValorFaturado(13750);
		cirurgia2.SetContrato(contrato3);
		
		System.out.println(GetInformacoesCirurgia(cirurgia2));
		
		
		Cirurgia cirurgia3 = new Cirurgia();
		
		cirurgia3.SetMedico(medico2);
		cirurgia3.SetPaciente(paciente3);
		cirurgia3.SetDataProcedimento("01/10/2021");
		cirurgia3.SetNomeProcedimento("CIRURGIA VITRECTOMIA");
		cirurgia3.SetUrgencia(false);
		cirurgia3.SetValorFaturado(25000);
		cirurgia3.SetContrato(contrato2);
		
		System.out.println(GetInformacoesCirurgia(cirurgia3));
		
		
		Cirurgia cirurgia4 = new Cirurgia();
		
		cirurgia4.SetMedico(medico2);
		cirurgia4.SetPaciente(paciente3);
		cirurgia4.SetDataProcedimento("01/10/2021");
		cirurgia4.SetNomeProcedimento("CIRURGIA VITRECTOMIA");
		cirurgia4.SetUrgencia(false);
		cirurgia4.SetValorFaturado(25000);
		cirurgia4.SetContrato(contrato4);
		
		System.out.println(GetInformacoesCirurgia(cirurgia4));
		
		
		
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
				"\n Nome Convenio: R$ "+cirurgia.GetContrato().GetConvenio().GetNome()+
				"\n Porcentagem Taxa Administrativa: R$ "+cirurgia.GetContrato().GetTaxaAdmFormatada()+"%"+
				"\n Porcentagem Taxa Urgencia: R$ "+ cirurgia.GetContrato().GetAcrescimoUrgenciaFormatada()+"%"+
				"\n Nome Hospital: R$ "+ cirurgia.GetContrato().GetHospital().GetNome()+
				"\n\n\n";
	}
	

}