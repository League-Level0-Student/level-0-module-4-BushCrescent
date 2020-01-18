package _06_test_scores;

import javax.swing.JOptionPane;

public class testscores {
	public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What did you get on your test?");
		double num = Double.parseDouble(score);
		if (num < 70) {
			JOptionPane.showMessageDialog(null, " lol noob");
		} else if (num > 70) {
			JOptionPane.showMessageDialog(null, "not bad");
		}
	}
}
