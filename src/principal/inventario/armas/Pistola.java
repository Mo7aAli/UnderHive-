package principal.inventario.armas;

import java.awt.Rectangle;
import java.util.ArrayList;

import principal.Constantes;
import principal.entes.Jugador;

public class Pistola extends Arma {

	public Pistola(int id, String nombre, String descripcion, int ataqueMinimo, int ataqueMaximo, boolean automatica,
			boolean penetrante, double ataquesPorSegundo) {
		super(id, nombre, descripcion, ataqueMinimo, ataqueMaximo, automatica, penetrante, ataquesPorSegundo,
				"recursos/sonidos/disparo.wav");

	}

	public ArrayList<Rectangle> obtenerAlcance(Jugador jugador) {
		final ArrayList<Rectangle> alcance = new ArrayList<>();

		final Rectangle alcance1 = new Rectangle();
		final int spritesAlcance = 3;
		if (jugador.obtenerDireccion() == 0 || jugador.obtenerDireccion() == 1) {
			alcance1.width = 1;
			alcance1.height = spritesAlcance * Constantes.LADO_SPRITE;
			alcance1.x = Constantes.CENTRO_VENTANA_X - 16;
			if (jugador.obtenerDireccion() == 0) {
				alcance1.y = Constantes.CENTRO_VENTANA_Y - 16;
			} else {

				alcance1.y = Constantes.CENTRO_VENTANA_Y - 16 - alcance1.height;
			}
		} else {
			alcance1.width = spritesAlcance * Constantes.LADO_SPRITE;
			alcance1.height = 1;
			alcance1.y = Constantes.CENTRO_VENTANA_Y - 16;

			if (jugador.obtenerDireccion() == 3) {
				alcance1.x = Constantes.CENTRO_VENTANA_X - 16 - alcance1.width;
			} else {

				alcance1.x = Constantes.CENTRO_VENTANA_X - 16;
			}
		}

		alcance.add(alcance1);

		return alcance;
	}

}
