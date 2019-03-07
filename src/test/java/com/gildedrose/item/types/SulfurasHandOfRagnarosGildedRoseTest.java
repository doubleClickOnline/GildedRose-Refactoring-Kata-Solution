package com.gildedrose.item.types;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import com.gildedrose.ItemFactory;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SulfurasHandOfRagnarosGildedRoseTest {

  private ItemFactory factory = new ItemFactory();

  @Test
  public void updateQualitySulfurasHandOfRagnaros1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Sulfuras, Hand of Ragnaros", 0, 80));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Sulfuras, Hand of Ragnaros", updatedItem.getName());
    Assert.assertEquals(0, updatedItem.getSellIn());
    Assert.assertEquals(80, updatedItem.getQuality());
  }

  @Test
  public void updateQualitySulfurasHandOfRagnaros2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Sulfuras, Hand of Ragnaros", -1, 80));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Sulfuras, Hand of Ragnaros", updatedItem.getName());
    Assert.assertEquals(-1, updatedItem.getSellIn());
    Assert.assertEquals(80, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysSulfurasHandOfRagnaros1Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Sulfuras, Hand of Ragnaros", 0, 80));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1day
    app.updateQuality(); // 2days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Sulfuras, Hand of Ragnaros", updatedItem.getName());
    Assert.assertEquals(0, updatedItem.getSellIn());
    Assert.assertEquals(80, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysSulfurasHandOfRagnaros2Test() {

    List<Item> items = new LinkedList<Item>();
    items.add(factory.create("Sulfuras, Hand of Ragnaros", -1, 80));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    Item updatedItem = app.getItems().get(0);

    Assert.assertEquals("Sulfuras, Hand of Ragnaros", updatedItem.getName());
    Assert.assertEquals(-1, updatedItem.getSellIn());
    Assert.assertEquals(80, updatedItem.getQuality());
  }
}
