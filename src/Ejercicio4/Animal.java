package Ejercicio4;

import java.util.ArrayList;

public abstract class Animal {

	private ArrayList<Habilidad> habilidades;
	private String nombre;
	private float peso;
	private float tamanioCms;
	private Alimento alimento;
	
	public Animal() {
		habilidades = new ArrayList<Habilidad>();
	}
	
	
	
	


	//GET SET
	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPeso() {
		return peso;
	}

	public float getTamanioCms() {
		return tamanioCms;
	}

	
	
	public void Alimentar(Alimento alimento) {		
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setTamanioCms(float tamanioCms) {
		this.tamanioCms = tamanioCms;
	}
	
	@Override
	public String toString() {
		return "Animal [habilidades=" + habilidades + ", nombre=" + nombre + ", peso=" + peso + ", tamanioCms="
				+ tamanioCms + ", alimento=" + alimento + "]";
	}


}
