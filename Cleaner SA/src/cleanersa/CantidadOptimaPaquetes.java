package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class CantidadOptimaPaquetes extends JDialog implements ActionListener, KeyListener {
	private JLabel lblCantidadptimaDe;
	private JTextField txtcantidadOptimaPaquetes;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CantidadOptimaPaquetes dialog = new CantidadOptimaPaquetes();
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
	public CantidadOptimaPaquetes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CantidadOptimaPaquetes.class.getResource("/imagenes/favicon.png")));
		getContentPane().setBackground(new Color(0, 0, 139));
		setTitle("Configurar Cantidad \u00D3ptima de Paquetes Vendidos");
		//tamaño
		setBounds(100, 100, 600, 230);
		getContentPane().setLayout(null);
		
		lblCantidadptimaDe = new JLabel("Cantidad \u00D3ptima de Paquetes Vendidos");
		lblCantidadptimaDe.setForeground(new Color(255, 255, 255));
		lblCantidadptimaDe.setFont(new Font("Cambria", Font.BOLD, 13));
		lblCantidadptimaDe.setBounds(24, 34, 250, 20);
		getContentPane().add(lblCantidadptimaDe);
		
		txtcantidadOptimaPaquetes = new JTextField();
		txtcantidadOptimaPaquetes.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtcantidadOptimaPaquetes.addKeyListener(this);
		txtcantidadOptimaPaquetes.setBounds(294, 34, 122, 20);
		getContentPane().add(txtcantidadOptimaPaquetes);
		txtcantidadOptimaPaquetes.setColumns(10);
		
		btnAceptar = new JButton("Grabar");
		btnAceptar.setIcon(new ImageIcon(CantidadOptimaPaquetes.class.getResource("/imagenes/save.png")));
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(438, 29, 112, 31);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Salir");
		btnCancelar.setIcon(new ImageIcon(CantidadOptimaPaquetes.class.getResource("/imagenes/cerrar.png")));
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(438, 74, 112, 31);
		getContentPane().add(btnCancelar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(CantidadOptimaPaquetes.class.getResource("/imagenes/configobsequio.png")));
		label.setBounds(-16, -39, 600, 241);
		getContentPane().add(label);
		cargarDatosIniciales();}
	//AL INICIAR LA GUI NOS MUESTRA LOS DATOS PREVIAMENTES CARGADOS EN ESTE METODO
	void cargarDatosIniciales(){
		txtcantidadOptimaPaquetes.setText(""+Tienda.cantidadOptimaPaquetes);}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);}
		
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);}
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		Tienda.cantidadOptimaPaquetes=Integer.parseInt(txtcantidadOptimaPaquetes.getText());
		JOptionPane.showMessageDialog(null, "Ha grabado los datos correctamente"
				+ "",   "Mensaje Informativo",JOptionPane.INFORMATION_MESSAGE);
				this.dispose();
				Tienda Tienda = new Tienda();
				Tienda.setLocationRelativeTo(null);
				Tienda.setVisible(true);}
	
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		//THIS es para cerrar la ventana actual con la que se esta trabajando
		this.dispose();
		Tienda Tienda = new Tienda();
		Tienda.setLocationRelativeTo(null);
		Tienda.setVisible(true);}
	
	public void keyPressed(KeyEvent arg0) {}
	
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtcantidadOptimaPaquetes) {
			keyTypedTxtcantidadOptimaPaquetes(arg0);}
	}
	
	protected void keyTypedTxtcantidadOptimaPaquetes(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();			
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				char c = arg0.getKeyChar();
				if((c<'0' || c>'9'))arg0.consume();}
	}

