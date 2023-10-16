package main;

public class Escultor extends Artista {

	public Escultor(int numeroLegajo, int diasDeAsistencia) {
		super(numeroLegajo, diasDeAsistencia);
	}

	@Override
	public double getPlus() {
		return 0.05;
	}

}
