package com.comp301.a04junit;

import com.comp301.a04junit.alphabetizer.Alphabetizer;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/** Write tests for the Alphabetizer class here */
public class NoviceAlphabetizerTests {
  @Test
  public void unitTest1() {
    String[] arr = {"a","c","b","d"};
    String[] test = {"a","c","b","d"};
    Alphabetizer a1 = new Alphabetizer(arr);
    assertEquals(arr, test);
  }
  @Test
  public void unitTest2() {
    String[] arr = {"a","c","b","d"};
    String[] test = {"a","b","c","d"};
    Alphabetizer a1 = new Alphabetizer(arr);
    assertEquals(a1.next(), test[0]);
    assertEquals(a1.next(), test[1]);
    assertEquals(a1.next(), test[2]);
    assertEquals(a1.next(), test[3]);
  }
  @Test
  public void unitTest3() {
    String[] arr = {"A","C","B","D"};
    String[] test = {"A","B","C","d"};
    Alphabetizer a1 = new Alphabetizer(arr);
    assertEquals(a1.next(), test[0]);

  }

  @Test
  public void constructorTest(){
    String[] arr = null;
    Alphabetizer a1 = new Alphabetizer(arr);
    assertNull(arr);
  }

  @Test
  public void nextExceptionTest(){
    String[] arr = {"b", "c", "a"};
    Alphabetizer a1 = new Alphabetizer(arr);
    boolean value = false;
    try{
      a1.next();
      a1.next();
      a1.next();
      a1.next();
    }catch(NoSuchElementException e){
      value = true;
    }
    assertTrue(value);
  }
  @Test
  public void hasNextBugTest(){
    String[] arr = {"d", "b", "a", "c"};
    Alphabetizer a1 = new Alphabetizer(arr);
    a1.next();
    assertTrue(a1.hasNext());
    a1.next();
    assertTrue(a1.hasNext());
    a1.next();
    assertTrue(a1.hasNext());
    a1.next();
    assertFalse(a1.hasNext());


  }

}
