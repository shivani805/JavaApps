package mypackage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.WindowConstants;

public class OnlineExam extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p;
	JLabel label;
	JButton btn1,btn2;
	ButtonGroup btngrp;
	JRadioButton radiobtn[]= new JRadioButton[5];
	int page=0;
	int count=0;
	OnlineExam()
	{
		
		btn1=new JButton("Next");
		btn1.setBounds(180,300,130,35);
		btn1.setForeground(Color.blue);
		btn2=new JButton("Exit");
		btn2.setBounds(350, 300, 130, 35);
		btn2.setForeground(Color.blue);
		btngrp=new ButtonGroup();
		label=new JLabel("1");
		label.setBounds(30,10,500,100);
		
	    label.setForeground(Color.blue);
	    add(label);
	   
	    for(int i=0;i<5;i++)
	    {
	    	radiobtn[i]=new JRadioButton();
	    add(radiobtn[i]);
	    btngrp.add(radiobtn[i]);
	    }
		radiobtn[0].setBounds(30, 100, 300, 50);
		radiobtn[0].setForeground(Color.blue);
		
		radiobtn[1].setBounds(30, 150, 300, 50);
		radiobtn[1].setForeground(Color.blue);
		radiobtn[2].setBounds(30, 200, 300, 50);
		radiobtn[2].setForeground(Color.blue);
		radiobtn[3].setBounds(30, 250, 300, 50);
		radiobtn[3].setForeground(Color.blue);
		
		add(btn1);
		add(btn2);
		Question();
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	
	setLayout(null);	
	setVisible(true);
	setSize(600,400);
	setBackground(Color.WHITE);
	
	
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn1)
		{
	//		System.out.println(Check());
			if(Check()) {  //if true the execute
				count= count+1;
			//	System.out.println(count);
				}
			page=page+1;
			Question();
			
			if(page==11) {
				btn1.setEnabled(false);
			    btn2.setText("Result");
			}
		}
		
		
		
		if(e.getActionCommand().equals("Result"))
		{
			if(Check())
				count =count+1;
	JOptionPane.showMessageDialog(this, "Correct answer: " +count);
			System.exit(0);
			
			
			
		}
		
		
		if(e.getSource()==btn2) {
			
			int reply=JOptionPane.showConfirmDialog(this, "Are you sure"," Confirm",JOptionPane.YES_NO_OPTION);
			if(reply==JOptionPane.YES_OPTION)
			System.exit(0);
			
			
		}
		
	}
       public void Question()
       {
    	   radiobtn[4].setSelected(true);
    	   if(page==0) {
    		   label.setText("Que1: Which of the following is not a java features?");
    	       radiobtn[0].setText("Architecture Neutral");
    	       radiobtn[1].setText("Dynamic");
    	       radiobtn[2].setText("Use of pointers");
    	       radiobtn[3].setText("Object Oriented");
    	   }
    	       if(page==1) {
    	    	   label.setText("Que2: Which class is the parent class of all classes in java?");
        	       radiobtn[0].setText("Swing");
        	       radiobtn[1].setText("Applet");
        	       radiobtn[2].setText("Object");
        	       radiobtn[3].setText("ActionEvent");
    	       }
        	   if(page==2) {
        		   label.setText("Que3: The \u104A article referred to as?");
        	    	   radiobtn[0].setText("Unicode escape sequence");   
        	    	   radiobtn[1].setText("Octal escape");   
        	    	   radiobtn[2].setText("Line feed");   
        	    	   radiobtn[3].setText("Hexadecimal");   
        	   }
        	   if(page==3) {
        		   label.setText("Que4:_____ is used to find and fix bugs in the java programs?");
    	    	   radiobtn[0].setText("JDB");   
    	    	   radiobtn[1].setText("JDK");   
    	    	   radiobtn[2].setText("JRE");   
    	    	   radiobtn[3].setText("JVM");   
    	   }
        	   if(page==4) {
        		   label.setText("Que6: Which one among these is not a keyword?");
    	    	   radiobtn[0].setText("class");   
    	    	   radiobtn[1].setText("int");   
    	    	   radiobtn[2].setText("get");   
    	    	   radiobtn[3].setText("if");   
    	   }
        	   if(page==5) {
        		   label.setText("Que5 : What is the return type of the hashcode() method in object class?");
    	    	   radiobtn[0].setText("Object");   
    	    	   radiobtn[1].setText("void");   
    	    	   radiobtn[2].setText("String");   
    	    	   radiobtn[3].setText("int");   
    	   }
        	   if(page==6) {
    	    	   label.setText("Ques.7: Which of the following is long litetral?");
    	    	   radiobtn[0].setText("ABH8097");   
    	    	   radiobtn[1].setText("9044256");   
    	    	   radiobtn[2].setText("L0124452");   
    	    	   radiobtn[3].setText("0xnf029L");   
    	   }
        	   if(page==7) {
    	    	   label.setText("Ques.8: What does the expression float a=25/0 returns?");
    	    	   radiobtn[0].setText("0");   
    	    	   radiobtn[1].setText("Not a number");   
    	    	   radiobtn[2].setText("Infinity");   
    	    	   radiobtn[3].setText("Run time exception");   
    	   }
        	   if(page==8) {
    	    	   label.setText("Ques.9: Which package contains the Random class?");
    	    	   radiobtn[0].setText("java.util");   
    	    	   radiobtn[1].setText("java.lang");   
    	    	   radiobtn[2].setText("java.awt");   
    	    	   radiobtn[3].setText("java.io");   
    	   }
        	   if(page==9) {
    	    	   label.setText("Ques.10: An interface with no fields or methods is known as a _______?");
    	    	   radiobtn[0].setText("Runnable interface");   
    	    	   radiobtn[1].setText("Abstract interface");   
    	    	   radiobtn[2].setText("Charsequence interface");   
    	    	   radiobtn[3].setText("Marker interface");   
    	   }
        	   if(page==10) {
    	    	   label.setText("Ques.11: Which of the following is an immediate subclass of the Panel class?");
    	    	   radiobtn[0].setText("Applet class");   
    	    	   radiobtn[1].setText("Window class");   
    	    	   radiobtn[2].setText("Frame class");   
    	    	   radiobtn[3].setText("Dialog class");   
    	   }
        	   if(page==11) {
    	    	   label.setText("Ques.12: Which of the following is marker interface?");
    	    	   radiobtn[0].setText("Runnable interface");   
    	    	   radiobtn[1].setText("Result interface");   
    	    	   radiobtn[2].setText("Remote interface");   
    	    	   radiobtn[3].setText("Readable interface");   
    	   }
       }
       boolean Check()                           //correct answer
       {                                  
    	   if(page==0)
    		   return (radiobtn[2].isSelected());//return true or false
    	   if(page==1)
    		   return (radiobtn[2].isSelected());
    	   if(page==2)
    		   return(radiobtn[0].isSelected());
    	   if(page==3)
    		   return(radiobtn[0].isSelected());
    	   if(page==4)
    		   return(radiobtn[2].isSelected());
    	   if(page==5)
    		   return(radiobtn[3].isSelected());
    	   if(page==6)
    		   return(radiobtn[3].isSelected());
    	   if(page==7)
    		   return(radiobtn[2].isSelected());
    	   if(page==8)
    		   return(radiobtn[1].isSelected());
    	   if(page==9)
    		   return(radiobtn[3].isSelected());
    	   if(page==10)
    		   return(radiobtn[0].isSelected());
    	   if(page==11)
    		   return(radiobtn[2].isSelected());
		return false;
    	   
       }
	
	
	public static void main(String[] args) {
		new OnlineExam();
	}

}
