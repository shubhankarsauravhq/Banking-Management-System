package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField amount_textfield;
    JButton deposit_button, back_button;
    Deposit(String pin){
        super("Deposit Amount");
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT TO DEPOSIT : ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        amount_textfield = new TextField();
        amount_textfield.setBounds(460, 230, 320, 25);
        amount_textfield.setFont(new Font("SansSerif", Font.BOLD, 22));
        amount_textfield.setBackground(new Color(65, 125,128));
        amount_textfield.setForeground(Color.WHITE);
        l3.add(amount_textfield);

        deposit_button = new JButton("DEPOSIT");
        deposit_button.setBounds(700, 362, 150,35);
        deposit_button.setBackground(new Color(65, 125, 128));
        deposit_button.setForeground(Color.WHITE);
        deposit_button.addActionListener(this);
        l3.add(deposit_button);

        back_button = new JButton("BACK");
        back_button.setBounds(700, 406, 150,35);
        back_button.setBackground(new Color(65, 125, 128));
        back_button.setForeground(Color.WHITE);
        back_button.addActionListener(this);
        l3.add(back_button);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = amount_textfield.getText();
            Date date = new Date();
            if(e.getSource() == deposit_button){
                if(amount_textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter a valid amount.");
                }
                else{
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values ('"+pin+"', '"+date+"', 'Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " deposited successfully.");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource() == back_button) {
                setVisible(false);
                new main_Class(pin);

            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
