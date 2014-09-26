package com.example.petsbook;

public class Tool {

	private String titulo;
	private String subTitulo;
	private int imagen;

	public Tool(String tit, String sub, int img) {
		titulo = tit;
		subTitulo = sub;
		imagen = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSubtitulo() {
		return subTitulo;
	}

	public int getImagen() {
		return imagen;
	}

}
