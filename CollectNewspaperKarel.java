/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// You fill in this part
	public void run(){
		moveToNewspaper();
		pickExistBeeper();
		goBackToStartingPoint();	
	}
	
	/*
	 * private void moveToNewspaper()
	 * This function can let Karel go to the door to pick newspaper
	 * Precondition: none
	 * Postcondition: Karel move to the newspaper, face to east
	 */
	private void moveToNewspaper(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	/*
	 * Method: private void pickExistBeeper
	 * This method first use if to confirm there is a newspaper that can be taken,
	 * and then pick the newspaper
	 * Precondition: Karel is on the newspaper and facing east
	 * postcondition: Karel has picked the newpaper and facing east
	 */
	private void pickExistBeeper(){
		if(beepersPresent()){
			pickBeeper();
		}
	}
	
	/*
	 * This method makes Karel go back to the initial place.
	 * Karel should face to east initially.
	 */
	private void goBackToStartingPoint(){
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}
}
