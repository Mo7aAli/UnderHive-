package principal;

import principal.entes.Jugador;
import principal.inventario.Inventario;
import principal.mapas.MapaTiled;

public class ElementosPrincipales {

	public static MapaTiled mapa = new MapaTiled("recursos/mapas/MapaUnderhive4.tmj");
//	public static MapaTiled mapa2 = new MapaTiled("recursos/mapas/mapa-apocaliptico.tmj");
	// public static Mapa mapa = new Mapa(Constantes.RUTA_MAPA_INICIAL);
	// public static Mapa mapa = new Mapa(Constantes.RUTA_MAPA);
	public static Jugador jugador = new Jugador();
	public static Inventario inventario = new Inventario();

}
