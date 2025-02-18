package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_numbers {
public static void main(String[] args){
Random ran = new Random();
int ran_1 = ran.nextInt(10);
int ran_2 = ran.nextInt(10);
int ran_3 = ran.nextInt(10);
int ran_4 = ran.nextInt(10);
int ran_5 = ran.nextInt(10);
int ran_6 = ran.nextInt(10);
JOptionPane.showMessageDialog(null, "Lottery Ticket "  +ran_1+ +ran_2+ +ran_3+  +ran_4+  +ran_5+ +ran_6++ );
}
}
