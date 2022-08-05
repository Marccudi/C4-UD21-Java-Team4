package JUnit.Junit09_Geometria;

import JUnit.Junit09_Geometria.dto.Geometria;

public class App 
{
    public static void main( String[] args )
    {
	   //Creacion de Objeto Circulo
	   Geometria gm=new Geometria(2);
	   double areaCirc= gm.areaCirculo(2);
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
	   
	  System.out.println(gm.areatrapecio(5, 4, 6));
	   
    }
    
}
