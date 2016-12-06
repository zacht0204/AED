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

public class ConfigurarObsequio extends JDialog implements ActionListener, KeyListener {
	private JLabel lblConfigurarObsequio;
	private JTextField txtcantidadMinimaPaquetes;
	private JLabel lblObsequio;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequio dialog = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConfigurarObsequio.class.getResource("/imagenes/favicon.png")));
		setTitle("Configurar Obsequio");
		getContentPane().setBackground(new Color(255, 228, 225));
		
		setBounds(100, 100, 600, 230);
		getContentPane().setLayout(null);
		
		lblConfigurarObsequio = new JLabel("Cantidad minima de paquetes adquiridos\r\n");
		lblConfigurarObsequio.setForeground(Color.WHITE);
		lblConfigurarObsequio.setFont(new Font("Cambria", Font.BOLD, 13));
		lblConfigurarObsequio.setBounds(10, 28, 262, 22);
		getContentPane().add(lblConfigurarObsequio);
		
		txtcantidadMinimaPaquetes = new JTextField();
		txtcantidadMinimaPaquetes.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtcantidadMinimaPaquetes.addKeyListener(this);
		txtcantidadMinimaPaquetes.setBounds(282, 28, 148, 22);
		getContentPane().add(txtcantidadMinimaPaquetes);
		txtcantidadMinimaPaquetes.setColumns(10);
		
		lblObsequio = new JLabel("Obsequio");
		lblObsequio.setForeground(Color.WHITE);
		lblObsequio.setFont(new Font("Cambria", Font.BOLD, 13));
		lblObsequio.setBounds(10, 56, 262, 22);
		getContentPane().add(lblObsequio);
		
		txtObsequio = new JTextField();
		txtObsequio.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtObsequio.addKeyListener(this);
		txtObsequio.setBounds(282, 56, 148, 22);
		getContentPane().add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnAceptar = new JButton("Grabar");
		btnAceptar.setIcon(new ImageIcon(ConfigurarObsequio.class.getResource("/imagenes/save.png")));
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(461, 28, 101, 33);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Salir");
		btnCancelar.setIcon(new ImageIcon(ConfigurarObsequio.class.getResource("/imagenes/cerrar.png")));
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(461, 72, 99, 33);
		getContentPane().add(btnCancelar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConfigurarObsequio.class.getResource("/imagenes/configobsequio.png")));
		lblNewLabel.setBounds(-16, -37, 600, 229);
		getContentPane().add(lblNewLabel);
		cargarDatosIniciales();}
	
	void cargarDatosIniciales(){
		txtcantidadMinimaPaquetes.setText(""+Tienda.cantidadMinimaPaquetes);
		txtObsequio.setText(""+Tienda.obsequio);}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);}
		
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);}
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		Tienda.cantidadMinimaPaquetes=Integer.parseInt(txtcantidadMinimaPaquetes.getText());
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
		if (arg0.getSource() == txtObsequio) {
			keyTypedTxtObsequio(arg0);}
		
		if (arg0.getSource() == txtcantidadMinimaPaquetes) {
			keyTypedTxtcantidadMinimaPaquetes(arg0);}
	}
	
	protected void keyTypedTxtcantidadMinimaPaquetes(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
				char cTeclaPresionada=arg0.getKeyChar();
				//da click al boton Ingresar al detectar la tecla ENTER
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				char c = arg0.getKeyChar();
				if((c<'0' || c>'9'))arg0.consume();}
	
	protected void keyTypedTxtObsequio(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				char c = arg0.getKeyChar();
				if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))arg0.consume();}
	
}