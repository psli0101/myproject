package oo.mid;

import java.util.ArrayList;
import java.util.Scanner;

public class TesterMid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList a = new ArrayList<>();
		
		Meal m = new Meal();
		Ticket t = new Ticket();
		m.order(s.nextLine(),Integer.parseInt(s.nextLine()));
		m.order(s.nextLine(),Integer.parseInt(s.nextLine()));
		m.order(s.nextLine(),Integer.parseInt(s.nextLine()));
		m.show();
	}

}
