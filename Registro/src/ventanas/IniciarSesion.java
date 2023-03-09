package ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class IniciarSesion extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();
	
	private JTextField usuario;
	private JPasswordField contrasenia;
	private JButton btnConfirmar;

	
	public IniciarSesion(VentanaMain ventanaMain, boolean b) {
		super(ventanaMain);
		setModal(b);

		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		usuario = new JTextField();
		usuario.setBackground(new Color(102, 204, 102));
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usuario.setBounds(191, 33, 194, 39);
		contentPanel.add(usuario);
		usuario.setColumns(10);
		
		contrasenia = new JPasswordField();
		contrasenia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contrasenia.setBounds(191, 111, 194, 39);
		contentPanel.add(contrasenia);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(157, 199, 120, 33);
		contentPanel.add(btnConfirmar);
		btnConfirmar.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(48, 33, 95, 39);
		contentPanel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(48, 111, 95, 39);
		contentPanel.add(lblContrasea);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnConfirmar)) {
			
		}
		
	}

}
