import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DateOfBirth  {
    
    

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setTitle("Date of Birth Calculator");
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(190, 254, 250));
        f.setContentPane(contentPane);
        contentPane.setLayout(null);

        long serialVersionUID = 1L;
        final JTextField textField = new JTextField();
        final JTextField textField_3 = new JTextField();
        final JTextField textField_4 = new JTextField();

        JLabel lblNewLabel = new JLabel("Enter your DOB (YYYY-MM-DD)");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(55, 30, 200, 36);
        contentPane.add(lblNewLabel);

        textField.setBounds(265, 32, 154, 36);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    LocalDate dob = LocalDate.parse(textField.getText());
                    Period age = Period.between(dob, LocalDate.now());
                    textField_3.setText(age.getYears() + " years");
                    textField_4.setText("Day of Year: " + dob.getDayOfYear());
                    //Local variable textField_4 defined in an enclosing scope must be final or effectively final

                    // Add days on the grid and highlight the birthdate with red background
                    GridLayout gd = new GridLayout(6, 7);
                    JPanel panel = new JPanel(gd);

                    LocalDate startDate = dob.withDayOfMonth(1);
                    DayOfWeek firstDayOfMonth = startDate.getDayOfWeek();
                    int emptyFields = firstDayOfMonth.getValue() - 1;

                    // Add empty fields for the days before the start of the month
                    for (int i = 0; i < emptyFields; i++) {
                        panel.add(new JButton(""));
                    }

                    // Add days of the month
                    for (int i = 1; i <= startDate.lengthOfMonth(); i++) {
                        LocalDate currentDate = startDate.withDayOfMonth(i);
                        JButton dayField = new JButton(String.valueOf(i));
                        if (currentDate.equals(dob)) {
                            dayField.setBackground(Color.RED);
                        }
                        panel.add(dayField);
                    }

                    // Fill remaining cells in the last row if required
                    int totalDays = emptyFields + startDate.lengthOfMonth();
                    int remainingCells = 6 * 7 - totalDays;
                    for (int i = 0; i < remainingCells; i++) {
                        panel.add(new JButton(""));
                    }

                    panel.setBounds(48, 196, 668, 334);
                    contentPane.add(panel);
                    contentPane.revalidate();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(435, 32, 120, 36);
        contentPane.add(btnNewButton);

        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setEditable(false);
        textField_3.setBounds(295, 113, 120, 36);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblYears = new JLabel("Your age");
        lblYears.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblYears.setBounds(326, 78, 65, 36);
        contentPane.add(lblYears);

        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setEditable(false);
        textField_4.setBounds(55, 113, 207, 36);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblCurrentDateAnd = new JLabel("Current Date and Year");
        lblCurrentDateAnd.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCurrentDateAnd.setBounds(77, 78, 163, 36);
        contentPane.add(lblCurrentDateAnd);


        f.setVisible(true);
        
    }

   
}
