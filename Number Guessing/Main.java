import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Main {
    JFrame f1=new JFrame();
    JLabel mainlabel,scorelabel,numlabel,attempLabel;
    JTextField txtfield,txtfield1;
    JButton btn,btn1;
    static int score=0;


    Main()
    {
        mainlabel=new JLabel("Number will generate here");
        mainlabel.setBounds(100,80,200,20);
        mainlabel.setFont(new Font("Arial",Font.PLAIN,15));
        f1.add(mainlabel);

        scorelabel=new JLabel("Score : "+score);
        scorelabel.setBounds(10,10,150,20);
        f1.add(scorelabel);

        txtfield=new JTextField();
        //txtfield.setBounds(90,120,210,30); //hidden from user
        f1.add(txtfield);

        btn=new JButton("Generate Number");
        btn.setBounds(120,160,150,30);
        f1.add(btn);

        numlabel=new JLabel("Enter your guess");
        numlabel.setBounds(135,210,200,20);
        numlabel.setFont(new Font("Arial",Font.PLAIN,15));
        f1.add(numlabel);

        txtfield1=new JTextField();
        txtfield1.setBounds(90,240,210,30);
        f1.add(txtfield1);

        btn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Random random=new Random();
        		int x=random.nextInt(100);
        		String num=Integer.toString(x);
        		txtfield.setText(num);


        	}
        	});

        btn1=new JButton("Generate Number");
        btn1.setBounds(120,280,150,30);
        f1.add(btn1);

        btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				scorelabel.setVisible(false);
				// TODO Auto-generated method stub

				int currentScore=score;
				int t1=Integer.parseInt(txtfield.getText());
				int t2=Integer.parseInt(txtfield1.getText());
				if(t1==t2) {
    			score=score+100;
    			currentScore+=score;
    			scorelabel.setText("Your Score is :"+score);
    			scorelabel.setVisible(true);
    			JOptionPane.showMessageDialog(f1,"Correct Guess");
				}
    		else if(t2<t1) {
				score=score+25;
    			currentScore+=score;
    			scorelabel.setText("Your Score is :"+score);
    			scorelabel.setVisible(true);
    			JOptionPane.showMessageDialog(f1,"Randomized number was : "+t1+"\nYour Guess was Lower");
    		}
    		else if(t2>t1) {
				score=score+50;
    			currentScore+=score;
    			scorelabel.setText("Your Score is :"+score);
    			scorelabel.setVisible(true);
    			JOptionPane.showMessageDialog(f1,"Randomized number was : "+t1+"\nYour Guess was Higher");
    		}
				txtfield.setText(""); //resetting values
				txtfield1.setText(""); //resetting values
			}

        });


        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(400,450);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setTitle("Number Guessing Game");
    }

    public static void main(String[] args) {
        new Main();
    }
}
