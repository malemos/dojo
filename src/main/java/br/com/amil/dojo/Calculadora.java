package br.com.amil.dojo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.amil.dojo.model.Venda;

public class Calculadora {

	private static final String DATA_CORTE = "01-01-2015";
	
	public static BigDecimal getComissao(Venda venda) throws ParseException {
		BigDecimal retorno = null;
		retorno = venda.getValor().multiply(venda.getAgenteVenda().getPercetual(venda.getDataVenda(),  getDataCorte())).setScale(2, RoundingMode.HALF_DOWN);
		return retorno;
	}

	private static Date getDataCorte() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		return formatter.parse(DATA_CORTE);
	}
}
