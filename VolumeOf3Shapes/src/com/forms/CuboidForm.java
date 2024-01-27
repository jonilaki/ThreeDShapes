package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.entities.Cuboid;
import com.entities.Sphere;

public class CuboidForm implements ActionListener{
	JFrame frame;
	JButton backbtn=new JButton("Back");
	JButton calcbtn=new JButton("Calculate");
	private JLabel baselb= new JLabel("Base") ;
	private JLabel heightlb= new JLabel("Height") ;
	private JLabel lenghtlb= new JLabel("Lenght") ;
	private JLabel diameterlb= new JLabel("diameter") ;
	private JLabel circumferencelb= new JLabel("circumference") ;
	private JLabel volumelb= new JLabel("volume") ;
	private JLabel surfacelb= new JLabel("surface") ;
	private JTextField Lenghtxt =new JTextField("");
	private JTextField heigthtxt=new JTextField("");
	private JTextField basetxt=new JTextField("");
	

	public CuboidForm() 

	{

		createWindow();
		addComponentToFrame();
		setLocationAndSize();
		addEventAction();
	}


	private void createWindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 700, 400);
		frame.setTitle("Cuboid");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);


	}

	private void addComponentToFrame() {
		frame.add(baselb);
		frame.add(heightlb);
		frame.add(lenghtlb);
		//frame.add(diameterlb);
		frame.add(surfacelb);
		frame.add(volumelb);
		frame.add(circumferencelb);
		frame.add(Lenghtxt);
		frame.add(basetxt);
		frame.add(heigthtxt);
		frame.add(backbtn);
		frame.add(calcbtn);
	}

	private void setLocationAndSize() {
		baselb.setBounds(50, 10, 80, 20);
		basetxt.setBounds(50, 30, 80, 20);
		
		lenghtlb.setBounds(150, 10, 80, 20);
		Lenghtxt.setBounds(150, 30, 80, 20);
		
	heightlb.setBounds(250, 10, 80, 20);
	heigthtxt.setBounds(250, 30, 80, 20);
		
		backbtn.setBounds(530, 50, 100, 20);
		calcbtn.setBounds(400, 50, 100, 20);
		
		//diameterlb.setBounds(170, 100, 70, 20);
		circumferencelb.setBounds(250, 100, 100, 20);
		surfacelb.setBounds(380, 100, 100, 20);
		volumelb.setBounds(500, 100,100, 20);

	}

	private void addEventAction() {
		
		backbtn.addActionListener(this);
		calcbtn.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Cuboid cub=new Cuboid();
				
		
		
		if(e.getSource()==calcbtn) {
			cub.setBase(Double.parseDouble(basetxt.getText()));
			cub.setLength(Double.parseDouble(Lenghtxt.getText()));
			cub.setHeight(Double.parseDouble(heigthtxt.getText()));
			//diameterlb.setText(Double.toString(cub.calculateDiameter()));
			circumferencelb.setText(Double.toString(cub.calculateCircumference()));
			surfacelb.setText(Double.toString(cub.calculateSurface()));
			volumelb.setText(Double.toString(cub.calculateVolume()));
						
		}
		
		if(e.getSource()==backbtn) {
			ThreeDShapesMain tdsm=new ThreeDShapesMain();
			frame.dispose();
		}

	}
	public static void main(String[] args) {
		CuboidForm sphfrm=new CuboidForm();

	}

}
