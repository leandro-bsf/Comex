package comex;

public class MainCategoria {

	public static void main(String[] args) {
		 Categoria  cat1 = new Categoria();
		 Categoria  cat2 = new Categoria();
		 Categoria  cat3 = new Categoria();
		 
		cat1.setDescricao("INFORMATICA");
		cat1.setAtiva("ATIVA");
		
		cat2.setDescricao("MOVEIS");
		cat2.setAtiva("INATIVA");
		
		cat3.setDescricao("LIVROS");
		cat3.setAtiva("ATIVA");
        cat1.print();
        cat2.print();
        cat3.print();
	}

}
