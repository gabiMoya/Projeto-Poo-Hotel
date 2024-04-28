import java.util.ArrayList;

public class Hotel{

private String nomeHotel;
private int qualificacao;
private List<Quarto> quartos;



public Hotel(){
		nomeHotel = "test";
		qualificacao = 1;
		quarto = new ArrayList<>();
	}

public String getNome(){
return nome;
}

public int getQualificacao(){
return qualificacao;
}


public void setNome(String nome){

this.nome = nome;
}

public void setQualificacao(int qualificacao){

this.qualificacao = qualificacao;
}

}