package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class TGenerarReportes extends JDialog implements ActionListener, ItemListener {
	private JLabel lblTipoDeReporte;
	private JComboBox cboTipo;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	public double promedio=(Tienda.precio0+Tienda.precio1+Tienda.precio2+Tienda.precio3+Tienda.precio4)/5;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TGenerarReportes dialog = new TGenerarReportes();
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
	public TGenerarReportes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TGenerarReportes.class.getResource("/imagenes/favicon.png")));
		setTitle("                                                                                      GENERAR REPORTE");
		getContentPane().setBackground(new Color(255, 228, 225));
		//tamaño de la gui
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de Reporte");
		lblTipoDeReporte.setForeground(new Color(255, 255, 255));
		lblTipoDeReporte.setFont(new Font("Cambria", Font.BOLD, 13));
		lblTipoDeReporte.setBounds(200, 19, 99, 25);
		getContentPane().add(lblTipoDeReporte);
		
		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Cambria", Font.PLAIN, 13));
		cboTipo.addItemListener(this);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Modelos con venta \u00F3ptima", "Precios superiores al precio modelo", "Precios Inferiores al precio modelo", "Promedio menor y mayor"}));
		cboTipo.setBounds(309, 21, 239, 20);
		getContentPane().add(cboTipo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(TGenerarReportes.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(558, 15, 116, 33);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(214, 55, 460, 237);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtS.setForeground(Color.WHITE);
		txtS.setBackground(new Color(70, 130, 180));
		scrollPane.setViewportView(txtS);
		lblNewLabel.setIcon(new ImageIcon(TGenerarReportes.class.getResource("/imagenes/GENERAR.png")));
		lblNewLabel.setBounds(-11, -29, 695, 391);
		getContentPane().add(lblNewLabel);
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		//THIS es para cerrar la ventana actual con la que se esta trabajando
		this.dispose();
		Tvendedor Tienda = new Tvendedor();
		Tienda.setLocationRelativeTo(null);
		Tienda.setVisible(true);}
	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboTipo) {
			itemStateChangedCboReporte(arg0);
		}
	}
	protected void itemStateChangedCboReporte(ItemEvent arg0) {
		//DECLARACION DE VARIABLE Y LECTURA DE LA MISMA 
		int tipo=cboTipo.getSelectedIndex();
		limpiar();
		
		//DENTRO DEL SWITCH INIDACMOS QUE IMPRIMA LO SOLICITADO
		switch(tipo){
		case 0:  reporte1();
				break;
		case 1:	imprimir("PAPEL HIGENICO CON VENTA OPTIMA \n");
			if(Tienda.cantpaq0>=Tienda.cantidadOptimaPaquetes){
				imprimir("Tipo\t\t:"+Tienda.modelo0);
				imprimir("Cantidad de Paquetes Vendidos\t:"+Tienda.cantpaq0+"\n");}
		
			if(Tienda.cantpaq1>=Tienda.cantidadOptimaPaquetes){
				imprimir("Tipo\t\t:"+Tienda.modelo1);
				imprimir("Cantidad de Paquetes Vendidoss\t:"+Tienda.cantpaq1+"\n");}
		
			if(Tienda.cantpaq2>=Tienda.cantidadOptimaPaquetes){
				imprimir("Tipo\t\t:"+Tienda.modelo2);
				imprimir("Cantidad de Paquetes Vendidos\t:"+Tienda.cantpaq2+"\n");}
		
			if(Tienda.cantpaq3>=Tienda.cantidadOptimaPaquetes){
				imprimir("Tipo\t\t:"+Tienda.modelo3);
				imprimir("Cantidad de Paquetes Vendidos\t:"+Tienda.cantpaq3+"\n");}
		
			if(Tienda.cantpaq4>=Tienda.cantidadOptimaPaquetes){
				imprimir("Tipo\t\t:"+Tienda.modelo4);
				imprimir("Cantidad de Paquetes Vendidos\t:"+Tienda.cantpaq4+"\n");}
				break;
		
		case 2: imprimir("MODELOS CON PRECIOS SUPERIORES AL PRECIO PROMEDIO");
		
			if(Tienda.precio0>promedio)
				imprimir(Tienda.modelo0);
			if(Tienda.precio1>promedio)
				imprimir(Tienda.modelo1);
			if(Tienda.precio2>promedio)
				imprimir(Tienda.modelo2);
			if(Tienda.precio3>promedio)
				imprimir(Tienda.modelo3);
			if(Tienda.precio4>promedio)
				imprimir(Tienda.modelo4);
	   	
				imprimir("Precio promedio:\t"+promedio);
				break;
		case 3: imprimir("MODELOS CON PRECIOS INFERIORES AL PRECIO PROMEDIO");

		   if(Tienda.precio0<promedio)
			    imprimir(Tienda.modelo0);
		   if(Tienda.precio1<promedio)
		   		imprimir(Tienda.modelo1);
		   if(Tienda.precio2<promedio)
		   		imprimir(Tienda.modelo2);
		   if(Tienda.precio3<promedio)
		   		imprimir(Tienda.modelo3);
		   if(Tienda.precio4<promedio)
		   		imprimir(Tienda.modelo4);
   	
		   		imprimir("Precio promedio:\t"+promedio);
		   		break;

		default:imprimir("PRECIOS PROMEDIO, MENOR Y MAYOR");
		
		//HALLAR MENOR PRECIO 
			double menor=Tienda.precio0;
			if(Tienda.precio1<menor)
				menor = Tienda.precio1;
			if(Tienda.precio2<menor)
				menor = Tienda.precio2;
			if(Tienda.precio3<menor)
				menor = Tienda.precio3;
			if(Tienda.precio4<menor)
				menor = Tienda.precio4;
		
		//HALLAR MAYOR PRECIO
			double mayor=Tienda.precio0;
			if(Tienda.precio1>mayor)
				mayor = Tienda.precio1;
			if(Tienda.precio2>mayor)
				mayor = Tienda.precio2;
			if(Tienda.precio3>mayor)
				mayor = Tienda.precio3;
			if(Tienda.precio4>mayor)
				mayor = Tienda.precio4;
		
				imprimir("Precio promedio\t:"+promedio);
				imprimir("Precio menor\t\t:"+menor);
				imprimir("Precio mayor\t\t:"+mayor);}
		}
		
		//MOTODO PARA EL PRIMER REPORTE GENERADO 
		void reporte1(){
				imprimir("VENTAS POR PAPEL HIGIENICO \n");
				//VENTAS PARA EL PRIMER MODELO
				imprimir("Tipo \t\t\t:"+Tienda.modelo0);
				imprimir("Cantidad de ventas \t\t:"+Tienda.cantV0);
				imprimir("Cantidad total de cajas vendidas \t:"+Tienda.cantpaq0);
				imprimir("Importe total acumulado \t\t:"+Tienda.totalIP0+"\n"); 
	
				//VENTAS PARA EL SEGUNDO MODELO
				imprimir("Tipo \t\t\t:"+Tienda.modelo1);
				imprimir("Cantidad de ventas \t\t:"+Tienda.cantV1);
				imprimir("Cantidad total de cajas vendidas \t:"+Tienda.cantpaq1);
				imprimir("Importe total acumulado \t\t:"+Tienda.totalIP1+"\n");
	
				//VENTAS PARA EL TERCER MODELO
				imprimir("Tipo \t\t\t:"+Tienda.modelo2);
				imprimir("Cantidad de ventas \t\t:"+Tienda.cantV2);
				imprimir("Cantidad total de cajas vendidas \t:"+Tienda.cantpaq2);
				imprimir("Importe total acumulado \t\t:"+Tienda.totalIP2+"\n");
	
				//VENTAS PARA EL CUARTO MODELO
				imprimir("Tipo \t\t\t:"+Tienda.modelo3);
				imprimir("Cantidad de ventas \t\t:"+Tienda.cantV3);
				imprimir("Cantidad total de cajas vendidas \t:"+Tienda.cantpaq3);
				imprimir("Importe total acumulado \t\t:"+Tienda.totalIP3+"\n");
	
				//VENTAS PARA EL QUINTO MODELO
				imprimir("Tipo \t\t\t:"+Tienda.modelo4);
				imprimir("Cantidad de ventas \t\t:"+Tienda.cantV4);
				imprimir("Cantidad total de cajas vendidas \t:"+Tienda.cantpaq4);
				imprimir("Importe total acumulado \t\t:"+Tienda.totalIP4+"\n");
				imprimir("Importe total general acumulado \t:"+Tienda.cantTotalIP+"\n");}
			
		void limpiar(){
			txtS.setText("");}
		
		void imprimir(String cad){
			txtS.append(cad+"\n");}
		
			
	}