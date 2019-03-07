package com.gildedrose.item.types;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import com.gildedrose.ItemFactory;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class AgedBrieGildedRoseTest {

  private ItemFactory factory = new ItemFactory();

  @Test
  public void updateQualityAgedBrie1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", 2, 0));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(1, updatedItem.getSellIn());
    Assert.assertEquals(1, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAgedBrie2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", -5, 10));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(-6, updatedItem.getSellIn());
    Assert.assertEquals(12, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAgedBrie3Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", -5, 100));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(-6, updatedItem.getSellIn());
    Assert.assertEquals(100, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysAgedBrie1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", 2, 0));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); //1 day
    app.updateQuality(); //2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(0, updatedItem.getSellIn());
    Assert.assertEquals(2, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysAgedBrie2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", -5, 10));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); //1 day
    app.updateQuality(); //2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(-7, updatedItem.getSellIn());
    Assert.assertEquals(14, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysAgedBrie3Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Aged Brie", -5, 100));

    GildedRose app = new GildedRose(items);
    app.updateQuality();  //1 day
    app.updateQuality();  //2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Aged Brie", updatedItem.getName());
    Assert.assertEquals(-7, updatedItem.getSellIn());
    Assert.assertEquals(100, updatedItem.getQuality());
  }
}
