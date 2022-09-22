package comex;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto P1 = new Produto();
		Produto P2 = new Produto();
		Produto P3 = new Produto();
		
		P1.setNome("nome Notebook Samsung");
		P1.setDescricao("I5 4gb ram");
		P1.setPreco((float)3523.00);
		P1.setQuantidade(1);
	
		
		P2.setNome("Clean Architecture");
		P2.setDescricao("bla bla  bla");
		P2.setPreco((float)102.90);
		P2.setQuantidade(2);
	
		
		P3.setNome(" Monitor Dell 27");
		P3.setDescricao("27 polegadas preto");
		P3.setPreco((float)1889.00);
		P3.setQuantidade(3);
		P3.calcula_estoque();
		P3.calcula_imposto ();
		
		P3.print();
		
	}

}
