package br.com.amil.dojo.model;
import java.math.BigDecimal;
import java.util.Date;


public class Corretor implements AgenteVenda {

	@Override
	public BigDecimal getPercetual(Date dataVenda, Date dataCorte) {
		BigDecimal retorno;
		if (dataVenda.before(dataCorte)) {
			retorno = new BigDecimal(0.02);
		} else {
			retorno = new BigDecimal(0.03);
		}
		return retorno;
	}

}
