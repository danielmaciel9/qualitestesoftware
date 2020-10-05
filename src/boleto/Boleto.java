package boleto;

import java.util.Calendar;

public class Boleto {
	int codBoleto;
	Calendar data;
	double valorPago;
	
	public Boleto(int codBoleto, Calendar data, double valorPago) {
		super();
		this.codBoleto = codBoleto;
		this.data = data;
		this.valorPago = valorPago;
	}
	
	public String toString() {
		return codBoleto + " - " + valorPago;
	}
	
	public int getCodBoleto() {
		return codBoleto;
	}
	public void setCodBoleto(int codBoleto) {
		this.codBoleto = codBoleto;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
}
