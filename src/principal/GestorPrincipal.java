package principal;

import principal.control.GestorControles;
import principal.graficos.SuperficieDibujo;
import principal.graficos.Ventana;
import principal.maquinaestado.GestorEstados;

public class GestorPrincipal {

	private boolean enFuncionamiento = false;
	private String titulo;
	private int ancho;
	private int alto;

	public static SuperficieDibujo sd;
	private Ventana ventana;
	private GestorEstados ge;

	public static int fps = 0;
	private static int aps = 0;
	// private Sonido musica = new Sonido("recursos/sonidos/musica.wav");
	private static boolean juegoIniciado = false;

	public GestorPrincipal(final String titulo, final int ancho, final int alto) {
		this.titulo = titulo;
		this.ancho = ancho;
		this.alto = alto;
	}

//	public static void iniciarJuegoDesdeEscena() {
//		if (!juegoIniciado) {
//			juegoIniciado = true;
//			GestorPrincipal gp = new GestorPrincipal("Underhive", Constantes.ANCHO_PANTALLA_COMPLETA,
//					Constantes.ALTO_PANTALLA_COMPLETA);
//			gp.iniciarJuego();
//			gp.iniciarBuclePrincipal();
//		}
//	}

	public static void main(String[] args) {

		System.setProperty("sun.java2d.d3d", "True");
		System.setProperty("sun.java2d.ddforcevram", "True");

		System.setProperty("sun.java2d.transaccel", "True");
		GestorPrincipal gp = new GestorPrincipal("Underhive", Constantes.ANCHO_PANTALLA_COMPLETA,
				Constantes.ALTO_PANTALLA_COMPLETA);

		gp.iniciarJuego();
		gp.iniciarBuclePrincipal();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Scene1 frame = new Scene1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	private void iniciarJuego() {
		enFuncionamiento = true;
		inicializar();
		// musica.repetir();

	}

	private void inicializar() {
		sd = new SuperficieDibujo(ancho, alto);
		ventana = new Ventana(titulo, sd);
		ge = new GestorEstados(sd);
	}

	private void iniciarBuclePrincipal() {
		int actualizacionesAcumuladas = 0;
		int framesAcumulados = 0;

		final int NS_POR_SEGUNDO = 1000000000;// cauntos nano hay en un segundo
		final int APS_OBJETIVO = 60;// Cuantas actualizaciones por segundo queremos llevar
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

		long referenciaAtualizacion = System.nanoTime();// se le retribuira una cantidad de tiempo en nano segundos
		long referenciaContador = System.nanoTime();

		double tiempoTranscurrido;
		double delta = 0;// cantidad de tiempo hasta que se realiza una actualizacion

		while (enFuncionamiento) {
			final long inicioBucle = System.nanoTime();// inicar cronometro

			tiempoTranscurrido = inicioBucle - referenciaAtualizacion;// cuanto ha pasado desde el inicio y la
																		// referencia
			referenciaAtualizacion = inicioBucle;

			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

			while (delta >= 1) { // se ejecutara solo si delta es mayor o igual a 1
				actualizar();
				actualizacionesAcumuladas++;
				delta--;
			}

			dibujar();
			framesAcumulados++;

			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				aps = actualizacionesAcumuladas;
				fps = framesAcumulados;

				actualizacionesAcumuladas = 0;
				framesAcumulados = 0;
				referenciaContador = System.nanoTime();
			}
		}

	}// Bucle

	private void actualizar() {
		if (GestorControles.teclado.inventarioActivo) {
			ge.cambiarEstadoActual(1);
		} else {
			ge.cambiarEstadoActual(0);
		}

		ge.actualizar();
		sd.actualizar();
	}

	private void dibujar() {
		sd.dibujar(ge);
	}

	public static int obtenerFPS() {
		return fps;
	}

	public static int obtenerAPS() {
		return aps;
	}
}// clase
