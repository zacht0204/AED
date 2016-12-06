package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import java.awt.Toolkit;

public class Consultarmodelo extends JDialog implements ActionListener, ItemListener {
	private JLabel lblModelo;
	private JLabel lblSuavidad;
	private JLabel lblNumeroDeHojas;
	private JLabel lblTamaoDeHoja;
	private JLabel lblPrecio;
	private JComboBox cboModelo;
	private JTextField txtSuavidad;
	private JTextField txtNumeroHojas;
	private JTextField txtTamañoHojas;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	int categoria;
	private JLabel lblFoto;
	private JLabel lblNewLabel;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultarmodelo dialog = new Consultarmodelo();
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
	public Consultarmodelo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Consultarmodelo.class.getResource("/imagenes/favicon.png")));
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		setTitle("Consultar  Modelo");
		getContentPane().setBackground(new Color(255, 228, 225));
		//TAMAÑO GUI
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(255, 255, 255));
		lblModelo.setFont(new Font("Cambria", Font.BOLD, 13));
		lblModelo.setBounds(192, 60, 191, 15);
		getContentPane().add(lblModelo);
		
		lblSuavidad = new JLabel("Suavidad");
		lblSuavidad.setForeground(new Color(255, 255, 255));
		lblSuavidad.setFont(new Font("Cambria", Font.BOLD, 13));
		lblSuavidad.setBounds(192, 86, 191, 14);
		getContentPane().add(lblSuavidad);
		
		lblNumeroDeHojas = new JLabel("N\u00FAmero de hojas por rollo");
		lblNumeroDeHojas.setForeground(new Color(255, 255, 255));
		lblNumeroDeHojas.setFont(new Font("Cambria", Font.BOLD, 13));
		lblNumeroDeHojas.setBounds(192, 111, 191, 18);
		getContentPane().add(lblNumeroDeHojas);
		
		lblTamaoDeHoja = new JLabel("Tama\u00F1o de hoja");
		lblTamaoDeHoja.setForeground(new Color(255, 255, 255));
		lblTamaoDeHoja.setFont(new Font("Cambria", Font.BOLD, 13));
		lblTamaoDeHoja.setBounds(192, 136, 191, 14);
		getContentPane().add(lblTamaoDeHoja);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setForeground(new Color(255, 255, 255));
		lblPrecio.setFont(new Font("Cambria", Font.BOLD, 13));
		lblPrecio.setBounds(192, 161, 191, 14);
		getContentPane().add(lblPrecio);
		
		cboModelo = new JComboBox();
		cboModelo.addItemListener(this);
		cboModelo.addActionListener(this);
		cboModelo.setFont(new Font("Cambria", Font.PLAIN, 13));
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Confort", "Secreto", "Carm\u00EDn", "P\u00E9talo", "Panda"}));
		cboModelo.setBounds(377, 60, 122, 20);
		getContentPane().add(cboModelo);
		
		txtSuavidad = new JTextField();
		txtSuavidad.setEditable(false);
		txtSuavidad.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtSuavidad.setBounds(377, 85, 122, 20);
		getContentPane().add(txtSuavidad);
		txtSuavidad.setColumns(10);
		
		txtNumeroHojas = new JTextField();
		txtNumeroHojas.setEditable(false);
		txtNumeroHojas.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtNumeroHojas.setBounds(377, 110, 122, 20);
		getContentPane().add(txtNumeroHojas);
		txtNumeroHojas.setColumns(10);
		
		txtTamañoHojas = new JTextField();
		txtTamañoHojas.setEditable(false);
		txtTamañoHojas.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtTamañoHojas.setBounds(377, 135, 122, 20);
		getContentPane().add(txtTamañoHojas);
		txtTamañoHojas.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setToolTipText("");
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtPrecio.setBounds(377, 162, 122, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(311, 234, 109, 41);
		getContentPane().add(btnCerrar);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/confort.png")));
		lblFoto.setBounds(517, 49, 157, 174);
		getContentPane().add(lblFoto);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/consultar.png")));
		lblNewLabel.setBounds(-11, -32, 711, 394);
		getContentPane().add(lblNewLabel);
		cargarDatosIniciales();}
	void cargarDatosIniciales(){
		
		categoria=cboModelo.getSelectedIndex();
		txtSuavidad.setText(""+Tienda.suavidad0);
		txtNumeroHojas.setText(""+Tienda.hojas0);
		txtTamañoHojas.setText(""+Tienda.tamaño0);
		txtPrecio.setText(""+Tienda.precio0);
		lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo0 + ".png")));}
			
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.dispose();
		Tienda Tienda = new Tienda();
		Tienda.setLocationRelativeTo(null);
		Tienda.setVisible(true);}

	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboModelo) {
			itemStateChangedCboModelo(arg0);}
	}
	
	protected void itemStateChangedCboModelo(ItemEvent arg0) {
		//DECLARACION DE LA VARIABLE
		int categoria;
		//INGRESO DE DATOS
		categoria=cboModelo.getSelectedIndex();
		//PROCESO A MOSTRAR 
		switch (categoria){
		case 0:
			txtSuavidad.setText(""+Tienda.suavidad0);
			txtNumeroHojas.setText(""+Tienda.hojas0);
			txtTamañoHojas.setText(""+Tienda.tamaño0);
			txtPrecio.setText(""+Tienda.precio0);
			lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo0 + ".png")));
			break;
		case 1:
			txtSuavidad.setText(""+Tienda.suavidad1);
			txtNumeroHojas.setText(""+Tienda.hojas1);
			txtTamañoHojas.setText(""+Tienda.tamaño1);
			txtPrecio.setText(""+Tienda.precio1);
			lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo1 + ".png")));
			break;
		case 2:
			txtSuavidad.setText(""+Tienda.suavidad2);
			txtNumeroHojas.setText(""+Tienda.hojas2);
			txtTamañoHojas.setText(""+Tienda.tamaño2);
			txtPrecio.setText(""+Tienda.precio2);
			lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo2 + ".png")));
			break;
		case 3:
			txtSuavidad.setText(""+Tienda.suavidad3);
			txtNumeroHojas.setText(""+Tienda.hojas3);
			txtTamañoHojas.setText(""+Tienda.tamaño3);
			txtPrecio.setText(""+Tienda.precio3);
			lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo3 + ".png")));
			break;
		default:
			txtSuavidad.setText(""+Tienda.suavidad4);
			txtNumeroHojas.setText(""+Tienda.hojas4);
			txtTamañoHojas.setText(""+Tienda.tamaño4);
			txtPrecio.setText(""+Tienda.precio4);
			lblFoto.setIcon(new ImageIcon(Consultarmodelo.class.getResource("/imagenes/" + Tienda.modelo4 + ".png")));}
	}
}