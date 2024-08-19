public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;
	private String email;

	public Cliente(String nome, String cpf, String telefone, String email) throws CpfInvalidoException {
		this.nome = nome;
		this.validaCpf(cpf);
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) throws CpfInvalidoException {
		this.validaCpf(cpf);
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void validaCpf(String cpf) throws CpfInvalidoException {
		if (cpf.length() != 11) {
			throw new CpfInvalidoException();
		}
	}

}