import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TstHotel {
	public static void main(String[] args) {
		Hotel h1 = new Hotel();
		Leitura l = new Leitura();
		Cliente c1 = new Cliente();
		Reserva r1 = new Reserva();
		Quarto q1 = new Quarto();

		// c1.setNome(l.entDados("Informe seu nome.:"));
		// c1.setCpf(Integer.parseInt(l.entDados("\nInforme seu CPF..:")));
		// c1.setTelefone(Integer.parseInt(l.entDados("\nInforme seu Telefone com DDD
		// sem espacos (ex 43991059635)..:")));
		// c1.setEmail(l.entDados("\nInforme seu e-mail.:"));

		// System.out.println("Confirme seus dados inseridos");
		// System.out.println("\n Nome..." + c1.getNome());
		// System.out.println("\n CPF..." + c1.getCpf());
		// System.out.println("\n Telefone..." + c1.getTelefone());
		// System.out.println("\n e-mail..." + c1.getEmail());

		String dataInicioStr = l.entDados("\nInforme a data de check in (formato: dd/MM/yyyy)..:");
		String dataFimStr = l.entDados("\nInforme a data de check out (formato: dd/MM/yyyy)..:");

		LocalDate dataInicio = stringParaLocalDate(dataInicioStr);
		LocalDate dataFim = stringParaLocalDate(dataFimStr);

		r1.setDataInicio(dataInicio);
		r1.setDataFim(dataFim);
		// Não sei transformar string inserida para formato de data

		System.out.println("Confirme as datas inseridas");
		System.out.println("Data de chegada..." + LocalDateParaString(r1.getDataInicio()));
		System.out.println("Data de saida..." + LocalDateParaString(r1.getDataFim()));
	}

	/**
	 * Método que converte uma string no formato dd/MM/yyyy para um objeto do tipo
	 * LocalDate
	 * 
	 * @param data Data no formato string.
	 * @return Objeto LocalDate.
	 */
	private static LocalDate stringParaLocalDate(String data) {
		String[] diaMesAno = data.split("/");

		return LocalDate.of(Integer.parseInt(diaMesAno[2]), Integer.parseInt(diaMesAno[1]),
				Integer.parseInt(diaMesAno[0]));
	}

	/**
	 * Método que converte um objeto do tipo LocalDate para uma string no formato
	 * dd/MM/yyyy
	 * 
	 * @param data Objeto LocalDate
	 * @return String representando a data.
	 */
	private static String LocalDateParaString(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(formatter);
	}
}
