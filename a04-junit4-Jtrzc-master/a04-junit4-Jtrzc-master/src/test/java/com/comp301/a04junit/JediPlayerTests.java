package com.comp301.a04junit;

import com.comp301.a04junit.adventure.*;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/** Write unit tests for the PlayerImpl class here */
public class JediPlayerTests {

  @Test
  public void unitTest1() {
    PlayerImpl player = new PlayerImpl("Name", 5, 5);
    int x = 5;
    int y =5;
    Position pos = new PositionImpl(x,y);
    String name = "Name";
    player.getName();

    Item box = new ItemImpl("box");
    player.getInventory();

    if(player.getPosition() == null){
      fail();
    }
    if(player.getInventory() == null){
      fail();
    }
    assertEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());



  }

  @Test
  public void unitTest2() {
    PlayerImpl player = new PlayerImpl("NAME", -10, -10);
    int x =-10;
    int y =-10;
    Position pos = new PositionImpl(x,y);
    String name = "NAME";
    player.getName();
    player.getPosition();
    player.getInventory();
    assertEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());

  }
  @Test
  public void unitTest3() {
    PlayerImpl player = new PlayerImpl("name", 10, 0);
    int x =10;
    int y =0;
    Position pos = new PositionImpl(x,y);
    String name = "name";
    player.getName();
    player.getPosition();
    player.getInventory();
    assertEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());

  }
  @Test
  public void unitTest4() {
    PlayerImpl player = new PlayerImpl("name", 0, 10);
    int x =0;
    int y =10;
    Position pos = new PositionImpl(x,y);
    String name = null;
    player.getName();
    player.getPosition();
    player.getInventory();
    assertNotEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());

  }
  @Test
  public void unitTest5() {
    PlayerImpl player = new PlayerImpl("Spaced Name", 5, 5);
    int x = 5;
    int y =5;
    Position pos = new PositionImpl(x,y);
    String name = "Spaced Name";
    player.getName();
    player.getPosition();
    player.getInventory();
    assertEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());

  }
  @Test
  public void unitTest6() {
    PlayerImpl player = new PlayerImpl("Spaced Name", -1, -5);
    int x = -1;
    int y =-5;
    Position pos = new PositionImpl(x,y);
    String name = "Spaced Name";
    player.getName();
    player.getPosition();
    player.getInventory();
    assertEquals(name, player.getName());
    assertEquals(x, player.getPosition().getX());
    assertEquals(y, player.getPosition().getY());
  }

  @Test
  public void unitTest7() {
    Player player;
    try {
      player= new PlayerImpl(null,-1,5);
    }catch(RuntimeException re){
      player = new PlayerImpl("name", 0,0);
    }
    assertEquals("name",player.getName());
    assertEquals(0, player.getPosition().getX());
    assertEquals(0, player.getPosition().getY());
  }
  @Test
  public void unitTest8() {
    PlayerImpl player = new PlayerImpl("Name", 5, 5);

    Item box = new ItemImpl("box");
    player.getInventory().addItem(box);
    assertEquals(box,player.getInventory().getItems().get(0));


  }

  @Test
  public void northTest() {
    PlayerImpl player = new PlayerImpl("spaced name", 5, 5);
    Position pos = new PositionImpl(5,6);
    player.move(Direction.NORTH);
    assertEquals(6,player.getPosition().getY());

  }
  @Test
  public void southTest() {
    PlayerImpl player = new PlayerImpl("spaced name", 5, 5);
    Position pos = new PositionImpl(5,4);
    player.move(Direction.SOUTH);
    assertEquals(4,player.getPosition().getY());

  }
  @Test
  public void eastTest() {
    PlayerImpl player = new PlayerImpl("spaced name", 5, 5);
    Position pos = new PositionImpl(6,5);
    player.move(Direction.EAST);
    assertEquals(6,player.getPosition().getX());

  }
  @Test
  public void westTest() {
    PlayerImpl player = new PlayerImpl("spaced name", 5, 5);
    Position pos = new PositionImpl(4,5);
    player.move(Direction.WEST);
    assertEquals(4,player.getPosition().getX());

  }
  }




