package main;

public class Escultor extends Artista {

	public Escultor(int numeroLegajo, int diasDeAsistencia) {
		super(numeroLegajo, diasDeAsistencia);
	}

	@Override
	public double getCuotaMensual() {
		return getCuotaBase() + (0.05 * getDiasAsitencia() * getCuotaBase()); 
	}

}
