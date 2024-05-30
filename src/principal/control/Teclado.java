package principal.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {

	public Tecla arriba = new Tecla();
	public Tecla abajo = new Tecla();
	public Tecla izquierda = new Tecla();
	public Tecla derecha = new Tecla();

	public boolean recogiendo = false;
	public boolean corriendo = false;
	public boolean debug = false;
	public boolean inventarioActivo = false;
	public boolean atacando = false;

	// tecla pulsada// tecla tecleada
	public void keyTyped(KeyEvent e) {

	}

	// tecla pulsada
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			arriba.teclaPulsada();
			break;
		case KeyEvent.VK_S:
			abajo.teclaPulsada();
			break;
		case KeyEvent.VK_A:
			izquierda.teclaPulsada();
			break;
		case KeyEvent.VK_D:
			derecha.teclaPulsada();
			break;
		case KeyEvent.VK_F:
			recogiendo = true;
			break;
		case KeyEvent.VK_SHIFT:
			corriendo = true;
			break;
		case KeyEvent.VK_F3:
			debug = !debug;
			break;
		case KeyEvent.VK_E:
			inventarioActivo = !inventarioActivo;
			break;
		case KeyEvent.VK_SPACE:
			atacando = true;
			break;
		case KeyEvent.VK_ESCAPE:
			System.exit(0);
		}
	}

	// tecla liberada
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			arriba.teclaLiberada();
			break;
		case KeyEvent.VK_S:
			abajo.teclaLiberada();
			break;
		case KeyEvent.VK_A:
			izquierda.teclaLiberada();
			break;
		case KeyEvent.VK_D:
			derecha.teclaLiberada();
			break;
		case KeyEvent.VK_F:
			recogiendo = false;
			break;
		case KeyEvent.VK_SHIFT:
			corriendo = false;
			break;
		case KeyEvent.VK_SPACE:
			atacando = false;
			break;

		}
	}

}
