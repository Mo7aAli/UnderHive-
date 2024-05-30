package principal.maquinaestado.estados.menuinicial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GestorInicial {
	private String[] opciones = { "Jugar", "Opciones", "Salir" };
	private int opcionSeleccionada = 0;

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_UP:
			opcionSeleccionada = (opcionSeleccionada - 1 + opciones.length) % opciones.length;
			break;
		case KeyEvent.VK_DOWN:
			opcionSeleccionada = (opcionSeleccionada + 1) % opciones.length;
			break;
		case KeyEvent.VK_ENTER:
			// Manejar la opción seleccionada (por ejemplo, iniciar juego o salir)
			switch (opcionSeleccionada) {
			case 0:
				System.out.println("Iniciar juego");
				break;
			case 1:
				System.out.println("Abrir opciones");
				break;
			case 2:
				System.out.println("Salir");
				System.exit(0);
				break;
			}
			break;
		}
	}

	public void dibujar(Graphics g) {
		final int margenGeneral = 20;
		final int lado = 32;
		final int xInicial = 50;
		final int yInicial = 100;

		for (int i = 0; i < opciones.length; i++) {
			if (i == opcionSeleccionada) {
				g.setColor(Color.YELLOW);
			} else {
				g.setColor(Color.GRAY);
			}
			g.fillRect(xInicial, yInicial + i * (lado + margenGeneral), 200, lado);

			g.setColor(Color.WHITE);
			g.drawString(opciones[i], xInicial + 10, yInicial + i * (lado + margenGeneral) + lado / 2);
		}
	}

}
