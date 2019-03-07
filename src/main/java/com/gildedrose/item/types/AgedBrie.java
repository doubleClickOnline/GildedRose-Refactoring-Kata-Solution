package com.gildedrose.item.types;

import com.gildedrose.Item;

public class AgedBrie extends Item {

  public AgedBrie(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    increaseQuality();

    if (getSellIn() < 0) {
      increaseQuality();
    }
  }

  @Override
  public void updateSellIn() {
    decreaseSellIn();
  }

  @Override
  public void increaseQuality() {
    if (getQuality() < 50) {
      super.increaseQuality();
    }
  }
}
