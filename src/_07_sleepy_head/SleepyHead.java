package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int vacation = JOptionPane.showConfirmDialog(null, "Is it vacation?", "Sleep head2", JOptionPane.YES_NO_OPTION);
		if (weekday == 0) {
			isWeekday = false;
		} else if (weekday == 1) {
			isWeekday = true;
		} else if (vacation == 0) {
			isVacation = false;
		} else if (vacation == 1) {
			isVacation = true;
		}
		if (isWeekday = false) {
			JOptionPane.showMessageDialog(null, "Sleep in?");
		}else if(isVacation = true) {
			JOptionPane.showMessageDialog(null, "Sleep in?");
		}else if((isWeekday = true) & (isVacation = true)) {
			JOptionPane.showMessageDialog(null, "Sleep in?");
		}else if((isWeekday = true) & (isVacation = false)) {
			JOptionPane.showMessageDialog(null, "Wake up sleepy head");
		}
		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * 
		 * 
		 * 
		 * 
		 * 
		 * /* Print “sleep in? if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!? If it is a weekday, and we are on vacation, print
		 * “sleep in?.
		 */
	}
}
