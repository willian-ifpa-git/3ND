
package aulajframe01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AulaJframe01 {


    public static void main(String[] args) {
       JFrame janela = new JFrame();
       janela.setLayout(null);
       janela.setBounds(500, 250, 400, 300);
       
       JButton botaoLog =new JButton("Login");
       janela.add(botaoLog);
       botaoLog.setBounds(200, 150, 100, 50);
       
       JLabel labelUsuario = new JLabel("Usuario:");
       JLabel labelSenha = new JLabel("Senha: ");
       labelUsuario.setBounds(150, 70, 60, 30);
       janela.add(labelUsuario);
       labelSenha.setBounds(150, 102, 60, 30);
       janela.add(labelSenha);
       
       JTextField campoUsuario = new JTextField("");
       JPasswordField campoSenha = new JPasswordField("");
       campoUsuario.setBounds(211, 70, 100, 30);
       janela.add(campoUsuario);
       campoSenha.setBounds(211, 102, 70, 30);
       janela.add(campoSenha);
       
       JLabel labelBoasVindas = new JLabel("Faça Seu Login");
       
       labelBoasVindas.setBounds(150, 205, 250, 80);
       janela.add(labelBoasVindas);
       
       JRadioButton botaoRadio01 = new JRadioButton();
       botaoRadio01.setBounds(50, 50, 20, 20);
       janela.add(botaoRadio01);
       
       JLabel exemplo01 = new JLabel("Exemplo01");
       exemplo01.setBounds(65, 45, 200, 50);
       janela.add(exemplo01);
       
            JRadioButton botaoRadio02 = new JRadioButton();
       botaoRadio01.setBounds(80, 90, 20, 20);
       janela.add(botaoRadio02);
       
       JLabel exemplo02 = new JLabel("Exemplo02");
       exemplo01.setBounds(65, 120, 200, 50);
       janela.add(exemplo02);
       
       
       
         botaoLog.addActionListener(
                 new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                        System.out.println("click");
                        String nmUsuario = campoUsuario.getText();
                        labelBoasVindas.setFont(new Font("Arial",Font.BOLD,20));
                        labelBoasVindas.setText("Bem vindo "+nmUsuario);
                        labelBoasVindas.setForeground(Color.orange);
                        
                 }
             }
                 
         );
       
       
       
       
       
       
       
       
       
       
       
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setVisible(true);
    }
    
}
