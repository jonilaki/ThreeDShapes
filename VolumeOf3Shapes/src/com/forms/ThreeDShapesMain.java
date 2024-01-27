package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ThreeDShapesMain implements ActionListener {
	
	JFrame frame;
	JButton spherebtn=new JButton("Sphere");
	JButton cubebtn=new JButton("Cube");
	JButton cylinderbtn=new JButton("Cylinder");
	JButton conebtn=new JButton("Cone");
	JButton cuboidbtn=new JButton("Cuboid");
	
	public ThreeDShapesMain() {
		
		createWindow();
		addComponentToFrame();
		setLocationAndSize();
		addEventAction();
	}
	

	private void createWindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 700, 400);
		frame.setTitle("Volume of 3D shapes");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
				
		
	}

	private void addComponentToFrame() {
		frame.add(conebtn);
		frame.add(cubebtn);
		frame.add(cuboidbtn);
		frame.add(cylinderbtn);
		frame.add(spherebtn);
		

		
	}

	private void setLocationAndSize() {
		spherebtn.setBounds(50, 100, 100, 20);
		cubebtn.setBounds(170, 100, 70, 20);
		cylinderbtn.setBounds(250, 100, 100, 20);
		conebtn.setBounds(380, 100, 100, 20);
		cuboidbtn.setBounds(500, 100,100, 20);
		
	}

	private void addEventAction() {
		spherebtn.addActionListener(this);
		cubebtn.addActionListener(this);
		cylinderbtn.addActionListener(this);
		conebtn.addActionListener(this);
		cuboidbtn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==spherebtn) {
			
			SphereForm spfrm=new SphereForm();
			frame.dispose();
		}else if(e.getSource()==cubebtn) {
			
			CubeForm cbfrm=new CubeForm();
			frame.dispose();
		}else if(e.getSource()==cylinderbtn) {
			
			CylinderForm cyfrm=new CylinderForm();
			frame.dispose();
		}else if(e.getSource()==conebtn) {
			
			ConeForm cnfrm=new ConeForm();
			frame.dispose();
		}else if(e.getSource()==cuboidbtn) {
			
			CuboidForm cnfrm=new CuboidForm();
			frame.dispose();
		}
		
	}
public static void main(String[] args) {
	ThreeDShapesMain thred=new ThreeDShapesMain();
	
}
}
