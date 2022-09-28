package comex;

public class MainCategoria {

	public static void main(String[] args) {
		 Categoria  cat1 = new Categoria("Vendedor","INATIVA");
		// Categoria  cat2 = new Categoria("MOVEIS","INATIVA");
	
		Categoria cat = new Categoria(5, "cadeira","INATIVA");
		 
	
        cat1.print();
      //  cat2.print();
        cat.print();
	}

}
