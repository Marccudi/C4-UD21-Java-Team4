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
	
	
	
	/////////// Jaume ////////////
	
	@Test
	public void testArearombo() {
		int res= geometria.arearombo(5,4);
	}

}
