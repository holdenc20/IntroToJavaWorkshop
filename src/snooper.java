import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog(null,"Hi, what is your name?");
JOptionPane.showMessageDialog(null,"Hi, "+ name);
String time=JOptionPane.showInputDialog(null,"What time is it?");
String robtime=JOptionPane.showInputDialog(null,"When is a good time to rob your house?");
String age = JOptionPane.showInputDialog(null,"What is your age?");
//JOptionPane.showMessageDialog(null,"Hi, you are "+ age+" years old");
String house = JOptionPane.showInputDialog(null,"Where do you live?");
//JOptionPane.showMessageDialog(null,"You live at "+ house);
String creditcard = JOptionPane.showInputDialog(null,"What is your creditcard number and the carier of it?");
//JOptionPane.showMessageDialog(null,"Your creditcard is "+ creditcard);
JOptionPane.showMessageDialog(null,"Sorry you are not very smart");
JOptionPane.showMessageDialog(null,"You are "+name+". "+age+" years old. You live at "+house+" and your creditcard number is "+creditcard);
JOptionPane.showMessageDialog(null,"I will rob you at "+robtime);
JOptionPane.showMessageDialog(null,"Watch out!");
System.out.println("SCARRRRRY");
}
}
