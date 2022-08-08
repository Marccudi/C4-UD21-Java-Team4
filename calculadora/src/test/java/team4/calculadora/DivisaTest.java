package team4.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisaTest {
	
	Divisa d;
	
	@BeforeEach
    public void before()
    {
        System.out.println("before(id)");
        d = new Divisa("USD","$", "Dolar","Estados Unidos", 1);
    }

    @AfterEach
    public void after()
    {
        System.out.println("after()");
        d = null;
    }
    
    @Test
	public void testId() {
		System.out.println("testId()");
		String res = d.getId();
		String esp = "USD";
		assertEquals(esp, res);
	}
    
	@Test
	public void testValorDolar() {
		System.out.println("testValorDolar()");
		double res = d.getValorDolar();
		double esp = 1;
		assertEquals(esp, res);
	}
	
	@Test
	public void testSimbolo() {
		System.out.println("testSimbolo()");
		String res = d.getSimbolo();
		String esp = "$";
		assertEquals(esp, res);
	}
	
	@Test
	public void testNombre() {
		System.out.println("testNombre()");
		String res = d.getNombre();
		String esp = "Dolar";
		assertEquals(esp, res);
	}
	
	@Test
	public void testPais() {
		System.out.println("testPais()");
		String res = d.getPais();
		String esp = "Estados Unidos";
		assertEquals(esp, res);
	}
	
	@Test
	public void testSetId() {
		Divisa d = new Divisa("","€", "Euro","Europa", 0.98);
		d.setId("EUR");
		String esp = "EUR";
		assertEquals(esp, d.getId());
	}
	
	@Test
	public void testSetSimbolo() {
		Divisa d = new Divisa("","", "","", 0);
		d.setSimbolo("€");
		String esp = "€";
		assertEquals(esp, d.getSimbolo());
	}
	
	@Test
	public void testSetNombre() {
		Divisa d = new Divisa("","", "Euro","", 0);
		d.setNombre("Euro");
		String esp = "Euro";
		assertEquals(esp, d.getNombre());
	}
	
	@Test
	public void testSetPais() {
		Divisa d = new Divisa("","", "","Europa", 0);
		d.setPais("Europa");
		String esp = "Europa";
		assertEquals(esp, d.getPais());
	}
    
    @Test
    public void testToString()
    {
        System.out.println("testToString()");
        String result = d.toString();
        String esper = d.getNombre() + " - " + d.getPais();

        assertEquals(esper, result);
    }
    

}
