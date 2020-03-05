//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   P05 Winter Carnival, consisting of frozen statues, starship robots, and dancing badgers!
// Files:   WinterCarnival.java, FrozenStatue.java, StarshipRobot.java, DancingBadger.java
// Course:  CS300, Spring, 2020
//
// Author:  Zach Austin
// Email:   zaustin@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////// PAIR PROGRAMMING (MAY SKIP WHEN WORKING INDIVIDUALLY) ////////////
//
// Partner Name:    (name of your pair programming partner)
// Partner Email:   (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understood the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Students who get help from sources other than their partner and the course 
// staff must fully acknowledge and credit those sources here.  If you did not
// receive any help of any kind from outside sources, explicitly indicate NONE
// next to each of the labels below.
//
// Persons:         (identify each person and describe their help in detail)
// Online Sources:  (identify each URL and describe their assistance in detail)
//
///////////////////////////////////////////////////////////////////////////////

import java.io.File;

public class StarshipRobot extends FrozenStatue {

	protected float[][] beginAndEnd = new float[2][2];
	protected float[] destination = new float[2];
	protected float speed;

	StarshipRobot(float[][] beginAndEnd) {
		super(new float[] { 0, 0 });
		this.beginAndEnd = beginAndEnd;
		destination = beginAndEnd[1];
		speed = 6;
		x = beginAndEnd[0][0];
		y = beginAndEnd[0][1];
		isFacingRight = true;
		imageName = "images" + File.separator + "starshipRobot.png";
	}

	protected boolean moveTowardDestination() {
		float distanceBetween = (float) Math
				.sqrt(Math.pow((destination[0] - x), 2) + Math.pow((destination[1] - y), 2));
		x = x + (speed * (destination[0] - x)) / (distanceBetween);
		y = y + (speed * (destination[1] - y)) / (distanceBetween);
		if (destination[0] > x) {
			isFacingRight = true;
		} else {
			isFacingRight = false;
		}
		if (distanceBetween < (2 * speed)) {
			return true;
		} else {
			return false;
		}
	}

	protected void updateDestination() {
		if (moveTowardDestination() && destination == beginAndEnd[1]) {
			destination = beginAndEnd[0];
		} else if (moveTowardDestination() && destination == beginAndEnd[0]) {
			destination = beginAndEnd[1];
		}
	}

	@Override
	public void update(SimulationEngine engine) {
		moveTowardDestination();
		updateDestination();
		super.update(engine);
	}

}
