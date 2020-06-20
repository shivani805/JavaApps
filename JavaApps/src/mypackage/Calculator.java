package mypackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;







public class Calculator extends JFrame{
String digitButton[] ={"0","1","2","3","4","5","6","7","8","9",".","+/-"};//we can't use digitButton for listener because it is not button class
	
String operatorButton[]= {"+","-","*","%","/","sq","1/x","="};	
	
String memoryButton[]= {"MC","MR","MS","M+"};

String specialButton[] = {"Backspc", "C", "CE" };

final int height=50;
final int width=50;

int space=60;
public Label label, memLabel;


double number,memValue;
char operator;


Calculator() {
	
	label=new Label("0",Label.RIGHT);
	label.setBounds(35,30, 370, 50);
	label.setBackground(Color.green);
	label.setForeground(Color.BLACK);
    memLabel=new Label(" ",Label.RIGHT);
	add(label);
    add(memLabel);
    setLayout(null);
	setVisible(true);
	setSize(500,500);//frame size

	

	
	int x=100;
	int y=160;
	for(int i=0;i<digitButton.length;i++) {

		MydigitButton digit=new MydigitButton(digitButton[i],this);//data of this class will not work in other class so pass the object id to another class 
		digit.setBounds(x,y,height,width);

		add(digit);
		x=x+space;
		    if((i+1)%3==0)//when we divide 0/3 it return 0 and split that we dont want so use i+1 
		    {
		    	x=100;
		    	y=y+width+10;
		    }
		  
	}
	
	x=300;
	y=160;
	for(int i=0;i<operatorButton.length;i++) {
		MyOperatorButton operator= new MyOperatorButton(operatorButton[i],this);
		operator.setBounds(x,y,height,width);
	     add(operator);
	     x=x+space;
	     if((i+1)%2==0) {
	    	x=300;
           y=y+width+10;
	     }
	}
	x=35;
    y=160;
	for(int i=0;i<memoryButton.length;i++) {
		MyMemoryButton memory=new MyMemoryButton(memoryButton[i],this);
		memory.setBounds(x,y,60,width);
		add(memory);
		y=y+height+10;
	}
	x=150;
	y=100;
	for(int i=0;i<specialButton.length;i++) {
		MySpecialButton special=new MySpecialButton(specialButton[i],this);
		special.setBounds(x,y,80,width);
		add(special);
		x=x+height+40;
	}

  
	
	
    
}


	public static void main(String[] args) {
		new Calculator();
		
	}

}

class MydigitButton extends JButton implements ActionListener
{
	Calculator cl;
	MydigitButton (String dgbtn,Calculator cl)
	{
		
	super(dgbtn);
    this.cl=cl;  //calculator class object( data)for use here
	addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent t)
	{
		
		
		String value=((MydigitButton) t.getSource()).getLabel();
	
	if(value.equals("."))
		{
			if(cl.label.getText()=="0")
			{
		cl.label.setText("0.");//this will not work if 118 line not write
			}else
				
			if(!(cl.label.getText().contains(".")))  //if already point exist then it will not run
		    cl.label.setText(cl.label.getText()+".");
		}	      
		
	else {
			cl.label.setText(cl.label.getText()+value);
			
		 }
		
		
	}
}
	
