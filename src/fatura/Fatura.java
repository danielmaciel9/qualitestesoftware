package fatura;

import java.util.ArrayList;
import java.util.Calendar;

import boleto.Boleto;
import pagamento.Pagamento;

public class Fatura {
	
	String nomeCliente;
	Calendar dataFatura;
	double valorTotalFatura;
	boolean paga;

	ArrayList<Pagamento> pagamentos;

	public Fatura(String nomeCliente, Calendar dataFatura, double valorTotalFatura) {
		super();
		this.nomeCliente = nomeCliente;
		this.dataFatura = dataFatura;
		this.valorTotalFatura = valorTotalFatura;
		this.pagamentos = new ArrayList<Pagamento>();
		this.paga = false;
	}
	
	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Calendar getDataFatura() {
		return dataFatura;
	}
	public void setDataFatura(Calendar dataFatura) {
		this.dataFatura = dataFatura;
	}
	public double getValorTotalFatura() {
		return valorTotalFatura;
	}
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setValorTotalFatura(double valorTotalFatura) {
		this.valorTotalFatura = valorTotalFatura;
	}
	
	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}
	
	
}
