package mypackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RepaintManager;



public class TicToe implements ActionListener {
	ImageIcon ic11,ic22;
	JButton btn[]=new JButton[9];
	  String i0,i1,i2,i3,i4,i5,i6,i7,i8=null;
	  Button reset;
	  boolean saved=true;
	TicToe(){
		JFrame fr=new JFrame();
		reset=new Button("Reset");
		reset.setBounds(120,320,70,30);
		reset.setBackground(Color.red);
		reset.setForeground(Color.white);
		fr.add(reset);
	    reset.addActionListener(this);
	    
	    
		for(int i=0;i<9;i++) {
		btn[i]=new JButton();
		fr.add(btn[i]);
		btn[i].addActionListener(this);
		}
		btn[0].setBounds(00,00,100,100);
		btn[1].setBounds(100,0,100,100);
		btn[2].setBounds(200,0,100,100);
		btn[3].setBounds(0,100,100,100);
		btn[4].setBounds(100,100,100,100);
		btn[5].setBounds(200,100,100,100);
		btn[6].setBounds(0,200,100,100);
		btn[7].setBounds(100,200,100,100);
		btn[8].setBounds(200,200,100,100);
		
	    
		fr.setLayout(null);
		fr.setVisible(true);
		fr.setSize(320,400);
		fr.setLocation(200,100);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { 	    
		
		
		if(e.getSource()==reset) {
			i0=null;
			i1=null;
			i2=null;
			i3=null;
			i4=null;
			i5=null;
			i6=null;
			i7=null;
			i8=null;
			for(int k =0;k<9;k++)
			
			btn[k].setIcon(null);
		      saved=true;
				
		}
		
		
		
	  	ic11=new ImageIcon("write1.jpg");
        ic22=new ImageIcon("wrongg.jpg");
		
 
        if(e.getSource()==btn[0]) {
        	
        	if(btn[0].getIcon()==null) {
               btn[0].setIcon(ic11);
        	if(btn[4].getIcon()==null) 
                btn[4].setIcon(ic22);
        	else if(btn[3].getIcon()==null) 
                btn[3].setIcon(ic22);
        	else if(btn[1].getIcon()==null) 
                btn[1].setIcon(ic22);
        	 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
        	 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
        	 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
        	 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
        	 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
        	}
        	
        }
        
        if(e.getSource()==btn[1]) {
        	if(btn[1].getIcon()==null) {
        	btn[1].setIcon(ic11);
        	if(btn[4].getIcon()==null) 
        		btn[4].setIcon(ic22);
        	else if(btn[2].getIcon()==null) 
        		btn[2].setIcon(ic22);
        	
        	else if(btn[0].getIcon()==null) 
        		btn[0].setIcon(ic22);
        	 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
        	 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
        	 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
        	 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
        	 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
        	}
        }
        
        if(e.getSource()==btn[2]) {
			if(btn[2].getIcon()==null) {
			btn[2].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
				 
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
			 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
			 
			}
        }

        if(e.getSource()==btn[3]) {
			if(btn[3].getIcon()==null) {
			btn[3].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
				 
			 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
			 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			}
        }
        if(e.getSource()==btn[4]) {
			if(btn[4].getIcon()==null) {
			btn[4].setIcon(ic11);
			 if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
				 
			 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
			 
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
			 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
			}
        }
        if(e.getSource()==btn[5]) {
			if(btn[5].getIcon()==null) {
			btn[5].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
				 
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
			 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
			}
        }
        
        if(e.getSource()==btn[6]) {
			if(btn[6].getIcon()==null) {
			btn[6].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
				 
			 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
			 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			}
        }
        if(e.getSource()==btn[7]) {
			if(btn[7].getIcon()==null) {
			btn[7].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[6].getIcon()==null) 
				 btn[6].setIcon(ic22);
				 
			 else if(btn[8].getIcon()==null) 
				 btn[8].setIcon(ic22);
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
			 else if(btn[3].getIcon()==null) 
				 btn[3].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[2].getIcon()==null) 
				 btn[2].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			}
        }

        
        
