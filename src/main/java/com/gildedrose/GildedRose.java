package com.gildedrose;

import java.util.List;

public class GildedRose {

  private List<Item> items;

  public GildedRose(List<Item> items) {
    this.items = items;
  }

  public List<Item> getItems() {
    return items;
  }

  public void updateQuality() {

    items.stream().forEach(item -> {
      item.updateSellIn();
      item.updateQuality();
    });
  }
}