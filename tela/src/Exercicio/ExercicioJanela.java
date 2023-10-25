package Exercicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ExercicioJanela {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Formulário");

        janela.setSize(550, 400);

        Color corDeFundo = new Color(176,196,222); // DarkSlateBlue em hexadecimal: #483D8B
        janela.getContentPane().setBackground(corDeFundo);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        
        JLabel lblTitulo = new JLabel("Cadastrar Conta");
        lblTitulo.setBounds(170, 20, 400, 30); // Personalize as coordenadas e o tamanho conforme necessário
        lblTitulo.setForeground(Color.GRAY); // Personalize a cor do texto
        lblTitulo.setFont(lblTitulo.getFont().deriveFont(26.0f)); // Personalize o tamanho da fonte
        janela.add(lblTitulo);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setBounds(100, 70, 100, 25);
        janela.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(150, 70,320, 25);
        janela.add(txtNome);

        JLabel lblgenero = new JLabel("Sexo: ");
        lblgenero.setBounds(100, 105, 90, 30);
        janela.add(lblgenero);

        JRadioButton radioButton = new JRadioButton("Masculino");
        radioButton.setSelected(false);
        radioButton.setBounds(150, 105, 100, 30);
        radioButton.setBackground(corDeFundo);
        janela.add(radioButton);

        JRadioButton radioButton1 = new JRadioButton("Feminino");
        radioButton1.setSelected(false);
        radioButton1.setBounds(250, 105, 100, 30);
        radioButton1.setBackground(corDeFundo);
        janela.add(radioButton1);

        JLabel lblIdade = new JLabel("Idade: ");
        lblIdade.setBounds(370, 105, 90, 30);
        janela.add(lblIdade);

        JSpinner spn = new JSpinner();
        spn.setBounds(420, 105, 60, 25);
        janela.add(spn);

        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(100, 140, 90, 30);
        janela.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(140, 140, 300, 25);
        janela.add(txtEmail);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(100, 180, 160, 20);
        janela.add(lblSenha);

        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(140, 180, 220, 25);
        janela.add(txtSenha);

        JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
        lblConfirmarSenha.setBounds(35, 215, 160, 20);
        janela.add(lblConfirmarSenha);

        JTextField txtConfirmarSenha = new JTextField();
        txtConfirmarSenha.setBounds(140, 215, 220, 25);
        janela.add(txtConfirmarSenha);

        JButton btnInscrever = new JButton("Inscrever");
        btnInscrever.setBounds(220, 280, 100, 35); // Define posição e tamanho do componente
        btnInscrever.setBackground(Color.WHITE);
        janela.add(btnInscrever);

        btnInscrever.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int CadastroPermitido=0;
            	 if (txtNome.getText().equals("")) {
                     JOptionPane.showMessageDialog(janela, "Nome não preenchido");
                     CadastroPermitido=CadastroPermitido+1;
                 }

                if (!radioButton1.isSelected() && !radioButton.isSelected()) {
                    JOptionPane.showMessageDialog(janela, "Sexo não escolhido");
                    CadastroPermitido=CadastroPermitido+1;
                }
                if (txtEmail.getText()==("")) {
                	JOptionPane.showMessageDialog(janela, "Email não informado");
				}

                 if (txtSenha.getText().equals("")) {
                    JOptionPane.showMessageDialog(janela, "Senha não preenchida");
                    CadastroPermitido=CadastroPermitido+1;
                }

                 if (!txtConfirmarSenha.getText().equals(txtSenha.getText())) {
                    JOptionPane.showMessageDialog(janela, "Senhas diferentes");
                    CadastroPermitido=CadastroPermitido+1;
                    
                }
                 if (CadastroPermitido==0)  {
                	JOptionPane.showMessageDialog(janela, "Cadastro Concluído");
            }
            }
        });

        janela.setVisible(true);
    }
}
