package mypackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.text.BadLocationException;




public class MyNotepad extends JFrame implements MenuList,ActionListener{

	private static final long serialVersionUID = 1L;
	
	JLabel l2;
	JTextArea ta;
	int linenumber=0;
	boolean newFileFlag,saved = true;
	File temp;
	String fileName;
	
	
	JScrollPane sp;
	JCheckBoxMenuItem d,s;
	 String getFileName(){
		 return new String(fileName);}
	 void setFileName(String fileName){
		 this.fileName=new String(fileName);}
	
	MyNotepad(){
		
		add(new JLabel("        "),BorderLayout.WEST);//left border
		add(new JLabel("        "),BorderLayout.EAST);//right border
		l2=new JLabel("||       Eclipse IDE Notepad        ",JLabel.RIGHT);
		add(l2,BorderLayout.SOUTH);                  //bottom border
		
		ta= new JTextArea();
		sp=new JScrollPane(ta);//layout
		add(sp);
		
		createfiles();
	//	setLayout(null);
		setVisible(true);
		setSize(700,600);
		
	}
	
	
	
	
	
	 void createfiles() 
{
		 
			JMenuBar mb=new JMenuBar();
			JMenu filemenu=new JMenu(filetext);
			JMenu editmenu=new JMenu(edittext);
			JMenu formatmenu=new JMenu(formattext);
			JMenu viewmenu=new JMenu(viewtext);
			JMenu helpmenu=new JMenu(helptext);
			
			mb.add(filemenu);
			mb.add(editmenu);
			mb.add(formatmenu);
			mb.add(viewmenu);
			mb.add(helpmenu);
			
			
//			JMenuItem m1=new JMenuItem(filenew);
//			JMenuItem m2=new JMenuItem(fileopen);
//			JMenuItem m3=new JMenuItem(filesave);
//			JMenuItem m4=new JMenuItem(filesaveAs);
//			JMenuItem m5=new JMenuItem(filepageSetup);
//			JMenuItem m6=new JMenuItem(fileprint);
//			JMenuItem m7=new JMenuItem(fileexit);
			
//			filemenu.add(m1);
//			filemenu.add(m2);
//			filemenu.add(m3);
//			filemenu.add(m4);
//			filemenu.addSeparator();
//			filemenu.add(m5);
//			m5.setEnabled(false);
//			filemenu.add(m6);
//			filemenu.addSeparator();
//			filemenu.add(m7);
			
			createMenuitem(filenew,this,filemenu);
			createMenuitem(fileopen,this,filemenu);
			createMenuitem(filesave,this,filemenu);
			createMenuitem(filesaveAs,this,filemenu);
			filemenu.addSeparator();
	JMenuItem pagesetup =createMenuitem(filepageSetup,this,filemenu);
	pagesetup.setEnabled(false);
			createMenuitem(fileprint,this,filemenu);
			filemenu.addSeparator();
			createMenuitem(fileexit,this,filemenu);
			
//			JMenuItem e1=new JMenuItem(editUndo);
//			JMenuItem e2=new JMenuItem(editCut);
//			JMenuItem e3=new JMenuItem(editCopy);
//			JMenuItem e4=new JMenuItem(editPaste);
//			JMenuItem e5=new JMenuItem(editDelete);
//			JMenuItem e6=new JMenuItem(editFind);
//			JMenuItem e7=new JMenuItem(editFindNext);
//			JMenuItem e8=new JMenuItem(editReplace);
//			JMenuItem e9=new JMenuItem(editGoTo);
//			JMenuItem e10=new JMenuItem(editSelectAll);
//			JMenuItem e11=new JMenuItem(editTimeDate);
//			
//			editmenu.add(e1);	
//			e1.setEnabled(false);
//			editmenu.addSeparator();
//			editmenu.add(e2);
//			editmenu.add(e3);
//			editmenu.add(e4);
//			editmenu.add(e5);
//			editmenu.addSeparator();
//			editmenu.add(e6);
//			editmenu.add(e7);
//			editmenu.add(e8);
//			editmenu.add(e9);
//			editmenu.addSeparator();
//			editmenu.add(e10);
//			editmenu.add(e11);
		
			JMenuItem e1=createMenuitem(editUndo,this,editmenu);
			e1.setEnabled(false);
			editmenu.addSeparator();
			JMenuItem e2=createMenuitem(editCut,this,editmenu);
			JMenuItem e3=createMenuitem(editCopy,this,editmenu);
			createMenuitem(editPaste,this,editmenu);
			JMenuItem e5=createMenuitem(editDelete,this,editmenu);
			editmenu.addSeparator();
			JMenuItem e6=createMenuitem(editFind,this,editmenu);
			JMenuItem e7=createMenuitem(editFindNext,this,editmenu);
			JMenuItem e8=createMenuitem(editReplace,this,editmenu);
			JMenuItem e9=createMenuitem(editGoTo,this,editmenu);
			editmenu.addSeparator();
			JMenuItem e10=createMenuitem(editSelectAll,this,editmenu);
			createMenuitem(editTimeDate,this,editmenu);
			
			
//			JMenuItem f1=new JMenuItem(formatWordWrap);
//			JMenuItem f2=new JMenuItem(formatFont);
//			JMenuItem f3=new JMenuItem(formatForeground);
//			JMenuItem f4=new JMenuItem(formatBackground);
//			
//			formatmenu.add(f1);
//			formatmenu.add(f2);
//			formatmenu.addSeparator();
//			formatmenu.add(f3);
//			formatmenu.add(f4);
			
			s=createCheckboxMenuitem(formatWordWrap,this,formatmenu);
			s.setEnabled(true);
			createMenuitem(formatFont,this,formatmenu);
			formatmenu.addSeparator();
			createMenuitem(formatForeground,this,formatmenu);
			createMenuitem(formatBackground,this,formatmenu);
			
//			JMenuItem v1=new JMenuItem(viewStatusBar);
//			
//			viewmenu.add(v1);
			
			
			d=createCheckboxMenuitem(viewStatusBar,this,viewmenu);
			d.setEnabled(true);
			
//			JMenuItem h1=new JMenuItem(helpHelpTopic);
//			JMenuItem h2=new  JMenuItem(helpAboutNotepad);
//			
//			helpmenu.add(h1);
//			h1.setEnabled(false);
//			helpmenu.addSeparator();
//			helpmenu.add(h2);
			
			createMenuitem(helpHelpTopic,this,helpmenu).setEnabled(false);
			helpmenu.addSeparator();
			createMenuitem(helpAboutNotepad,this,helpmenu);
			
			
			MenuListener menulistener=new MenuListener()
			{ //for listener menu
				
				@Override
				public void menuSelected(MenuEvent e) {
					if(ta.getText().length()==0)
					{
						
						
						e6.setEnabled(false);
						e7.setEnabled(false);
						e8.setEnabled(false);
						e9.setEnabled(false);
						e10.setEnabled(false);
					}
					else {
						
						
						
						e6.setEnabled(true);
						e7.setEnabled(true);
						e8.setEnabled(true);
						e9.setEnabled(true);
						e10.setEnabled(true);
					}
					
					if(ta.getSelectionStart()==ta.getSelectionEnd())
					{
						
						e2.setEnabled(false);
						e3.setEnabled(false);
						e5.setEnabled(false);
						
						
					}
					else {
						
						e2.setEnabled(true);
						e3.setEnabled(true);
						e5.setEnabled(true);
						
						
					}
					
				}
				
				@Override
				public void menuDeselected(MenuEvent e) {
				}
				
				@Override
				public void menuCanceled(MenuEvent e) {
				}
				
			};
			editmenu.addMenuListener(menulistener);

			setJMenuBar(mb);
			
			
 }
	
