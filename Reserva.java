import java.time.LocalDate;

public class Reserva {

	private Cliente cliente;
	private Quarto quarto;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private double valor;

	public Reserva(Cliente cliente, Quarto quarto, LocalDate dataInicio, LocalDate dataFim) {
		this.cliente = cliente;
		this.quarto = quarto;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Reserva() {

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

	public Double getValor() {
		return valor;
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

	public void setValor(double valor) {
		this.valor = valor;
	}

}