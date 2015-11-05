package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Please spell, squirrelled");
		// 2. Catch the user's answer in a String
		String answer=JOptionPane.showInputDialog("How do you spell this word?");
		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals("squirrelled")){
		speak("correct");
		JOptionPane.showMessageDialog(null,"correct!");
		}
		else{
		speak("wrong!");
		JOptionPane.showMessageDialog(null, "incorrect =(");
		speak("It is correctly spelled S Q U I R R E L L E D");
		}
		speak("Please say how many q there are");
		speak("QQQQQQQQQQQQQQQQQQQQQQQ");
		String qqq=JOptionPane.showInputDialog("How many q s are there?");
		if(qqq.equals("23")){
		speak("correct");
		JOptionPane.showMessageDialog(null,"correct!");
		}
		else{
		speak("wrong!");
		JOptionPane.showMessageDialog(null, "incorrect =(");
		speak("There are 23");
			}
		}
		
		
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


