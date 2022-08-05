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
		//geometria.c;
	}
	
	/////////// Marc ////////////
	
	@Test
	public void testAreaCuadrado() {
		int res = geometria.areacuadrado(5);
		int esp = 16;
		assertEquals(res, esp);
	}
	
	@Test
	public void testAreaCirculo() {
		double res = geometria.areaCirculo(8);
		double esp = 201.06;
		double delta = 0.5;
		assertEquals(res, esp,delta);
	}
	
	@Test
	public void testAreaRectangulo() {
		int res = geometria.arearectangulo(2, 4);
		int esp = 8;
		assertEquals(res, esp);
	}
	
	@Test
	public void testangulo() {
		int res = geometria.areatriangulo(4, 2);
		int esp = 4;
		assertEquals(res, esp);
	}
	
	@Test
	public void testAreaPentagono() {
		int res = geometria.areapentagono(4, 2);
		int esp = 4;
		assertEquals(res, esp);
	}
	
	/////////// Jaume ////////////
	
	@Test
	public void testArearombo() {
		int res= geometria.arearombo(5,4);
	}

}
