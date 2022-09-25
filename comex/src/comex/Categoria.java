package comex;

public  class Categoria {

      private int Id;
	  private String Descricao;
      private String Ativa = "inativa" ;
	  private static int cont = 0;
	public  Categoria(String descricao, String ativa) {
		  ++cont;
		Descricao = descricao;
		Ativa = ativa;
		Id = cont;
	  
		
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
