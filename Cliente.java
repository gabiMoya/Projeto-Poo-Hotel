public class Cliente {

	private String nome;
	private String cpf;
	private int telefone;
	private String email;

	public Cliente(String nome, String cpf, int telefone, String email) throws CpfPeqException {
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

	public int getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) throws CpfPeqException {
		this.validaCpf(cpf);
		this.cpf = cpf;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void validaCpf(String cpf) throws CpfPeqException {
		if (cpf.length() > 12 || cpf.length() < 0) {
			throw new CpfPeqException();
		}
	}

}