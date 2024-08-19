import java.time.LocalDate;
import java.util.List;

public class Principal {
	private static Leitura l = new Leitura();
	private static Hotel hotel = new Hotel();

	public static void main(String arg[]) {
		boolean cont = true;
		int op = 0;

		Cliente cliente = criaCliente();

		while (cont) {
			System.out.println(" === Grad Plaza Hotel === ");
			System.out.println("\n 1) Fazer uma reserva");
			System.out.println(" 2) Consultar reserva");
			System.out.println(" 3) Excluir reserva");
			System.out.println(" 4) Sair");

			op = Integer.parseInt(l.entDados("Escolha um opção"));

			switch (op) {
				case 1: {
					int quantQuartos = Integer.parseInt(l.entDados("Informe a quantidade de quartos desejados."));
					String dataInicioStr = l.entDados("\nInforme a data de check in (formato: dd/MM/yyyy)..:");
					String dataFimStr = l.entDados("\nInforme a data de check out (formato: dd/MM/yyyy)..:");

					LocalDate dataInicio = stringParaLocalDate(dataInicioStr);
					LocalDate dataFim = stringParaLocalDate(dataFimStr);

					Reserva reserva = hotel.insReserva(cliente, quantQuartos, dataInicio, dataFim);
					if (reserva == null) {
						System.out.println("Não foi possível concluir a reserva");
					}

					else {

						System.out.println("A sua reserva foi feita e tem Valor..." + reserva.calcPreco());
					}
					break;
				}
				case 2: {
					List<Reserva> reservas = hotel.consultaReserva();
					for (int f = 0; f < reservas.size(); f++) {
						Reserva reservaAux = reservas.get(f);
						System.out.println("Reserva " + reservaAux.getNumeroReserva() + "\n");
						System.out.println("Preço " + reservaAux.calcPreco() + "\n");
						for (int j = 0; j < reservaAux.getQuartos().size(); j++) {
							Quarto quartoAux = reservaAux.getQuartos().get(j);
							System.out.println("Qaurto número " + quartoAux.getNum() + "\n");
						}
					}
					break;
				}
				case 3: {
					int numResv = Integer.parseInt(l.entDados("Informe a reserva a ser cancelada"));

					hotel.cancelaReserva(numResv);
					break;

				}
				case 4: {
					System.exit(0);
					break;
				}
				default: {
					System.out.println("\nDeve escolher um opção válida!");
				}
			}

		}

	}// fim do main

	public static Cliente criaCliente() {
		String nome = l.entDados("Insira seu nome");
		String telefone = l.entDados("Insira seu telefome com DDD");
		String email = l.entDados("Insira um e-mail para contato");

		boolean cpfValido = false;
		Cliente cliente = null;

		while (cpfValido == false) {
			try {
				String cpf = l.entDados("Insira seu CPF");
				cliente = new Cliente(nome, cpf, telefone, email);
				cpfValido = true;
			} catch (CpfInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		return cliente;
	}

	private static LocalDate stringParaLocalDate(String data) {
		String[] diaMesAno = data.split("/");

		return LocalDate.of(Integer.parseInt(diaMesAno[2]), Integer.parseInt(diaMesAno[1]),
				Integer.parseInt(diaMesAno[0]));
	}

}// fim da classe