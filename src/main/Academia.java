package main;

import java.util.ArrayList;

public class Academia {
 
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
	
	public static void cambiarCuotaBase(double nuevaCuotaBase) {
		Artista.cuotaBase = nuevaCuotaBase;
	}
	
	public double getTotalMensualDeCuotas() {
		double total = 0;
		
		for (Artista artista : artistas) {
			total += artista.getCuotaMensual();
		}
		
		return total;
	}
	
	public void listarPlanillaDeArtistas() {
		System.out.println("Planilla de Artistas:");
        for (Artista artista : artistas) {
            System.out.println("Número de legajo: " + artista.getNumLegajo() + ", Cuota mensual: $" + artista.getCuotaMensual());
        }
	}

}
