package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaMain extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JButton btnIniciar;
	private JButton btnRegistrarse;

	public VentanaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIniciar.setBounds(127, 51, 179, 54);
		contentPane.add(btnIniciar);
		btnIniciar.addActionListener(this);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegistrarse.setBounds(127, 156, 179, 54);
		contentPane.add(btnRegistrarse);
		btnRegistrarse.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnIniciar)) {
			iniciarSesion();
		}else if(e.getSource().equals(btnRegistrarse)) {
			registrarse();
		}
	
	}

	private void registrarse() {
		Registrarse reg = new Registrarse(this, true);
		this.setVisible(false);
		reg.setVisible(true);
	}

	private void iniciarSesion() {
		IniciarSesion ini = new IniciarSesion(this, true);
		this.setVisible(false);
		ini.setVisible(true);
	}
}
