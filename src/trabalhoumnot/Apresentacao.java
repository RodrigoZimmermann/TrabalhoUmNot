/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoumnot;

/**
 *
 * @author Rodrigo Luís Zimmermann
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Apresentacao {

	private JFrame frame;
	private JTextField txtCaminhoArquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arquivo:");
		lblNewLabel.setBounds(10, 15, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.setBounds(363, 11, 89, 23);
		frame.getContentPane().add(btnAnalisar);
		
		txtCaminhoArquivo = new JTextField();
		txtCaminhoArquivo.setBounds(71, 12, 260, 20);
		frame.getContentPane().add(txtCaminhoArquivo);
		txtCaminhoArquivo.setColumns(10);
		
		
		JTextArea txtAreaMensagem = new JTextArea();
		txtAreaMensagem.setBounds(43, 51, 368, 98);
		frame.getContentPane().add(txtAreaMensagem);
		
		JScrollPane scroll = new JScrollPane(txtAreaMensagem);
		scroll.setBounds(43, 51, 368, 98);
		frame.getContentPane().add(scroll);
		
		JTextArea txtAreaTags = new JTextArea();
		txtAreaTags.setBounds(43, 173, 370, 98);
		frame.getContentPane().add(txtAreaTags); 
		
		
		JScrollPane scrollDois = new JScrollPane(txtAreaTags);
		scrollDois.setBounds(43, 173, 370, 98);
		frame.getContentPane().add(scrollDois);
		
	}
}
