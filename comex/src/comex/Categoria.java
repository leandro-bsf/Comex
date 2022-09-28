package comex;

public  class Categoria {

      private int Id;
	  private String Descricao;
      private String Ativa = "inativa" ;
	  private static int cont = 0;
	public  Categoria(String descricao, String ativa) {
		
		ativa = ativa.toUpperCase();
		System.out.println(ativa);
		  ++cont;
		  if(descricao.length() <= 3 || descricao == null) {
			  throw new IllegalArgumentException("Descricao deve ter mais que 3 caracteres e nao pode ser NULL");
			  
		  }
		  if(ativa != "ATIVA"  && ativa != "INATIVA") {
			  throw new IllegalArgumentException("Status da Cetegoria deve ser apenas ATIVA OU INATIVA!"); 
		  }
		Descricao = descricao;
		Ativa = ativa;
		Id = cont;
	  
		System.out.println("Cadastrou");
	}

	
	public int getId() {
		return Id;
	}
    public void setId(int id) {
		this.Id = id;
	}
	

	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getAtiva() {
		return Ativa;
	}
	public void setAtiva(String ativa) {
		Ativa = ativa;
	}
	public void  print () {
		System.out.printf("id: %d - Descricao: %s  - Situacao: %s \n ", getId() , getDescricao() , getAtiva());
	}


	 
}
