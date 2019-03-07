package com.gildedrose.item.types;

import com.gildedrose.Item;

public class BackstagePassesTAFKAL80ETConcert extends Item {

  public BackstagePassesTAFKAL80ETConcert(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    increaseQuality();

    if (getSellIn() < 6) {
      increaseQuality();
      increaseQuality();
    } else if (getSellIn() < 11) {
      increaseQuality();
    }

    if (getSellIn() < 0 && getQuality() < 50) {
      setQuality(0);
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
