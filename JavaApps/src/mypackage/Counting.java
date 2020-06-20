package mypackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Counting extends JFrame implements ActionListener{
	JLabel label1,label2;
	JTextArea text;
	JButton btn, btn1;
	JScrollPane sp;
	Counting(){
		label1=new JLabel("Words");
		label1.setBounds(50,50,320,30);
		label2=new JLabel("Characters");
		label2.setBounds(50,100,320,30);
		
		text=new JTextArea(20,20);
		sp=new JScrollPane(text);
		sp.setBounds(50,140,320,170);
		
		btn =new JButton("Count");
		btn.setBounds(60,340,100,30);
		btn1=new JButton("TextColor");
		btn1.setBounds(170,340,100,30);
		setLayout(null);
	//	setLayout(new FlowLayout());
		add(label1);
		add(label2);
//		add(text); //not need to add
		add(sp);
		add(btn);
		add(btn1);
		btn.addActionListener(this);
		btn1.addActionListener(this);
		setVisible(true);
		setSize(500,500);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ar) {
		if(ar.getSource()==btn) {
			String s=text.getText();
			label2.setText("Characters:"+" "+s.length());
		String d[]=s.split("\\s");
		label1.setText("Words:"+" "+d.length);
		}
		if(ar.getSource()==btn1) {
			Color c=JColorChooser.showDialog(this, "you can Change color", Color.black);
			text.setForeground(c);
		}
	}
	

	public static void main(String[] args) {
		new Counting();
	}



	

}
