package _03_string_conversion._3_rollercoaster;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args){
String heightAsString = JOptionPane.showInputDialog(null, "enter your height in inches");
Integer heightAsInt = Integer.parseInt(heightAsString);
if( heightAsInt > 48 ) {
JOptionPane.showMessageDialog(null,"Hooray, you can ride the roller coaster alone.");
}
else{
if( heightAsInt > 42){
JOptionPane.showMessageDialog(null, "You can ride with someone else");
}
else{
JOptionPane.showMessageDialog(null,"Sorry, youare not tall enought to ride");
}
}
}
	// 1) Make a main method that includes all the steps below…. 
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		
		// Uncomment the line below...
			//if( heightToRide > 42 ) { }
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
} 
