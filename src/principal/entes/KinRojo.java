package principal.entes;

import java.awt.Graphics;
import java.util.ArrayList;

import principal.Constantes;
import principal.herramientas.DibujoDebug;
import principal.sprites.HojaSprites;

public class KinRojo extends Enemigo {
	private static HojaSprites hojaKinRojo;
	private int frameActual;
	private int totalFrames;

	public KinRojo(final int idEnemigo, final String nombre, final int vidaMaxima, final String rutaLamneto) {
		super(idEnemigo, nombre, vidaMaxima, rutaLamneto);

		if (hojaKinRojo == null) {
			hojaKinRojo = new HojaSprites(Constantes.RUTA_ENEMIGOS + idEnemigo + ".png", Constantes.LADO_SPRITE, false);
		}

		frameActual = 0;
		totalFrames = 4; // Cantidad de direcciones (arriba, derecha, abajo, izquierda)

	}

//
	public void actualizar(ArrayList<Enemigo> enemigos) {
		super.actualizar(enemigos);

//		if (enMovimiento) {
//			// Actualizar la animación cuando se mueve
//			frameActual++;
//			if (frameActual >= totalFrames) {
//				frameActual = 0;
//			}
//		}
//		if (!enMovimiento) {
//			// Si no se está moviendo, seleccionar el sprite de la dirección actual
//			frameActual = 0;
//		}
	}

	public void dibujar(final Graphics g, final int puntoX, final int puntoY) {
		System.out.println("Dirección: " + direccion + ", Frame Actual: " + frameActual);
		DibujoDebug.dibujarImagen(g, hojaKinRojo.obtenerSprite(direccion).obtenerImagen(), puntoX, puntoY);
		super.dibujar(g, puntoX, puntoY);
	}
}
