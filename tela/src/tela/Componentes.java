package tela;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class Componentes {
	
	public static void main(String[] args) {
		
		// Criando a janela
		JFrame janela = new JFrame("Exemplo de Comoponente");
		
		// Definir o tamanho
		janela.setSize(600,500);
		
		// Colocar cor
		janela.getContentPane().setBackground(Color.GRAY);
		
		// Fechar a tabela de fato fecha a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Garante q tudo esteja na coordenada correta(posicao absoluta)
		janela.setLayout(null);
		
		// JLabel - Texto na janela
		
		JLabel lblTextoCheck = new JLabel("Selecionado?");
		// setBounds(coordenada x,coordenada y, largura, comprimento)
		lblTextoCheck.setBounds(10,10,100,25);
		janela.add(lblTextoCheck);
		
		// RADIO BUTTON Botão de seleção
		JRadioButton radioButton = new JRadioButton("Sim");
		radioButton.setSelected(false);
		radioButton.setBounds(100, 10, 100, 25);
		janela.add(radioButton);
		
		// CheckBox Botão de Seleção
		JCheckBox cnkBox = new JCheckBox("Caixa de Seleção 1");
		cnkBox.setBounds(150, 40, 120, 25);
		janela.add(cnkBox);
		
		JLabel lblRadio = new JLabel("Caixa de Seleção");
		lblRadio.setBounds(10, 40, 100, 25);
		janela.add(lblRadio);
		
		// JSLIDER Usar som
		JSlider sld = new JSlider(JSlider.HORIZONTAL,0,100,50);
		sld.setBounds(10, 70, 100, 25);
		janela.add(sld);
		
		// JSPINNER
		JSpinner spn = new JSpinner();
		spn.setBounds(10, 100, 200, 25);
		janela.add(spn);
				
		
		// Janela visível
		janela.setVisible(true);
		
	}

}
