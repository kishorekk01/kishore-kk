package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Mukkiyamaana import!

// ActionListener interface-ah implement pannanum
public class Login extends JFrame implements ActionListener { 

    JTextField cardTextField;
    JPasswordField pinTextField;
    JButton login, clear, signup;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Heading
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 450, 40);
        add(text);

        // Card No
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        // PIN
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(pinTextField);

        // Buttons
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); // Registration
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this); // Registration
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); // Registration
        add(signup);

        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // --- Action Function (Button logic inga dhaan irukku) ---
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            // Box-ah empty pannum
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
            // Ippo trial-ku print pannuvom
            System.out.println("Login Button Clicked");
        } else if (ae.getSource() == signup) {
            // Sign up logic inga varum
            System.out.println("Signup Button Clicked");
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
