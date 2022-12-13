/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Menu.java
 * Purpose: This is the main class of the program, it interacts with the user using a command line menu.
 *    It shows the user a group of menu, accepts the user's input, error checks the input and acts based 
 *    on the input accepted from the user.
 */

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Date;

public class Menu extends JFrame implements ActionListener {
	static Scanner input = new Scanner(System.in);
	JFrame frame = new JFrame("Choose an option.");
	JPanel panel = new JPanel();

	public static float Check(String value) {
		float num = 0;
		try{
			num = Float.parseFloat(value);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter a numeric value.");
		}
		return num;
	}

	Menu() throws IllegalVariableException{
		panel.setLayout(new GridLayout(9,1));
			ButtonGroup group  = new ButtonGroup();
			JRadioButton  cir  = new JRadioButton("Construct a Circle");
			cir.setActionCommand("Circle");
			cir.addActionListener(this);
			panel.add(cir);     group.add(cir);
			JRadioButton  rec  = new JRadioButton("Construct a Rectangle");
			rec.setActionCommand("Rectangle");
			rec.addActionListener(this);
			panel.add(rec); 	group.add(rec);
			JRadioButton  sq   = new JRadioButton("Construct a Square");
			sq.setActionCommand("Square");
			sq.addActionListener(this);
			panel.add(sq); 		group.add(sq);
			JRadioButton  tri  = new JRadioButton("Construct a Triangle");
			tri.setActionCommand("Triangle");
			tri.addActionListener(this);
			panel.add(tri);		group.add(tri);
			JRadioButton  sph  = new JRadioButton("Construct a Sphere");
			sph.setActionCommand("Sphere");
			sph.addActionListener(this);
			panel.add(sph);		group.add(sph);
			JRadioButton  cub  = new JRadioButton("Construct a Cube");
			cub.setActionCommand("Cube");
			cub.addActionListener(this);
			panel.add(cub);		group.add(cub);
			JRadioButton  cone = new JRadioButton("Construct a Cone");
			cone.setActionCommand("Cone");
			cone.addActionListener(this);
			panel.add(cone);	group.add(cone);
			JRadioButton  cyl  = new JRadioButton("Construct a Cylinder");
			cyl.setActionCommand("Cylinder");
			cyl.addActionListener(this);
			panel.add(cyl);		group.add(cyl);
			JRadioButton  tor  = new JRadioButton("Construct a Torus");
			tor.setActionCommand("Torus");
			tor.addActionListener(this);
			panel.add(tor);		group.add(tor);
			JRadioButton  ex   = new JRadioButton("Exit Program");
			ex.setMnemonic('e');
			ex.setActionCommand("Exit");
			ex.addActionListener(this);
			panel.add(ex);		group.add(ex);
			frame.add(panel);
			frame.setLocation(150, 150);
			frame.setSize(300,400);
			frame.setVisible(true);
	}
	
