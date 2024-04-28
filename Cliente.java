public class Cliente {

	private String nome;
	private int cpf;
	private int telefone;
	private String email;

	public Cliente() {
		nome = "tst nome";
		cpf = 12;
		telefone = 213;
		email = "teset email";
	}

	// Construtor já com os campos da classe. Interessante fazer com todas as
	// classes
	public Cliente(String nome, int cpf, int telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}