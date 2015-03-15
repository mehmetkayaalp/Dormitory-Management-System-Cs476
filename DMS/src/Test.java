import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue Mar 03 15:36:22 EET 2015
 */



/**
 * @author Erdi KoÃ§
 */
public class Test  {

	private void label1MouseClicked(MouseEvent e) {
		// TODO add your code here
	}


	private void homeMenuMouseClicked(MouseEvent e) {
		// panel 2 refresh edilecek ilk haline dönücek 
	}

	private void button1ActionPerformed(ActionEvent e) {
		System.exit(0);
	}

	private void menuItemAddStudentMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void listStudentValueChanged(ListSelectionEvent e) {
		// TODO add your code here
	}

	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Erdi KoÃ§
		frame1 = new JFrame();
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menu2 = new JMenu();
		menuItem2 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menu3 = new JMenu();
		menuItem3 = new JMenuItem();
		menu4 = new JMenu();
		menuItem4 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem5 = new JMenuItem();
		label2 = new JLabel();
		tabbedPane1 = new JTabbedPane();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		textField1 = new JTextField();
		label1 = new JLabel();
		panel1 = new JPanel();
		scrollPane1 = new JScrollPane();
		list1 = new JList();
		button2 = new JButton();
		button1 = new JButton();

		//======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout(
				"24*(default), 4*($lcgap, default)",
				"21*(default)"));

			//======== menuBar1 ========
			{

				//======== menu1 ========
				{
					menu1.setText("Home");
					menu1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							homeMenuMouseClicked(e);
						}
					});

					//---- menuItem1 ----
					menuItem1.setText("Add Student");
					menuItem1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItemAddStudentMouseClicked(e);
						}
					});
					menu1.add(menuItem1);
				}
				menuBar1.add(menu1);

				//======== menu2 ========
				{
					menu2.setText("Dorm");

					//---- menuItem2 ----
					menuItem2.setText("Dorm 1");
					menu2.add(menuItem2);

					//---- menuItem8 ----
					menuItem8.setText("Dorm 2");
					menu2.add(menuItem8);

					//---- menuItem9 ----
					menuItem9.setText("Add Dorm");
					menu2.add(menuItem9);
				}
				menuBar1.add(menu2);

				//======== menu3 ========
				{
					menu3.setText("Room");

					//---- menuItem3 ----
					menuItem3.setText("Room Types");
					menu3.add(menuItem3);
				}
				menuBar1.add(menu3);

				//======== menu4 ========
				{
					menu4.setText("Others");

					//---- menuItem4 ----
					menuItem4.setText("Lost Materials");
					menu4.add(menuItem4);

					//---- menuItem7 ----
					menuItem7.setText("Damaged Materials");
					menu4.add(menuItem7);

					//---- menuItem5 ----
					menuItem5.setText("Contacts");
					menu4.add(menuItem5);
				}
				menuBar1.add(menu4);
			}
			frame1.setJMenuBar(menuBar1);

			//---- label2 ----
			label2.setText("                    Search Student");
			frame1ContentPane.add(label2, CC.xy(2, 2));

			//======== tabbedPane1 ========
			{

				//======== panel4 ========
				{

					// JFormDesigner evaluation mark
					panel4.setBorder(new javax.swing.border.CompoundBorder(
						new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
							"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
							javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
							java.awt.Color.red), panel4.getBorder())); panel4.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

					panel4.setLayout(new FormLayout(
						"default, $lcgap, default",
						"2*(default, $lgap), default"));
				}
				tabbedPane1.addTab("Profile", panel4);

				//======== panel5 ========
				{
					panel5.setLayout(new FormLayout(
						"default, $lcgap, default",
						"2*(default, $lgap), default"));
				}
				tabbedPane1.addTab("Payment", panel5);

				//======== panel6 ========
				{
					panel6.setLayout(new FormLayout(
						"default, $lcgap, default",
						"2*(default, $lgap), default"));
				}
				tabbedPane1.addTab("text", panel6);

				//======== panel7 ========
				{
					panel7.setLayout(new FormLayout(
						"default, $lcgap, default",
						"2*(default, $lgap), default"));
				}
				tabbedPane1.addTab("text", panel7);
			}
			frame1ContentPane.add(tabbedPane1, CC.xywh(4, 2, 29, 3));
			frame1ContentPane.add(textField1, CC.xy(2, 3));

			//---- label1 ----
			label1.setIcon(new ImageIcon(getClass().getResource("/images.png")));
			label1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					label1MouseClicked(e);
					label1MouseClicked(e);
				}
			});
			frame1ContentPane.add(label1, CC.xy(3, 3));

			//======== panel1 ========
			{
				panel1.setLayout(new FormLayout(
					"10*(default)",
					"15*(default)"));

				//======== scrollPane1 ========
				{

					//---- list1 ----
					list1.addListSelectionListener(new ListSelectionListener() {
						@Override
						public void valueChanged(ListSelectionEvent e) {
							listStudentValueChanged(e);
						}
					});
					scrollPane1.setViewportView(list1);
				}
				panel1.add(scrollPane1, CC.xywh(1, 1, 10, 15));
			}
			frame1ContentPane.add(panel1, CC.xy(2, 4));

			//---- button2 ----
			button2.setText("About Us");
			frame1ContentPane.add(button2, CC.xywh(24, 5, 7, 1));

			//---- button1 ----
			button1.setText("Quit");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			frame1ContentPane.add(button1, CC.xy(32, 5));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Erdi KoÃ§
	private JFrame frame1;
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenu menu2;
	private JMenuItem menuItem2;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenu menu3;
	private JMenuItem menuItem3;
	private JMenu menu4;
	private JMenuItem menuItem4;
	private JMenuItem menuItem7;
	private JMenuItem menuItem5;
	private JLabel label2;
	private JTabbedPane tabbedPane1;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JTextField textField1;
	private JLabel label1;
	private JPanel panel1;
	private JScrollPane scrollPane1;
	private JList list1;
	private JButton button2;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
}