	double circle(String a) {
		Circle circle = new Circle(Float.parseFloat(a));
		return circle.CalculateArea();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton image = new JButton("Get image");
		image.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String imagePath = "src/images/"+e.getActionCommand()+".jpg";
				BufferedImage picture = null;
				try {
					 picture = ImageIO.read(new /*URL*/File(imagePath));
				} catch (IOException e1) {
					JOptionPane.showInternalMessageDialog(null, e1, getTitle(), JOptionPane.ERROR_MESSAGE);
				}
				JLabel picLabel = new JLabel(new ImageIcon(imagePath));
				JPanel jPanel = new JPanel();
				jPanel.add(picLabel);
				JFrame f = new JFrame(e.getActionCommand()+" image");
				f.setSize(new Dimension(picture.getWidth(), picture.getHeight()));
				f.add(jPanel);
				f.setVisible(true);
			}});
		switch(e.getActionCommand()) {
			case "Circle":
				JFrame cirFrame = new JFrame("Circle");
				JPanel cirPanel = new JPanel();
				JLabel input = new JLabel("Enter radius"), output = new JLabel("Area: ");
				JTextField rad = new JTextField(5), cirArea = new JTextField(20);
				JButton area = new JButton("Calculate Area");
				image.setActionCommand("circle");
				area.setSize(20, 20);
				image.setSize(20, 20);
				area.addActionListener(new ActionListener() {
				       @Override
				        public void actionPerformed(ActionEvent e) {
				        	   Circle circle = new Circle(Check(rad.getText()));
				        	   cirArea.setText(String.valueOf(circle.CalculateArea()));
				        	   cirPanel.add(output);
				        	   cirPanel.add(cirArea);
				        	   cirPanel.revalidate();
				        }
				 });
				cirPanel.setLayout(new GridLayout(3,2));
				cirPanel.add(input);
				cirPanel.add(rad);
				cirPanel.add(area);
				cirPanel.add(image);
				cirFrame.add(cirPanel);
				cirFrame.setSize(350, 200);
				cirFrame.setVisible(true);
				break;
			case "Cone":
				JFrame coneFrame = new JFrame("Cone");
				JPanel conePanel = new JPanel();
				JLabel cBLabel = new JLabel("Enter Base: "), cHLabel = new JLabel("Enter Height: "),
									cone_Label = new JLabel("Area: ");
				JTextField rText = new JTextField(5), h_Text = new JTextField(5),
						cArea_Text = new JTextField(10);
				JButton cone_area = new JButton("Calculate Volume");
				cone_area.setSize(20, 20);
				image.setActionCommand("cone");
				image.setSize(20, 20);
				cone_area.addActionListener(new ActionListener() {
				       @Override
				        public void actionPerformed(ActionEvent e) {
				        	   Cone cone = new Cone(Check(rText.getText()),Check(h_Text.getText()));
				        	   cArea_Text.setText(String.valueOf(cone.CalculateVolume()));
				        	   conePanel.add(cone_Label);
				        	   conePanel.add(cArea_Text);
				        	   conePanel.revalidate();
				        }
				 });
				conePanel.setLayout(new GridLayout(4,2));
				conePanel.add(cBLabel);
				conePanel.add(rText);
				conePanel.add(cHLabel);
				conePanel.add(h_Text);
				conePanel.add(cone_area);
				conePanel.add(image);
				coneFrame.add(conePanel);
				coneFrame.setSize(350,200);
				coneFrame.setVisible(true);
				break;
			case "Cube":
				JFrame cubeFrame = new JFrame("Cube");
				JPanel cubePanel = new JPanel();
				JLabel cLength = new JLabel("Enter length"), c_ALabel = new JLabel("Area: ");
				JTextField cLText = new JTextField(5), cube_area = new JTextField(10);
				JButton cube_calc = new JButton("Calculate Volume");
				cube_calc.addActionListener(new ActionListener() {
				     @Override
				     public void actionPerformed(ActionEvent e) {
				        Cube cube = new Cube(Check(cLText.getText()));
				        cube_area.setText(String.valueOf(cube.CalculateVolume()));
				        cubePanel.add(c_ALabel);
				        cubePanel.add(cube_area);
				        cubePanel.revalidate();
				     }
				 });
				image.setActionCommand("cube");
				cube_calc.setSize(20, 20);
				image.setSize(20, 20);
				cubePanel.setLayout(new GridLayout(3,2));
				cubePanel.add(cLength);
				cubePanel.add(cLText);
				cubePanel.add(cube_calc);
				cubePanel.add(image);
				cubeFrame.add(cubePanel);
				cubeFrame.setSize(350,200);
				cubeFrame.setVisible(true);
				break;
			case "Cylinder":
				JFrame cylFrame = new JFrame("Cylinder");
				JPanel cylPanel 	= new JPanel();
				JLabel cyl_RLabel = new JLabel("Enter Radius: "), cyl_HLabel = new JLabel("Enter Height: "),
				cyl_Label = new JLabel("Area: ");
				JTextField cyl_rad = new JTextField(5), cyl_height = new JTextField(5),
						cyl_Area = new JTextField(10);
				JButton cyl_area = new JButton("Calculate Volume");
				cyl_area.setSize(20, 20);
				image.setSize(20, 20);
				cyl_area.addActionListener(new ActionListener() {
				     @Override
				     public void actionPerformed(ActionEvent e) {
				        Cylinder cyl = new Cylinder(Check(cyl_rad.getText()),Check(cyl_height.getText()));
				        cyl_Area.setText(String.valueOf(cyl.CalculateVolume()));
				        cylPanel.add(cyl_Label);
				        cylPanel.add(cyl_Area);
				        cylPanel.revalidate();
				     }
				 });
				image.setActionCommand("cylinder");
				cylPanel.setLayout(new GridLayout(4,2));
				cylPanel.add(cyl_RLabel);
				cylPanel.add(cyl_rad);
				cylPanel.add(cyl_HLabel);
				cylPanel.add(cyl_height);
				cylPanel.add(cyl_area);
				cylPanel.add(image);
				cylFrame.add(cylPanel);
				cylFrame.setSize(350, 200);
				cylFrame.setVisible(true);
				break;
			case "Exit":
				JOptionPane.showMessageDialog(null, "Thanks for using the application. Today is: "+ new Date());
				frame.dispose();
				System.exit(0);
				break;
			case "Rectangle":
				JFrame recFrame = new JFrame("Rectangle");
				JPanel recPanel = new JPanel();
				JLabel rLen = new JLabel("Enter Length: "), rWid = new JLabel("Enter Width: "),
											rec_Label = new JLabel("Area: ");
				JTextField recLength = new JTextField(5), recWidth = new JTextField(5),
												recArea = new JTextField(10);
				JButton rec_area = new JButton("Calculate Area");
				rec_area.setSize(20, 20);
				image.setSize(20, 20);
				rec_area.addActionListener(new ActionListener() {
				     @Override
				     public void actionPerformed(ActionEvent e) {
				        Rectangle rectangle = new Rectangle(Check(recLength.getText()), Check(recWidth.getText()));
				        recArea.setText(String.valueOf(rectangle.CalculateArea()));
				        recPanel.add(rec_Label);
				        recPanel.add(recArea);
				        recPanel.revalidate();
				     }
				 });
				image.setActionCommand("rectangle");
				recPanel.setLayout(new GridLayout(4,2));
				recPanel.add(rLen);
				recPanel.add(recLength);
				recPanel.add(rWid);
				recPanel.add(recWidth);
				recPanel.add(rec_area);
				recPanel.add(image);
				recFrame.add(recPanel);
				recFrame.setSize(350, 200);
				recFrame.setVisible(true);				
				break;
			case "Sphere":				
				JFrame sphFrame = new JFrame("Sphere");
				JPanel sphPanel = new JPanel();
				JLabel sph_RLabel = new JLabel("Enter radius"), 
								sph_VolLabel = new JLabel("Area: ");
				JTextField sphRad = new JTextField(5), out = new JTextField(10);
				JButton sphArea = new JButton("Calculate Volume");
				sphArea.addActionListener(new ActionListener() {
				       @Override
				        public void actionPerformed(ActionEvent e) {
				        	   Sphere sphere = new Sphere(Check(sphRad.getText()));
				        	   out.setText(String.valueOf(sphere.CalculateVolume()));
				        	   sphPanel.add(sph_VolLabel);
				        	   sphPanel.add(out);
				        	   sphPanel.revalidate();
				        }
				 });
				image.setActionCommand("sphere");
				sphArea.setSize(20, 20);
				image.setSize(20, 20);
				sphPanel.setLayout(new GridLayout(3,2));
				sphPanel.add(sph_RLabel);
				sphPanel.add(sphRad);
				sphPanel.add(sphArea);
				sphPanel.add(image);
				sphFrame.add(sphPanel);
				sphFrame.setSize(350, 200);
				sphFrame.setVisible(true);
				break;
			case "Square":
				JFrame sqFrame = new JFrame("Square");
				JPanel sqPanel = new JPanel();
				JLabel sq_lenLabel = new JLabel("Enter length"), sqALabel = new JLabel("Area: ");
				JTextField sq_length = new JTextField(5), sqArea = new JTextField(10);
				JButton sq_area = new JButton("Calculate Area");
				sq_area.addActionListener(new ActionListener() {
				       @Override
				        public void actionPerformed(ActionEvent e) {
				        	   Square square = new Square(Check(sq_length.getText()));
				        	   sqArea.setText(String.valueOf(square.CalculateArea()));
				        	   sqPanel.add(sqALabel);
				        	   sqPanel.add(sqArea);
				        	   sqPanel.revalidate();
				        }
				 });
				image.setActionCommand("square");
				sq_area.setSize(20, 20);
				image.setSize(20, 20);
				sqPanel.setLayout(new GridLayout(3,2));
				sqPanel.add(sq_lenLabel);
				sqPanel.add(sq_length);
				sqPanel.add(sq_area);
				sqPanel.add(image);
				sqFrame.add(sqPanel);
				sqFrame.setSize(350, 200);
				sqFrame.setVisible(true);
				break;
			case "Triangle":
				JFrame triFrame = new JFrame("Triangle");
				JPanel triPanel = new JPanel();
				JLabel tri_bLabel = new JLabel("Enter Base: "), tri_hLabel = new JLabel("Enter Height: "),
				tri_ALabel = new JLabel("Area: ");
				JTextField triBase = new JTextField(5), triHeight = new JTextField(10), triArea = new JTextField(10);
				JButton tri_area = new JButton("Calculate Area");
				tri_area.addActionListener(new ActionListener() {
				     @Override
				     public void actionPerformed(ActionEvent e) {
				        Triangle triangle = new Triangle(Check(triBase.getText()), Check(triHeight.getText()));
				        triArea.setText(String.valueOf(triangle.CalculateArea()));
				        triPanel.add(tri_ALabel);
				        triPanel.add(triArea);
				        triPanel.revalidate();
				     }
				 });
				triPanel.setLayout(new GridLayout(4,2));
				image.setActionCommand("triangle");
				tri_area.setSize(20, 20);
				image.setSize(20, 20);
				triPanel.add(tri_bLabel);
				triPanel.add(triBase);
				triPanel.add(tri_hLabel);
				triPanel.add(triHeight);
				triPanel.add(tri_area);
				triPanel.add(image);
				triFrame.add(triPanel);
				triFrame.setSize(350, 200);
				triFrame.setVisible(true);
				break;
			case "Torus":
				JFrame torusFrame = new JFrame("Torus");
				JPanel torusPanel = new JPanel();
				JLabel outer_Label = new JLabel("Enter the outer radius: "), 
						inner_Label = new JLabel("Enter the inner radius: "),
						torus_Label = new JLabel("Area: ");
				JTextField outerText = new JTextField(5), innerText = new JTextField(5), 
														torusArea = new JTextField(10);
				JButton torus_area = new JButton("Calculate Volume");
				torus_area.addActionListener(new ActionListener() {
				     @Override
				     public void actionPerformed(ActionEvent e) {
				        try {
							Torus torus = new Torus(Check(innerText.getText()), Check(outerText.getText()));
							torusArea.setText(String.valueOf(torus.CalculateVolume()));
						} catch (IllegalVariableException e1) {
							JOptionPane.showInternalMessageDialog(null, e1, getTitle(), JOptionPane.ERROR_MESSAGE);
						}
				        torusPanel.add(torus_Label);
				        torusPanel.add(torusArea);
				        torusPanel.revalidate();
				     }
				 });
				torusPanel.setLayout(new GridLayout(4,2));
				torus_area.setSize(20, 20);
				image.setActionCommand("torus");
				image.setSize(20, 20);
				torusPanel.add(outer_Label);
				torusPanel.add(outerText);
				torusPanel.add(inner_Label);
				torusPanel.add(innerText);
				torusPanel.add(torus_area);
				torusPanel.add(image);
				torusFrame.add(torusPanel);
				torusFrame.setSize(350, 200);
				torusFrame.setVisible(true);
				break;
			default:

		}
	}
	
	public static void main(String args[]) throws IllegalVariableException {
		new Menu();
	}
}