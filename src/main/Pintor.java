package main;

public class Pintor extends Artista {

	public Pintor(int numeroLegajo, int diasDeAsistencia) {
		super(numeroLegajo, diasDeAsistencia);
	}

	@Override
	public double getCuotaMensual() {
		return getCuotaBase() + (0.10 * getDiasAsitencia() * getCuotaBase()); 
	}

}
