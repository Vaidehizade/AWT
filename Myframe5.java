package Testpackage;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Myframe5 extends Frame
{
	

	Panel mainPanel;
	Label lbltitle, lblsubtitle1, lblsubtitle2;
	Panel titlePanel, subPanel, registerPanel, payPanel, choosePanel;
	Label lblname, lblno, lblBirthdate, lblcollege, lblchoose, lbltotal,lblpay;
	TextField txtname,txtno;
	Choice cmbyear, cmbmonth, cmbday, cmbcollege;
	Checkbox chkC, chkCPP, chkDS, chkADS,chkJAVA, chkPython;
	Label lblC, lblCPP, lblDS, lblADS, lblJAVA, lblPython;
	Button btnconfirm, btnpay, btnclose, btncls;
	int n;
	int cnt,total;
	Dialog md;
	public Myframe5()
	{
		
		setTitle("Myframe");
		setUndecorated(true);
		cnt=0;
		total =0;
		//setSize(1366,766);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLocationRelativeTo(null);
		setBackground(Color.black);
		addComponent();
		fillyear();
		fillmonth();
	    n = 31;
	    fillcollege();
		setLayout(null);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
			
			
		});
	}
	
	private void addComponent()
	{
		
		mainPanel = new Panel();
		mainPanel.setBounds(20,20,1326,726);
		mainPanel.setBackground(new Color(138,210,57));
		mainPanel.setLayout(null);
		
		titlePanel = new Panel();
	    titlePanel.setBounds(10,10,1306,60);
		titlePanel.setBackground(new Color(0,94,239));
		titlePanel.setLayout(null);
		
		lbltitle = new Label("REGAL");
		lbltitle.setBounds(530,0,280,70);
		lbltitle.setAlignment(Label.CENTER);
		lbltitle.setForeground(Color.white);
		lbltitle.setFont(new Font("verdena",Font.BOLD,50));
		
		subPanel = new Panel();
	    subPanel.setBounds(10,80,1306,640);
	    subPanel.setBackground(new Color(58,158,239));
	    subPanel.setLayout(null);
	    
	    lblsubtitle1 = new Label("Register here :: ");
		lblsubtitle1.setBounds(10,0,280,70);
		lblsubtitle1.setForeground(Color.black);
		lblsubtitle1.setFont(new Font("verdena",Font.BOLD,25));
		
        String mydate;
		
		Calendar cld = Calendar.getInstance();
		Date d = cld.getTime();
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY");
		mydate = sd.format(d);
		
	    lblsubtitle2 = new Label("Date here: "+mydate);
		lblsubtitle2.setBounds(930,0,280,70);
		lblsubtitle2.setForeground(Color.black);
		lblsubtitle2.setFont(new Font("verdena",Font.BOLD,25));
		
		registerPanel = new Panel();
	    registerPanel.setBounds(40,60,880,540);
	    registerPanel.setBackground(new Color(0,94,239));
	    registerPanel.setLayout(null);
	    subPanel.add(registerPanel);
		

		payPanel = new Panel();
	    payPanel.setBounds(930,60,300,540);
	    payPanel.setBackground(new Color(0,94,239));
	    payPanel.setLayout(null);
	    subPanel.add(payPanel);
	    
	    lbltotal = new Label("Total = ");
	    lbltotal.setBounds(20,20,200,50);
	    lbltotal.setForeground(Color.BLACK);
	    //lbltotal.setActionCommand("Total = ");
	    lbltotal.setFont(new Font("verdena", Font.BOLD,25));
	    payPanel.add(lbltotal);
	    
	    lblname = new Label("Name ::");
	    lblname.setBounds(170,30,120,30);
	    lblname.setForeground(Color.white);
		lblname.setFont(new Font("verdena",Font.BOLD,22));
		registerPanel.add(lblname);
		
	    txtname = new TextField();
	    txtname.setBounds(300,35,460,25);
	    txtname.setFont(new Font("verdena",Font.BOLD,20));
	    txtname.setForeground(Color.white);
	    txtname.setBackground(new Color(58,158,239));
	    
	    lblno = new Label("PhoneNo ::");
	    lblno.setBounds(125,90,130,30);
	    lblno.setForeground(Color.white);
		lblno.setFont(new Font("verdena",Font.BOLD,23));
		registerPanel.add(lblno);
	    
	    txtno = new TextField();
	    txtno.setBounds(300,90,460,25);
	    txtno.setFont(new Font("verdena",Font.BOLD,15));
	    txtno.setForeground(Color.white);
	    txtno.setBackground(new Color(58,158,239));
	    
	    txtno.addKeyListener(new MyKeyListener5(this));
	    registerPanel.add(txtname);
	    registerPanel.add(txtno);
	    
	    lblBirthdate = new Label("BirthDate ::");
	    lblBirthdate.setBounds(120,140,130,30);
	    lblBirthdate.setForeground(Color.white);
		lblBirthdate.setFont(new Font("verdena",Font.BOLD,23));
		registerPanel.add(lblBirthdate);
	    
	    
	    cmbday = new Choice();
	    cmbmonth = new Choice();
	    cmbyear = new Choice();
	    
	    cmbyear.setBounds(300,140,130,10);
	    cmbyear.setBackground(new Color(58,158,239));
	    cmbyear.insert("YEAR", 0);
	    
	    cmbmonth.setBounds(465,140,130,10);
	    cmbmonth.setBackground(new Color(58,158,239));
	    cmbmonth.insert("MONTH", 0);
	    cmbday.setBounds(630,140,130,10);
	    cmbday.setBackground(new Color(58,158,239));
	    cmbday.insert("DAY", 0);
	    
	    cmbday.setForeground(Color.white);
	    cmbmonth.setForeground(Color.white);
	    cmbyear.setForeground(Color.white);
	    
		cmbday.setFont(new Font("verdena",Font.BOLD,14));
		cmbmonth.setFont(new Font("verdena",Font.BOLD,14));
		cmbyear.setFont(new Font("verdena",Font.BOLD,14));
		
		cmbday.addItemListener(new MyItemListener5(this));
		cmbmonth.addItemListener(new MyItemListener5(this));
		cmbyear.addItemListener(new MyItemListener5(this));
		
		registerPanel.add(cmbday);
		registerPanel.add(cmbmonth);
		registerPanel.add(cmbyear);
		
		lblcollege = new Label("College ::");
	    lblcollege.setBounds(140,190,130,30);
	    lblcollege.setForeground(Color.white);
		lblcollege.setFont(new Font("verdena",Font.BOLD,23));
		registerPanel.add(lblcollege);
		
		cmbcollege = new Choice();
		cmbcollege.setBounds(300,195,460,25);
		cmbcollege.setBackground(new Color(58,158,239));
		cmbcollege.setFont(new Font("verdena",Font.BOLD,14));
		cmbcollege.setForeground(Color.white);
		cmbcollege.insert("Select college here: ",0);
		registerPanel.add(cmbcollege);
		
		lblchoose = new Label("Choose ::");
		lblchoose.setBounds(138,240,130,30);
		lblchoose.setForeground(Color.white);
	    lblchoose.setFont(new Font("verdena",Font.BOLD,23));
		registerPanel.add(lblchoose);
		
		choosePanel = new Panel();
		choosePanel.setBackground(new Color(139,211,57));
		choosePanel.setBounds(300,245,460,190);
		choosePanel.setLayout(null);
		
		chkC = new Checkbox("C");
		chkCPP = new Checkbox("CPP");
		chkDS = new Checkbox("DS");
		chkADS = new Checkbox("ADS");
		chkJAVA = new Checkbox("JAVA");
		chkPython = new Checkbox("PYTHON");
		
		chkC.setBounds(50,30,100,15);
		chkC.setFont(new Font("verdena", Font.BOLD, 15));
		chkCPP.setBounds(50,75,100,15);
		chkCPP.setFont(new Font("verdena", Font.BOLD, 15));
		chkDS.setBounds(50,120,100,15);
		chkDS.setFont(new Font("verdena", Font.BOLD, 15));
		
		lblC = new Label("3000");
	    lblC.setBounds(120,23,100,30);
	    lblC.setForeground(Color.black);
		lblC.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblC);
		
		lblCPP = new Label("3500");
	    lblCPP.setBounds(120,68,100,30);
	    lblCPP.setForeground(Color.black);
		lblCPP.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblCPP);
		
		lblDS = new Label("3000");
	    lblDS.setBounds(120,113,100,30);
	    lblDS.setForeground(Color.black);
		lblDS.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblDS);
		
		chkADS.setBounds(265,30,100,15);
		chkADS.setFont(new Font("verdena", Font.BOLD, 15));
		chkJAVA.setBounds(265,75,100,15);
		chkJAVA.setFont(new Font("verdena", Font.BOLD, 15));
		chkPython.setBounds(265,120,100,15);
		chkPython.setFont(new Font("verdena", Font.BOLD, 15));
		
		lblADS = new Label("3000");
	    lblADS.setBounds(370,23,100,30);
	    lblADS.setForeground(Color.black);
		lblADS.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblADS);
		
		lblJAVA = new Label("4000");
	    lblJAVA.setBounds(370,68,100,30);
	    lblJAVA.setForeground(Color.black);
		lblJAVA.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblJAVA);
		
		lblPython = new Label("4000");
	    lblPython.setBounds(370,113,100,30);
	    lblPython.setForeground(Color.black);
		lblPython.setFont(new Font("verdena",Font.BOLD,17));
		choosePanel.add(lblPython);
		
        MyItemListener7 mil2 = new MyItemListener7(this);
		
		chkC.addItemListener(mil2);
		chkCPP.addItemListener(mil2);
		chkDS.addItemListener(mil2);
		chkADS.addItemListener(mil2);
		chkJAVA.addItemListener(mil2);
		chkPython.addItemListener(mil2);
		
		
		
		
		choosePanel.add(chkC);
		choosePanel.add(chkCPP);
		choosePanel.add(chkDS);
		choosePanel.add(chkADS);
		choosePanel.add(chkJAVA);
		choosePanel.add(chkPython);
		registerPanel.add(choosePanel);
		
		btnconfirm = new Button("CONFIRM");
		btnconfirm.setBackground(new Color(255,0,0));
		btnconfirm.setBounds(300,465,460,50);
		btnconfirm.setForeground(Color.yellow);
		btnconfirm.setFont(new Font("verdena", Font.BOLD, 25));
		btnconfirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnconfirm.addMouseListener(new MyMouseListener6_1(this));
		registerPanel.add(btnconfirm);
		
		btnpay = new Button("PAY");
		btnpay.setBackground(new Color(255,0,0));
		btnpay.setBounds(40,465,200,50);
		btnpay.setForeground(Color.yellow);
		btnpay.setFont(new Font("verdena", Font.BOLD, 25));
		btnpay.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnpay.addMouseListener(new MyMouseListener9(this));
		payPanel.add(btnpay);
		
		btnclose = new Button("X");
		btnclose.setBackground(new Color(255,0,0));
		btnclose.setBounds(8,570,30,30);
		btnclose.setForeground(Color.white);
		btnclose.setFont(new Font("verdena", Font.BOLD, 20));
		btnclose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		subPanel.add(btnclose);
		
		addWindowListener(new WindowAdapter()
		{ 
			  public void windowOpened( WindowEvent e)
			  { 
			    txtname.requestFocus();
			  } 
		}); 
	    
		btnclose.addMouseListener(new MyMouseListener5(this));
		titlePanel.add(lbltitle);
		subPanel.add(lblsubtitle1);
		subPanel.add(lblsubtitle2);
		mainPanel.add(titlePanel);
		mainPanel.add(subPanel);
		add(mainPanel);
		
	}
	
	
	public void fillyear()
	{
		int i;
		for(i=1900; i<=2021; i++)
		{
			cmbyear.add(String.valueOf(i));
		}
	}
	
	public void fillmonth()
	{
		int j;
		for(j=1; j<=12; j++)
		{
			cmbmonth.add(String.valueOf(j));
		}
	}
	
	public void fillday(int month1, int year1)
	{
		int flag =0;
		if((year1 %4 ==0 && year1 %100!=0)|| (year1 % 400 ==0))
		{
			flag =1;
		}
		else
		{
			flag =0;
		}
		
		if(month1 ==2 && flag ==1)
		{
			n = 29;
		}
		else if(month1 ==2 && flag==0)
		{
			n = 28;
		}
		else if(month1 ==1 || month1 == 3 || month1 ==5 || month1 ==7 || month1 ==8 || month1 ==10 || month1 == 12)
		{
		    	n =31;
		}
		else
		{
		    	n =30;
		}
		    
		  
		    for(int k=1; k<=n; k++)
		   {
			cmbday.add(String.valueOf(k));
		   }
	}
	
	public void fillcollege()
	{
		String arr[] = { "Bhartiya Vidyapeeth College of Engineering", "College of Engineering, Pune","D.Y.Patil, Akurdi","Modern College of Engineering, Pune","Pune Institute of Computer Technology", "Sinhagad College(BK)Wadagaon, Pune"};
		for(int i=0; i< arr.length; i++)
		{
			cmbcollege.add(arr[i]);
		}
	}
	
}

