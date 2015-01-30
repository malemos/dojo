package br.com.amil.dojo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Venda {

	private AgenteVenda agenteVenda;
	private Date dataVenda;
	private BigDecimal valor;
	
	public Venda(AgenteVenda agenteVenda, Date dataVenda, BigDecimal valor) {
		super();
		this.agenteVenda = agenteVenda;
		this.dataVenda = dataVenda;
		this.valor = valor;
	}
	
	public AgenteVenda getAgenteVenda() {
		return agenteVenda;
	}
	
	public void setAgenteVenda(AgenteVenda agenteVenda) {
		this.agenteVenda = agenteVenda;
	}
	
	public Date getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
