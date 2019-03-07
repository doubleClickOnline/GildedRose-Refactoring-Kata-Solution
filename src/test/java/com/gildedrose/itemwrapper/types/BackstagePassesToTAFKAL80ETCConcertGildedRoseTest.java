package com.gildedrose.itemwrapper.types;

import com.gildedrose.GildedRose;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BackstagePassesToTAFKAL80ETCConcertGildedRoseTest {

  private ItemWrapperFactory factory = new ItemWrapperFactory();

  @Test
  public void updateQualityBackstagePassesToTAFKAL80ETCConcert1Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 15, 20));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(14, updatedItem.getSellIn());
    Assert.assertEquals(21, updatedItem.getQuality());
  }

  @Test
  public void updateQualityBackstagePassesToTAFKAL80ETCConcert2Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 10, 49));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(9, updatedItem.getSellIn());
    Assert.assertEquals(50, updatedItem.getQuality());
  }

  @Test
  public void updateQualityBackstagePassesToTAFKAL80ETCConcert3Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 49));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(4, updatedItem.getSellIn());
    Assert.assertEquals(50, updatedItem.getQuality());
  }

  @Test
  public void updateQualityBackstagePassesToTAFKAL80ETCConcert4Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 45));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(4, updatedItem.getSellIn());
    Assert.assertEquals(48, updatedItem.getQuality());
  }

  @Test
  public void updateQualityBackstagePassesToTAFKAL80ETCConcert5Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", -15, 30));

    GildedRose app = new GildedRose(items);
    app.updateQuality();
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(-16, updatedItem.getSellIn());
    Assert.assertEquals(0, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysBackstagePassesToTAFKAL80ETCConcert1Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 15, 20));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(13, updatedItem.getSellIn());
    Assert.assertEquals(22, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysBackstagePassesToTAFKAL80ETCConcert2Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 10, 49));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(8, updatedItem.getSellIn());
    Assert.assertEquals(50, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysBackstagePassesToTAFKAL80ETCConcert3Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 49));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(3, updatedItem.getSellIn());
    Assert.assertEquals(50, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysBackstagePassesToTAFKAL80ETCConcert4Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 45));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(3, updatedItem.getSellIn());
    Assert.assertEquals(50, updatedItem.getQuality());
  }

  @Test
  public void updateQualityAfter2DaysBackstagePassesToTAFKAL80ETCConcert5Test() {

    List<ItemWrapper> items = new LinkedList<ItemWrapper>();
    items.add(factory.create("Backstage passes to a TAFKAL80ETC concert", -15, 30));

    GildedRose app = new GildedRose(items);
    app.updateQuality(); // 1 day
    app.updateQuality(); // 2 days
    ItemWrapper updatedItem = app.getItems().get(0);

    Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert", updatedItem.getName());
    Assert.assertEquals(-17, updatedItem.getSellIn());
    Assert.assertEquals(0, updatedItem.getQuality());
  }

}