//closse button sathi
class MyMouseListener5 extends MouseAdapter
{
	Myframe5 ref;
	
	public MyMouseListener5(Myframe5 temp) 
	{
		ref = temp;
	}
	//@Override
	public void mouseClicked(MouseEvent e) 
	{
		MyDialog5 md = new MyDialog5(ref);
		//ref.dispose();
	}
}

class MyActionListener5 implements ActionListener
{
	
	MyDialog5 dref;
	public MyActionListener5(MyDialog5 md5) 
	{
		
		dref = md5;
	}
	//@Override
	public void actionPerformed(ActionEvent e) 
	{
		Button btnclicked;
		btnclicked = (Button)e.getSource();
		if(btnclicked.getActionCommand().equals("YES"))
		{
			//System.out.println("EXIT the window");
			dref.myframe.dispose();
			dref.dispose();
			
		}
		else if(btnclicked.getActionCommand().equals("NO"))
		{
			//System.out.println("Do not EXIT the window");
			dref.dispose();
		}
	
	}
	
}

class MyItemListener5 implements ItemListener
{
	
	Myframe5 ref;
	
	public MyItemListener5(Myframe5 temp)
	{
		ref = temp;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		
		//String str1 = ref.cmbday.getSelectedItem();
		//int day = Integer.parseInt(str1);
		String str2 = ref.cmbmonth.getSelectedItem();
		int month = Integer.parseInt(str2);
		
		String str3 = ref.cmbyear.getSelectedItem();
		int year = Integer.parseInt(str3);
	
		if((e.getSource() == ref.cmbmonth) || (e.getSource() == ref.cmbyear))
		{
		   ref.cmbday.removeAll();
		   ref.fillday(month, year);
		}
	}
	
}

