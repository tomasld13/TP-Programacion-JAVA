package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Piso {

	private int x;
	private int y;

	private int alto;
	private int ancho;
	private Image img;

	public Piso(int x, int y, int ancho) {
		this.x = x;
		this.y = y;
		this.alto = 20;
		this.ancho = ancho;
		this.img = Herramientas.cargarImagen("escalera.png");
	}

	public void dibujar(Entorno e) {
		e.dibujarImagen(img, x, y, 0);
	}

	public boolean chocasteParteSuperiorCon(double xDeUnPersonaje, double yDeUnPersonaje) {
		return yDeUnPersonaje > y - alto / 2 && yDeUnPersonaje < y && xDeUnPersonaje < x + ancho / 2
				&& xDeUnPersonaje > x - ancho / 2;
	}

	public boolean chocasteParteInferiorCon(double XdelObjeto, double YdelObjeto) {
		return YdelObjeto < y + alto / 2 && YdelObjeto > y && XdelObjeto < x + ancho / 2 && XdelObjeto > x - ancho / 2;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
}
