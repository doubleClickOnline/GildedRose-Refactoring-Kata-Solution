package com.gildedrose;

import com.gildedrose.itemwrapper.types.ItemWrapper;
import java.util.List;

public class GildedRose {

  private List<ItemWrapper> items;

  public GildedRose(List<ItemWrapper> items) {
    this.items = items;
  }

  public List<ItemWrapper> getItems() {
    return items;
  }

  public void updateQuality() {

    items.stream().forEach(item -> update(item));
  }

  public void update(ItemWrapper item) {

    item.updateSellIn();
    item.updateQuality();
  }
}