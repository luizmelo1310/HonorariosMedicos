
public class Contrato {
		
		private Hospital hospital = new Hospital();
		private Convenio convenio = new Convenio();
		private double TaxaAdministracao = 0;
		private double AcrescimoUrgencia = 0;
		
		public void SetHospital(Hospital hospital) {
			this.hospital = hospital; 
		}
		public Hospital GetHospital() {
			return this.hospital ;
		}
		
		
		public void SetConvenio(Convenio convenio) {
			this.convenio = convenio; 
		}
		public Convenio GetConvenio() {
			return this.convenio ;
		}

		
		public void SetTaxaAdm(double TaxaAdministracao) {
			this.TaxaAdministracao = TaxaAdministracao/100; 
		}
		public double GetTaxaAdm() {
			return this.TaxaAdministracao ;
		}
		
		public double GetTaxaAdmFormatada() {
			return this.TaxaAdministracao*100 ;
		}

		
		public void SetAcrescimoUrgencia(double AcrescimoUrgencia) {
			this.AcrescimoUrgencia = AcrescimoUrgencia/100; 
		}
		public double GetAcrescimoUrgencia() {
			return this.AcrescimoUrgencia ;
		}
		public double GetAcrescimoUrgenciaFormatada() {
			return this.AcrescimoUrgencia*100 ;
		}


}
