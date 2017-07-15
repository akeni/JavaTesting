package org.jpacman.test.framework.model;

import static org.junit.Assert.*;

import java.io.ObjectOutputStream.PutField;
import java.util.Arrays;
import java.util.Collection;

import org.jpacman.framework.model.*;
import org.jpacman.framework.model.IBoardInspector.SpriteType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class Board {
	int height = 10;
	int width = 20;
	Tile startTile;
	
	Sprite food;
	org.jpacman.framework.model.Board b;
	@Before
	public void setUp() throws Exception {
		//set board up
		b = new org.jpacman.framework.model.Board(width, height);
		food = new Food();
		startTile = b.tileAt(0, 0);
	}

	@Test
	public void BoardSizeTest() {
		assertEquals(b.getHeight(), height);
		assertEquals(b.getWidth(), width);
	}
	
	@Test
	public void SpriteOnBoardTest() {
		b.put(food, 0, 0);
		SpriteType food = SpriteType.FOOD;
		assertEquals(food, b.spriteTypeAt(0, 0));
	}
	
	@Test
	public void nextTile() {
		assertEquals(b.tileAtDirection(startTile, Direction.RIGHT).getX(),startTile.getX()+1);
		assertEquals(b.tileAtDirection(startTile, Direction.DOWN).getY(),startTile.getY()+1);
	}
	
	

	

}


