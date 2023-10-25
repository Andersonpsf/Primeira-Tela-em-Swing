package tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraJanela {

	public static void main(String[] args) {
		
		// Instanciar a janela que vamos criar
		
		JFrame janela = new JFrame("Janela");
		
		// Definir o tamanho da janela em pixels(largura x altura)
		janela.setSize(400,300);
		
		// Para alterar a cor da janela utilizaremos a função
		//setBackground
		//ContentPane para mudar a cor de fundo e apenas ela
		janela.getContentPane().setBackground(Color.RED);
		
		
		//JLabel
		//JTextField
		//JButton
		//JComboBox
		
		// Define o layout da janela em nulo (layout absuluto
		janela.setLayout(null);
		
		//JLabel
		JLabel labelTexto = new JLabel("Digite o texto:");
		
		// Define tamanho e posição do componente
		labelTexto.setBounds(20,20,90,30);
		janela.add(labelTexto);
		
		//janela de texto
		JTextField txtNome= new JTextField();
		
		txtNome.setBounds(110,20,100,30);
		janela.add(txtNome);
		
		//botão
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(140,220,100,30); //Define posição e tamanho do componente
		btnSalvar.setBackground(Color.WHITE);
		janela.add(btnSalvar); // adiciona a janela
		
		// Define o comportamento do botão quando for clicado
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Botão clicado");
				
			}
		});
		
		// Crie um array para armazenar as opcoes do ComboBox
		
		String[] opcoes = {"Opção 1","Opção 2","Opção 3"};
		
		// COMBOX
		JComboBox<String> comboBox = new JComboBox<>(opcoes);
		comboBox.setBounds(20,75,100,20);
		janela.add(comboBox);
		
		// Defina o comportamento padrão de fechamento da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Tornar a janela vísivel
		janela.setVisible(true);
		
		

	}

}
