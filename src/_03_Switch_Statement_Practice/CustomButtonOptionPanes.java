package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sleeping all day");
			break;
		case "Monday":
			System.out.println("Mondays are the worst");
			break;
		case "Tuesday":
			System.out.println("Homework load today");
			break;
		case "Wednesday":
			System.out.println("2 more days of the week");
			break;
		case "Thursday":
			System.out.println("Tomorrow is Friday");
			break;
		case "Friday":
			System.out.println("Resting all afternoon");
			break;
		case "Saturday":
			System.out.println("On computer for the entire morning");
			break;
		default:
			System.out.println("Not a day");
			break;
		}
	}
}
