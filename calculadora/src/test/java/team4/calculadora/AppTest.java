package team4.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	@BeforeEach
	public void before() {
		System.out.println("before()");
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
	}

}
