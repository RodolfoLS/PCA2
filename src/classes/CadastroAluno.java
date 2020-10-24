package classes;

public class CadastroAluno {

	private String nome;
	private String grauescola;
	private String email;
	private String senha;
	private String sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrauescola() {
		return grauescola;
	}
	public void setGrauescola(String grauescola) {
		this.grauescola = grauescola;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public CadastroAluno(String nome, String grauescola, String email, String senha, String sexo) {
		super();
		this.nome = nome;
		this.grauescola = grauescola;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
	}
	
	
	
}
