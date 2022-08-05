package JUnit.Junit09_Geometria.dto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {

	Geometria geometria;
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geometria=new Geometria();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		geometria=null;
	}
	
	/////////// Marc ////////////
	
	@Test
	public void testAreaCuadrado() {
		int res = geometria.areacuadrado(5);
		int esp = 25;
		assertEquals(esp, res);
	}
	
	@Test
	public void testAreaCirculo() {
		double res = geometria.areaCirculo(8);
		double esp = 201.06;
		double delta = 0.5;
		assertEquals(esp, res,delta);
	}
	
	@Test
	public void testAreaRectangulo() {
		int res = geometria.arearectangulo(2, 4);
		int esp = 8;
		assertEquals(esp, res);
	}
	
	@Test
	public void testangulo() {
		int res = geometria.areatriangulo(4, 2);
		int esp = 4;
		assertEquals(esp, res);
	}
	
	@Test
	public void testAreaPentagono() {
		int res = geometria.areapentagono(4, 2);
		int esp = 4;
		assertEquals(esp, res);
	}
	
	/////////// Jaume ////////////
	
	@Test
	public void testArearombo() {
		System.out.println("testArearombo()");
		int res= geometria.arearombo(5,4);
		int esp=10;
		assertEquals(esp, res);
	}
	
	@Test
	public void testArearomboide() {
		System.out.println("testArearomboide()");
		int res= geometria.arearomboide(5,4);
		int esp=20;
		assertEquals(esp, res);
	}
	
	@Test
	public void testAreatrapecio() {
		System.out.println("testAreatrapecio(");
		int res= geometria.areatrapecio(5,4,6);
		int esp=27;
		int delta=3;
		assertEquals(esp, res,delta);
	}
	
	@Test
	public void testFigura() {
		System.out.println("testFigura()");
		String res;
		String esp;
		
		res= geometria.figura(1);
		esp="cuadrado";
		assertEquals(esp, res);
		
		res= geometria.figura(2);
		esp="Circulo";
		assertEquals(esp, res);
		
		res= geometria.figura(3);
		esp="Triangulo";
		assertEquals(esp, res);
		
		res= geometria.figura(4);
		esp="Rectangulo";
		assertEquals(esp, res);
		
		res= geometria.figura(5);
		esp="Pentagono";
		assertEquals(esp, res);
		
		res= geometria.figura(6);
		esp="Rombo";
		assertEquals(esp, res);
		
		res= geometria.figura(7);
		esp="Romboide";
		assertEquals(esp, res);
		
		res= geometria.figura(8);
		esp="Trapecio";
		assertEquals(esp, res);
		
		res= geometria.figura(9);
		esp="Default";
		assertEquals(esp, res);
	}

}
