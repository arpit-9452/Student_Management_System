import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class MainFrame extends JFrame{
    public int total_Fee;
    MainFrame(){
       
        Font  font =  new Font("Roboto",Font.BOLD,30);
        Font  newfont =  new Font("Roboto",Font.BOLD,24);
        Font  regularfont =  new Font("Roboto",Font.BOLD,18);

        ArrayList<String> s_Details = new ArrayList<>();
        // Navbar==============
        JLabel navText = new JLabel("Student Resgitration System");
        navText.setLayout(null);
        navText.setFont(font);
        navText.setBounds(450, 5, 480, 50);
        navText.setForeground(Color.WHITE);

        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBackground(Color.BLUE);
        navbar.setBounds(0, 2, 1285, 60);
        navbar.add(navText);
        // Navbar==============


        //Main Panel================
        JLabel s_DetailsText = new JLabel("Student Details");
        s_DetailsText.setLayout(null);
        s_DetailsText.setFont(regularfont);
        s_DetailsText.setBounds(10, 0, 200, 50);
        s_DetailsText.setForeground(Color.BLACK);

        JLabel s_IdText = new JLabel("Student Id:");
        s_IdText.setLayout(null);
        s_IdText.setFont(regularfont);
        s_IdText.setBounds(220, 0, 200, 50);
        s_IdText.setForeground(Color.BLACK);

        JLabel s_NameText = new JLabel("Student Name");
        s_NameText.setLayout(null);
        s_NameText.setFont(newfont);
        s_NameText.setBounds(20, 50, 200, 50);
        s_NameText.setForeground(Color.WHITE);

        JLabel s_ClassText = new JLabel("Student Class");
        s_ClassText.setLayout(null);
        s_ClassText.setFont(newfont);
        s_ClassText.setBounds(20, 100, 200, 50);
        s_ClassText.setForeground(Color.WHITE);

        JLabel s_Passed_LastClassText = new JLabel("Passed Last Class");
        s_Passed_LastClassText.setLayout(null);
        s_Passed_LastClassText.setFont(newfont);
        s_Passed_LastClassText.setBounds(20, 150, 300, 50);
        s_Passed_LastClassText.setForeground(Color.WHITE);

        JLabel s_Blood_GroupText = new JLabel("Blood Group");
        s_Blood_GroupText.setLayout(null);
        s_Blood_GroupText.setFont(newfont);
        s_Blood_GroupText.setBounds(20, 200, 300, 50);
        s_Blood_GroupText.setForeground(Color.WHITE);

        JLabel s_Mo_NumberText = new JLabel("Mobile Number");
        s_Mo_NumberText.setLayout(null);
        s_Mo_NumberText.setFont(newfont);
        s_Mo_NumberText.setBounds(20, 250, 300, 50);
        s_Mo_NumberText.setForeground(Color.WHITE);

        JLabel s_F_NameText = new JLabel("Father Name");
        s_F_NameText.setLayout(null);
        s_F_NameText.setFont(newfont);
        s_F_NameText.setBounds(20, 300, 300, 50);
        s_F_NameText.setForeground(Color.WHITE);
        
        JLabel s_M_NameText = new JLabel("Mother Name");
        s_M_NameText.setLayout(null);
        s_M_NameText.setFont(newfont);
        s_M_NameText.setBounds(20, 350, 300, 50);
        s_M_NameText.setForeground(Color.WHITE);

        JLabel s_Exam_FeeText = new JLabel("Exam Fee");
        s_Exam_FeeText.setLayout(null);
        s_Exam_FeeText.setFont(newfont);
        s_Exam_FeeText.setBounds(20, 400, 300, 50);
        s_Exam_FeeText.setForeground(Color.WHITE);

        JLabel s_Practical_FeeText = new JLabel("Practical Fee");
        s_Practical_FeeText.setLayout(null);
        s_Practical_FeeText.setFont(newfont);
        s_Practical_FeeText.setBounds(20, 450, 300, 50);
        s_Practical_FeeText.setForeground(Color.WHITE);

        JLabel s_Smester_FeeText = new JLabel("Semester Fee");
        s_Smester_FeeText.setLayout(null);
        s_Smester_FeeText.setFont(newfont);
        s_Smester_FeeText.setBounds(20, 500, 300, 50);
        s_Smester_FeeText.setForeground(Color.WHITE);

        JLabel s_Total_FeeText = new JLabel("Total Fee");
        s_Total_FeeText.setLayout(null);
        s_Total_FeeText.setFont(newfont);
        s_Total_FeeText.setBounds(20, 550, 300, 50);
        s_Total_FeeText.setForeground(Color.WHITE);

        // Student Details TextArea====================
        JTextArea s_Name_TextArea = new JTextArea();
        s_Name_TextArea.setLayout(null);
        s_Name_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Name_TextArea.setFont(regularfont);
        s_Name_TextArea.setBounds(260, 60, 220, 30);
        

        JTextArea s_Class_TextArea = new JTextArea();
        s_Class_TextArea.setLayout(null);
        s_Class_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Class_TextArea.setFont(regularfont);
        s_Class_TextArea.setBounds(260, 110, 220, 30);

        JTextArea s_Passed_Class_TextArea = new JTextArea();
        s_Passed_Class_TextArea.setLayout(null);
        s_Passed_Class_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Passed_Class_TextArea.setFont(regularfont);
        s_Passed_Class_TextArea.setBounds(260, 160, 220, 30);

        JTextArea s_Blood_Group_TextArea = new JTextArea();
        s_Blood_Group_TextArea.setLayout(null);
        s_Blood_Group_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Blood_Group_TextArea.setFont(regularfont);
        s_Blood_Group_TextArea.setBounds(260, 210, 220, 30);

        JTextArea s_Mo_Number_TextArea = new JTextArea();
        s_Mo_Number_TextArea.setLayout(null);
        s_Mo_Number_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Mo_Number_TextArea.setFont(regularfont);
        s_Mo_Number_TextArea.setBounds(260, 260, 220, 30);

        JTextArea s_F_Name_TextArea = new JTextArea();
        s_F_Name_TextArea.setLayout(null);
        s_F_Name_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_F_Name_TextArea.setFont(regularfont);
        s_F_Name_TextArea.setBounds(260, 310, 220, 30);

        JTextArea s_M_Name_TextArea = new JTextArea();
        s_M_Name_TextArea.setLayout(null);
        s_M_Name_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_M_Name_TextArea.setFont(regularfont);
        s_M_Name_TextArea.setBounds(260, 360, 220, 30);

        JTextArea s_Exam_fee_TextArea = new JTextArea();
        s_Exam_fee_TextArea.setLayout(null);
        s_Exam_fee_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Exam_fee_TextArea.setFont(regularfont);
        s_Exam_fee_TextArea.setBounds(260, 410, 220, 30);

        JTextArea s_Practical_Fee_TextArea = new JTextArea();
        s_Practical_Fee_TextArea.setLayout(null);
        s_Practical_Fee_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Practical_Fee_TextArea.setFont(regularfont);
        s_Practical_Fee_TextArea.setBounds(260, 460, 220, 30);

        JTextArea s_Semester_Fee_TextArea = new JTextArea();
        s_Semester_Fee_TextArea.setLayout(null);
        s_Semester_Fee_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Semester_Fee_TextArea.setFont(regularfont);
        s_Semester_Fee_TextArea.setBounds(260, 510, 220, 30);

        JTextArea s_Total_Fee_TextArea = new JTextArea();
        s_Total_Fee_TextArea.setLayout(null);
        s_Total_Fee_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Total_Fee_TextArea.setFont(regularfont);
        s_Total_Fee_TextArea.setBounds(260, 560, 220, 30);
        s_Total_Fee_TextArea.setEditable(false);

        JTextArea s_Id_TextArea = new JTextArea();
        s_Id_TextArea.setLayout(null);
        s_Id_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_Id_TextArea.setFont(regularfont);
        s_Id_TextArea.setBounds(350, 10, 100, 30);
        s_Id_TextArea.setEditable(false);

        JTextArea s_All_Details_TextArea = new JTextArea();
        s_All_Details_TextArea.setLayout(null);
        s_All_Details_TextArea.setBorder(new EmptyBorder(10,10,10,10));
        s_All_Details_TextArea.setFont(regularfont);
        s_All_Details_TextArea.setBounds(560, 60, 700, 500);
        s_All_Details_TextArea.setEditable(false);
        s_All_Details_TextArea.setVisible(true);

        JScrollPane scrollableTextArea = new JScrollPane(s_All_Details_TextArea);  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setBounds(560, 60, 700, 500);
        // Student Details TextArea====================

        // Registration Button=====================
        JButton regBtn = new JButton();
        regBtn.setText("Register");
        regBtn.setBackground(Color.black);
        regBtn.setForeground(Color.WHITE);
        regBtn.setFont(newfont);
        regBtn.setBounds(560, 570, 200, 050);

        regBtn.addActionListener((e)->{
            String s_Name_Str,s_Class_Str,s_Passed_Last_Class_Str,s_Blood_Group,s_Mo_No_Str,s_F_Name_Str,
            s_M_Name_Str,s_Exam_Fee_Str,s_Practical_Fee_Str,s_Semester_Fee_Str;

            s_Name_Str = s_Name_TextArea.getText();
            int s_Name_Len = s_Name_Str.length();
            s_Class_Str = s_Class_TextArea.getText();
            s_Passed_Last_Class_Str = s_Passed_Class_TextArea.getText();
            s_Blood_Group = s_Blood_Group_TextArea.getText();
            s_Mo_No_Str = s_Mo_Number_TextArea.getText();
            s_F_Name_Str = s_F_Name_TextArea.getText();
            int f_Name_Len = s_F_Name_Str.length();
            s_M_Name_Str = s_M_Name_TextArea.getText();

            s_Exam_Fee_Str = s_Exam_fee_TextArea.getText();
            int s_Exam_Fee_Int = Integer.parseInt(s_Exam_Fee_Str);

            s_Practical_Fee_Str = s_Practical_Fee_TextArea.getText();
            int s_Practical_Fee_Int = Integer.parseInt(s_Practical_Fee_Str);

            s_Semester_Fee_Str = s_Semester_Fee_TextArea.getText();
            int s_Semester_Fee_Int = Integer.parseInt(s_Semester_Fee_Str);

            total_Fee = s_Exam_Fee_Int + s_Practical_Fee_Int + s_Semester_Fee_Int;

            String total_Fee_Str = Integer.toString(total_Fee);
            s_Total_Fee_TextArea.setText(total_Fee_Str);
            

            int stu_Id = s_Name_Len*f_Name_Len/2;
            String stu_Id_Str = Integer.toString(stu_Id);

            s_Id_TextArea.setText(stu_Id_Str);

            s_Details.add(s_Name_Str+" "+s_Class_Str+" "+s_Passed_Last_Class_Str+" "+s_Blood_Group+" "+
            s_Mo_No_Str+" "+s_F_Name_Str+" "+s_M_Name_Str+" "+s_Exam_Fee_Str+" "+s_Practical_Fee_Str+" "+
            s_Semester_Fee_Str);

            s_All_Details_TextArea.selectAll();
            s_All_Details_TextArea.replaceSelection("");

            for(String str : s_Details){
                s_All_Details_TextArea.append(str+"\n");

            }
        });

        JButton clearBtn = new JButton();
        clearBtn.setText("Clear");
        clearBtn.setBackground(Color.black);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setFont(newfont);
        clearBtn.setBounds(760, 570, 200, 050);

        clearBtn.addActionListener((e)->{
            s_All_Details_TextArea.setText(" ");
        });

        JButton returnBtn = new JButton();
        returnBtn.setText("Return");
        returnBtn.setBackground(Color.black);
        returnBtn.setForeground(Color.WHITE);
        returnBtn.setFont(newfont);
        returnBtn.setBounds(940, 570, 200, 050);

        returnBtn.addActionListener((e)->{
            new LoginFrame();
            //new LoginFrame();
        });

        JButton AdminBtn = new JButton();
        AdminBtn.setText("Admin");
        AdminBtn.setBackground(Color.black);
        AdminBtn.setForeground(Color.WHITE);
        AdminBtn.setFont(newfont);
        AdminBtn.setBounds(1100, 570, 200, 050);

        AdminBtn.addActionListener((e)->{
            new AdminFrame(total_Fee);
            this.setVisible(false);
        });

        // Registration Button=====================

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setBounds(05, 80, 1275, 620);
        mainPanel.add(s_DetailsText);
        mainPanel.add(s_IdText);
        mainPanel.add(s_NameText);
        mainPanel.add(s_ClassText);
        mainPanel.add(s_Passed_LastClassText);
        mainPanel.add(s_Blood_GroupText);
        mainPanel.add(s_Mo_NumberText);
        mainPanel.add(s_F_NameText);
        mainPanel.add(s_M_NameText);
        mainPanel.add(s_Exam_FeeText);
        mainPanel.add(s_Practical_FeeText);
        mainPanel.add(s_Smester_FeeText);
        mainPanel.add(s_Total_FeeText);

        mainPanel.add(s_Name_TextArea);
        mainPanel.add(s_Class_TextArea);
        mainPanel.add(s_Passed_Class_TextArea);
        mainPanel.add(s_Blood_Group_TextArea);
        mainPanel.add(s_Mo_Number_TextArea);
        mainPanel.add(s_F_Name_TextArea);
        mainPanel.add(s_M_Name_TextArea);
        mainPanel.add(s_Exam_fee_TextArea);
        mainPanel.add(s_Practical_Fee_TextArea);
        mainPanel.add(s_Semester_Fee_TextArea);
        mainPanel.add(s_Total_Fee_TextArea);
        mainPanel.add(s_Id_TextArea);
        //mainPanel.add(s_All_Details_TextArea);
        mainPanel.add(scrollableTextArea);

        mainPanel.add(regBtn);
        mainPanel.add(clearBtn);
        mainPanel.add(returnBtn);
        mainPanel.add(AdminBtn);
        //Main Panel================


        this.setSize(1300,750);
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
