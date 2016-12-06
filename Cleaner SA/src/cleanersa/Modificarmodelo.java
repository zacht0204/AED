package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Modificarmodelo extends JDialog implements ActionListener, KeyListener {
	private JLabel lblModelo;
	private JLabel lblSuavidad;
	private JLabel lblNmeroDeHojas;
	private JLabel lblTamañodehoja;
	private JLabel lblPrecios;
	private JComboBox cboModelo;
	private JTextField txtSuavidad;
	private JTextField txtNumerohojas;
	private JTextField txtTamañohojas;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	private JButton btnGrabar;
	
	
		
		
		int modelo;
		private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificarmodelo dialog = new Modificarmodelo();
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
	public Modificarmodelo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Modificarmodelo.class.getResource("/imagenes/favicon.png")));
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("Modificar Modelo");
		//tamaño de gui
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(255, 255, 255));
		lblModelo.setFont(new Font("Cambria", Font.BOLD, 13));
		lblModelo.setBounds(171, 78, 190, 14);
		getContentPane().add(lblModelo);
		
		lblSuavidad = new JLabel("Suavidad");
		lblSuavidad.setForeground(new Color(255, 255, 255));
		lblSuavidad.setFont(new Font("Cambria", Font.BOLD, 13));
		lblSuavidad.setBounds(171, 103, 190, 14);
		getContentPane().add(lblSuavidad);
		
		lblNmeroDeHojas = new JLabel("N\u00FAmero de hojas por rollo");
		lblNmeroDeHojas.setForeground(new Color(255, 255, 255));
		lblNmeroDeHojas.setFont(new Font("Cambria", Font.BOLD, 13));
		lblNmeroDeHojas.setBounds(171, 128, 190, 14);
		getContentPane().add(lblNmeroDeHojas);
		
		lblTamañodehoja = new JLabel("Tama\u00F1o de hoja");
		lblTamañodehoja.setForeground(new Color(255, 255, 255));
		lblTamañodehoja.setFont(new Font("Cambria", Font.BOLD, 13));
		lblTamañodehoja.setBounds(171, 153, 190, 14);
		getContentPane().add(lblTamañodehoja);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setForeground(new Color(255, 255, 255));
		lblPrecios.setFont(new Font("Cambria", Font.BOLD, 13));
		lblPrecios.setBounds(171, 178, 190, 14);
		getContentPane().add(lblPrecios);
		
		final JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/confort.png")));
		lblFoto.setBounds(524, 58, 175, 168);
		getContentPane().add(lblFoto);
		
		cboModelo = new JComboBox();
		cboModelo.setFont(new Font("Cambria", Font.BOLD, 13));
		cboModelo.addActionListener(new ActionListener() {
			
			//PARA MOSTRAR LOS DATOS DEL COMBO BOX
			
			public void actionPerformed(ActionEvent arg0) {
				int categoria;
				
				categoria=cboModelo.getSelectedIndex();
				
				switch (categoria){
				case 0:
					txtSuavidad.setText(""+Tienda.suavidad0);
					txtNumerohojas.setText(""+Tienda.hojas0);
					txtTamañohojas.setText(""+Tienda.tamaño0);
					txtPrecio.setText(""+Tienda.precio0);
					lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/" + Tienda.modelo0 + ".png")));
					break;
				case 1:
					txtSuavidad.setText(""+Tienda.suavidad1);
					txtNumerohojas.setText(""+Tienda.hojas1);
					txtTamañohojas.setText(""+Tienda.tamaño1);
					txtPrecio.setText(""+Tienda.precio1);
					lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/" + Tienda.modelo1 + ".png")));
					break;
				case 2:
					txtSuavidad.setText(""+Tienda.suavidad2);
					txtNumerohojas.setText(""+Tienda.hojas2);
					txtTamañohojas.setText(""+Tienda.tamaño2);
					txtPrecio.setText(""+Tienda.precio2);
					lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/" + Tienda.modelo2 + ".png")));
					break;
				case 3:
					txtSuavidad.setText(""+Tienda.suavidad3);
					txtNumerohojas.setText(""+Tienda.hojas3);
					txtTamañohojas.setText(""+Tienda.tamaño3);
					txtPrecio.setText(""+Tienda.precio3);
					lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/" + Tienda.modelo3 + ".png")));
					break;
				default:
					txtSuavidad.setText(""+Tienda.suavidad4);
					txtNumerohojas.setText(""+Tienda.hojas4);
					txtTamañohojas.setText(""+Tienda.tamaño4);
					txtPrecio.setText(""+Tienda.precio4);
					lblFoto.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/" + Tienda.modelo4 + ".png")));}			
				}		
		});
		
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Confort", "Secreto", "Carm\u00EDn", "Petalo", "Panda"}));
		cboModelo.setBounds(362, 72, 142, 20);
		getContentPane().add(cboModelo);
		
		txtSuavidad = new JTextField();
		txtSuavidad.addKeyListener(this);
		txtSuavidad.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtSuavidad.setBounds(362, 97, 142, 20);
		getContentPane().add(txtSuavidad);
		txtSuavidad.setColumns(10);
		
		txtNumerohojas = new JTextField();
		txtNumerohojas.addKeyListener(this);
		txtNumerohojas.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtNumerohojas.setBounds(362, 122, 142, 20);
		getContentPane().add(txtNumerohojas);
		txtNumerohojas.setColumns(10);
		
		txtTamañohojas = new JTextField();
		txtTamañohojas.addKeyListener(this);
		txtTamañohojas.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtTamañohojas.setBounds(362, 147, 142, 20);
		getContentPane().add(txtTamañohojas);
		txtTamañohojas.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(this);
		txtPrecio.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPrecio.setBounds(362, 172, 142, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(398, 242, 106, 35);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/save.png")));
		btnGrabar.addActionListener(this);
		btnGrabar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnGrabar.setBounds(255, 242, 106, 35);
		getContentPane().add(btnGrabar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Modificarmodelo.class.getResource("/imagenes/consultar.png")));
		label.setBounds(-16, -34, 700, 413);
		getContentPane().add(label);
		cargarDatosIniciales();}
	
	void cargarDatosIniciales(){
		
		modelo=cboModelo.getSelectedIndex();
		txtSuavidad.setText(""+Tienda.suavidad0);
		txtNumerohojas.setText(""+Tienda.hojas0);
		txtTamañohojas.setText(""+Tienda.tamaño0);
		txtPrecio.setText(""+Tienda.precio0);}
				
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);}
		
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.dispose();
			Tienda Tienda = new Tienda();
			Tienda.setLocationRelativeTo(null);
			Tienda.setVisible(true);}
	
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Ha grabado los datos correctamente"
				+ "",   "Mensaje Informativo",JOptionPane.INFORMATION_MESSAGE);
		//DECLARACION DE VARIABLES
		int categoria;
		//LECTURA DE DATOS
		categoria=cboModelo.getSelectedIndex();
		//PROCESO A MOSTRAR
		switch (categoria){
		case 0:
			Tienda.suavidad0=txtSuavidad.getText();
			Tienda.hojas0=Integer.parseInt(txtNumerohojas.getText());
			Tienda.tamaño0=txtTamañohojas.getText();
			Tienda.precio0=Double.parseDouble(txtPrecio.getText());
			break;
			
		case 1:
			Tienda.suavidad1=txtSuavidad.getText();
			Tienda.hojas1=Integer.parseInt(txtNumerohojas.getText());
			Tienda.tamaño1=txtTamañohojas.getText();
			Tienda.precio1=Double.parseDouble(txtPrecio.getText());
			break;
			
		case 2:
			Tienda.suavidad2=txtSuavidad.getText();
			Tienda.hojas2=Integer.parseInt(txtNumerohojas.getText());
			Tienda.tamaño2=txtTamañohojas.getText();
			Tienda.precio2=Double.parseDouble(txtPrecio.getText());
			break;
			
		case 3:
			Tienda.suavidad3=txtSuavidad.getText();
			Tienda.hojas3=Integer.parseInt(txtNumerohojas.getText());
			Tienda.tamaño3=txtTamañohojas.getText();
			Tienda.precio3=Double.parseDouble(txtPrecio.getText());
			break;
			
		default:
			Tienda.suavidad4=txtSuavidad.getText();
			Tienda.hojas4=Integer.parseInt(txtNumerohojas.getText());
			Tienda.tamaño4=txtTamañohojas.getText();
			Tienda.precio4=Double.parseDouble(txtPrecio.getText());}
	}
	
	public void keyPressed(KeyEvent arg0) {}
	
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtPrecio) {
			keyTypedTxtPrecio(arg0);}
		
		if (arg0.getSource() == txtTamañohojas) {
			keyTypedTxtTamañohojas(arg0);}
		
		if (arg0.getSource() == txtNumerohojas) {
			keyTypedTxtNumerohojas(arg0);}
		
		if (arg0.getSource() == txtSuavidad) {
			keyTypedTxtSuavidad(arg0);}
	}

	protected void keyTypedTxtSuavidad(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
				char cTeclaPresionada=arg0.getKeyChar();
				//da click al boton Ingresar al detectar la tecla ENTER
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnGrabar.doClick();}
	}
	
	protected void keyTypedTxtNumerohojas(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();		
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnGrabar.doClick();}		
	}
	
	protected void keyTypedTxtTamañohojas(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnGrabar.doClick();}
	}
	
	protected void keyTypedTxtPrecio(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnGrabar.doClick();}
	}
}
