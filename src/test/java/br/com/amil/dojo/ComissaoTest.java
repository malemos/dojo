package br.com.amil.dojo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import br.com.amil.dojo.model.Corretor;
import br.com.amil.dojo.model.Corretora;
import br.com.amil.dojo.model.Gerente;
import br.com.amil.dojo.model.Venda;

public class ComissaoTest {

	@Test
	public void getComissaoCorretoraTest() throws ParseException {
		Venda venda = new Venda(new Corretora(), new Date(), new BigDecimal(100));
		BigDecimal comissao = Calculadora.getComissao(venda);
		Assert.assertEquals(new BigDecimal(4.00).setScale(2), comissao);;
	}
	
	@Test
	public void getComissaoCorretorTest() throws ParseException {
		Venda venda = new Venda(new Corretor(), new Date(), new BigDecimal(100));
		BigDecimal comissao = Calculadora.getComissao(venda);
		Assert.assertEquals(new BigDecimal(3.00).setScale(2), comissao);;
	}
	
	@Test
	public void getComissaoGerenteTest() throws ParseException {
		Venda venda = new Venda(new Gerente(), new Date(), new BigDecimal(100));
		BigDecimal comissao = Calculadora.getComissao(venda);
		Assert.assertEquals(new BigDecimal(3.00).setScale(2), comissao);;
	}
}
