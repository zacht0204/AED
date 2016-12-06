package cleanersa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public  class Login extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3660406048848482126L;
	private JPanel contentPane;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblClave;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JPasswordField jpassClave;
	private JPanel loginPanel;
	private JMenu mnArchivo;
	private JMenu mnVentas;
	private JLabel lblNewLabel;
	

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login frame = new Login();
			//Esta linea de codigo sirve para mostrar la GUI al centro de la pantalla
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/lock.png")));	
		setTitle("Entrada al Sistema DIGESMA S.A.");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 230);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Cambria", Font.BOLD, 13));
		lblUsuario.setBounds(185, 40, 85, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(this);
		txtUsuario.setForeground(new Color(70, 130, 180));
		txtUsuario.setFont(new Font("Cambria", Font.BOLD, 13));
		txtUsuario.setBackground(new Color(220, 220, 220));
		txtUsuario.setBounds(296, 36, 134, 18);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblClave = new JLabel("CONTRASE\u00D1A:");
		lblClave.setForeground(Color.WHITE);
		lblClave.setFont(new Font("Cambria", Font.BOLD, 13));
		lblClave.setBounds(185, 81, 114, 14);
		contentPane.add(lblClave);
		
		btnIngresar = 	new JButton("INGRESAR");
		btnIngresar.setIcon(new ImageIcon(Login.class.getResource("/imagenes/key_go.png")));
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(173, 115, 133, 41);
		contentPane.add(btnIngresar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setIcon(new ImageIcon(Login.class.getResource("/imagenes/Salida2.png")));
		btnSalir.addActionListener(this);
		btnSalir.setBounds(316, 114, 114, 42);
		contentPane.add(btnSalir);
		
		jpassClave = new JPasswordField();
		jpassClave.setFont(new Font("Cambria", Font.BOLD, 13));
		jpassClave.addKeyListener(this);
		jpassClave.setForeground(new Color(70, 130, 180));
		jpassClave.setBackground(new Color(220, 220, 220));
		jpassClave.setBounds(296, 77, 134, 18);
		contentPane.add(jpassClave);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/login.png")));
		lblNewLabel.setBounds(0, -28, 494, 239);
		contentPane.add(lblNewLabel);}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);}
		
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnNewButton(arg0);}
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
		//Declaracion de las variables para usuario y contraseña
				String contraseña=jpassClave.getText();
				String usuario=txtUsuario.getText();

		//USUARIO Y CONTRASEÑA DEL ADMINISTRADOR
				if (usuario.equals("Administrador") && contraseña.equals("admin")){
				           		this.dispose();
		
				           		//MENSAJE DE BIENVENIDA 
				           		JOptionPane.showMessageDialog(null, "Bienvenido\n"
				           		+ "Acceso correcto al sistema Digesma S.A.",   "Mensaje de bienvenida",JOptionPane.INFORMATION_MESSAGE);
				           		
				           		//UNA VEZ SE NOS MUESTRA EL MENSAJE INCIDAMOS QUE APARESCA LA VENTANA TIENDA
				                    Tienda Tienda = new Tienda();
				                    Tienda.setLocationRelativeTo(null);
				                    Tienda.setVisible(true);}
		
				else if(usuario.equals("Vendedor1") && contraseña.equals("vendedor1") 	|| 
						usuario.equals("Vendedor2") && contraseña.equals("vendedor2")){
								this.dispose();
								JOptionPane.showMessageDialog(null, "Bienvenido\n"
								+ "Ha ingresado al panel para ventas",   "Mensaje de bienvenida",JOptionPane.INFORMATION_MESSAGE);
				 
									Tvendedor frame = new Tvendedor();
									frame.setLocationRelativeTo(null);
									frame.setVisible(true);}
				
			    else if(usuario.equals("") && contraseña.equals("")){				
								JOptionPane.showMessageDialog(this,"Ingrese Usuario y Contraseña","Error",JOptionPane.ERROR_MESSAGE);
									txtUsuario.requestFocus();}
				
			    else if (usuario.equals("") ){
								JOptionPane.showMessageDialog(this,"Ingrese Usuario","Error",JOptionPane.ERROR_MESSAGE);
									jpassClave.requestFocus();}
				
			    else if (contraseña.equals("")){
								JOptionPane.showMessageDialog(this,"Ingrese Contraseña","Error",JOptionPane.ERROR_MESSAGE);
									jpassClave.requestFocus();}
		      
				else if (!usuario.equals("")  && !usuario.equals("Administrador") 
						&& !usuario.equals("Vendedor1") && !usuario.equals("Vendedor2") 
						&& !contraseña.equals("")  && !contraseña.equals("admin") 
						&& !contraseña.equals("vendedor1") && !contraseña.equals("vendedor2")){
											
								JOptionPane.showMessageDialog(this,"Usuario y Contraseña Incorrecto","Error",JOptionPane.ERROR_MESSAGE);
									txtUsuario.setText("");
									jpassClave.setText("");
									txtUsuario.requestFocus();}
				
				else if (!usuario.equals("Administrador") && !usuario.equals("Vendedor1") &&  !usuario.equals("Vendedor2") 
						&& !usuario.equals("")){
							   	JOptionPane.showMessageDialog(this,"Usuario Incorrecto","Error",JOptionPane.ERROR_MESSAGE);
							   		txtUsuario.requestFocus();}
				
				else if (contraseña.equals("") && !contraseña.equals("vendedor1") && !contraseña.equals("vendedor2")	  
						 && !contraseña.equals("admin")){
							JOptionPane.showMessageDialog(this,"Contraseña incorrecta","Error",JOptionPane.ERROR_MESSAGE);
								jpassClave.requestFocus();}
				
				else if (usuario.equals("Administrador") && !contraseña.equals("admin") && !contraseña.equals("")){
							JOptionPane.showMessageDialog(this,"Contraseña Incorrecta","Error",JOptionPane.ERROR_MESSAGE);
								jpassClave.setText("");
								jpassClave.requestFocus();}
				
				else if (usuario.equals("Vendedor1") && !contraseña.equals("vendedor1") && !contraseña.equals("")){	
							JOptionPane.showMessageDialog(this,"Contraseña Incorrecta","Error",JOptionPane.ERROR_MESSAGE);
								jpassClave.setText("");
								jpassClave.requestFocus();}
		      else if (usuario.equals("Vendedor2") && !contraseña.equals("vendedor2") && !contraseña.equals("")){
		    	  
							JOptionPane.showMessageDialog(this,"Contraseña Incorrecta","Error",JOptionPane.ERROR_MESSAGE);
								jpassClave.setText("");
								jpassClave.requestFocus();}
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		//THIS es para cerrar la ventana actual con la que se esta trabajando
		this.dispose();}
	
	public void keyPressed(KeyEvent arg0) {}
	
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == jpassClave) {
			keyTypedJpassClave(arg0);}
		
		if (arg0.getSource() == txtUsuario) {
			keyTypedTxtUsuario(arg0);}
		
	}
	
	protected void keyTypedTxtUsuario(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
		char cTeclaPresionada=arg0.getKeyChar();
		//da click al boton Ingresar al detectar la tecla ENTER
		if(cTeclaPresionada==KeyEvent.VK_ENTER){
			btnIngresar.doClick();}
		char c = arg0.getKeyChar();
		if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))arg0.consume();}
	
	protected void keyTypedJpassClave(KeyEvent arg0) {
		//Se asegura de capturar la tecla enter y descarta todas las demas
				char cTeclaPresionada=arg0.getKeyChar();
				//da click al boton Ingresar al detectar la tecla ENTER
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnIngresar.doClick();}
	}
	}	