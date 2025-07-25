package  Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    JLabel label1, labelx, labely;
    JTextField textFieldx;
    JPasswordField passwordFieldy;
    JButton buttona,buttonb,buttonc;
    Login(){
      super("Bank Of India");
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/govt.jpeg"));
      Image i2 = i1.getImage().getScaledInstance(110,100, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(600,20,110,100);
      add(image);
      label1 = new JLabel("WELCOME TO BOI ATM");
      label1.setForeground(Color.GREEN);
      label1.setFont(new Font("AvantGrade",Font.BOLD,28));
      label1.setBounds(230,110,450,40);
      add(label1);
      labelx = new JLabel("VALUABLE CARD NO:-");
        labelx.setForeground(Color.magenta);
        labelx.setFont(new Font("ALGERIAN",Font.BOLD,18));
        labelx.setBounds(130,170,350,20);
        add(labelx);
        textFieldx = new JTextField(17);
        textFieldx.setBounds(315,170,220,25);
        textFieldx.setFont(new Font("ALGERIAN",Font.BOLD,18));
        add(textFieldx);
        labely = new JLabel("PIN NO:-");
        labely.setForeground(Color.magenta);
        labely.setFont(new Font("ALGERIAN",Font.BOLD,18));
        labely.setBounds(130,230,350,20);
        add(labely);
        passwordFieldy = new JPasswordField(15);
        passwordFieldy.setBounds(315,230,220,15);
        passwordFieldy.setFont(new Font("ALGERIAN",Font.BOLD,18));
        add(passwordFieldy);
        buttona= new JButton("ENTER");
        buttona.setForeground(Color.YELLOW);
        buttona.setFont(new Font("ALGERIAN",Font.BOLD,15));
        buttona.setForeground(Color.DARK_GRAY);
        buttona.setBounds(250,250,110,25);
        buttona.addActionListener(this);
        add(buttona);
        buttonb= new JButton("CLEAR");
        buttonb.setForeground(Color.YELLOW);
        buttonb.setFont(new Font("ALGERIAN",Font.BOLD,15));
        buttonb.setForeground(Color.DARK_GRAY);
        buttonb.setBounds(350,250,110,25);
        buttonb.addActionListener(this);
        add(buttonb);
        buttonc= new JButton("SIGN UP");
        buttonc.setForeground(Color.YELLOW);
        buttonc.setFont(new Font("ALGERIAN",Font.BOLD,15));
        buttonc.setForeground(Color.DARK_GRAY);
        buttonc.setBounds(250,310,210,25);
        buttonc.addActionListener(this);
        add(buttonc);
        ImageIcon ij1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpeg"));
        Image ij2 = ij1.getImage().getScaledInstance(720,420, Image.SCALE_DEFAULT);
        ImageIcon ij3 = new ImageIcon(ij2);
        JLabel ijmage = new JLabel(ij3);
        ijmage.setBounds(0,0,720,420);
        add(ijmage);
      setLayout(null);
       setSize(750,450);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == buttona) {
            } else if (e.getSource() == buttonb) {
                textFieldx.setText("Re-Write Again");
                passwordFieldy.setText("");
            } else if (e.getSource() == buttonc) {
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
