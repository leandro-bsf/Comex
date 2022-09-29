package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		Cliente ana = new Cliente("Ana Clara", "125365425253" , "952525252525", "Rua antonina", "S/N", "Proximo a Sorveteria", "CEntro", "FC. Beltrao", "PA");
		ana.PrintCliente();
		Cliente eli = new Cliente("Eli", "090524556" , "4691255566", "Rua alagoas", "S/N", "Proximo a mercado", "CEntro", "FC. Beltrao", "Parana");
		Cliente gabi = new Cliente("Gabi", "09052" , "4691255577", "Rua argentina", "1350", "Proximo a bar", "CEntro", "FC. Beltrao", "Parana");
       System.out.println("Listando Clientes");
   	   System.out.println("ID  |     Nome     |  CPF    |  Telefone  | Rua      |  Numero   |  Complento |   Bairro  | Cidade  | Estado ");
		
       eli.PrintCliente();
        gabi.PrintCliente();
        
	}

}
