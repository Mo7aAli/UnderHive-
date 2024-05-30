package principal.maquinaestado.estados.juego;

import java.awt.Color;
import java.awt.Graphics;

import principal.ElementosPrincipales;
import principal.herramientas.DatosDebug;
import principal.interfaz_Usuario.MenuInferior;
import principal.maquinaestado.EstadoJuego;

public class GestorJuego implements EstadoJuego {

	MenuInferior menuInferior;

	public GestorJuego() {
		menuInferior = new MenuInferior();
	}

	public void actualizar() {

		ElementosPrincipales.jugador.actualizar();
		ElementosPrincipales.mapa.actualizar();

	}

	public void dibujar(Graphics g) {
		ElementosPrincipales.mapa.dibujar(g);
		ElementosPrincipales.jugador.dibujar(g);
		menuInferior.dibujar(g);

		g.setColor(Color.white);

		DatosDebug.enviarDato("X = " + ElementosPrincipales.jugador.obtenerPosicionXInt());
		DatosDebug.enviarDato("Y = " + ElementosPrincipales.jugador.obtenerPosicionYInt());
		DatosDebug.enviarDato("Siguiente mapa =" + ElementosPrincipales.mapa.obtenerSiguienteMapa());
		DatosDebug.enviarDato("Coordenadas salida X = " + ElementosPrincipales.mapa.obtenerPuntoSalida().getX()
				+ ", Y = " + ElementosPrincipales.mapa.obtenerPuntoSalida().getY());

//		MenuInferior.dibujarResistencia(g, jugador.resistencia);
	}

}
