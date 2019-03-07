package com.gildedrose.item.types;

import com.gildedrose.Item;

public class SulfurasHandOfRagnaros extends Item {

  public SulfurasHandOfRagnaros(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    if (getQuality() < 50) {
      increaseQuality();
    }
  }

  @Override
  public void updateSellIn() {
    // There shouldn't be any updateSellIn for SulfurasHandOfRagnaros
  }
}