package com.comp301.a04junit;

import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/** Write unit tests for the ItemImpl class here */
public class  AdeptItemTests {
  @Test
  public void constructorTest1() {
    ItemImpl item = new ItemImpl("Name");
    String tester = "Name";
    assertEquals(item.getName(), tester);
  }
  @Test
  public void namingEqualsTest() {
    ItemImpl item = new ItemImpl("Name");
    ItemImpl item2 = new ItemImpl("Name");
    assertTrue(item.equals(item2));
  }
  @Test
  public void namingEqualsTest2() {
    ItemImpl item = new ItemImpl("NAME");
    ItemImpl item2 = new ItemImpl("NAME");
    assertTrue(item.equals(item2));
  }
  @Test
  public void namingEqualsTest3() {
    ItemImpl item = new ItemImpl("name");
    ItemImpl item2 = new ItemImpl("name");
    assertTrue(item.equals(item2));
  }
  @Test
  public void namingEqualsTest4() {
    ItemImpl item = new ItemImpl("1");
    ItemImpl item2 = new ItemImpl("1");
    assertTrue(item.equals(item2));
  }
  @Test
  public void namingEqualsTest5() {
    ItemImpl item = new ItemImpl("Test Case");
    ItemImpl item2 = new ItemImpl("Test Case");
    assertTrue(item.equals(item2));
  }

  @Test
  public void namingEqualsTest7() {
    ItemImpl item = new ItemImpl("Name");
    ItemImpl item2 = new ItemImpl("Blue");
    assertFalse(item.equals(item2));

  }
  @Test
  public void namingEqualsTest8() {
    ItemImpl item = new ItemImpl("Name");
    assertFalse(item.equals(null));

  }


}
