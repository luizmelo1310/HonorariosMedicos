public class Medico {

	private String Nome;
	private int FatorMultiplicacao = 1;
	
	public void SetNome(String nome) {
		this.Nome = nome;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public void SetFatorMultiplicacao(int fator_multiplicacao) {
		if(fator_multiplicacao < 1) {
			this.FatorMultiplicacao = 1;
		}
		if(fator_multiplicacao > 3) {
			this.FatorMultiplicacao = 3;
		}
		else {
			this.FatorMultiplicacao = fator_multiplicacao;
		}
	}
	
	public int GetFatorMultiplicacao() {
		return this.FatorMultiplicacao;
	}
	
}
