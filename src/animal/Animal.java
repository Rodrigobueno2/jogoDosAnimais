package animal;

public class Animal {
	private String nome;
	private String acao;
	
	public Animal() {
	  
	}
	
	

	public Animal(String nome, String acao) {
		this.nome = nome;
		this.acao = acao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