class MyKeyListener5 implements KeyListener
{
	
	Myframe5 ref;
	public MyKeyListener5(Myframe5 temp)
	{
		ref = temp;
	}
	
	public void keyPressed(KeyEvent e)
	{
		System.out.println("Key pressed");
	}
	
	public void keyReleased(KeyEvent e)
	{
		System.out.println("Key released");
	}
	
	public void keyTyped(KeyEvent e)
	{
		System.out.println("Key typed");
		char ch;
		ch = e.getKeyChar();
		ref.txtno.requestFocus();
		System.out.println("u typed : "+ ch);
		
		if(Character.isDigit(ch)==false)
		{
			e.consume();
		}
		else
		{
			ref.cnt++;
			if(ref.cnt >10)
			{
				MyDialog6 obj = new MyDialog6(ref);
			}
		}
		
	}

	
	
}


class MyDialog5 extends Dialog
{
	Myframe5 myframe;
	Label lblmsg;
	Button btnyes,btncancel;
	public MyDialog5(Myframe5 temp) 
	{
		super(temp,false);
		myframe = temp;
		setLayout(null);
		//setUndecorated(true);
		setSize(300,300);
		setBackground(new Color(58,158,239));
		setResizable(false);
		setLocationRelativeTo(temp);
		initialize();
		setVisible(true);
	}
	private void initialize()
	{
		
		MyActionListener5 ma5 = new MyActionListener5(this);
		
		lblmsg = new Label("Do you want to exit?");
		lblmsg.setFont(new Font("Serif",Font.BOLD,20));
		lblmsg.setBounds(20,40,200,30);
		add(lblmsg);
		
		
		btnyes = new Button("YES");
		btnyes.setBounds(40,150,100,35);
		btnyes.setFont(new Font("Serif",Font.BOLD,20));
		btnyes.setBackground(Color.red);
		btnyes.setForeground(Color.white);
		btnyes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnyes.addActionListener(ma5);
		add(btnyes);
		
		btncancel = new Button("NO");
		btncancel.setBounds(160,150,100,35);
		btncancel.setFont(new Font("Serif",Font.BOLD,20));
		btncancel.setBackground(Color.red);
		btncancel.setForeground(Color.white);
		btncancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btncancel.addActionListener(ma5);
		add(btncancel);
	}
	
}


