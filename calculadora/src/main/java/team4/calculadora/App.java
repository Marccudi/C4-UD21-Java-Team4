package team4.calculadora;

import java.awt.Window;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AppGrafica window = new AppGrafica();
    	
    	Metodos.generarDivisas();
    	double moneda=Metodos.cambio(66, "EUR", "GBP");
    	System.out.println(moneda);
    	
    	moneda=Metodos.cambio(66, "EUR", "USD");
    	System.out.println(moneda);
    }
}
