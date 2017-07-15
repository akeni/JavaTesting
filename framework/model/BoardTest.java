package org.jpacman.test.framework.model;

import static org.junit.Assert.*;


import org.jpacman.framework.model.Board;
import org.jpacman.framework.model.Player;
import org.jpacman.framework.model.Sprite;
import org.jpacman.framework.model.Tile;
import org.junit.Test;

/**
 * Test the Board class
 * 
 */
public class BoardTest {

	private Board board;
	private Sprite p;
	private static final int height = 3;	
	private static final int width = 3;
	
/*	@Test public void setInvalid() {
		board = new Board(-1, -1);
		assertEquals(board, null);
	}
*/
	
	@Test public void testget() {
		board = new Board(width, height);	
		assertEquals(width, board.getWidth());
		assertEquals(height, board.getHeight());
	}
	
	@Test public void testPlacement() {
		board = new Board(width, height);
		p = new Player();
		int px = 1;
		int py = 1;
		Sprite s = board.spriteAt(px, py);
		board.put(p, px, py);
		//assertEquals(p, s);
		assertEquals(p.getSpriteType(), board.spriteTypeAt(px, py));
	}
	
	@Test public void testOffPlacement() {
		board = new Board(width, height);
		p = new Player();
		int px = 2;
		int py = 5;
		assertFalse(board.withinBorders(px, py));
		//board.put(p, px, py);
		assertEquals(p.getTile(), null);
	}

}
