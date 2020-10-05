package pagamento;

import java.util.Calendar;

import boleto.Boleto;

public class Pagamento {
	
	Calendar dataPagamento;
	double valorPagamento;
	String tipoPagamentoEfetuado;
	Boleto boleto;
	
	public Pagamento(Calendar dataPagamento, double valorPagamento, String tipoPagamentoEfetuado) {
		super();
		this.dataPagamento = dataPagamento;
		this.valorPagamento = valorPagamento;
		this.tipoPagamentoEfetuado = tipoPagamentoEfetuado;
	}
	
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	public String getTipoPagamentoEfetuado() {
		return tipoPagamentoEfetuado;
	}
	public void setTipoPagamentoEfetuado(String tipoPagamentoEfetuado) {
		this.tipoPagamentoEfetuado = tipoPagamentoEfetuado;
	}
	
	public void associaBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
}
