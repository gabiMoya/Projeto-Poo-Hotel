import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Reserva {
	private int numeroReserva;
	private Cliente cliente;
	private List<Quarto> quartos;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	public Reserva(int numeroReserva, Cliente cliente, List<Quarto> quartos, LocalDate dataInicio, LocalDate dataFim)
			throws PeriodoInvalidoException, DataInvalidaException {

		this.validarDatas(dataInicio, dataFim);
		this.numeroReserva = numeroReserva;
		this.cliente = cliente;
		this.quartos = quartos;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Quarto> getQuartos() {
		return quartos;
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

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public int calcPreco() {

		Period periodo = Period.between(this.dataInicio, this.dataFim);

		int valorResult = (periodo.getDays() * 50) * this.quartos.size();

		return valorResult;
	}

	public void validarDatas(LocalDate dataInicio, LocalDate dataFim)
			throws PeriodoInvalidoException, DataInvalidaException {
		Period periodo = Period.between(dataInicio, dataFim);

		if (periodo.getDays() == 0) {
			throw new PeriodoInvalidoException();
		}
		LocalDate dataAtual = LocalDate.now();

		if (dataInicio.isBefore(dataAtual) || dataFim.isBefore(dataAtual)) {
			throw new DataInvalidaException();
		}
	}

}