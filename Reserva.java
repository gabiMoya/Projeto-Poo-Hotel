public class Reserva{

	private Cliente cliente;
	private Quarto quarto;
	private LocalDate dataInicio;
	private LocalDate dataFim;

    public Reserva(Cliente cliente, Quarto quarto,LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }



	public int getCliente(){
		return cliente;
	}
	
	public int getQuarto(){
		return quarto;
	}
	
	public int getDataInicio(){
		return dataInicio;
	}
	
	public int getDataFim(){
		return DataFim;
	}
		
	public int getValor(){
		return valor;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
}

	public void setQuarto(Quarto quarto){
		this.quarto = quarto;
}

	public void setDataInicio(LocalDate dataInicio){
		this.dataInicio = dataInicio;
}


}
	//public void CalcPreco(){
	//	System.out.println("Mostra o Valor da estadia")
	//}

	



}
