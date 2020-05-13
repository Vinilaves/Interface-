import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;


public class Texto extends JFrame implements ActionListener{
   private JTextField txtTexto;
   private JLabel lblTexto;
   private JButton btnMostrar, btnLimpar, btnSair;

 
   
   public Texto (){
      super ("Texto");
      JPanel painelDadosEntrada = new JPanel ( new GridLayout (4, 2));
      JPanel painelEntrada = new JPanel (new FlowLayout());
      txtTexto = new JTextField (33);
      lblTexto = new JLabel (" Texto: ");
      painelDadosEntrada.add (lblTexto);
      painelDadosEntrada.add (txtTexto);
      painelEntrada.add(painelDadosEntrada);
      
      JPanel painelDadosSaida = new JPanel (new GridLayout (4, 2));
      JPanel painelSaida = new JPanel (new FlowLayout ());
      
      JPanel painelBotoes = new JPanel (new FlowLayout());
      btnMostrar = new JButton ("Mostrar");
      btnLimpar = new JButton ( "Limpar");
      btnSair = new JButton (" Sair ");
      
      btnMostrar.addActionListener(this);
      btnLimpar.addActionListener(this);
      btnSair.addActionListener(this);
      
      painelBotoes.add(btnMostrar);
      painelBotoes.add(btnLimpar);
      painelBotoes.add(btnSair);
      
      Container painelDeConteudo = getContentPane();
      
      painelDeConteudo.setLayout (new BorderLayout());
      
      painelDeConteudo.add(painelEntrada, BorderLayout.WEST);
      painelDeConteudo.add(painelSaida, BorderLayout.EAST);
      painelDeConteudo.add(painelBotoes, BorderLayout.SOUTH);
      
      setSize (400, 190);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
      
      
      
   }
     public void actionPerformed (ActionEvent e){
      if(e.getSource() == btnMostrar){
         String escrever = txtTexto.getText();
         JOptionPane.showMessageDialog (null, escrever, "Mostrando", JOptionPane.PLAIN_MESSAGE);
      }
      else if (e.getSource() == btnLimpar){
        txtTexto.setText("");
         
      }
      else if (e.getSource() == btnSair){
         System.exit(0);
      }
   }
   public static void main (String [] args){
      SwingUtilities.invokeLater (new Runnable(){
         public void run (){
            new Texto();
         }
      
      });
    }

}
