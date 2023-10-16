package main;

import java.util.ArrayList;
import java.util.Collections;

public class Academia {
	
	private static final double CUOTA_BASE = 50;
	private int cantMaxDeArtitasAdmitidos;
	private ArrayList<Artista> artistas;
	
	public Academia(int cantMaxDeArtitasAdmitidos) {
		this.cantMaxDeArtitasAdmitidos = cantMaxDeArtitasAdmitidos;
		this.artistas = new ArrayList<Artista>();
	}
	
	public void agregarArtista(Artista a) {
		if(artistas.size() < cantMaxDeArtitasAdmitidos) {
			artistas.add(a);
		}else {
			throw new Error("Academia alcanzo la maxima cantidad de artistas");
		}
	}
	
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public double getTotalMensualDeCuotas() {
		double total = 0;
		
		for (Artista artista : artistas) {
			total += artista.calcularCuotaMensual(CUOTA_BASE);
		}
		
		return total;
	}
	
	public void listarPlanillaDeArtistas() {
		Collections.sort(artistas);
		System.out.println("Planilla de Artistas:");
        for (Artista artista : artistas) {
            System.out.println(artista + " Cuota Mensual: $" + artista.calcularCuotaMensual(CUOTA_BASE));
        }
	}

}
