package main;

public abstract class Artista implements Comparable<Artista>{
	
	private int numeroLegajo;
	private int diasDeAsistencia;
	
	public Artista(int numeroLegajo, int diasDeAsistencia) {
		this.numeroLegajo = numeroLegajo;
		setDiasDeAsistencia(diasDeAsistencia);
	}
	
	private void setDiasDeAsistencia(int dias) {
		if(dias < 1 || dias > 3) {
			throw new Error("Dias fuera de rango");
		}
		this.diasDeAsistencia = dias;
	}
	
	public int getDiasDeAsistencia() {
		return diasDeAsistencia;
	}
	
	public int getNumLegajo() {
		return this.numeroLegajo;
	}
	
	public abstract double getPlus();
	
	public double calcularCuotaMensual(double cuotaBase) {
		return cuotaBase + (cuotaBase * getPlus() * diasDeAsistencia);
	}
	
	
	@Override
	public String toString() {
		return "Numero de legajo: " + getNumLegajo() + " Dias que asiste: " + getDiasDeAsistencia();
	}
	
	@Override
	public int compareTo(Artista o) {
		return Integer.compare(this.numeroLegajo, o.getNumLegajo());
		
	}

}
