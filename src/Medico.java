public class Medico {

	private String Nome;
	private int FatorMultiplicação = 1;
	
	public void SetNome(String nome) {
		this.Nome = nome;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public void SetFatorMultiplicacao(int fator_multiplicacao) {
		if(fator_multiplicacao < 1) {
			this.FatorMultiplicação = 1;
		}
		if(fator_multiplicacao > 3) {
			this.FatorMultiplicação = 3;
		}
		else {
			this.FatorMultiplicação = fator_multiplicacao;
		}
	}
	
	public int GetFatorMultiplicacao() {
		return this.FatorMultiplicação;
	}
	
}
