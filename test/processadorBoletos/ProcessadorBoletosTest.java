package processadorBoletos;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import produto.Produto;

@DisplayName("Classe para teste dos processamentos dos boletos")
public class ProcessadorBoletosTest {
	
	Fatura fatura;
	
	Boleto boleto1;
	Boleto boleto2;
	Boleto boleto3;
	
	ArrayList<Boleto> listaDeBoletos;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("Fatura de Teste", Calendar.getInstance(), 1500);
		boleto1 = new Boleto(1, Calendar.getInstance(), 500);
		boleto2 = new Boleto(2, Calendar.getInstance(), 600);
		boleto3 = new Boleto(3, Calendar.getInstance(), 400);
		
		listaDeBoletos = new ArrayList<Boleto>();
		
		listaDeBoletos.add(boleto1);
		listaDeBoletos.add(boleto2);
		listaDeBoletos.add(boleto3);
		
		ProcessadorBoletos processadorBoleto = new ProcessadorBoletos();
		processadorBoleto.processaBoletos(listaDeBoletos, fatura);
	}
	
	@Test
	public void testProcessadorEhTrue() {
		assertThat(fatura.isPaga(), equalTo(true));
	}
	
	@Test
	public void testQtdBoletosIgualQtdPagamentos() {
		assertThat(fatura.getPagamentos().size(), equalTo(listaDeBoletos.size()));
	}
	
}
