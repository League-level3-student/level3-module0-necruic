package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
	boolean top = false;	
	
        // 2. create an array of 5 robots.
		Robot[] robo= new Robot[3];;
        // 3. use a for loop to initialize the robots.
		for(int i=0; i<3; i++) {
			robo[i] = new Robot();
			robo[i].setX(300+i*50);
			robo[i].setY(500);
			robo[i].setSpeed(20);
		}
		while (!top ) {
		for(int j=0; j<3; j++) {
			Random rand = new Random();
			int distance = rand.nextInt(50);
			robo[j].move(distance);
			robo[j].turn(30);
			int yvalue = robo[j].getY();
			if(yvalue>=500) {
				top=true;
				System.out.println("Robot #" +(j+1)+" won");
				break;
				
			}
		}
		}
		}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
		
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

	}

