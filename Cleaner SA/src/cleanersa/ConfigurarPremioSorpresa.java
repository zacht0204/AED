package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class ConfigurarPremioSorpresa extends JDialog implements ActionListener, KeyListener {
	private JLabel lblNmeroDeClientees;
	private JTextField txtnumeroClienteSorpresa;
	private JLabel lblPremioSorpresa;
	private JTextField txtpremioSorpresa;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarPremioSorpresa dialog = new ConfigurarPremioSorpresa();
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
	public ConfigurarPremioSorpresa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConfigurarPremioSorpresa.class.getResource("/imagenes/favicon.png")));
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("Configurar Premio Sorpresa");
		//tamaño
		setBounds(100, 100, 600, 230);
		getContentPane().setLayout(null);
		
		lblNmeroDeClientees = new JLabel("N\u00FAmero de cliente");
		lblNmeroDeClientees.setForeground(Color.WHITE);
		lblNmeroDeClientees.setFont(new Font("Cambria", Font.BOLD, 13));
		lblNmeroDeClientees.setBounds(157, 35, 130, 24);
		getContentPane().add(lblNmeroDeClientees);
		
		txtnumeroClienteSorpresa = new JTextField();
		txtnumeroClienteSorpresa.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtnumeroClienteSorpresa.addKeyListener(this);
		txtnumeroClienteSorpresa.setBounds(286, 35, 130, 24);
		getContentPane().add(txtnumeroClienteSorpresa);
		txtnumeroClienteSorpresa.setColumns(10);
		
		lblPremioSorpresa = new JLabel("Premio Sorpresa");
		lblPremioSorpresa.setForeground(Color.WHITE);
		lblPremioSorpresa.setFont(new Font("Cambria", Font.BOLD, 13));
		lblPremioSorpresa.setBounds(157, 65, 117, 24);
		getContentPane().add(lblPremioSorpresa);
		
		txtpremioSorpresa = new JTextField();
		txtpremioSorpresa.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtpremioSorpresa.addKeyListener(this);
		txtpremioSorpresa.setColumns(10);
		txtpremioSorpresa.setBounds(286, 65, 130, 24);
		getContentPane().add(txtpremioSorpresa);
		
		btnAceptar = new JButton("Grabar");
		btnAceptar.setIcon(new ImageIcon(ConfigurarPremioSorpresa.class.getResource("/imagenes/save.png")));
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(460, 27, 101, 33);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Salir");
		btnCancelar.setIcon(new ImageIcon(ConfigurarPremioSorpresa.class.getResource("/imagenes/cerrar.png")));
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(460, 71, 101, 33);
		getContentPane().add(btnCancelar);
		lblNewLabel.setBounds(0, -28, 117, 47);
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setIcon(new ImageIcon(ConfigurarPremioSorpresa.class.getResource("/imagenes/configobsequio.png")));
		lblNewLabel_1.setBounds(-16, -39, 600, 231);
		getContentPane().add(lblNewLabel_1);
		cargarDatosIniciales();}
	
	void cargarDatosIniciales(){
	txtnumeroClienteSorpresa.setText(""+Tienda.numeroClienteSorpresa);
	txtpremioSorpresa.setText(""+Tienda.premioSorpresa);}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);}
		
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnNewButton(arg0);}
	}
	
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		this.dispose();
		Tienda Tienda = new Tienda();
		Tienda.setLocationRelativeTo(null);
		Tienda.setVisible(true);}
	
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Ha grabado los datos correctamente"
				+ "",   "Mensaje Informativo",JOptionPane.INFORMATION_MESSAGE);
							this.dispose();
								Tienda Tienda = new Tienda();
								Tienda.setLocationRelativeTo(null);
								Tienda.setVisible(true);}
	
	public void keyPressed(KeyEvent arg0) {}
	
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {
		
		if (arg0.getSource() == txtpremioSorpresa) {
			keyTypedTxtpremioSorpresa(arg0);}
		
		if (arg0.getSource() == txtnumeroClienteSorpresa) {
			keyTypedTxtnumeroClienteSorpresa(arg0);}
		}
	
	protected void keyTypedTxtnumeroClienteSorpresa(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
				char cTeclaPresionada=arg0.getKeyChar();
				//da click al boton Ingresar al detectar la tecla ENTER
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				char c = arg0.getKeyChar();
				if((c<'0' || c>'9'))arg0.consume();}
	
	
	protected void keyTypedTxtpremioSorpresa(KeyEvent arg0) {
		
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnAceptar.doClick();}
				char c = arg0.getKeyChar();
				if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))arg0.consume();}
	
}
