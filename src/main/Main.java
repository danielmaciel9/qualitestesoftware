package main;

import java.util.ArrayList;
import java.util.Calendar;

import boleto.Boleto;
import fatura.Fatura;
import processadorBoletos.ProcessadorBoletos;

public class Main {
	public static void main(String[] args) {
		Fatura fatura = new Fatura("Super Autor", Calendar.getInstance(), 1500);
		
		Boleto boleto1 = new Boleto(1, Calendar.getInstance(), 500);
		Boleto boleto2 = new Boleto(2, Calendar.getInstance(), 600);
		Boleto boleto3 = new Boleto(3, Calendar.getInstance(), 400);
		
		ArrayList<Boleto> listaDeBoletos = new ArrayList<Boleto>();
		
		listaDeBoletos.add(boleto1);
		listaDeBoletos.add(boleto2);
		listaDeBoletos.add(boleto3);
		
		ProcessadorBoletos processadorBoleto = new ProcessadorBoletos();
		
		processadorBoleto.processaBoletos(listaDeBoletos, fatura);
	}
}
