package br.com.amil.dojo.model;
import java.math.BigDecimal;
import java.util.Date;


public class Gerente implements AgenteVenda {

	@Override
	public BigDecimal getPercetual(Date dataVenda, Date dataCorte) {
		return new BigDecimal(0.03);
	}

}
