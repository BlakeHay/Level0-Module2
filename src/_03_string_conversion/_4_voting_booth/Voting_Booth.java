package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args){
String ageAsString = JOptionPane.showInputDialog(null, "What is your age?");
Integer ageAsInt = Integer.parseInt(ageAsString);
if(ageAsInt >= 18){
String president = JOptionPane.showInputDialog(null, "Who should be the next president.");
}
else{
JOptionPane.showMessageDialog(null,"No one cares what you think.");
}
}
}

