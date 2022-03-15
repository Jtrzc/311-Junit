package com.comp301.a04junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;
import com.comp301.a04junit.adventure.Inventory;
import com.comp301.a04junit.adventure.InventoryImpl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/** Write unit tests for the InventoryImpl class here */
public class JediInventoryTests {
  @Test
  public void unitTest1() {
    Inventory inv = new InventoryImpl();
    List<Item> list = new ArrayList<Item>();
    assertEquals(0,inv.getNumItems());
    assertEquals(list,inv.getItems());
    assertTrue(inv.isEmpty());


  }
  @Test
  public void unitTest2() {
    Inventory inv = new InventoryImpl();
    List<Item> list = new ArrayList<Item>();
    Item box = new ItemImpl("box");
    list.add(box);
    inv.addItem(box);
    assertEquals(list,inv.getItems());


  }
  @Test
  public void unitTest3() {
    Inventory inv = new InventoryImpl();
    List<Item> list = new ArrayList<Item>();
    Item box = new ItemImpl("box");
    inv.addItem(box);
    inv.removeItem(box);
    assertEquals(list, inv.getItems());

  }
  @Test
  public void unitTest4() {
    Inventory inv = new InventoryImpl();
    List<Item> list = new ArrayList<Item>();
    Item box = new ItemImpl("box");
    Item pencil = new ItemImpl("pencil");
    Item basketball = new ItemImpl("basketball");
    inv.addItem(box);
    inv.addItem(pencil);
    inv.addItem(basketball);
    inv.clear();
    assertEquals(list, inv.getItems());

  }
  @Test
  public void unitTest5() {
    Inventory inv = new InventoryImpl();
    Inventory list = new InventoryImpl();
    List<Item> list1 = new ArrayList<Item>();
    Item box = new ItemImpl("box");
    Item pencil = new ItemImpl("pencil");
    Item basketball = new ItemImpl("basketball");
    list1.add(box);
    list1.add(pencil);
    list1.add(basketball);
    list.addItem(box);
    list.addItem(pencil);
    list.addItem(basketball);
    inv.transferFrom(list);
    assertEquals(list1,inv.getItems());


  }
  @Test
  public void unitTest6() {
    Inventory inv = new InventoryImpl();
    Item box = new ItemImpl("box");
    Item pencil = new ItemImpl("pencil");
    Item basketball = new ItemImpl("basketball");
    List<Item> list1 = new ArrayList<Item>();
    inv.transferFrom(null);
    assertEquals(list1,inv.getItems());


  }
}
