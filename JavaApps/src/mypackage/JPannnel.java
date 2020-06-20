package mypackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class JPannnel extends JFrame {
JButton b1,b2,b3,b4,b5;
JPanel panel;
JLabel l1;
	public JPannnel() {
		setTitle("CORE Java Applications");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setBackground(Color.green);
		panel.setBorder(new EmptyBorder(10,10,10,10));
		setContentPane(panel);
		b1=new JButton();
		b1.setBounds(20,100,250, 250);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Calculator();
				
			}
		});
		
		b1.setIcon(new ImageIcon("calculator.jpg"));
		
		
		
		b2=new JButton();
		b2.setBounds(270,100,250,250);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Counting();
				
			}
		});
		
		b2.setIcon(new ImageIcon("wct.jpg"));
		
	
		b3=new JButton();
		b3.setBounds(20,350,250,250);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyNotepad();
				
			}
		});
		
		b3.setIcon(new ImageIcon("notepad.jpg"));
		
		b4=new JButton();
		b4.setBounds(270,350,250,250);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OnlineExam();
				
			}
		});
		
		b4.setIcon(new ImageIcon("Exam System.jpg"));
		
		b5=new JButton();
		b5.setBounds(150,600,250,250);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TicToe();
				
			}
		});
		
		b5.setIcon(new ImageIcon("tictactoe.jpg"));
		
	
		
		l1=new JLabel("CORE Java Applications");
		l1.setFont(new Font("Tahoma", Font.BOLD, 31));
		l1.setBounds(100,20,750,50);
		l1.setBackground(Color.yellow);
		l1.setForeground(Color.WHITE);
		
		setLayout(null);
		
		
add(l1);			
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);

	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
new Thread(new Runnable() {
	
	@Override
	public void run() {
	JPannnel f=	new JPannnel();
		f.setVisible(true);
		
		f.setSize(560,900);
		f.setLocation(300,10);
	}
}).start();
	}

}
