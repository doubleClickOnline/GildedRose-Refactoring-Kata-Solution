package com.gildedrose.itemwrapper.types;

public class ItemWrapper {

  private String name;
  private int sellIn;
  private int quality;

  public ItemWrapper(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

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

  public void increaseSellIn() {
    setSellIn(getSellIn() + 1);
  }

  @Override
  public int hashCode() {
    return getName().hashCode()
        + Integer.valueOf(getSellIn()).hashCode()
        + Integer.valueOf(getQuality()).hashCode();
  }

  @Override
  public boolean equals(Object obj) {

    if (obj instanceof ItemWrapper
        && getName().equalsIgnoreCase((((ItemWrapper) obj).getName()))
        && (getSellIn() == ((ItemWrapper) obj).getSellIn())
        && (getQuality() == ((ItemWrapper) obj).getQuality())) {
      return true;
    }

    return false;
  }
}
