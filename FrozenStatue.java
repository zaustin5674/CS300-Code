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
import java.util.ArrayList;

public class FrozenStatue {

	protected float x;
	protected float y;
	protected boolean isFacingRight;
	protected String imageName;

	FrozenStatue(float[] position) {
		this.x = position[0];
		this.y = position[1];
		this.isFacingRight = true;
		this.imageName = "images" + File.separator + "frozenStatue.png";
	}

	public void update(SimulationEngine engine) {
		engine.draw(imageName, x, y, isFacingRight);
	}

}
