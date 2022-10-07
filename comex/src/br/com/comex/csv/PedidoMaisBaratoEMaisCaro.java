package br.com.comex.csv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PedidoMaisBaratoEMaisCaro  {
		public static void main(String[] args) {
			LeitorPedidosCsv leitor = new LeitorPedidosCsv();
			 List<PedidoCsv> pedidos =  new ArrayList<PedidoCsv>();
			 comparadorPedido porOrdem = new comparadorPedido();
			 pedidos.sort(porOrdem);
			System.out.println(pedidos.get(0));
			System.out.println(pedidos.get(pedidos.size()-1));
		}
}
	
		class comparadorPedido implements Comparator<PedidoCsv>{
			public int compare(PedidoCsv p1 , PedidoCsv p2) {
				
				double P1 = Double.parseDouble(p1.getPreco())* Double.parseDouble(p1.getQuantidade());
				double P2 = Double.parseDouble(p2.getPreco())* Double.parseDouble(p2.getQuantidade());
				
				if(P1 == P2) {
					return 0;
				}if(P1 > P2) {
					return 1;
				}
				if(P1 < P2) {
					return -1;
				}
				
				return 0;
			}
		}

