package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String form_number;
    JComboBox religion_dropdown, category_dropdown, income_dropdown, education_dropdown, occupation_dropdown;
    JTextField pan_number, aadhaar_number;
    JRadioButton s1, s2, n1, n2;
    JButton next;


    Signup2(String form_number) {
        super("APPLICATION FORM");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.form_number = form_number;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("SansSerif", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("SansSerif", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("SansSerif", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String[] religion = {"Hinduism", "Islam", "Sikhism", "Christianity", "Buddhism", "Jainism", "Zoroastrianism", "Others", "Rather not say"};
        religion_dropdown = new JComboBox(religion);
        religion_dropdown.setBackground(Color.WHITE);
        religion_dropdown.setFont(new Font("SansSerif", Font.BOLD, 14));
        religion_dropdown.setBounds(350, 120, 320, 30);
        add(religion_dropdown);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("SansSerif", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String[] categories = {"General", "OBC", "SC", "ST", "Others", "Rather not say"};
        category_dropdown = new JComboBox(categories);
        category_dropdown.setBackground(Color.WHITE);
        category_dropdown.setFont(new Font("SansSerif", Font.BOLD, 14));
        category_dropdown.setBounds(350, 170, 320, 30);
        add(category_dropdown);

        JLabel l5 = new JLabel("Annual Income : ");
        l5.setFont(new Font("SansSerif", Font.BOLD, 18));
        l5.setBounds(100, 220, 150, 30);
        add(l5);

        String[] income = {"NIL", "< Rs. 2,50,001", "Rs. 2,50,001 - Rs. 5,00,000", "Rs. 5,00,001 - Rs. 10,00,000", "Rs. 10,00,001 - Rs. 15,00,000", "Rs. 15,00,001 - Rs. 20,00,000", "> Rs. 20,00,0001"};
        income_dropdown = new JComboBox(income);
        income_dropdown.setBackground(Color.WHITE);
        income_dropdown.setFont(new Font("SansSerif", Font.BOLD, 14));
        income_dropdown.setBounds(350, 220, 320, 30);
        add(income_dropdown);

        JLabel l6 = new JLabel("Educational Qualification: ");
        l6.setFont(new Font("SansSerif", Font.BOLD, 18));
        l6.setBounds(100, 270, 250, 30);
        add(l6);

        String[] education = {"Matriculate", "Intermediate", "Graduate", "Post Graduate", "PhD", "Others"};
        education_dropdown = new JComboBox(education);
        education_dropdown.setBackground(Color.WHITE);
        education_dropdown.setFont(new Font("SansSerif", Font.BOLD, 14));
        education_dropdown.setBounds(350, 270, 320, 30);
        add(education_dropdown);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("SansSerif", Font.BOLD, 18));
        l7.setBounds(100, 320, 250, 30);
        add(l7);

        String[] occupation = {"Student", "Unemployed", "Self-Employed", "Employed-Public", "Employed-Private", "Business", "Retired"};
        occupation_dropdown = new JComboBox(occupation);
        occupation_dropdown.setBackground(Color.WHITE);
        occupation_dropdown.setBounds(350, 320, 320, 30);
        occupation_dropdown.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(occupation_dropdown);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("SansSerif", Font.BOLD, 18));
        l8.setBounds(100, 370, 250, 30);
        add(l8);

        pan_number = new JTextField();
        pan_number.setFont(new Font("SansSerif", Font.BOLD, 14));
        pan_number.setBounds(350, 370, 320, 30);
        add(pan_number);

        JLabel l9 = new JLabel("Aadhaar Number :");
        l9.setFont(new Font("SansSerif", Font.BOLD, 18));
        l9.setBounds(100, 420, 200, 30);
        add(l9);

        aadhaar_number = new JTextField();
        aadhaar_number.setFont(new Font("SansSerif", Font.BOLD, 14));
        aadhaar_number.setBounds(350, 420, 320, 30);
        add(aadhaar_number);

        JLabel l10 = new JLabel("Senior Citizen (60+): ");
        l10.setFont(new Font("SansSerif", Font.BOLD, 18));
        l10.setBounds(100, 470, 200, 30);
        add(l10);

        s1 = new JRadioButton("Yes");
        s1.setFont(new Font("SansSerif", Font.BOLD, 14));
        s1.setBounds(350, 470, 160, 14);
        s1.setBackground(new Color(252, 208, 76));
        add(s1);

        s2 = new JRadioButton("No");
        s2.setFont(new Font("SansSerif", Font.BOLD, 14));
        s2.setBounds(510, 470, 160, 14);
        s2.setBackground(new Color(252, 208, 76));
        add(s2);

        ButtonGroup senior_citizen = new ButtonGroup();

        senior_citizen.add(s1);
        senior_citizen.add(s2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("SansSerif", Font.BOLD, 18));
        l11.setBounds(100, 520, 200, 18);
        add(l11);

        n1 = new JRadioButton("Yes");
        n1.setFont(new Font("SansSerif", Font.BOLD, 14));
        n1.setBounds(350, 520, 160, 14);
        n1.setBackground(new Color(252, 208, 76));
        add(n1);

        n2 = new JRadioButton("No");
        n2.setFont(new Font("SansSerif", Font.BOLD, 14));
        n2.setBounds(510, 520, 160, 14);
        n2.setBackground(new Color(252, 208, 76));
        add(n2);

        ButtonGroup existing_acc = new ButtonGroup();

        existing_acc.add(n1);
        existing_acc.add(n2);

        JLabel l12 = new JLabel("Form : ");
        l12.setFont(new Font("SansSerif", Font.BOLD, 18));
        l12.setBounds(600, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(form_number);
        l13.setFont(new Font("SansSerif", Font.BOLD, 18));
        l13.setBounds(660, 10, 100, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("SansSerif", Font.BOLD, 14));
        next.setBackground(new Color(255, 255, 255));
        next.setForeground(new Color(105, 105, 105));
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 750);
        setLocation(450, 80);
        setUndecorated(true);
        setVisible(true);
        getContentPane().setBackground(new Color(252, 208, 76));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new Signup2("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) religion_dropdown.getSelectedItem();
        String category = (String) category_dropdown.getSelectedItem();
        String income = (String) income_dropdown.getSelectedItem();
        String education = (String) education_dropdown.getSelectedItem();
        String occupation = (String) occupation_dropdown.getSelectedItem();

        String pan = pan_number.getText();
        String aadhaar = aadhaar_number.getText();

        String senior_citizen = "";
        if (s1.isSelected()) {
            senior_citizen = "Yes";
        } else if (s2.isSelected()) {
            senior_citizen = "No";
        }

        String existing_account = "";
        if (n1.isSelected()) {
            existing_account = "Yes";
        } else if (n2.isSelected()) {
            existing_account = "No";
        }

        try {
            if (pan_number.getText().equals("") || aadhaar_number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter your PAN and Aadhaar Number.");
            } else {
                Con c1 = new Con();
                String query = "insert into signuptwo values('" + form_number + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhaar + "', '" + senior_citizen + "', '" + existing_account + "')";
                c1.statement.executeUpdate(query);
                new Signup3(form_number);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}