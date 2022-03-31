import java.awt.event.*;
import javax.swing.*;

public class Welcome{
    JFrame f=new JFrame();
    JLabel l1=new JLabel("Welcome to Number Guessing Game");
    JButton b1=new JButton("Start Game");

    Welcome()
    {
        l1.setBounds(90,150,300,20);
        b1.setBounds(115,200,150,20);
        f.add(l1);
        f.add(b1);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //JOptionPane.showMessageDialog(f,"Button Clicked");
                new Main();
                f.setVisible(false);
            }
        });

        f.setLayout(null);
        f.setTitle("Welcome");
        f.setVisible(true);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Welcome();
    }
}
