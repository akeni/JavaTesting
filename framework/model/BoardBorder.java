package org.jpacman.test.framework.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jpacman.framework.model.Board;
import org.jpacman.framework.model.Food;
import org.jpacman.framework.model.Sprite;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BoardBorder {

	private final int height = 20;
	private final int width = 10;
	private final int xAxis;
	private final int yAxis;
	private final boolean bExpected;
	private final Board board;


		/**
		 * Create a new test case obtaining the tile
		 * from starting point (x, y) into the given direction.
		 * The result should be the new point (nx, ny).
		 * @param x X Axis
		 * @param y Y Axis
		 * @param expected
	 */
		public BoardBorder(int x, int y, boolean expected) {
			xAxis = x;
			yAxis = y;
			bExpected = expected;
			board = new Board(width, height);
			
		}
		
		@Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { 0, 0 , true}, {9, 19, true}, {0, 20, false}, {10, 0, false}, {10, 20, false}
	           });
	    }
	    
		@Test
		public void testBoardBorder() {
			assertEquals(board.withinBorders(xAxis, yAxis), bExpected);
		}


}
