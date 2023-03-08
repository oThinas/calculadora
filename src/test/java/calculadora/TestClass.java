package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {

	Calculadora calc = new Calculadora();

	@Test
	public void testSomar() {
		int valor1 = 1;
		int valor2 = 2;
		int resultado = calc.somar(valor1,valor2);
		//assertEquals(valor-esperado, retorno-do-metodo)
		assertEquals(valor1 + valor2, resultado);
	}

	@Test
	public void testSubtrair() {
		int valor1 = 1;
		int valor2 = 2;
		int resultado = calc.subtrair(valor1,valor2);

		assertEquals(valor1 - valor2, resultado);
	}

	@Test
	public void testMultiplicar() {
		int valor1 = 1;
		int valor2 = 2;
		int resultado = calc.multiplicar(valor1,valor2);

		assertEquals(valor1 * valor2, resultado);
	}

	@Test
	public void testDividir() {
		int valor1 = 1;
		int valor2 = 0;
		int resultado = 0;
		try {
			resultado = calc.dividir(valor1,valor2);
			assertEquals(valor1 / valor2, resultado);
		} catch (IllegalArgumentException error) {
			System.out.println(error);
		}
	}
}
