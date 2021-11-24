public class Medico {

	private String Nome;
	private int FatorMultiplica��o = 1;
	
	public void SetNome(String nome) {
		this.Nome = nome;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public void SetFatorMultiplicacao(int fator_multiplicacao) {
		if(fator_multiplicacao < 1) {
			this.FatorMultiplica��o = 1;
		}
		if(fator_multiplicacao > 3) {
			this.FatorMultiplica��o = 3;
		}
		else {
			this.FatorMultiplica��o = fator_multiplicacao;
		}
	}
	
	public int GetFatorMultiplicacao() {
		return this.FatorMultiplica��o;
	}
	
}
