package principal.inventario.armas;

import java.awt.Rectangle;
import java.util.ArrayList;

import principal.entes.Jugador;

public class Desarmado extends Arma {

	public Desarmado(int id, String nombre, String descripcion, int ataqueMinimo, int ataqueMaximo, boolean automatica,
			boolean penetrante, double ataquesPorSegundo) {
		super(id, nombre, descripcion, ataqueMinimo, ataqueMaximo, automatica, penetrante, ataquesPorSegundo,"recursos/sonidos/golpe.wav");

	}

	public ArrayList<Rectangle> obtenerAlcance(Jugador jugador) {

		return null;
	}

}
