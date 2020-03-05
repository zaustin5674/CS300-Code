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

public class WinterCarnival extends SimulationEngine {

	private ArrayList<FrozenStatue> objects = new ArrayList<FrozenStatue>();

	public static void main(String[] args) {
		WinterCarnival winterCarnival = new WinterCarnival();
		FrozenStatue frozenStatue = new FrozenStatue(new float[] { 500, 500 });

	}

	WinterCarnival() {
		StarshipRobot one = new StarshipRobot(new float[][] { { 0, 0 }, { 600, 100 } });
		StarshipRobot two = new StarshipRobot(new float[][] { { 800, 300 }, { 200, 500 } });
		DancingBadger a = new DancingBadger(new float[] { 304, 268 },
				new DanceStep[] { DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Down,
						DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Up });
		DancingBadger b = new DancingBadger(new float[] { 368, 268 },
				new DanceStep[] { DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Down,
						DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Up });
		DancingBadger c = new DancingBadger(new float[] { 432, 268 },
				new DanceStep[] { DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Down,
						DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Up });
		DancingBadger d = new DancingBadger(new float[] { 496, 268 },
				new DanceStep[] { DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Down,
						DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Up });
		objects.add(new FrozenStatue(new float[] { 600, 100 }));
		objects.add(new FrozenStatue(new float[] { 200, 500 }));
		objects.add(one);
		objects.add(two);
		objects.add(a);
		objects.add(b);
		objects.add(c);
		objects.add(d);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).update(this);
		}
	}
}
