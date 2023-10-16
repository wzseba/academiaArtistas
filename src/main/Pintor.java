package main;

public class Pintor extends Artista {

	public Pintor(int numeroLegajo, int diasDeAsistencia) {
		super(numeroLegajo, diasDeAsistencia);
	}

	@Override
	public double getPlus() {
		return 0.1;
	}

}
