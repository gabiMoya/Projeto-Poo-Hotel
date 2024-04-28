public class TstHotel {
    public static void main(String[] args) {

        //Hotel h1 = new Hotel();
	Leitura l = new Leitura();
        Cliente c1= new Cliente();
	//Reserva r1 = new Reserva();
	//Quarto q1 = new Quarto();

	c1.setNome(l.entDados("Informe seu nome.:"));
	c1.setCpf(Integer.parseInt(l.entDados("/nInforme seu 	CPF..:"))); 
	c1.setTelefone(Integer.parseInt(l.entDados("/nInforme seu 	Telefone com DDD sem espacos (ex 43991059635)..:")));
	c1.setEmail(l.entDados("/nInforme seu e-mail.:"));

 	System.out.println("Confirme seus dados inseridos");
 	System.out.println("/n Nome..."+c1.getNome());
 	System.out.println("/n CPF..."+c1.getCpf());
 	System.out.println("/n Telefone..."+c1.getTelefone());
	System.out.println("/n e-mail..."+c1.getEmail());

}
	
}