import java.time.LocalDate;
import java.time.Period;

public class Reserva {

	private Cliente cliente;
	private Quarto quarto;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
		this.cliente = cliente;
		this.quarto = quarto;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public int calcPreco() {

		Period periodo = Period.between(this.dataInicio, this.dataFim);

		return periodo.getDays() * 50;

	}

	public void dataInvalidaException(LocalDate dataInicio, LocalDate dataFim)
			throws PeriodoInvalidoException, DataInvalidaException {
		Period periodo = Period.between(dataInicio, dataFim);
		if (periodo.getDays() == 0) {
			throw new PeriodoInvalidoException();
		}
		LocalDate dataAtual = LocalDate.now();

		if (dataInicio.isBefore(dataAtual) && dataFim.isBefore(dataAtual)) {
			throw new DataInvalidaException();

		}
	}

}