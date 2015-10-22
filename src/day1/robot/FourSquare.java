package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Q = new Robot();

	void go() {
		Q.penDown();
		// 4. Make the robot move as fast as possible
		Q.setSpeed(11);
		// 5. Set the pen width to 5
		Q.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for(int i=0; i<4;i++)
			// 7. Set the pen color to random
			Q.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			Q.turn(90);
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
	//for(int o=0; o<4;o++);{
	Q.move(100);
	Q.turn(90);
		//}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
