package main;

public class Pruebas {
		
	public static void main(String[] args) {
		
		Academia academia = new Academia(5);
		
		Artista pintorCaleb = new Pintor(545, 1);
        Artista pintor = new Pintor(123, 2);
        Artista pintorPepe = new Pintor(823, 2);
        Artista escultor = new Escultor(124, 3);
        Artista pintorSeba = new Pintor(465, 1);
        
        academia.agregarArtista(pintorCaleb);
        academia.agregarArtista(pintor);
        academia.agregarArtista(escultor);
        academia.agregarArtista(pintorPepe);
        academia.agregarArtista(pintorSeba);
        
        academia.listarPlanillaDeArtistas();
        
        double totalCuotas = academia.getTotalMensualDeCuotas();
        System.out.println("\nTotal mensual de cuotas: $" + totalCuotas);
	}

}
