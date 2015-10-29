import javax.swing.JOptionPane;

public class Questions {
public static void main(String[] args) {

String name = JOptionPane.showInputDialog(null,"What is your name?");
JOptionPane.showMessageDialog(null,"Hi, "+ name);
String feeling = JOptionPane.showInputDialog(null,"How do you feel?");

JOptionPane.showMessageDialog(null,feeling);
}
}
