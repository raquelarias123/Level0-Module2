package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	
	public static void main(String[] args) {
		String userAge = JOptionPane.showInputDialog("Enter your age (in years): ");
		int userAgeInt = Integer.parseInt(userAge);
		
		if(userAgeInt>18) {
			JOptionPane.showMessageDialog(null, "Who should the next president be? ");
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
	
	/*Ask the user how old they are (in years)
	If they are over 18, ask them who the next president should be
	If they are younger, tell them nobody cares what they think
	*/

}
