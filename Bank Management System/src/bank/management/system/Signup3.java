package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;
    String form_number;

    Signup3(String form_number) {
        super("Account Details");

        this.form_number = form_number;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);


        JLabel l1 = new JLabel("Page 3 : ");
        l1.setFont(new Font("SansSerif", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("SansSerif", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("SansSerif", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("SansSerif", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 30);
        r1.setBackground(new Color(215, 252, 252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("SansSerif", Font.BOLD, 16));
        r2.setBounds(350, 180, 300, 30);
        r2.setBackground(new Color(215, 252, 252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("SansSerif", Font.BOLD, 16));
        r3.setBounds(100, 220, 250, 30);
        r3.setBackground(new Color(215, 252, 252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("SansSerif", Font.BOLD, 16));
        r4.setBounds(350, 220, 300, 30);
        r4.setBackground(new Color(215, 252, 252));
        add(r4);

        ButtonGroup account_type = new ButtonGroup();
        account_type.add(r1);
        account_type.add(r2);
        account_type.add(r3);
        account_type.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("SansSerif", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("SansSerif", Font.BOLD, 12));
        l5.setBounds(100, 330, 200, 20);
        add(l5);

        JLabel l7 = new JLabel("XXX-XXXX-XXXX-5264");
        l7.setFont(new Font("SansSerif", Font.BOLD, 18));
        l7.setBounds(330, 300, 200, 30);
        add(l7);

        JLabel l8 = new JLabel("(Card number would appear on ATM card, cheque book & statements)");
        l8.setFont(new Font("SansSerif", Font.BOLD, 12));
        l8.setBounds(330, 330, 400, 20);
        add(l8);

        JLabel l9 = new JLabel("PIN :");
        l9.setFont(new Font("SansSerif", Font.BOLD, 18));
        l9.setBounds(100, 370, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("SansSerif", Font.BOLD, 18));
        l10.setBounds(330, 370, 200, 30);
        add(l10);

        JLabel l11 = new JLabel("(Your 4-Digit password)");
        l11.setFont(new Font("SansSerif", Font.BOLD, 12));
        l11.setBounds(100, 400, 200, 20);
        add(l11);

        JLabel l12 = new JLabel("Services Required :");
        l12.setFont(new Font("SansSerif", Font.BOLD, 18));
        l12.setBounds(100, 440, 200, 30);
        add(l12);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("SansSerif", Font.BOLD, 16));
        c1.setBounds(100, 470, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("SansSerif", Font.BOLD, 16));
        c2.setBounds(350, 470, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile App");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("SansSerif", Font.BOLD, 16));
        c3.setBounds(100, 520, 200, 30);
        add(c3);

        c4 = new JCheckBox("SMS Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("SansSerif", Font.BOLD, 16));
        c4.setBounds(350, 520, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("SansSerif", Font.BOLD, 16));
        c5.setBounds(100, 570, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statements");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("SansSerif", Font.BOLD, 16));
        c6.setBounds(350, 570, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the submitted information is correct and to the best of my knowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("SansSerif", Font.BOLD, 12));
        c7.setBounds(100, 650, 600, 20);
        add(c7);

        JLabel l14 = new JLabel("Form : ");
        l14.setFont(new Font("SansSerif", Font.BOLD, 14));
        l14.setBounds(600, 10, 100, 30);
        add(l14);

        JLabel l13 = new JLabel(form_number);
        l13.setFont(new Font("SansSerif", Font.BOLD, 14));
        l13.setBounds(660, 10, 100, 30);
        add(l13);

        submit = new JButton("Submit");
        submit.setFont(new Font("SansSerif", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("SansSerif", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setVisible(true);
        setSize(850, 800);
        setLocation(400, 20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Signup3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String account_type = null;
        if (r1.isSelected()) {
            account_type = "Saving Account";
        } else if (r2.isSelected()) {
            account_type = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            account_type = "Current Account";
        } else if (r4.isSelected()) {
            account_type = "Recurring Deposit Account";
        }

        Random random = new Random();
        long first_seven = (random.nextLong() % 90000000L) + 1409963000000000L;
        String card_number = "" + Math.abs(first_seven);

        long first_three = (random.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first_three);

        String facility = "";
        if (c1.isSelected()){
            facility += "ATM Card ";
        }else if(c2.isSelected()){
            facility += "Internet Banking ";
        } else if (c3.isSelected()) {
            facility += "Mobile App ";
        }else if(c4.isSelected()){
            facility += "SMS Alerts ";
        } else if (c5.isSelected()) {
            facility += "Cheque Book ";
        } else if (c6.isSelected()) {
            facility += "E-Statements ";
        }
        try {
            if(e.getSource() == submit){
                if(account_type.equals("")){
                    JOptionPane.showMessageDialog(null, "Please choose a type.");
                }
                else{
                    Con c1 = new Con();
                    String query1 = "insert into signupthree values('"+form_number+"', '"+account_type+"', '"+card_number+"', '"+pin+"', '"+facility+"')";
                    c1.statement.executeUpdate(query1);

                    String query2 = "insert into login values('"+form_number+"', '"+card_number+"', '"+pin+"')";
                    c1.statement.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Account created successfully.\nCard Number : " + card_number +"\nPIN: " + pin);
                    setVisible(false);
                }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
