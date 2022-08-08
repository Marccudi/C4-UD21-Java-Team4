package team4.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MetodosTest {
	
	@Test
	public void testCambio() {
		System.out.println("testCambio()");
		Metodos.generarDivisas();
		double res = Metodos.cambio(5,"USD", "EUR");
		double esp = 4.9;
		assertEquals(esp, res);
	}
	
	@Test
	public void testGetDivisas() {
		System.out.println("testGetDivisas()");
		Metodos.generarDivisas();
		Divisa res = Metodos.getDivisas().get(0);
		Divisa esp = new Divisa("USD","$", "Dolar","Estados Unidos", 1);
		assertEquals(esp.getPais(), res.getPais());
	}
}
