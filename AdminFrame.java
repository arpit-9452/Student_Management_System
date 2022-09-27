
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class AdminFrame extends JFrame {
    AdminFrame(int val){

        //MainFrame frame = new MainFrame();
        //int totalAmt = frame.total_Fee;

        Font  font =  new Font("Roboto",Font.BOLD,30);
        Font  newfont =  new Font("Roboto",Font.BOLD,24);
        Font  regularfont =  new Font("Roboto",Font.BOLD,18);

         // Navbar==============
         JLabel navText = new JLabel("Admin System");
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

         // Main Panel=================
         JLabel s_NameText = new JLabel("Total Revenue");
         s_NameText.setLayout(null);
         s_NameText.setFont(newfont);
         s_NameText.setBounds(20, 50, 200, 50);
         s_NameText.setForeground(Color.WHITE);

         JTextArea s_Name_TextArea = new JTextArea();
         s_Name_TextArea.setLayout(null);
         s_Name_TextArea.setBorder(new EmptyBorder(10,10,10,10));
         s_Name_TextArea.setFont(regularfont);
         s_Name_TextArea.setBounds(220, 60, 220, 30);

         s_Name_TextArea.setText(String.valueOf(val));

         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(null);
         mainPanel.setBackground(Color.GRAY);
         mainPanel.setBounds(105, 80, 475, 300);
         mainPanel.add(s_NameText);
         mainPanel.add(s_Name_TextArea);
         // Main Panel=================
         

        this.setSize(800,550);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
