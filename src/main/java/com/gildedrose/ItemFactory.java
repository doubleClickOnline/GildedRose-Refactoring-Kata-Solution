package com.gildedrose;

import com.gildedrose.item.types.AgedBrie;
import com.gildedrose.item.types.BackstagePassesTAFKAL80ETConcert;
import com.gildedrose.item.types.SulfurasHandOfRagnaros;

public class ItemFactory {

  public Item create(String name, int sellIn, int quality) {
    switch (name) {
      case "Aged Brie":
        return new AgedBrie(name, sellIn, quality);
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasHandOfRagnaros(name, sellIn, quality);
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackstagePassesTAFKAL80ETConcert(name, sellIn, quality);
      default:
        return new Item(name, sellIn, quality);
    }
  }
}
