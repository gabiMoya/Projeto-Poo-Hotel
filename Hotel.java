import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String nome;
	private List<Quarto> quartos;
	private List<Reserva> reservasFeitas;
	private int contReserva = 0;

	public Hotel() {
		nome = "Grad Plaza Hotel";
		quartos = new ArrayList<>();
		reservasFeitas = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Quarto quarto = new Quarto(i, true);
			quartos.add(quarto);
		}
	}

	public Reserva insReserva(Cliente cliente, int quntQuatos, LocalDate dataInicio, LocalDate dataFim) { // INSERÇÃO de
																											// uma nova
																											// reserva

		List<Quarto> quartosLivres = new ArrayList<>();

		for (int i = 0; i < quartos.size(); i++) {
			Quarto quarto = quartos.get(i);
			if (quarto.getDisponivel() == true) {
				quartosLivres.add(quarto);
			}
		}

		if (quntQuatos <= 3 && quntQuatos <= quartosLivres.size()) {
			try {
				Reserva reservaAux = new Reserva(contReserva, cliente, quartos.subList(0, quntQuatos), dataInicio,
						dataFim);
				reservasFeitas.add(reservaAux);
				contReserva += 1;
				return reservaAux;
			} catch (DataInvalidaException | PeriodoInvalidoException e) {
				System.out.println(e.getMessage());
				return null;
			}
		} else {
			return null;
		}

	}

	public List<Reserva> consultaReserva() {

		return reservasFeitas;
	}

	public void cancelaReserva(int numeroReserva) {
		for (int i = 0; i < reservasFeitas.size(); i++) {
			Reserva reserva = reservasFeitas.get(i);
			if (reserva.getNumeroReserva() == numeroReserva) {
				reservasFeitas.remove(numeroReserva);
			}
		}

	}

}