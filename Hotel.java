import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String nome;
	private int qualificacao;
	private List<Quarto> quartos;

	public Hotel() {
		nome = "test";
		qualificacao = 1;
		quartos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getQualificacao() {
		return qualificacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQualificacao(int qualificacao) {

		this.qualificacao = qualificacao;
	}

}