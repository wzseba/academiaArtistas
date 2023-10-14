package main;

public class Pruebas {
		
	public static void main(String[] args) {
		
		Academia academia = new Academia(3);
		
        Pintor pintor = new Pintor(123, 2);
        Escultor escultor = new Escultor(124, 3);
        Pintor pintorSeba = new Pintor(465, 1);
        
        academia.agregarArtista(pintor);
        academia.agregarArtista(escultor);
        academia.agregarArtista(pintorSeba);
        
        academia.listarPlanillaDeArtistas();
        
        double totalCuotas = academia.getTotalMensualDeCuotas();
        System.out.println("Total mensual de cuotas: $" + totalCuotas);
	}

}
