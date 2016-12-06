package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class ConfigurarDescuento extends JDialog implements ActionListener, KeyListener {
	private JLabel lblDeA;
	private JLabel lblDeA_1;
	private JLabel lblDeA_2;
	private JLabel lblMsDe;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuento dialog = new ConfigurarDescuento();
					//Esta linea de codigo sirve para mostrar la GUI al centro de la pantalla
					dialog.setLocationRelativeTo(null);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConfigurarDescuento.class.getResource("/imagenes/favicon.png")));
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("                        CONFIGURACION DE PORCENTAJES DE DESCUENTO");
		//tamaño de la gui
		setBounds(100, 100, 550, 230);
		getContentPane().setLayout(null);
		
		lblDeA = new JLabel(" 1 a 5 unidades");
		lblDeA.setForeground(Color.WHITE);
		lblDeA.setFont(new Font("Cambria", Font.BOLD, 13));
		lblDeA.setBounds(168, 25, 145, 22);
		getContentPane().add(lblDeA);
		
		lblDeA_1 = new JLabel("6 a 10 unidades");
		lblDeA_1.setForeground(Color.WHITE);
		lblDeA_1.setFont(new Font("Cambria", Font.BOLD, 13));
		lblDeA_1.setBounds(168, 53, 145, 22);
		getContentPane().add(lblDeA_1);
		
		lblDeA_2 = new JLabel("11 a 15 unidades");
		lblDeA_2.setForeground(Color.WHITE);
		lblDeA_2.setFont(new Font("Cambria", Font.BOLD, 13));
		lblDeA_2.setBounds(168, 81, 145, 22);
		getContentPane().add(lblDeA_2);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setForeground(Color.WHITE);
		lblMsDe.setFont(new Font("Cambria", Font.BOLD, 13));
		lblMsDe.setBounds(168, 109, 145, 22);
		getContentPane().add(lblMsDe);
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPorcentaje1.addKeyListener(this);
		txtPorcentaje1.setBounds(302, 25, 76, 22);
		getContentPane().add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPorcentaje2.addKeyListener(this);
		txtPorcentaje2.setColumns(10);
		txtPorcentaje2.setBounds(302, 53, 76, 22);
		getContentPane().add(txtPorcentaje2);
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPorcentaje3.addKeyListener(this);
		txtPorcentaje3.setColumns(10);
		txtPorcentaje3.setBounds(302, 81, 76, 22);
		getContentPane().add(txtPorcentaje3);
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPorcentaje4.addKeyListener(this);
		txtPorcentaje4.setColumns(10);
		txtPorcentaje4.setBounds(302, 109, 76, 22);
		getContentPane().add(txtPorcentaje4);
		
		label = new JLabel("%");
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(384, 25, 24, 22);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(384, 53, 24, 22);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(384, 81, 24, 22);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(384, 109, 24, 22);
		getContentPane().add(label_3);
		
		btnAceptar = new JButton("Grabar");
		btnAceptar.setIcon(new ImageIcon(ConfigurarDescuento.class.getResource("/imagenes/save.png")));
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(418, 37, 106, 36);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Salir");
		btnCancelar.setIcon(new ImageIcon(ConfigurarDescuento.class.getResource("/imagenes/cerrar.png")));
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(418, 80, 106, 36);
		getContentPane().add(btnCancelar);
		lblNewLabel.setIcon(new ImageIcon(ConfigurarDescuento.class.getResource("/imagenes/configdescuento.png")));
		lblNewLabel.setBounds(-11, -37, 557, 238);
		getContentPane().add(lblNewLabel);
				cargarDatosIniciales();}
	
	
	void cargarDatosIniciales(){
		txtPorcentaje1.setText(""+Tienda.porcentaje1);
		txtPorcentaje2.setText(""+Tienda.porcentaje2);
		txtPorcentaje3.setText(""+Tienda.porcentaje3);
		txtPorcentaje4.setText(""+Tienda.porcentaje4);}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);}
		
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);}
		
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		Tienda.porcentaje1=Double.parseDouble(txtPorcentaje1.getText());
		Tienda.porcentaje2=Double.parseDouble(txtPorcentaje2.getText());
		Tienda.porcentaje3=Double.parseDouble(txtPorcentaje3.getText());
		Tienda.porcentaje4=Double.parseDouble(txtPorcentaje4.getText());
		JOptionPane.showMessageDialog(null, "Ha grabado los datos correctamente"
				+ "",   "Mensaje Informativo",JOptionPane.INFORMATION_MESSAGE);
				this.dispose();
				Tienda Tienda = new Tienda();
				Tienda.setLocationRelativeTo(null);
				Tienda.setVisible(true);}
	
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		//Anteponiendo el "This" al dispose cerrarmos la ventana con la que estamos trabajando
		this.dispose();
		Tienda Tienda = new Tienda();
		Tienda.setLocationRelativeTo(null);
		Tienda.setVisible(true);}
	
	public void keyPressed(KeyEvent arg0) {}
	
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtPorcentaje4) {
			keyTypedTxtPorcentaje4(arg0);}
		
		if (arg0.getSource() == txtPorcentaje3) {
			keyTypedTxtPorcentaje3(arg0);}
		
		if (arg0.getSource() == txtPorcentaje2) {
			keyTypedTxtPorcentaje2(arg0);}
		
		if (arg0.getSource() == txtPorcentaje1) {
			keyTypedTxtPorcentaje1(arg0);}
		
	}
	protected void keyTypedTxtPorcentaje1(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
				char cTeclaPresionada=arg0.getKeyChar();
				//da click al boton Ingresar al detectar la tecla ENTER
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				
	}
	
	protected void keyTypedTxtPorcentaje2(KeyEvent arg0) {	
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
	}
	
	protected void keyTypedTxtPorcentaje3(KeyEvent arg0) {	
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
	}
	
	protected void keyTypedTxtPorcentaje4(KeyEvent arg0) {	
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
	}
}