	 JCheckBoxMenuItem  createCheckboxMenuitem(String viewstatusbar, ActionListener al, JMenu k) {
		JCheckBoxMenuItem allname2=new JCheckBoxMenuItem(viewstatusbar);
		allname2.addActionListener(al);
		allname2.setSelected(true);
		k.add(allname2);
		return allname2;
		
	}





JMenuItem createMenuitem(String name,ActionListener al,JMenu j) {
		JMenuItem allname=new JMenuItem(name);
		allname.addActionListener(al);
		 j.add(allname);
		 return allname;
	}





public static void main(String[] args) {
		new MyNotepad();

	}





@Override
public void actionPerformed(ActionEvent e) {
	String menuitemclick=e.getActionCommand();
	
	if(menuitemclick.equals(filenew))
	newFile();
	
	
	
	else if(menuitemclick.equals(fileopen))
		try {
			fileOpen();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	else if(menuitemclick.equals(filesave))
		alreadySave();
	
	else if(menuitemclick.equals(filesaveAs))
		saveASfile();
	
//	else if(menuitemclick.equals(filepageSetup))
//		System.out.println("setup");
	
	else if(menuitemclick.equals(fileprint))
JOptionPane.showMessageDialog(this, "Get ur printer repaired first! It seems u dont have one!","Bad Printer",JOptionPane.INFORMATION_MESSAGE);
	
	else if(menuitemclick.equals(fileexit))
		System.exit(0);
	
//	else if(menuitemclick.equals(editUndo))
//		System.out.println("undo");
	
	else if(menuitemclick.equals(editCut))
		ta.cut();
	
	else if(menuitemclick.equals(editCopy))
		ta.copy();
	
	else if(menuitemclick.equals(editPaste))
		ta.paste();
	
	
	else if(menuitemclick.equals(editDelete))
		ta.replaceSelection("");
	
	else if(menuitemclick.equals(editFind)) {
	String x=JOptionPane.showInputDialog("find what");
		
		
	
	}
	else if(menuitemclick.equals(editFindNext))
		System.out.println("findnext");
	
	else if(menuitemclick.equals(editReplace))
		System.out.println("replace");
	
	else if(menuitemclick.equals(editGoTo)) 
	{
		if(ta.getText().length()==0) 
			return ;	
		goTo();
		
	}
	else if(menuitemclick.equals(editSelectAll))
		ta.selectAll();
	
	else if(menuitemclick.equals(editTimeDate))
ta.insert(new Date().toString(),ta.getSelectionEnd());	
	
	
	else if(menuitemclick.equals(formatWordWrap))
		ta.setLineWrap(s.isSelected());
	
	else if(menuitemclick.equals(formatFont))
		System.out.println("word");
	
	else if(menuitemclick.equals(formatForeground)) {
		Color c=JColorChooser.showDialog(this, "choose your color", Color.black);
	       ta.setForeground(c);
	}
	else if(menuitemclick.equals(formatBackground)) {
		
		Color c=JColorChooser.showDialog(this, "choose your color", Color.white);
	          ta.setBackground(c);                                       }
	else if(menuitemclick.equals(viewStatusBar))
		
		l2.setVisible(d.isSelected());//if d is select then show label l2
	
	else if(menuitemclick.equals(helpHelpTopic))
		System.out.println("helptopi");
	
	else if(menuitemclick.equals(helpAboutNotepad))
		//ta.setText(aboutText);
	JOptionPane.showMessageDialog(this, aboutText,"about ide", JOptionPane.INFORMATION_MESSAGE);
	
	
}
boolean confirmSave() {
	String strMsg="<html>The text in the "+fileName+" file has been changed.<br>"+
		"Do you want to save the changes?<html>";
	if(!newFileFlag)
	{
	int x=JOptionPane.showConfirmDialog(this,strMsg,"notepad+",JOptionPane.YES_NO_CANCEL_OPTION);

	if(x==JOptionPane.CANCEL_OPTION) return false;
	if(x==JOptionPane.YES_OPTION && !saveASfile()) return false;
	}
	return true;
	}
	
	



 void newFile()
{
if(!confirmSave()) return;

ta.setText("");
fileName=new String("Untitled");
File temp1=new File(fileName);
saved=true;
newFileFlag=true;
setTitle(fileName);
}
 
boolean alreadySave() {
	 fileName=new String("untitled");
	 File temp1=new File(fileName);
	 if(!newFileFlag)
	 return saveFile(temp1);
	
	 
	 
	return saveASfile();
}





private boolean saveASfile() {
	
	File temp=null;
	JFileChooser fc=new JFileChooser();
	fc.setDialogTitle("SaveAs This File");
	fc.setApproveButtonText("save");
	
	do {
		
		if(fc.showSaveDialog(this)!=JFileChooser.APPROVE_OPTION)
		return false;
		 temp=fc.getSelectedFile();
		if(!temp.exists())
			break;
		if(   JOptionPane.showConfirmDialog(
this,"<html>"+temp.getPath()+" already exists.<br>Do you want to replace it?<html>","Save As",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		break;
	}while(true);
	
	return saveFile(temp);
	}





boolean saveFile(File temp) {
		
	FileWriter fout=null;
	try
	{
	fout=new FileWriter(temp);
	fout.write(ta.getText());
	}catch(IOException ioe){ return false;}
	finally {
	saved= true;
	try {
		fout.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	return true;
}





void fileOpen() throws IOException {
	
	

	String applicationTitle="Notepad+";
	
	
	JFileChooser chooser= new JFileChooser();
	chooser.setDialogTitle("File OPEN");
	chooser.setApproveButtonText("want open");
	do
	{
	if(chooser.showOpenDialog(this)!=JFileChooser.APPROVE_OPTION)
		return;
	temp=chooser.getSelectedFile();
	
	if(temp.exists())	break;

	JOptionPane.showMessageDialog(this,
		"<html>"+temp.getName()+"<br>file not found.<br>"+
		"Please verify the correct file name was given.<html>",
		"Open",	JOptionPane.INFORMATION_MESSAGE);

	} while(true);

	ta.setText("");

if(fileOpen2(temp))
{
	if(saved) {
		String name=temp.getName();
		this.setTitle(name+"-"+applicationTitle);
	}
	else {
	fileName="Untitled"; saved=true; 
	this.setTitle(fileName+" - "+applicationTitle);
	}
}

	if(!temp.canWrite())
		newFileFlag=true; 
	
}
boolean fileOpen2(File f) throws IOException  {//for read file when open
	
	FileInputStream fin=new FileInputStream(f);
	
	while(true) {
	
		try {
		int	i = fin.read();
		if(i==-1)
			break;
		ta.append(" "+(char)i);
		     } 
		catch (IOException e) {e.printStackTrace();}	
		          	
}
	return true;	
}




void goTo()
{
int lineNumber=0;
try
{
lineNumber=ta.getLineOfOffset(ta.getCaretPosition())+1;
String tempStr=JOptionPane.showInputDialog("Enter Line Number:",""+lineNumber);
if(tempStr==null)
	{return;}
lineNumber=Integer.parseInt(tempStr);
ta.setCaretPosition(ta.getLineStartOffset(lineNumber-1));
}catch(Exception e){}
}

}
interface MenuList{
	String filetext="File";
	String edittext="Edit";
	String formattext="Format";
	String viewtext="View";
	String helptext="Help";
	
	String filenew="New";
	String fileopen="Open";
	String filesave="Save";
	String filesaveAs="Save as";
	String filepageSetup="Page Setup";
	String fileprint="Print";
	String fileexit="Exit";
	
	final String editUndo="Undo";
	final String editCut="Cut";
	final String editCopy="Copy";
	final String editPaste="Paste";
	final String editDelete="Delete";
	final String editFind="Find...";
	final String editFindNext="Find Next";
	final String editReplace="Replace";
	final String editGoTo="Go To...";
	final String editSelectAll="Select All";
	final String editTimeDate="Time/Date";

	final String formatWordWrap="Word Wrap";
	final String formatFont="Font...";
	final String formatForeground="Set Text color...";
	final String formatBackground="Set Pad color...";

	final String viewStatusBar="Status Bar";

	final String helpHelpTopic="Help Topic";
	final String helpAboutNotepad="About Javapad";	
	
	final String aboutText=
			"<html><big>Your Javapad</big><hr><hr>"
			+"<p align=right>Prepared by a SHivani!"
			+"<hr><p align=left>I Used jdk1.5 to compile the source code.<br><br>"
			+"<strong>Thanx for using Eclipsepad</strong><br>"
			+"Ur Comments as well as bug reports r very welcome at<p align=center>"
			+"<hr><em><big>hr@java.com</big></em><hr><html>";
}

