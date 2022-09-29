package br.com.comex.modelo;

public class Cliente {
  private int Id ;
  String Nome , Cpf, Telefone , Rua,Numero,Complemento, Bairro, Cidade, Estado ;
  
  public Cliente( String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, String estado) {
		super();
		   numero = numero.toUpperCase();
		 
		  if(nome.length() <= 5 || nome == null) {
			  throw new IllegalArgumentException("nome deve ter mais 5 caracteres");
			  
		  }
		  if(cpf.length() <= 11 || cpf.length() >=14) {
			  throw new IllegalArgumentException("Cpf deve ter entre 11 e 15 numeros!");
			  
		  }
		  if(telefone.length() <= 11 || telefone.length() >=16) {
			  throw new IllegalArgumentException("Telefone deve conter de 11 as 16  numeros");
			  
		  }
		  if(rua.length() <=   5 ) {
			  throw new IllegalArgumentException("Rua deve ter mais 5 caracteres");
			  
		  }
		  if( numero.length() < 
				  1   ||  !numero.equals("S/N") ) {
			  throw new IllegalArgumentException("Deve ser numero ou  (S/N).");
			  
		  }
		  if(cidade.length() <=   1 ) {
			  throw new IllegalArgumentException("Cidade deve ter mais  que 1 caracterer");
			  
		  }
		  if(estado.length() !=  2 ) {
			  throw new IllegalArgumentException("Estado invalido, informar apenas sigla");
			  
		  }
		Nome = nome;
		Cpf = cpf;
		Telefone = telefone;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Cidade = cidade;
		Estado = estado;
	}

	public int getId() {
	return Id;
}

public String getNome() {
	return Nome;
}

public String getCpf() {
	return Cpf;
}

public String getTelefone() {
	return Telefone;
}

public String getRua() {
	return Rua;
}

public String getNumero() {
	return Numero;
}

public String getComplemento() {
	return Complemento;
}

public String getBairro() {
	return Bairro;
}

public String getCidade() {
	return Cidade;
}

public String getEstado() {
	return Estado;
}


public void PrintCliente() {

	System.out.printf("|"+ getId()+"|"+ getNome() +"|"+  getCpf() +"|"+ getTelefone() +"|"+  getRua() +"|"+  getNumero() +"|"+ 
			getComplemento()+"|"+ getBairro() +"|"+ getCidade() +"|"+ getEstado());
	
	System.out.println();
	System.out.println("Cliente Inserido!\n");
	
}

}
