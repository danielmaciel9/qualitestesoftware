package processadorBoletos;
import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorBoletos {
	
	public void processaBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		
		double valorTotal = fatura.getValorTotalFatura();
		double valorTotalPago = 0.0;
		
		for (Iterator i = boletos.iterator(); i.hasNext();) {
			Boleto item = (Boleto) i.next();
			valorTotalPago += item.getValorPago();
			Pagamento pagamento = new Pagamento(item.getData(), item.getValorPago(), "BOLETO");
			fatura.adicionaPagamento(pagamento);
			pagamento.associaBoleto(item);
		}
		
		if(valorTotalPago >= valorTotal) {
			fatura.setPaga(true);
		}
		
	}
}
