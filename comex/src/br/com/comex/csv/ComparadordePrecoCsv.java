package br.com.comex.csv;
import java.util.Comparator;
import br.com.comex.csv.PedidoCsv;


public class ComparadordePrecoCsv implements Comparator<PedidoCsv> {

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {
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