class MyDialog6 extends Dialog
{
	Myframe5 myframe1;
	Label lblmsg;
	Button btnyes;
	public Object lbltotal;
	public String total;
	public MyDialog6(Myframe5 temp) 
	{
		super(temp,false);
		myframe1 = temp;
		setLayout(null);
		//setUndecorated(true);
		setSize(300,300);
		setBackground(new Color(58,158,239));
		setResizable(false);
		setLocationRelativeTo(temp);
		initialize();
		setVisible(true);
	}
	private void initialize()
	{
		
		MyActionListener6 ma6 = new MyActionListener6(this);
		
		lblmsg = new Label("Please enter valid Mobile.no!");
		lblmsg.setFont(new Font("verdena",Font.BOLD,18));
		lblmsg.setBounds(10,40,250,30);
		add(lblmsg);
		
		
		btnyes = new Button("OK"); 
		btnyes.setBounds(100,150,100,40);
		btnyes.setFont(new Font("verdena",Font.BOLD,15));
		btnyes.setBackground(Color.red);
		btnyes.setForeground(Color.white);
		btnyes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnyes.addActionListener(ma6);
		add(btnyes);
		
	}
	
}

class MyActionListener6 implements ActionListener
{
	
	MyDialog6 dref1;
	public MyActionListener6(MyDialog6 md6) 
	{
		
		dref1 = md6;
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) 
	{
		Button btnclicked;
		btnclicked = (Button)e.getSource();
		if(btnclicked.getActionCommand().equals("OK"))
		{
			//System.out.println("EXIT the window");
			//dref1.myframe1.dispose();
			dref1.dispose();
		}
	}
	
}


