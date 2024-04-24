import java.awt.*;
import java.util.*;
import java.util.stream.Stream;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class RegistreStudent {
	String sturegnu;
	String stname;
	String stcour;

	RegistreStudent(String sturegnu, String stname, String stcour) {
		this.sturegnu = sturegnu;
		this.stname = stname;
		this.stcour = stcour;
	}
}

public class Round1 {
	static ArrayList<RegistreStudent> student_List = new ArrayList<>();

	public static void main(String[] rk) {
		// Creating the Frame

		JFrame frame = new JFrame("Reappear Registration");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 254, 145));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		// Adding Components in the Frame

		JLabel l = new JLabel("Reappear Registration Form");
		l.setFont(new Font("Serif", 1, 30));
		l.setForeground(Color.BLUE);
		l.setBounds(110, 20, 380, 50);
		frame.add(l);

		// Name

		JTextField name = new JTextField("Student Name");
		name.setBounds(200, 100, 200, 40);
		frame.add(name);
		name.setFont(new Font("Serif", 0, 20));

		// Registration Number

		JTextField regno = new JTextField("Registration Number");
		regno.setBounds(200, 180, 200, 40);
		frame.add(regno);
		regno.setFont(new Font("Serif", 0, 20));

		// Course

		String[] courses = { "-- Select Course --", "CSE101", "CSE310", "CSE406", "INT108" };
		JComboBox<String> course = new JComboBox<>(courses);
		course.setBounds(200, 260, 200, 40);
		frame.add(course);
		course.setFont(new Font("Serif", 0, 20));

		// Register
		boolean ex = false;
		JButton register = new JButton("Register");
		register.setBounds(250, 340, 100, 40);
		frame.add(register);
		register.setFont(new Font("Serif", 0, 20));
		register.addActionListener(ae -> {

			// Stream<RegistreStudent> str = student_List.stream().filter(a ->
			// (a.sturegnu.equals(regno.getText())) &&
			// a.stcour.equals(course.getSelectedItem().toString()));
			// Object [] arr = str.toArray();
			Stream<RegistreStudent> filteredStudents = student_List.stream()
					.filter(student -> student.sturegnu.equals(regno.getText())
							&& student.stcour.equals(course.getSelectedItem().toString()));

			if (filteredStudents.findAny().isPresent()) {
				JOptionPane.showMessageDialog(frame,
						"Student with the same registration number and course already exists!");
			} else {
				student_List
						.add(new RegistreStudent(regno.getText(), name.getText(), course.getSelectedItem().toString()));
			}
		});

		// View Option

		JLabel lbl = new JLabel("View Registration Details");
		lbl.setFont(new Font("Serif", 1, 30));
		lbl.setForeground(Color.BLUE);
		lbl.setBounds(130, 460, 380, 50);
		frame.add(lbl);

		JLabel lb2 = new JLabel("Write *all* to print all registered student list ");
		lb2.setFont(new Font("Serif", 1, 20));
		lb2.setForeground(Color.BLUE);
		lb2.setBounds(160, 500, 300, 40);
		frame.add(lb2);

		JTextField reg = new JTextField("Registration Number");
		reg.setBounds(100, 550, 200, 40);
		frame.add(reg);
		reg.setFont(new Font("Serif", 2, 20));
		reg.setForeground(Color.RED);

		JButton view = new JButton("View");
		view.setBounds(320, 550, 180, 40);
		frame.add(view);
		view.setForeground(Color.RED);
		view.addActionListener(ae -> {
            /*
			we can make table like this if we don't want to update the table
			 String[][] data = {
                {"1", "John", "Doe"},
                {"2", "Jane", "Smith"},
                {"3", "Bob", "Johnson"}
            };
            String[] columns = {"ID", "First Name", "Last Name"};
            JTable myTable = new JTable(data, columns);
			 */
            
			String[] columnNames = { "regno", "Name", "course" };
			DefaultTableModel myModel = new DefaultTableModel(columnNames, 0);
			JTable myTable = new JTable(myModel);

			for (RegistreStudent st : student_List) {
				if (st.sturegnu.equals(reg.getText())) {
					myModel.addRow(new Object[] { st.sturegnu, st.stname, st.stcour });
				} else if ("all".equals(reg.getText())) {
					myModel.addRow(new Object[] { st.sturegnu, st.stname, st.stcour });
				}
			}

			JScrollPane myScroll = new JScrollPane(myTable);
			frame.add(myScroll, BorderLayout.CENTER); // borderlayout center to show drag the table;
			myScroll.setBounds(100, 600, 300, 120);
		});

		frame.setVisible(true);
	}
}