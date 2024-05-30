package principal.entes;

public class RegistroEnemigos {
	public static Enemigo obtenerEnemigo(final int idEnemigo) {
		Enemigo enemigo = null;

		switch (idEnemigo) {
		case 1:
			enemigo = new KinRojo(idEnemigo, "KinRojo", 10, "recursos/sonidos/rugidoZombie.wav");
			break;
		}

		return enemigo;
	}
}
