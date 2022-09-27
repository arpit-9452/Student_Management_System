import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {
    LoginFrame(){

        Font  font =  new Font("Roboto",Font.BOLD,30);
        Font  newfont =  new Font("Roboto",Font.BOLD,24);
        Font  regularfont =  new Font("Roboto",Font.BOLD,18);

        String inputStrUsername = "arpit9452";
        String inputStrPassword = "5256";

        // Navbar==============
        JLabel navText = new JLabel("Login System");
        navText.setLayout(null);
        navText.setFont(font);
        navText.setBounds(270, 5, 480, 50);
        navText.setForeground(Color.WHITE);

        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBackground(Color.RED);
        navbar.setBounds(0, 1, 790, 60);
        navbar.add(navText);
        // Navbar==============

        //Main Panel================
        JLabel s_UserNameText = new JLabel("UserName:");
        s_UserNameText.setLayout(null);
        s_UserNameText.setFont(regularfont);
        s_UserNameText.setBounds(110, 30, 200, 50);
        s_UserNameText.setForeground(Color.BLACK);

        JLabel s_passWordText = new JLabel("Password:");
        s_passWordText.setLayout(null);
        s_passWordText.setFont(regularfont);
        s_passWordText.setBounds(110, 80, 200, 50);
        s_passWordText.setForeground(Color.BLACK);

        JTextArea s_UserName_TextArea = new JTextArea();
        s_UserName_TextArea.setLayout(null);
        s_UserName_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_UserName_TextArea.setFont(regularfont);
        s_UserName_TextArea.setBounds(260, 40, 220, 30);

        JTextArea s_Password_TextArea = new JTextArea();
        s_Password_TextArea.setLayout(null);
        s_Password_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Password_TextArea.setFont(regularfont);
        s_Password_TextArea.setBounds(260, 90, 220, 30);

        JLabel errorText = new JLabel("Invalid Username or Password...");
        errorText.setLayout(null);
        errorText.setFont(font);
        errorText.setBounds(70, 260, 480, 50);
        errorText.setForeground(Color.RED);
        errorText.setVisible(false);

        JButton loginBtn = new JButton();
        loginBtn.setText("Login");
        loginBtn.setBackground(Color.black);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFont(newfont);
        loginBtn.setBounds(150, 200, 200, 050);

        loginBtn.addActionListener((e)->{
            
            
            String user_Name_Str = s_UserName_TextArea.getText();
            String user_PassWord = s_Password_TextArea.getText();
            if(user_Name_Str.equals(inputStrUsername) || user_PassWord.equals(inputStrPassword)){
                new MainFrame();
                this.setVisible(false);
            }else{
                errorText.setVisible(true);
            }
             
            
        });


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setBounds(90, 100, 600, 350);
        mainPanel.add(s_UserNameText);
        mainPanel.add(s_passWordText);
        mainPanel.add(s_UserName_TextArea);
        mainPanel.add(s_Password_TextArea);
        mainPanel.add(loginBtn);
        //mainPanel.add(AdminBtn);
        mainPanel.add(errorText);

        //Main Panel================
        this.setSize(800,550);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);

        this.add(navbar);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
