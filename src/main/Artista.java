package main;

public abstract class Artista {
	
	public static double cuotaBase = 100;
	private int numeroLegajo;
	private int diasDeAsistencia;
	
	public Artista(int numeroLegajo, int diasDeAsistencia) {
		this.numeroLegajo = numeroLegajo;
		this.diasDeAsistencia = diasDeAsistencia;
	}
	
	public int getNumLegajo() {
		return this.numeroLegajo;
	}
	
	public double getCuotaBase() {
		return  cuotaBase;
	}
	
	public int getDiasAsitencia() {
		if(this.diasDeAsistencia <= 0 || this.diasDeAsistencia > 3) {
			throw new Error("Dia incorrecto");
		}
		return this.diasDeAsistencia;	
	}
	
	public abstract double getCuotaMensual();

}
