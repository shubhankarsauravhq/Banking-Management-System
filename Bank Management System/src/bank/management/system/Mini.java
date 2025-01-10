package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener{
    String pin;
    JButton exit_button;
    Mini(String pin) {
        this.pin = pin;
        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 250);
        add(label1);

        JLabel label2 = new JLabel("Obsidian Financial Services");
        label2.setBounds(100, 20, 250, 20);
        label2.setFont(new Font("System", Font.BOLD, 15));
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        add(label4);

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number : " + resultSet.getString("card_number").substring(0, 4) + "XXXXXXXX" + resultSet.getString("card_number").substring(12, 16));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;

            Con c = new Con();
            ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");

            while (resultset.next()) {
                label1.setText(label1.getText()+"<html>" + resultset.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("amount") + "<br><br><html>");
                if (resultset.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultset.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultset.getString("amount"));
                }
            }
            label4.setText("Your current balance is: Rs. " + balance);

        } catch (Exception E) {
            E.printStackTrace();
        }

        exit_button = new JButton("EXIT");
        exit_button.setBounds(20, 500, 100, 25);
        exit_button.setBackground(Color.WHITE);
        exit_button.addActionListener(this);
        add(exit_button);

        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini(" ");
    }
}
