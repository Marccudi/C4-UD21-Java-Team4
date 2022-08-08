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
    	Metodos.generarDivisas();
    	AppGrafica window = new AppGrafica();
    	
    	double moneda=Metodos.cambio(66, "EUR", "GBP");
    	System.out.println(moneda);
    	
    	moneda=Metodos.cambio(66, "EUR", "USD");
    	System.out.println(moneda);
    }
}
