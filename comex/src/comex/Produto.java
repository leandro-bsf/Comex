package comex;

public class Produto {
		// int id , 
	int quantidade;
		 String Nome, Descricao;
		 Float Preco;
		 Categoria categoria;
		/*public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}*/
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		public Float getPreco() {
			return Preco;
		}
		public void setPreco(float d) {
			Preco = d;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public  void calcula_estoque() {
			
			float subtotal =+ getPreco() * getQuantidade();
			System.out.printf("total: %.2f \n", subtotal);
		}
		public void calcula_imposto () {
			float imposto;
			imposto = (float) (getPreco()*0.4);
			System.out.printf("Valor imposto por unidade: %.2f\n", imposto);
			
		}
		public void print () {
			System.out.printf("Nome Produto: %s - Descricao: %s  valor: %f - quantidade: %d - categoria: %s \n",
			    getNome(), getDescricao() , getPreco() , getQuantidade() , getCategoria()
			    );

		}
		 
		 
}
