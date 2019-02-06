import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame salaryCalculator = new JFrame();
		salaryCalculator.setBounds(300, 200, 500, 300);
		salaryCalculator.setLayout(null);
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		JLabel hoursPerWeek = new JLabel("Hours/Week: ");
		hourlyRate.setBounds(50, 50, 100, 20);
		hoursPerWeek.setBounds(50, 70, 100, 20);
		salaryCalculator.add(hourlyRate);
		salaryCalculator.add(hoursPerWeek);
		
		JTextField txt1 = new JTextField();
		JTextField txt2 = new JTextField();
		txt1.setBounds(170, 50, 100, 20);
		txt2.setBounds(170, 70, 100, 20);
		salaryCalculator.add(txt1);
		salaryCalculator.add(txt2);
		
		JCheckBox fullTime = new JCheckBox("Full Time");
		fullTime.setBounds(50, 90, 100, 20);
		salaryCalculator.add(fullTime);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(50, 120, 100, 20);
		salaryCalculator.add(calculate);
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(!fullTime.isSelected())
						{
							int salary = hourlyRate.getText() * hoursPerWeek.getText() * 52
							annualSalary.setText();
						}
					}
				});
		
		JLabel annualSalary = new JLabel("Annual Salary: $");
		annualSalary.setBounds(170, 120, 200, 20);
		salaryCalculator.add(annualSalary);
		
		
		salaryCalculator.setVisible(true);
		salaryCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
