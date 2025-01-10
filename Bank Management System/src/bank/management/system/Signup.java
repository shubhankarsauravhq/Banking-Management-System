package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    TextField textName, textFathers_name, textEmail, textAddress, textCity, textPIN, textState;
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;

    Random random = new Random();
    long first5 = (random.nextLong() % 90000L) + 10000L;
    String first = " " + Math.abs(first5);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION NUMBER: " + first);
        label1.setBounds(130, 20, 600, 40);
        label1.setFont(new Font("SansSerif", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("SansSerif", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("SansSerif", Font.BOLD, 22));
        label3.setBounds(290, 100, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new TextField();
        textName.setFont(new Font("SansSerif", Font.BOLD, 16));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelFathersName = new JLabel("Father's Name :");
        labelFathersName.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelFathersName.setBounds(100, 240, 200, 30);
        add(labelFathersName);

        textFathers_name = new TextField();
        textFathers_name.setFont(new Font("SansSerif", Font.BOLD, 16));
        textFathers_name.setBounds(300, 240, 400, 30);
        add(textFathers_name);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelGender.setBounds(100, 290, 200, 30);
        add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("SansSerif", Font.BOLD, 18));
        r1.setBounds(300, 290, 100, 30);
        r1.setBackground(new Color(222, 255, 228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("SansSerif", Font.BOLD, 18));
        r2.setBounds(450, 290, 100, 30);
        r2.setBackground(new Color(222, 255, 228));
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setFont(new Font("SansSerif", Font.BOLD, 18));
        r3.setBounds(600, 290, 100, 30);
        r3.setBackground(new Color(222, 255, 228));
        add(r3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("SansSerif", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new TextField();
        textEmail.setFont(new Font("SansSerif", Font.BOLD, 16));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMaritalStatus = new JLabel("Marital Status :");
        labelMaritalStatus.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelMaritalStatus.setBounds(100, 440, 200, 30);
        add(labelMaritalStatus);

        m1 = new JRadioButton("Single");
        m1.setFont(new Font("SansSerif", Font.BOLD, 18));
        m1.setBounds(300, 440, 120, 18);
        m1.setBackground(new Color(222, 255, 228));
        add(m1);

        m2 = new JRadioButton("Married");
        m2.setFont(new Font("SansSerif", Font.BOLD, 18));
        m2.setBounds(440, 440, 120, 18);
        m2.setBackground(new Color(222, 255, 228));
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setFont(new Font("SansSerif", Font.BOLD, 18));
        m3.setBounds(580, 440, 120, 18);
        m3.setBackground(new Color(222, 255, 228));
        add(m3);

        ButtonGroup gp2 = new ButtonGroup();
        gp2.add(m1);
        gp2.add(m2);
        gp2.add(m3);

        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelAddress.setBounds(100, 490, 200, 30);
        add(labelAddress);

        textAddress = new TextField();
        textAddress.setFont(new Font("SansSerif", Font.BOLD, 16));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new TextField();
        textCity.setFont(new Font("SansSerif", Font.BOLD, 16));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPIN = new JLabel("PIN :");
        labelPIN.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelPIN.setBounds(100, 590, 200, 30);
        add(labelPIN);

        textPIN = new TextField();
        textPIN.setFont(new Font("SansSerif", Font.BOLD, 16));
        textPIN.setBounds(300, 590, 400, 30);
        add(textPIN);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("SansSerif", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new TextField();
        textState.setFont(new Font("SansSerif", Font.BOLD, 16));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(new Color(255, 255, 255));
        next.setForeground(new Color(105, 105, 105));
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setUndecorated(true);
        setVisible(true);
        setLocation(360, 40);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Form_no = first;
        String Name = textName.getText();
        String Fathers_name = textFathers_name.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender = null;
        if (r1.isSelected()) {
            Gender = "Male";
        } else if (r2.isSelected()) {
            Gender = "Female";
        }
        String Email = textEmail.getText();
        String Marital_Status = null;
        if (m1.isSelected()) {
            Marital_Status = "Single";
        } else if (m2.isSelected()) {
            Marital_Status = "Married";
        } else if (m3.isSelected()) {
            Marital_Status = "Other";
        }

        String Address = textAddress.getText();
        String City = textCity.getText();
        String PIN = textPIN.getText();
        String State = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Complete the form.");
            } else {
                Con con1 = new Con();
                String q = "INSERT INTO signup VALUES ('" + Form_no + "','" + Name + "','" + Fathers_name + "', '" + DOB + "', '" + Gender + "', '" + Email + "', '" + Marital_Status + "', '" + Address + "', '" + City + "', '" + PIN + "', '" + State + "')";
                con1.statement.executeUpdate(q);
                new Signup2(Form_no);
                setVisible(false);

            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
