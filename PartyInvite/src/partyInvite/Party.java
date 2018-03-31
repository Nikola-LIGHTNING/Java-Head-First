package partyInvite;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Party {
    public static void main(String[] args) {
        int x;        
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        buildInvite();        
        System.out.print("Input: " + x);
    }    
    
    public static void buildInvite() {
	Frame f = new Frame();
	Label l = new Label("Party at Kolio's");
	Button b = new Button("You bet!");
	Button c = new Button("Shoot me!");
	Panel p = new Panel();
	p.add(l);
    }	// more code here...	
}