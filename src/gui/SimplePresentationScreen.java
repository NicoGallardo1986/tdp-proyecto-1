package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(639, 275));
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(contentPane);
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Ubuntu", Font.BOLD, 12));
		tabbedPane.setBounds(5, 5, 430, 209);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 14, 104, 16);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 45, 85, 16);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 79, 57, 16);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 113, 104, 16);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 147, 104, 16);
		tabInformation.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(100, 11, 315, 22);
		tabInformation.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 42, 315, 22);
		tabInformation.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 75, 315, 22);
		tabInformation.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 107, 315, 22);
		tabInformation.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 140, 315, 22);
		tabInformation.add(textField_4);
		contentPane.add(tabbedPane);
		
		textField.setText(Integer.toString(studentData.getId()));
		textField_1.setText(studentData.getFirstName());
		textField_2.setText(studentData.getLastName());
		textField_3.setText(studentData.getMail());
		textField_4.setText(studentData.getGithubURL());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 214, 377, 27);
		contentPane.add(panel_2);
		
		Calendar f = Calendar.getInstance();
		String fecha = Integer.toString(f.get(Calendar.DATE)) + "/" + Integer.toString(f.get(Calendar.MONTH)+1) + "/" + Integer.toString(f.get(Calendar.YEAR));
		//Calendar.h
		String hora = Integer.toString(f.get(Calendar.HOUR_OF_DAY)) + ":" + Integer.toString(f.get(Calendar.MINUTE)) + ":" + Integer.toString(f.get(Calendar.SECOND)); 
		JLabel lblNewLabel_5 = new JLabel("Esta ventana fue generada el " + fecha + " a las: " + hora);
	    lblNewLabel_5.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(122, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    		.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
	    );
		panel_2.setLayout(gl_panel_2);
		
		//Carga de una imagen en un label, ajustadanose al tamañao del label
		//lblNewLabel_6 = new JLabel();
		//lblNewLabel_6.setBounds(468, 27, 100, 100);
		//Image imagen = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())).getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_DEFAULT);
		//lblNewLabel_6.setIcon(new ImageIcon(imagen));
		//contentPane.add(lblNewLabel_6);
		
		//Carga de una imagen en un jPanel con la clase JPanel rediseñada.
		JPanelConFondo panelFoto = new JPanelConFondo(studentData.getPathPhoto());
		panelFoto.setBounds(442, 26, 172, 188);
		contentPane.add(panelFoto);
		
	
	}
}
