package team4.calculadora;

import java.util.ArrayList;

public class Metodos {
	
	private static ArrayList<Divisa> divisas;
	
	public static void generarDivisas() {
		divisas=new ArrayList<>();
		
		//String id, String simbolo, String nombre, String pais, Double valorDolar
		
		divisas.add(new Divisa("USD","$", "Dolar","Estados Unidos", 1));
		divisas.add(new Divisa("EUR","€", "Euro","Europa", 0.98));
		divisas.add(new Divisa("GBP","£", "Libra","Reino Unido", 0.82));
		
		
		divisas.add(new Divisa("AFN","؋", "Afgani","Afganistan", 90.41));
		divisas.add(new Divisa("ALL","ALL", "Lek","Albania", 113.59));
		divisas.add(new Divisa("SAR","SR", "Rial","Arabia Saudi", 3.76));
		divisas.add(new Divisa("DZD","دج", "Dinar","Argelia", 143.75));
		divisas.add(new Divisa("ARS","$", "Peso","Argentina", 132.64));
		divisas.add(new Divisa("AWG","ƒ", "Florin","Aruba", 1.78));
		divisas.add(new Divisa("AUD","$", "Dolar","Australia", 1.44));
		divisas.add(new Divisa("AZN","ман", "Nuevo Manat","Azerbayan", 1.69));
		divisas.add(new Divisa("BSD","B$", "Dolar","Bahamas", 1));
		divisas.add(new Divisa("BDT","৳", "Taka","Bangladesh", 94.53));
		divisas.add(new Divisa("BBD","$", "Dolar","Barbados", 2));
		divisas.add(new Divisa("BHD","د.ب", "Dinar","Barein", 0.377));
		divisas.add(new Divisa("BYN","Br", "Rublo","Belarus", 2.52));
		divisas.add(new Divisa("BZD","BZ$", "Dolar","Belice", 2));
		divisas.add(new Divisa("BMD","$", "Dolar","Bermudas", 1));
		divisas.add(new Divisa("BOB","$b", "Boliviano","Bolivia", 6.8));
		divisas.add(new Divisa("BAM","KM", "Marco convertible","Bosnia y Herzegovina", 1.91));
		divisas.add(new Divisa("BWP","P", "Pula","Botsuana", 12.55));
		divisas.add(new Divisa("BRL","R$", "Real","Brasil", 5.21));
		divisas.add(new Divisa("BND","$", "Dolar","Brnuei", 1.38));
		divisas.add(new Divisa("BGN","Лв", "Lev","Bulgaria", 1.91));
		divisas.add(new Divisa("BIF","Fbu", "Franco","Burundi", 2022));
		divisas.add(new Divisa("CVE","Esc", "Escudo","Cabo Verde", 107.75));
		divisas.add(new Divisa("KHR","៛", "Riel","Camboya", 4093));
		divisas.add(new Divisa("CAD","$", "Dolar","Canada", 1.29));
		divisas.add(new Divisa("QAR","ر. ق", "Rial","Catar", 3.68));
		divisas.add(new Divisa("CLP","$", "Peso","Chile", 902));
		divisas.add(new Divisa("CNY","¥", "Yuan","China", 6.75));
		divisas.add(new Divisa("COP","$", "Peso","Colombia", 4285.60));
		divisas.add(new Divisa("KMF","CF", "Franco","Comoras", 483));
		divisas.add(new Divisa("CDF","F", "Franco","Congo", 1994.14));	
		divisas.add(new Divisa("KRW","₩", "Won","Corea del Sur", 1298));
		divisas.add(new Divisa("CRC","₡", "Colon","Costa Rica", 666.32));
		divisas.add(new Divisa("HRK","kn", "Kuna","Croacia", 7.34));
		divisas.add(new Divisa("CUP","$", "Peso","Cuba", 24));
		divisas.add(new Divisa("DKK","kr", "Corona","Dinamarca", 7.27));
		divisas.add(new Divisa("EGP","ج.م", "Libra","Egipto", 19.10));
		divisas.add(new Divisa("AED","د.إ", "Dirham","Emiratos Arabes Unidos", 3.67));
		divisas.add(new Divisa("ETB","ETB", "Birr","Etipoia", 52.21));
		divisas.add(new Divisa("PHP","₱", "Peso","Filipinas", 55.23));	
		divisas.add(new Divisa("FJD","$", "Dolar","Fiyi", 2.17));
		divisas.add(new Divisa("GMD","D", "Dalasi","Gambia",54.55));
		divisas.add(new Divisa("GEL","GEL", "Lari","Georgia", 2.69));
		divisas.add(new Divisa("GHS","₵", "Cedi","Ghana", 8.50));
		divisas.add(new Divisa("GTQ","Q", "Quetzal","Guatemala", 7.72));
		divisas.add(new Divisa("GNF","FG", "Franco","Guinea", 8595));
		divisas.add(new Divisa("HTG","G", "Gourde","Haiti", 118));
		divisas.add(new Divisa("HNL","L", "Lempira","Honduras", 24.41));
		divisas.add(new Divisa("HUF","Ft", "Florin","Hungria", 385.95));
		divisas.add(new Divisa("INR","₹", "Rupia","India", 79.17));
		divisas.add(new Divisa("IDR","Rp", "Rupia indonesia","Indonesia", 14890));
		divisas.add(new Divisa("IQD","ع.د", "Dinar","Irak", 1458.520));
		divisas.add(new Divisa("IRR","﷼", "Rial","Iran", 42000));
		divisas.add(new Divisa("ISK","kr", "Corona","Islandia", 135));
		divisas.add(new Divisa("KYD","$", "Dolar","Islas Caiman", 0.82));
		divisas.add(new Divisa("ILS","₪", "Shequel","Israel", 3.33));
		divisas.add(new Divisa("JMD","J$", "Dolar","Jamaica", 151));
		divisas.add(new Divisa("JPY","¥", "Yen","Japon", 133));
		divisas.add(new Divisa("JOD","د.أ", "Dinar","Jordania", 0.708));
		divisas.add(new Divisa("KZT","₸", "Tenge","Kazajistan", 477.44));
		divisas.add(new Divisa("KES","KSh", "Chelin","Kenia", 119.10));
		
		//return divisas;
	}
	
	public static double cambio(double cantidad, String idMonedaCan, String idMonedaRec) {
		double dolar=0, res=0;
		
		for (Divisa divisa : divisas) {
			
			if(divisa.getId().equals(idMonedaCan)) {
				dolar= cantidad/divisa.getValorDolar();
			}			
		}
		
		for (Divisa divisa : divisas) {
			
			if(divisa.getId().equals(idMonedaRec)) {
				res= dolar*divisa.getValorDolar();
			}			
		}
		
		return res;
	}
}
