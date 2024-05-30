package principal.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Scene2 extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtVolumen;

	/**
	 * Create the dialog.
	 */
	public Scene2() {
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		boton_Volver();
		Volumen();
		opcion_fps();

	}

	public void boton_Volver() {

		JButton boton_Volver = new JButton("");
		boton_Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		configurarBotonTransparente(boton_Volver);
		boton_Volver.setIcon(new ImageIcon(Scene2.class.getResource("/principal/gui/iconosMenu/Salir.jpg")));
		boton_Volver.setBounds(299, 450, 173, 51);
		contentPanel.add(boton_Volver);

	}

	public void Volumen() {
		JSlider volumen = new JSlider();
		volumen.setBackground(new Color(116, 116, 116));
		volumen.setBounds(299, 230, 171, 51);
		contentPanel.add(volumen);

		txtVolumen = new JTextField();
		txtVolumen.setBackground(new Color(116, 116, 116));
		txtVolumen.setFont(new Font("Verdana", Font.BOLD, 20));
		txtVolumen.setHorizontalAlignment(SwingConstants.CENTER);
		txtVolumen.setText("Volumen");
		txtVolumen.setBounds(299, 200, 173, 25);
		contentPanel.add(txtVolumen);
		txtVolumen.setColumns(10);

	}

	public void opcion_fps() {
		JCheckBox fps_Opciones = new JCheckBox("FPS");
		fps_Opciones.setBackground(new Color(116, 116, 116));
		fps_Opciones.setBounds(299, 300, 173, 51);
		contentPanel.add(fps_Opciones);

		JLabel Cuadro = new JLabel("");
		Cuadro.setBackground(new Color(116, 116, 116));
		Cuadro.setForeground(new Color(116, 116, 116));
		Cuadro.setIcon(new ImageIcon(Scene2.class.getResource("/principal/gui/iconosMenu/cuadro3_MENUDEOPCIONES.png")));
		Cuadro.setBounds(0, 0, 785, 562);
		contentPanel.add(Cuadro);

	}

	private void configurarBotonTransparente(JButton boton) {
		boton.setOpaque(false);
		boton.setContentAreaFilled(false);
		boton.setBorderPainted(false);
		boton.setFocusPainted(false);
	}
}