class MyOperatorButton extends JButton implements ActionListener
{
	Calculator cl;
	double number2 ,result;
	MyOperatorButton(String opbtn,Calculator cl)
	{
		super(opbtn);
		this.cl=cl;
		
		addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double i=Double.parseDouble(cl.label.getText());
		String value=((MyOperatorButton) e.getSource()).getLabel();
		

		
		if(value.equals("1/x"))
		{
			try {
			double d=1/(double)i;
			String f=" "+d;
			

			cl.label.setText(f);
			}catch(ArithmeticException ae) {
				cl.label.setText("wrong input");
			}
		}
			
		if(value.equals("sq"))	
		{
			   try {
				   double w=Math.sqrt(i);
				   cl.label.setText(" "+w);
				    }
			   catch(ArithmeticException se)
			     {
				   cl.label.setText("can't get square ");
			      }
		}
		
	  
	    if(value.equals("+"))  //run when press +,-,*,%,/
	    {
	    	cl.number=i;           //hold data 
	    	cl.label.setText("");
	    	cl.operator=value.charAt(0);  //hold operator
	    //	System.out.println(cl.operator);
	    }
	    else if(value.equals("-"))  //run when press +,-,*,%,/
	    {
	    	cl.number=i;           //hold data 
	    	cl.label.setText("");
	    	cl.operator=value.charAt(0);  //hold operator
	   // 	System.out.println(cl.operator);
	    }
	    else if(value.equals("*"))  //run when press +,-,*,%,/
	    {
	    	cl.number=i;           //hold data 
	    	cl.label.setText("");
	    	cl.operator=value.charAt(0);  //hold operator
	    //	System.out.println(cl.operator);
	    }
	    else if(value.equals("%"))  //run when press +,-,*,%,/
	    {
	    	cl.number=i;           //hold data 
	    	cl.label.setText("");
	    	cl.operator=value.charAt(0);  //hold operator
	    //	System.out.println(cl.operator);
	    }
	    else  if(value.equals("/"))  //run when press +,-,*,%,/
	    {
	    	cl.number=i;           //hold data 
	    	cl.label.setText("");
	    	cl.operator=value.charAt(0);  //hold operator
	    //	System.out.println(cl.operator);
	    }
	    else //run when press equals
	    
	    {                
	    	double number2=Double.parseDouble(cl.label.getText());
	    //	System.out.println(number2);
	    //	System.out.println(cl.number);
	    	
	    //	System.out.println(cl.operator);
	    	switch(cl.operator) {
	    	case '+':
	    		 result =cl.number+number2;
	    		
	    		break;
	    	case '-':
	    		result=cl.number-number2;
	    		break;
	    	case '*':
	    		result=cl.number*number2;
	    		break;
	    	case '%':
	    	 result=cl.number%number2;
	    		break;
	    	case '/':
	    		result=cl.number/number2;
	    	                    }
	    	cl.label.setText(""+result);
	    }		
		
	}
}
	
class MySpecialButton extends JButton implements ActionListener
{
	Calculator cl;
	MySpecialButton(String sbtn,Calculator cl)
	{
		super(sbtn);
		this.cl=cl;
		
		addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String value=((MySpecialButton) e.getSource()).getLabel();
		
		if(value.equals("Backspc")) {
			String res="";
			String h=cl.label.getText();
			for(int i=0;i<h.length()-1;i++)
			res+=h.charAt(i);
			cl.label.setText(res);
		}
		if(value.equals("CE")) {
			cl.label.setText("0");
		}
		
		if(value.equals("C")) {//for all reset
			
			cl.label.setText(" ");
			
		}
	}	
}
class MyMemoryButton extends JButton implements ActionListener
{
Calculator cl;

/////////////////////////////////
MyMemoryButton(String membtn, Calculator cl)
{
super(membtn);

this.cl=cl;
addActionListener(this);
}
////////////////////////////////////////////////
public void actionPerformed(ActionEvent ev)
{
char memop=((MyMemoryButton)ev.getSource()).getLabel().charAt(1);


double temp=Double.parseDouble(cl.label.getText());

switch(memop)
{
case 'C': 
	cl.memLabel.setText(" ");
	cl.memValue=0.0;
	break;
case 'R': 

	;break;
case 'S':
	cl.memValue=0.0;
case '+': 
	cl.memValue+=Double.parseDouble(cl.label.getText());
	if(cl.label.getText().equals("0") || cl.label.getText().equals("0.0")  )
		cl.memLabel.setText(" ");
	else 
		cl.memLabel.setText("M");	
	break;
}
}
}
	
	
