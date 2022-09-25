package comex;

public class Cliente {
  private int Id ;
  String Nome , Cpf, Telefone , Rua,Numero,Complemento, Bairro, Cidade, Estado ;
  
  public Cliente( String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, String estado) {
		super();
		
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
	
}

}
