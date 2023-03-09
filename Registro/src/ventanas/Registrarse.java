package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Registrarse extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JLabel lblNewLabel;
	private JPasswordField contrasenia;
	private JFormattedTextField telefono;
	private JLabel Contraseña;
	private JButton btnLimpiar;
	private JButton btnConfirmar;
	private JComboBox<String> comboBox;
	private JRadioButton radioH;
	private JRadioButton radioM;

	private JLabel porcentaje;
	private JSlider slider;
	private ButtonGroup grupoGenero;

	public Registrarse(VentanaMain ventanaMain, boolean b) {
		super(ventanaMain);
		setModal(b);

		setBounds(750, 300, 325, 455);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		nombre = new JTextField();
		nombre.setBounds(90, 11, 183, 20);
		contentPanel.add(nombre);
		nombre.setColumns(10);

		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 14, 59, 14);
		contentPanel.add(lblNewLabel);

		contrasenia = new JPasswordField();
		contrasenia.setBounds(90, 53, 183, 20);
		contentPanel.add(contrasenia);

		Contraseña = new JLabel("Contraseña:");
		Contraseña.setBounds(10, 56, 70, 14);
		contentPanel.add(Contraseña);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 289, 8);
		contentPanel.add(separator);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(29, 382, 110, 23);
		contentPanel.add(btnLimpiar);
		btnLimpiar.addActionListener(this);

		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(168, 382, 110, 23);
		contentPanel.add(btnConfirmar);
		btnConfirmar.addActionListener(this);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(90, 235, 183, 22);
		contentPanel.add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("ESO");
		comboBox.addItem("Bachiller");
		comboBox.addItem("Grado Superior");
		comboBox.addItem("Universidad");

		JLabel lblNewLabel_1 = new JLabel("Titulacion");
		lblNewLabel_1.setBounds(10, 239, 46, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Genero:");
		lblNewLabel_2.setBounds(10, 157, 46, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setBounds(10, 113, 70, 14);
		contentPanel.add(lblNewLabel_3);

		telefono = new JFormattedTextField();
		telefono.setBounds(90, 110, 183, 20);
		contentPanel.add(telefono);

		grupoGenero = new ButtonGroup();

		radioH = new JRadioButton("Hombre");
		radioH.setBounds(94, 153, 109, 23);
		contentPanel.add(radioH);
		grupoGenero.add(radioH);

		radioM = new JRadioButton("Mujer");
		radioM.setBounds(94, 190, 109, 23);
		contentPanel.add(radioM);
		grupoGenero.add(radioM);

		slider = new JSlider();
		slider.setValue(0);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cambiarPorcentaje();
			}
		});
		slider.setPaintLabels(true);
		slider.setBounds(10, 329, 289, 26);
		contentPanel.add(slider);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 274, 289, 14);
		contentPanel.add(separator_1);

		JLabel lblNewLabel_4 = new JLabel("Porcentaje de Alvaro:");
		lblNewLabel_4.setBounds(10, 299, 125, 14);
		contentPanel.add(lblNewLabel_4);

		porcentaje = new JLabel("0 %");
		porcentaje.setBounds(256, 299, 43, 14);
		contentPanel.add(porcentaje);

	}

	protected void cambiarPorcentaje() {
		porcentaje.setText(slider.getValue() + " %");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnLimpiar)) {
			nombre.setText("");
			nombre.setBackground(new Color(255, 255, 255));
			contrasenia.setText("");
			contrasenia.setBackground(new Color(255, 255, 255));
			telefono.setText("");
			telefono.setBackground(new Color(255, 255, 255));
			radioH.setSelected(false);
			radioH.setBackground(new Color(240, 240, 240));
			radioM.setSelected(false);
			radioM.setBackground(new Color(240, 240, 240));
			comboBox.setSelectedIndex(-1);
			comboBox.setBackground(new Color(255, 255, 255));
			slider.setValue(0);

		} else if (e.getSource().equals(btnConfirmar)) {
			comprobar();
		}
	}

	private void comprobar() {
		JComponent[] campos = { nombre, contrasenia, telefono, comboBox, slider };

		if (nombre.getText().isBlank()) {
			nombre.setBackground(new Color(255, 105, 105));
		} else {
			nombre.setBackground(new Color(102, 204, 102));
		}
		if (contrasenia.getText().isBlank()) {
			contrasenia.setBackground(new Color(255, 105, 105));
		} else {
			contrasenia.setBackground(new Color(102, 204, 102));
		}
		if (telefono.getText().isBlank()) {
			telefono.setBackground(new Color(255, 105, 105));
		} else {
			telefono.setBackground(new Color(102, 204, 102));
		}
		if (!radioH.isSelected() && !radioH.isSelected()) {
			radioH.setBackground(new Color(255, 105, 105));
			radioM.setBackground(new Color(255, 105, 105));
		} else {
			radioH.setBackground(new Color(240, 240, 240));
			radioM.setBackground(new Color(240, 240, 240));
		}
		if (comboBox.getSelectedIndex() == 0) {
			comboBox.setBackground(new Color(255, 105, 105));
		}else {
			comboBox.setBackground(new Color(102, 204, 102));
		}

	}
}
