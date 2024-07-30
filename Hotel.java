import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String nome;
	private List<Quarto> quartos;

	public Hotel() {
		nome = "Grad Plaza Hotel";
		quartos = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Quarto quarto = new Quarto(i, true);
			quartos.add(quarto);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}