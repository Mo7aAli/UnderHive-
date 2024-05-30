package principal;

import java.awt.Color;
import java.awt.Font;

import principal.herramientas.CargadorRecursos;

public class Constantes {
	public static final int LADO_SPRITE = 32;

	public static int ANCHO_JUEGO = 640;// 1280---640
	public static int ALTO_JUEGO = 360;// 720-----360

	// public static int ANCHO_PANTALLA_COMPLETA = 1920;
	// public static int ALTO_PANTALLA_COMPLETA = 1080;

	public static int ANCHO_PANTALLA_COMPLETA = 1280;
	public static int ALTO_PANTALLA_COMPLETA = 720;

	public static double FACTOR_ESCALADO_X = (double) ANCHO_PANTALLA_COMPLETA / (double) ANCHO_JUEGO;
	public static double FACTOR_ESCALADO_Y = (double) ALTO_PANTALLA_COMPLETA / (double) ALTO_JUEGO;

	public static int CENTRO_VENTANA_X = ANCHO_JUEGO / 2;
	public static int CENTRO_VENTANA_Y = ALTO_JUEGO / 2;

	public static int MARGEN_X = ANCHO_JUEGO / 2 - LADO_SPRITE / 2;
	public static int MARGEN_Y = ALTO_JUEGO / 2 - LADO_SPRITE / 2;

	public static String RUTA_MAPA_INICIAL = "recursos/mapas/01.U";
	public static String RUTA_ICONO_RATON = "recursos/imagenes/iconos/iconoCursor.png";
	public static String RUTA_PERSONAJE = "recursos/imagenes/hojaspersonajes/1.png";
	public static String RUTA_PERSONAJE_CON_ARMA = "recursos/imagenes/hojaspersonajes/2.png";
	public static String RUTA_ICONO_VENTANA = "recursos/imagenes/iconos/U.png";
	public static Font RUTA_FUENTE = CargadorRecursos.cargarFuente("recursos/fuentes/px10.ttf");
	public static String RUTA_OBJETOS = "recursos/imagenes/hojasObjetos/1.png";
	public static String RUTA_OBJETOS_ARMAS = "recursos/imagenes/hojasArmas/armas.png";
	public static String RUTA_ENEMIGOS = "recursos/imagenes/hojaEnemigos/";
	public static final Color COLOR_VERDE = new Color(0xff136b5a);
	public static final Color COLOR_AMARILLO = new Color(0xffeaaa00);
	public static final Color COLOR_AZUL = new Color(0xff25268a);
	public static final Color COLOR_MAR = new Color(0xff156c99);

}
