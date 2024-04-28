public class Quarto {

	private int num;
	private String tipo;
	private boolean disponivel;

	public Quarto() {
		num = 0;
		tipo = "";
		disponivel = true;
	}

	public int getNum() {
		return num;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		;
	}

}