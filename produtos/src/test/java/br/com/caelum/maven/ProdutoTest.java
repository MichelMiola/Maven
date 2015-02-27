package br.com.caelum.maven;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void deveSetarVariaveis(){
		
		Produto bala = new Produto("bala", 15.30);
		Assert.assertEquals(15.30, bala.getPreco(), 0.0);
		Assert.assertEquals("bala", bala.getNome());
	}

}
