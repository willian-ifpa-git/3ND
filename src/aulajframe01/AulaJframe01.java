
package aulajframe01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AulaJframe01 {


    public static void main(String[] args) {
       JFrame janela = new JFrame();
       janela.setLayout(null);
       janela.setBounds(500, 250, 500, 300);
       
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
       campoSenha.setBounds(211, 102, 100, 30);
       janela.add(campoSenha);
       
       
       
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setVisible(true);
    }
    
}
