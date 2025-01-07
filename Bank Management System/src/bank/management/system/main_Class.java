package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class main_Class extends JFrame {
    JButton deposit_button, cash_withdraw_button, fast_cash_button, statement_button, changePin_button, balEnquiry_button, exit_button;
    main_Class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0, 1550, 830);
        add(l3);

        JLabel label = new JLabel("Please select your transaction");
        label.setBounds(430, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        l3.add(label);

        deposit_button = new JButton("DEPOSIT");
        deposit_button.setForeground(Color.white);
        deposit_button.setFont(new Font("System", Font.BOLD, 14));
        deposit_button.setBackground(new Color(65, 125, 128));
        deposit_button.setBounds(410, 274, 150, 35);
        l3.add(deposit_button);

        cash_withdraw_button = new JButton("WITHDRAW");
        cash_withdraw_button.setForeground(Color.white);
        cash_withdraw_button.setFont(new Font("System", Font.BOLD, 14));
        cash_withdraw_button.setBackground(new Color(65, 125, 128));
        cash_withdraw_button.setBounds(700, 274, 150, 35);
        l3.add(cash_withdraw_button);

        fast_cash_button = new JButton("FAST CASH");
        fast_cash_button.setForeground(Color.white);
        fast_cash_button.setFont(new Font("System", Font.BOLD, 14));
        fast_cash_button.setBackground(new Color(65, 125, 128));
        fast_cash_button.setBounds(410, 318, 150, 35);
        l3.add(fast_cash_button);

        statement_button = new JButton("STATEMENT");
        statement_button.setForeground(Color.white);
        statement_button.setFont(new Font("System", Font.BOLD, 14));
        statement_button.setBackground(new Color(65, 125, 128));
        statement_button.setBounds(700, 318, 150, 35);
        l3.add(statement_button);

        changePin_button = new JButton("CHANGE PIN");
        changePin_button.setForeground(Color.white);
        changePin_button.setFont(new Font("System", Font.BOLD, 14));
        changePin_button.setBackground(new Color(65, 125, 128));
        changePin_button.setBounds(410, 362, 150, 35);
        l3.add(changePin_button);

        balEnquiry_button = new JButton("CHECK BAL");
        balEnquiry_button.setForeground(Color.white);
        balEnquiry_button.setFont(new Font("System", Font.BOLD, 14));
        balEnquiry_button.setBackground(new Color(65, 125, 128));
        balEnquiry_button.setBounds(700, 362, 150, 35);
        l3.add(balEnquiry_button);

        exit_button = new JButton("EXIT");
        exit_button.setForeground(Color.white);
        exit_button.setFont(new Font("System", Font.BOLD, 14));
        exit_button.setBackground(new Color(65, 125, 128));
        exit_button.setBounds(700, 406, 150, 35);
        l3.add(exit_button);



        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new main_Class();
    }
}
