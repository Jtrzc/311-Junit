package com.comp301.a04junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.Direction;
import com.comp301.a04junit.adventure.Position;
import com.comp301.a04junit.adventure.PositionImpl;

import org.junit.Test;

/** Write unit tests for the PositionImpl class here */
public class AdeptPositionTests {
  @Test
  public void unitTest1() {
    PositionImpl pos = new PositionImpl(0,0);
    int x =0;
    int y= 0;
    assertEquals(pos.getX(), x);
    assertEquals(pos.getY(), y);
  }
  @Test
  public void unitTest2() {
    PositionImpl pos = new PositionImpl(10,5);
    int x =10;
    int y= 5;
    assertEquals(pos.getX(), x);
    assertEquals(pos.getY(), y);
  }
  @Test
  public void unitTest3() {
    PositionImpl pos = new PositionImpl(8,8);
    int x =8;
    int y= 8;
    assertEquals(pos.getX(), x);
    assertEquals(pos.getY(), y);
  }
  @Test
  public void unitTest4() {
    PositionImpl pos = new PositionImpl(8,8);
    PositionImpl pos2 = new PositionImpl(8,8);
    assertEquals(pos.getX(),pos2.getX());
    assertEquals(pos.getY(),pos2.getY());
  }
  @Test
  public void unitTest5() {
    int x =8;
    int y = 8;
    PositionImpl pos = new PositionImpl(x,y);
    pos.getX();
    pos.getY();
    assertEquals(pos.getX(), x);
    assertEquals(pos.getY(), y);
  }
  @Test
  public void northTest() {
    Position pos = new PositionImpl(8,8);
    Position north = new PositionImpl(8,9);
    assertEquals(north.getY(), pos.getNeighbor(Direction.NORTH).getY());
    assertEquals(north.getX(), pos.getNeighbor(Direction.NORTH).getX());

  }
  @Test
  public void southTest() {
    Position pos = new PositionImpl(8,8);
    Position north = new PositionImpl(8,7);
    assertEquals(north.getY(), pos.getNeighbor(Direction.SOUTH).getY());
    assertEquals(north.getX(), pos.getNeighbor(Direction.SOUTH).getX());

  }
  @Test
  public void eastTest() {
    Position pos = new PositionImpl(8,8);
    Position north = new PositionImpl(9,8);
    assertEquals(north.getY(), pos.getNeighbor(Direction.EAST).getY());
    assertEquals(north.getX(), pos.getNeighbor(Direction.EAST).getX());

  }
  @Test
  public void westTest() {
    Position pos = new PositionImpl(8,8);
    Position north = new PositionImpl(7,8);
    assertEquals(north.getY(), pos.getNeighbor(Direction.WEST).getY());
    assertEquals(north.getX(), pos.getNeighbor(Direction.WEST).getX());

  }




}
