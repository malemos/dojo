package br.com.amil.dojo.model;

import java.math.BigDecimal;
import java.util.Date;


public interface AgenteVenda {
	BigDecimal getPercetual(Date dataVenda, Date dataCorte);
}
