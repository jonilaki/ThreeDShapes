package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.entities.Sphere;

public class SphereForm implements ActionListener{
	JFrame frame;
	JButton backbtn=new JButton("Back");
	JButton calcbtn=new JButton("Calculate");
	private JLabel radiuslb= new JLabel("Radius") ;
	private JLabel diameterlb= new JLabel("diameter") ;
	private JLabel circumferencelb= new JLabel("circumference") ;
	private JLabel volumelb= new JLabel("volume") ;
	private JLabel surfacelb= new JLabel("surface") ;
	private JTextField radiustxt =new JTextField("");
	

	public SphereForm() 

	{

		createWindow();
		addComponentToFrame();
		setLocationAndSize();
		addEventAction();
	}


	private void createWindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 700, 400);
		frame.setTitle("Sphere");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);


	}

	private void addComponentToFrame() {
		frame.add(radiuslb);
		frame.add(diameterlb);
		frame.add(surfacelb);
		frame.add(volumelb);
		frame.add(circumferencelb);
		frame.add(radiustxt);
		frame.add(backbtn);
		frame.add(calcbtn);
	}

	private void setLocationAndSize() {
		radiustxt.setBounds(50, 50, 100, 20);
		backbtn.setBounds(500, 50, 100, 20);
		calcbtn.setBounds(300, 50, 100, 20);
		radiuslb.setBounds(50, 100, 100, 20);
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
		Sphere sph=new Sphere();
				
		if(e.getSource()==radiustxt) {
			sph.setRadius(Double.parseDouble(radiustxt.getText()));
			diameterlb.setText(Double.toString(sph.calculateDiameter()));
			circumferencelb.setText(Double.toString(sph.calculateCircumference()));
			surfacelb.setText(Double.toString(sph.calculateSurface()));
			volumelb.setText(Double.toString(sph.calculateVolume()));
			//SphereForm spfrm=new SphereForm();
			
		}
		
		if(e.getSource()==calcbtn) {
			sph.setRadius(Double.parseDouble(radiustxt.getText()));
			diameterlb.setText(Double.toString(sph.calculateDiameter()));
			circumferencelb.setText(Double.toString(sph.calculateCircumference()));
			surfacelb.setText(Double.toString(sph.calculateSurface()));
			volumelb.setText(Double.toString(sph.calculateVolume()));
						
		}
		
		if(e.getSource()==backbtn) {
			ThreeDShapesMain tdsm=new ThreeDShapesMain();
			frame.dispose();
		}

	}
	public static void main(String[] args) {
		SphereForm sphfrm=new SphereForm();

	}

}