        if(e.getSource()==btn[8]) {
			if(btn[8].getIcon()==null) {
			btn[8].setIcon(ic11);
			 if(btn[4].getIcon()==null) 
				 btn[4].setIcon(ic22);
			 else if(btn[7].getIcon()==null) 
				 btn[7].setIcon(ic22);
				 
			 else if(btn[5].getIcon()==null) 
				 btn[5].setIcon(ic22);
			 else if(btn[0].getIcon()==null) 
				 btn[0].setIcon(ic22);
			 else if(btn[1].getIcon()==null) 
				 btn[1].setIcon(ic22);
			 else if(btn[2].getIcon()==null)
				 btn[2].setIcon(ic22);
			 else if(btn[6].getIcon()==null)
				 btn[6].setIcon(ic22);
			 else if(btn[3].getIcon()==null)
				 btn[3].setIcon(ic22);
			
        } 
       }
     
        
        
      
        Icon a=btn[0].getIcon();
        if(a!=null) {
         i0=a.toString();}
        Icon b=btn[1].getIcon();
        if(b!=null) {
         i1=b.toString();}
        Icon c=btn[2].getIcon();
        if(c!=null) {
         i2=c.toString();}
        Icon d=btn[3].getIcon();
        if(d!=null) {
         i3=d.toString();}
        Icon ee=btn[4].getIcon();
        if(ee!=null) {
         i4=ee.toString();}
        Icon f=btn[5].getIcon();
        if(f!=null) {
         i5=f.toString();}
        Icon g=btn[6].getIcon();
        if(g!=null) {
         i6=g.toString();}
        Icon h=btn[7].getIcon(); 
        if(h!=null) {
        
         i7=h.toString();}
        Icon i=btn[8].getIcon();
        if(i!=null) {
         i8=i.toString();}

        
        
    if(saved) {
     
     if ((i0==i1)&&(i1==i2)&&(i0!=null)&&(i0=="write1.jpg")||(i2==i4)&&(i4==i6)&&(i2!=null)&&(i2=="write1.jpg")|| (i0==i3)&&(i3==i6)&&(i0!=null)&&(i0=="write1.jpg")|| (i0==i4)&&(i4==i8)&&(i0!=null)&&(i0=="write1.jpg") ||(i1==i4)&&(i4==i7)&&(i1!=null)&&(i1=="write1.jpg")||(i2==i5)&&(i5==i8)&&(i2!=null)&&(i2=="write1.jpg")||(i3==i4)&&(i4==i5)&&(i3!=null)&&(i3=="write1.jpg")||(i6==i7)&&(i7==i8)&&(i6!=null)&&(i6=="write1.jpg"))
     
     {	    	
	       JOptionPane.showMessageDialog(null,"Hurray! You won........ Click reset");
	       
	       saved=false;  	
     }
     else if ((i0==i1)&&(i1==i2)&&(i0!=null)&&(i0=="wrongg.jpg")||(i2==i4)&&(i4==i6)&&(i2!=null)&&(i2=="wrongg.jpg")|| (i0==i3)&&(i3==i6)&&(i0!=null)&&(i0=="wrongg.jpg")|| (i0==i4)&&(i4==i8)&&(i0!=null)&&(i0=="wrongg.jpg") ||(i1==i4)&&(i4==i7)&&(i1!=null)&&(i1=="wrongg.jpg")||(i2==i5)&&(i5==i8)&&(i2!=null)&&(i2=="wrongg.jpg")||(i3==i4)&&(i4==i5)&&(i3!=null)&&(i3=="wrongg.jpg")||(i6==i7)&&(i7==i8)&&(i6!=null)&&(i6=="wrongg.jpg")) 
      {
		JOptionPane.showMessageDialog(null,"Shit! Computer won....... Click reset"); 

       }
               }
	}      //method   
	public static void main(String[] args) {
		new TicToe();
	}

}