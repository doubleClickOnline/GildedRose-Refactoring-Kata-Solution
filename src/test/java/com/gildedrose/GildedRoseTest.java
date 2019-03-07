package com.gildedrose;

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

  private ItemFactory factory = new ItemFactory();

  @Test
  public void updateQualityFooTest() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("foo", 0, 0));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("foo", updatedItem.getName());
    Assert.assertEquals(-1, updatedItem.getSellIn());
    Assert.assertEquals(0, updatedItem.getQuality());
  }

  @Test
  public void updateQualityElixirOfTheMongoose1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Elixir of the Mongoose", 5, 7));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Elixir of the Mongoose", updatedItem.getName());
    Assert.assertEquals(4, updatedItem.getSellIn());
    Assert.assertEquals(6, updatedItem.getQuality());
  }

  @Test
  public void updateQualityElixirOfTheMongoose2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Elixir of the Mongoose", -5, 10));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Elixir of the Mongoose", updatedItem.getName());
    Assert.assertEquals(-6, updatedItem.getSellIn());
    Assert.assertEquals(8, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysElixirOfTheMongoose1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Elixir of the Mongoose", 5, 7));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Elixir of the Mongoose", updatedItem.getName());
    Assert.assertEquals(3, updatedItem.getSellIn());
    Assert.assertEquals(5, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysElixirOfTheMongoose2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Elixir of the Mongoose", -5, 10));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 days
    app.updateQuality(); // 2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Elixir of the Mongoose", updatedItem.getName());
    Assert.assertEquals(-7, updatedItem.getSellIn());
    Assert.assertEquals(6, updatedItem.getQuality());
  }

  @Test
  public void updateQualityConjuredManaCake1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Conjured Mana Cake", 3, 6));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Conjured Mana Cake", updatedItem.getName());
    Assert.assertEquals(2, updatedItem.getSellIn());
    Assert.assertEquals(5, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysConjuredManaCake1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Conjured Mana Cake", 3, 6));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1day
    app.updateQuality(); // 2days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Conjured Mana Cake", updatedItem.getName());
    Assert.assertEquals(1, updatedItem.getSellIn());
    Assert.assertEquals(4, updatedItem.getQuality());
  }

  @Test
  public void updateQualityDexterityVest() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("+5 Dexterity Vest", 10, 20));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("+5 Dexterity Vest", updatedItem.getName());
    Assert.assertEquals(9, updatedItem.getSellIn());
    Assert.assertEquals(19, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysDexterityVest() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("+5 Dexterity Vest", 10, 20));

    GildedRose app = new GildedRose(items);
    app.updateQuality();  //1 day
    app.updateQuality();  //2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("+5 Dexterity Vest", updatedItem.getName());
    Assert.assertEquals(8, updatedItem.getSellIn());
    Assert.assertEquals(18, updatedItem.getQuality());
  }
}
