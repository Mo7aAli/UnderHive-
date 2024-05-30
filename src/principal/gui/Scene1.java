package principal.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Scene1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Scene1() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);

		boton_Play();
		boton_Settings();
		boton_Salir();
		marco();
	}

	public void boton_Play() {
		JButton botonPlay = new JButton("");
		botonPlay.setBounds(299, 150, 173, 51);
		configurarBotonTransparente(botonPlay);
		botonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				GestorPrincipal.iniciarJuegoDesdeEscena();
				dispose(); // Cierra la ventana de la escena
			}
		});

		try {
			contentPane.setLayout(null);
			botonPlay.setIcon(new ImageIcon(Scene1.class.getResource("/principal/gui/iconosMenu/play1.png")));
			contentPane.add(botonPlay);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void boton_Settings() {
		JButton botonSettings = new JButton("");
		botonSettings.setBounds(299, 250, 173, 51);
		configurarBotonTransparente(botonSettings);
		botonSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scene2 s2 = new Scene2();
				s2.setVisible(true);
			}
		});
		try {
			contentPane.setLayout(null);
			botonSettings.setIcon(new ImageIcon(Scene1.class.getResource("/principal/gui/iconosMenu/Settings.png")));
			contentPane.add(botonSettings);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void boton_Salir() {
		JButton botonSalir = new JButton("");
		botonSalir.setBounds(299, 450, 173, 51);
		configurarBotonTransparente(botonSalir);
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		try {

			botonSalir.setIcon(new ImageIcon(Scene1.class.getResource("/principal/gui/iconosMenu/Salir.jpg")));
			contentPane.add(botonSalir);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void marco() {

		JLabel marco = new JLabel("");
		marco.setBounds(0, 0, 785, 562);
		marco.setOpaque(false);

		try {
			contentPane.setLayout(null);

			marco.setOpaque(false);

			// Asegurar que el contenido del JLabel también sea transparente
			marco.setBackground(new java.awt.Color(0, 0, 0, 0));
			marco.setIcon(new ImageIcon(Scene1.class.getResource("/principal/gui/iconosMenu/CUADRO_BUENO.png")));
			contentPane.add(marco);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void configurarBotonTransparente(JButton boton) {
		boton.setOpaque(false);
		boton.setContentAreaFilled(false);
		boton.setBorderPainted(false);
		boton.setFocusPainted(false);
	}

}
