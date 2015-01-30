package br.com.amil.dojo.model;
import java.math.BigDecimal;
import java.util.Date;


public class Corretora implements AgenteVenda {

	@Override
	public BigDecimal getPercetual(Date dataVenda, Date dataCorte) {
		BigDecimal retorno;
		if (dataVenda.before(dataCorte)) {
			retorno = new BigDecimal(0.05);
		} else {
			retorno = new BigDecimal(0.04);
		}
		return retorno;
	}

}
