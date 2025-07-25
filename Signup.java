package Bank.Management;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Signup extends JFrame {
    Signup(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/boi.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(110,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(650,20,110,100);
        add(image);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() %9000L) + 1000L);
        JLabel formno = new JLabel("Application Form No.:-" + random);
        formno.setFont(new Font("Arial", Font.BOLD,30));
        formno.setBounds(200,35,550,40);
        setLayout(null);
        add(formno);
        JLabel personDetails = new JLabel("page1: personal Details");
        personDetails.setFont(new Font("Arial", Font.BOLD,25));
        personDetails.setBounds(280,90,450,30);
        add(personDetails);
        JLabel name = new JLabel("NAME:-");
        name.setFont(new Font("Arial", Font.BOLD,20));
        name.setBounds(120,150,100,30);
        add(name);
        JTextField nameTextField =new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,15));
        nameTextField.setBounds(250,150,500,30);
        add(nameTextField);
        JLabel gname = new JLabel("GURDIAN NAME:-");
        gname.setFont(new Font("Arial", Font.BOLD,20));
        gname.setBounds(120,190,250,30);
        add(gname);
        JTextField gnameTextField =new JTextField();
        gnameTextField.setFont(new Font("Raleway", Font.BOLD,15));
        gnameTextField.setBounds(300,190,450,30);
        add(gnameTextField);
        JLabel dob = new JLabel("DATE OF BIRTH:-");
        dob.setFont(new Font("Arial", Font.BOLD,20));
        dob.setBounds(120,230,400,30);
        add(dob);
        JLabel gen = new JLabel("GENDER:-");
        gen.setFont(new Font("Arial", Font.BOLD,20));
        gen.setBounds(120,270,100,30);
        add(gen);
        JLabel reg = new JLabel("REGION:-");
        reg.setFont(new Font("Arial", Font.BOLD,20));
        reg.setBounds(120,310,100,30);
        add(reg);
        JLabel cat = new JLabel("CATEGORY:-");
        cat.setFont(new Font("Arial", Font.BOLD,20));
        cat.setBounds(120,350,150,30);
        add(cat);
        JLabel mob = new JLabel("MOBILE NO.:-");
        mob.setFont(new Font("Arial", Font.BOLD,20));
        mob.setBounds(120,390,200,30);
        add(mob);
        JLabel eml = new JLabel("EMAIL NO.:-");
        eml.setFont(new Font("Arial", Font.BOLD,20));
        eml.setBounds(120,430,200,30);
        add(eml);
        JLabel adr = new JLabel("ADDRESS:-");
        adr.setFont(new Font("Arial", Font.BOLD,20));
        adr.setBounds(120,470,100,30);
        add(adr);
        JLabel ct = new JLabel("CITY:-");
        ct.setFont(new Font("Arial", Font.BOLD,20));
        ct.setBounds(120,510,100,30);
        add(ct);
        JLabel dst = new JLabel("DISTRICT:-");
        dst.setFont(new Font("Arial", Font.BOLD,20));
        dst.setBounds(120,550,100,30);
        add(dst);
        JLabel st = new JLabel("STATE:-");
        st.setFont(new Font("Arial", Font.BOLD,20));
        st.setBounds(120,590,100,30);
        add(st);
        JLabel pin = new JLabel("PIN NO:-");
        pin.setFont(new Font("Arial", Font.BOLD,20));
        pin.setBounds(120,630,100,30);
        add(pin);
        setSize(800,750);
        setLocation(300,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
