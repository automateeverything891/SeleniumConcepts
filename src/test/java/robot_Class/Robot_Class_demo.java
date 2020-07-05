package robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Class_demo {

	public static void main(String[] args) throws IOException,AWTException {
		
		//We are trying to store "John" in an Notepad File
		
		//Open Notepad
		Runtime.getRuntime().exec("notepad");
		
		//Create an Element of Robot
		Robot r=new Robot();
		
//		Use Robot class methods KeyPress & Keyy Release to perform actions 
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		

	}
}
