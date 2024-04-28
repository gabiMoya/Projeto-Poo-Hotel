import java.time.LocalDate;

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

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	// public void CalcPreco(){
	// System.out.println("Mostra o Valor da estadia")
	// }

}
