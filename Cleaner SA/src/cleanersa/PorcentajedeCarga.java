package cleanersa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.AttributeSetUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Dialog.ModalExclusionType;

public class PorcentajedeCarga extends JFrame {
	private Timer t;
	private ActionListener al;	
	private JPanel contentPane;
	private JProgressBar progressBar;
	private JLabel label;
	private JLabel label_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorcentajedeCarga frame = new PorcentajedeCarga();
					//Asignamos un tamaño a la ventana a la hora de correr el programa
					frame.setSize(530, 370);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);}
				catch (Exception e) {
					e.printStackTrace();}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PorcentajedeCarga() {
		setUndecorated(true);
		setResizable(false);
		setAutoRequestFocus(false);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		getContentPane().add(progressBar, BorderLayout.SOUTH);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PorcentajedeCarga.class.getResource("/imagenes/porcentaje.png")));
		getContentPane().add(label_1, BorderLayout.CENTER);
		al = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(progressBar.getValue()<100){
					progressBar.setValue(progressBar.getValue()+3);
				}else{
					t.stop();
					//Termina el progreso y nos muestra la ventana que le designamos
					mostrarVentana();}
			}
		};
		t = new Timer(80,al);
		//Iniciar los componentes
		getComponents();
		//Darle opacidad a nuestra ventana y false para que no aparesca el marco de la ventana
		AWTUtilities.setWindowOpaque(this, false);
		t.start();}
	
	//Para pasar de una ventana a otra creamos este metodo void 
	private void mostrarVentana(){
		Login frame = new Login();
		//Esta linea de codigo sirve para mostrar la GUI al centro de la pantalla
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		this.dispose();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(89, 167, 328, 50);
		contentPane.add(progressBar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(PorcentajedeCarga.class.getResource("/imagenes/consultar.png")));
		label.setBounds(87, 33, 330, 184);
		contentPane.add(label);}
	}
