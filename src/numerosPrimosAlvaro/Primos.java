package numerosPrimosAlvaro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Primos {
	
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primos window = new Primos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Primos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(52, 67, 30, 20);
		frame.getContentPane().add(spinner);
		textField = new JTextField();
		textField.setBounds(32, 165, 258, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero= (int) spinner.getValue();
				int i,j;
				  boolean esPrimo;
				
				  int rFinal = numero;
				  int numeros;
				  String strMatriz = "";
				  for(i =2;i <= rFinal;i++){//empiezo desde el 2 ya que el 1 y el 0 no son primos
	
				      esPrimo=true;
				       for(j = 2;j < i;j++){
				  
				   
				       if(i % j == 0){
				          esPrimo = false;
				       }
				 
			    	
				       }
				  
				       if(esPrimo){
				    	     String numCadena= j+"";
						       strMatriz+= "\n";
					    	   strMatriz+= numCadena;
					    	   textField.setText( strMatriz );
				    	   String numCadena1=  j+"";
							System.out.println(numCadena1);
				    	   
				    	   
				    	
				       
				    
				    
				      
				        
				       }
					
				}
			}
			
		});
		btnNewButton.setBounds(29, 123, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

		
	}
}
