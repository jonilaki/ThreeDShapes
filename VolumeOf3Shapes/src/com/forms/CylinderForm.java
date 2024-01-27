package com.forms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.entities.Cylinder;
import com.entities.Sphere;

public class CylinderForm implements ActionListener{
	JFrame frame;
	JButton backbtn=new JButton("Back");
	JButton calcbtn=new JButton("Calculate");
	private JLabel radiuslb= new JLabel("Radius") ;
	private JLabel heightlb= new JLabel("Height") ;
	private JLabel lenghtlb= new JLabel("Lenght") ;
	private JLabel diameterlb= new JLabel("diameter") ;
	private JLabel circumferencelb= new JLabel("circumference") ;
	private JLabel volumelb= new JLabel("volume") ;
	private JLabel surfacelb= new JLabel("surface") ;
	private JTextField radiustxt =new JTextField("");
	private JTextField heigthtxt=new JTextField("");
	

	public CylinderForm() 

	{

		createWindow();
		addComponentToFrame();
		setLocationAndSize();
		addEventAction();
	}


	private void createWindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 700, 400);
		frame.setTitle("Cylinder");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);


	}

	private void addComponentToFrame() {
		frame.add(radiuslb);
		frame.add(heightlb);
		
		frame.add(diameterlb);
		frame.add(surfacelb);
		frame.add(volumelb);
		frame.add(circumferencelb);
		frame.add(radiustxt);
		frame.add(heigthtxt);
		
		frame.add(backbtn);
		frame.add(calcbtn);
	}

	private void setLocationAndSize() {
		radiustxt.setBounds(50, 50, 100, 20);
		heigthtxt.setBounds(170, 50, 100, 20);
		
		backbtn.setBounds(550, 50, 100, 20);
		calcbtn.setBounds(400, 50, 100, 20);
		radiuslb.setBounds(50, 10, 100, 20);
		heightlb.setBounds(170, 10, 100, 20);
		
		diameterlb.setBounds(170, 100, 70, 20);
		circumferencelb.setBounds(250, 100, 100, 20);
		surfacelb.setBounds(380, 100, 100, 20);
		volumelb.setBounds(500, 100,100, 20);

	}

	private void addEventAction() {
		radiustxt.addActionListener(this);
		backbtn.addActionListener(this);
		calcbtn.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Cylinder cyl=new Cylinder();
				
		if(e.getSource()==radiustxt) {
			cyl.setRadius(Double.parseDouble(radiustxt.getText()));
			cyl.setHeight(Double.parseDouble(radiustxt.getText()));
			diameterlb.setText(Double.toString(cyl.calculateDiameter()));
			circumferencelb.setText(Double.toString(cyl.calculateCircumference()));
			surfacelb.setText(Double.toString(cyl.calculateSurface()));
			volumelb.setText(Double.toString(cyl.calculateVolume()));
			//SphereForm spfrm=new SphereForm();
			
		}
		
		if(e.getSource()==calcbtn) {
			cyl.setRadius(Double.parseDouble(radiustxt.getText()));
			cyl.setHeight(Double.parseDouble(radiustxt.getText()));
			
			circumferencelb.setText(Double.toString(cyl.calculateCircumference()));
			surfacelb.setText(Double.toString(cyl.calculateSurface()));
			volumelb.setText(Double.toString(cyl.calculateVolume()));
			diameterlb.setText(Double.toString(cyl.calculateDiameter()));
						
		}
		
		if(e.getSource()==backbtn) {
			ThreeDShapesMain tdsm=new ThreeDShapesMain();
			frame.dispose();
		}

	}
	public static void main(String[] args) {
		CylinderForm sphfrm=new CylinderForm();

	}

}
