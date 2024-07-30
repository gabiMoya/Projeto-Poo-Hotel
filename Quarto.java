
public class Quarto {

	private int num;
	private boolean disponivel;

	public Quarto(int num, boolean disponivel) {
		this.num = num;
		this.disponivel = disponivel;
	}

	public int getNum() {
		return num;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}