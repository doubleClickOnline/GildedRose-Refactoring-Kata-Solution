package com.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

  private String name;
  private int sellIn;
  private int quality;

  public void updateQuality() {

    decreaseQuality();
    if (getSellIn() < 0) {
      decreaseQuality();
    }
  }

  public void updateSellIn() {
    decreaseSellIn();
  }

  public void decreaseQuality() {
    if (quality > 0) {
      setQuality(getQuality() - 1);
    }
  }

  public void increaseQuality() {
    setQuality(getQuality() + 1);
  }

  public void decreaseSellIn() {
    setSellIn(getSellIn() - 1);
  }
}
