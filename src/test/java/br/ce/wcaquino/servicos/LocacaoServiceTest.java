package br.ce.wcaquino.servicos;


import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;

public class LocacaoServiceTest {

	@Test
	public void teste() {
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Mano");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		
		Locacao locacao = service.alugarFilme(usuario, filme);

		Assert.assertTrue(locacao.getValor() == 5.0);
	}
}