class MyMouseListener6 extends MouseAdapter
{
	Myframe5 ref;
	
	public MyMouseListener6(Myframe5 temp) 
	{
		ref = temp;
	}
	//@Override
	public void mouseClicked(MouseEvent e) 
	{
		MyDialog6 md = new MyDialog6(ref);
		//ref.dispose();
	}
}

class MyItemListener7 implements ItemListener
{
	Myframe5 ref;
	public MyItemListener7(Myframe5 temp)
	{
		ref = temp;
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox chktemp = (Checkbox)ie.getSource();
	
		if(chktemp.getState()==true)
		{
			if(chktemp == ref.chkC || chktemp == ref.chkDS || chktemp == ref.chkADS)
			{
				ref.total = ref.total + 3000;
			}
			if(chktemp == ref.chkCPP)
			{
				ref.total = ref.total + 3500;
			}
			if(chktemp == ref.chkJAVA || chktemp == ref.chkPython)
			{
				ref.total = ref.total + 4000;
			}
		
		}
		else if(chktemp.getState()==false)
		{
			if(chktemp == ref.chkC || chktemp == ref.chkDS || chktemp == ref.chkADS)
			{
				ref.total = ref.total - 3000;
			}
			if(chktemp == ref.chkCPP)
			{
				ref.total = ref.total - 3500;
			}
			if(chktemp == ref.chkJAVA || chktemp == ref.chkPython)
			{
				ref.total = ref.total - 4000;
			}
		}
	}
}




