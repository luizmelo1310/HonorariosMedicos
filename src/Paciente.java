public class Paciente {

	private String Nome;
	private String DataNascimento;
	
	public void SetNome(String nome) {
		this.Nome = nome;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public void SetDataNascimento(String data) {
		this.DataNascimento = data;
	}
	
	public String GetDataNascimento() {
		return this.DataNascimento;
	}
}
