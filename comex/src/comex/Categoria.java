package comex;

public  class Categoria {
	private static int cont = 0;
      private int Id;
	 String Descricao;
 String Ativa = "inativa" ;
	public  Categoria(String descricao, String ativa) {
		
		Descricao = descricao;
		Ativa = ativa;
	    cont++;
		
	}

	public Categoria() {
		
	}
	public int getId() {
		return Id;
	}
    public void setId(int id) {
		this.Id = this.cont;
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
