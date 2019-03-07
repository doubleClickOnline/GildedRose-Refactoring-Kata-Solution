package com.gildedrose.itemwrapper.types;

public class ItemWrapperFactory {

  public ItemWrapper create(String name, int sellIn, int quality) {
    switch (name) {
      case "Aged Brie":
        return new AgedBrie(name, sellIn, quality);
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasHandOfRagnaros(name, sellIn, quality);
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackstagePassesTAFKAL80ETConcert(name, sellIn, quality);
      default:
        return new ItemWrapper(name, sellIn, quality);
    }
  }
}