class MyMouseListener6_1 extends MouseAdapter
{
	Myframe5 ref;
	public MyMouseListener6_1(Myframe5 temp)
	{
		ref = temp;
	}
	public void mouseClicked(MouseEvent ae) 
	{
		
		if(ae.getSource() == ref.btnpay)
		{
			ref.lblpay.setText("PAYMENT SUCCESSFULL !");
			return;
		}
		
		if(ae.getSource() == ref.btnconfirm)
		{
		
		if(ref.txtname.getText().equals("") || ref.txtno.getText().equals("") || ref.cmbday.getSelectedItem().equals("DAY") || ref.cmbmonth.getSelectedItem().equals("MONTH") ||
				ref.cmbyear.getSelectedItem().equals("YEAR") || ref.cmbcollege.getSelectedItem().equals("Select college here"))
		{
			
			ref.md = new Mydialog6_1(ref);
		}
		
		else 
		{
			ref.lbltotal.setText("TOTAL :: " + " "+ ref.total);
		}
		}
		
	}
}








class Mydialog6_1 extends Dialog
{
	Myframe5 ref;
	Label lbl;
	Button btnok;
	public Mydialog6_1(Myframe5 temp)
	{
		super(temp,false);
		setSize(350,200);
		setLayout(null);
		ref  = temp;
		setBackground(Color.CYAN);
		setUndecorated(true);
		setLocationRelativeTo(temp);
		setLayout(null);
		addComp();
		setVisible(true);
	}
	public void addComp()
	{
		
		lbl = new Label("Fill complete form to proceed");
		lbl.setBounds(30,50,300,30);
		lbl.setFont(new Font("verdena",Font.BOLD, 20));
		lbl.setForeground(Color.black);
		add(lbl);
	
		btnok = new Button("OK");
		btnok.setBounds(135,120,50,30);
		btnok.setBackground(Color.yellow);
		btnok.setForeground(Color.red);
		btnok.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnok.addActionListener(new MyActionListener62(this));
		//btnok.setActionCommand("ok");
		btnok.setFont(new Font("verdena",Font.BOLD, 20));
		add(btnok);
		
	}
}
class MyActionListener62 implements ActionListener
{
	
	Mydialog6_1 ref;
	public MyActionListener62(Mydialog6_1 temp)
	{
		ref = temp;
	}
	
	public void actionPerformed(ActionEvent me)
	{
		
		if(me.getSource() == ref.btnok)
		{
			System.out.println("dispose");
			ref.dispose();
		}
		
	}
}


class MyMouseListener9 extends MouseAdapter
{
	Myframe5 ref;
	
	public MyMouseListener9(Myframe5 temp)
	{
		ref = temp;
	}
	public void mouseClicked(MouseEvent e)
	{
		MyDialog90  obje = new MyDialog90(ref);
	}
}

class MyDialog90 extends Dialog
{
	Myframe5 myframe;
	Label lblmsg;
	Button btncls;
	
	public MyDialog90(Myframe5 temp) 
	{
		super(temp,false);
		myframe = temp;
		setUndecorated(true);
		setLayout(null);
		setSize(300,200);
		setBackground(new Color(192,247,127));
		setResizable(false);
		setLocationRelativeTo(temp);
		initialize();
		setVisible(true);
	}
	private void initialize()
	{
		
		MyActionListener90 ma2 = new MyActionListener90(this);
		
		lblmsg = new Label("Payment Successfully Done!");
		lblmsg.setFont(new Font("verdena",Font.BOLD,16));
		lblmsg.setBounds(10,30,240,30);
		add(lblmsg);
		
		
		btncls = new Button("Close");
		btncls.setBounds(100,130,100,40);
		btncls.setFont(new Font("verdena",Font.BOLD,20));
		btncls.setBackground(Color.yellow);
		btncls.setForeground(Color.black);
		btncls.addActionListener(ma2);
		add(btncls);
	}
}


class MyActionListener90 implements ActionListener
{	
	
	MyDialog90 mdref2;
	public MyActionListener90(MyDialog90 md2) 
	{
		mdref2 = md2;
	}
	
	
	
	
	
	
	//@Override
	public void actionPerformed(ActionEvent e) 
	{
		Button btnclicked;
		btnclicked = (Button)e.getSource();
		if(btnclicked.getActionCommand().equals("Close"))
		{
			//System.out.println("EXIT the window");
			//mdref2.myframe.dispose();
			mdref2.dispose();
			
		}
	}
}

public class Pro5
{
	public static void main(String[] args)
	{
		Myframe5 obj = new Myframe5();
	}

}
