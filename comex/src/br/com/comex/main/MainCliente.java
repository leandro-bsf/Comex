package comex;

public class MainCliente {

	public static void main(String[] args) {
		Cliente ana = new Cliente("Ana", "090524555" , "4691255555", "Rua antonina", "150", "Proximo a Sorveteria", "CEntro", "FC. Beltrao", "Parana");
		Cliente eli = new Cliente("Eli", "090524556" , "4691255566", "Rua alagoas", "1550", "Proximo a mercado", "CEntro", "FC. Beltrao", "Parana");
		Cliente gabi = new Cliente("Gabi", "090524557" , "4691255577", "Rua argentina", "1350", "Proximo a bar", "CEntro", "FC. Beltrao", "Parana");
       System.out.println("Listando Clientes");
   	   System.out.println("ID  |     Nome     |  CPF    |  Telefone  | Rua      |  Numero   |  Complento |   Bairro  | Cidade  | Estado ");
		ana.PrintCliente();
        eli.PrintCliente();
        gabi.PrintCliente();
        
	}

}
