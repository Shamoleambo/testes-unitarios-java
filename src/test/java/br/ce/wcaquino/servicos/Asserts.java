package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class Asserts {

	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);

		Assert.assertEquals(1, 1);
		Assert.assertEquals(0.51, 0.51, 0.01);
		Assert.assertEquals(Math.PI, 3.14, 0.01);

		int i1 = 1;
		Integer i2 = 1;
		Assert.assertEquals(i1, (int) i2);
		Assert.assertEquals(Integer.valueOf(i1), i2);
		Assert.assertEquals(i1, i2.intValue());
		
		Assert.assertEquals("Mano", "Mano");
		Assert.assertTrue("MAnO".equalsIgnoreCase("mano"));
		Assert.assertTrue("mano".startsWith("ma"));
		
		Usuario u1 = new Usuario("Truta");
		Usuario u2 = new Usuario("Truta");
		Usuario u3 = u2;
		Usuario u4 = null;
		Assert.assertEquals(u1, u2);
		Assert.assertSame(u2, u3);
		Assert.assertTrue(u4 == null);
		Assert.assertNull(u4);
		Assert.assertNotSame(u1, u2);
		Assert.assertNotNull(u1);
	}
}
