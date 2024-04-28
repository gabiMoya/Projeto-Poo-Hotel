import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TstHotel {
    public static void main(String[] args) {

        Hotel h1 = new Hotel();
	Leitura l = new Leitura();
        Cliente c1= new Cliente();
	Reserva r1 = new Reserva();
	Quarto q1 = new Quarto();
	    
	c1.setNome(l.entDados("Informe seu nome.:"));
	c1.setCpf(Integer.parseInt(l.entDados("\nInforme seu 	CPF..:"))); 
	c1.setTelefone(Integer.parseInt(l.entDados("\nInforme seu Telefone com DDD sem espacos (ex 43991059635)..:")));
	c1.setEmail(l.entDados("\nInforme seu e-mail.:"));

 	System.out.println("Confirme seus dados inseridos");
 	System.out.println("\n Nome..."+c1.getNome());
 	System.out.println("\n CPF..."+c1.getCpf());
 	System.out.println("\n Telefone..."+c1.getTelefone());
	System.out.println("\n e-mail..."+c1.getEmail());

	//q1.setDataInicio(Integer.parseInt(l.entDados("\nInforme a data de check in..:"))); 
	//q1.setDataFim(Integer.parseInt(l.entDados("\nInforme a data de check out..:")));
//Não sei transformar string inserida para formato de data
	    
 	//System.out.println("Confirme as datas inseridas");
 	//System.out.println("/n data de chegada..."+q1.getDataInicio());
 	//System.out.println("/n data de saida..." q1.getDatafim());
 
}
	
}
