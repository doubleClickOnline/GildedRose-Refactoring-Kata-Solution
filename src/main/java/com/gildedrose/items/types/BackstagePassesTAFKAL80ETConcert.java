package com.gildedrose.items.types;

public class BackstagePassesTAFKAL80ETConcert extends Item {

	public BackstagePassesTAFKAL80ETConcert(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (getQuality() < 50) {
			increaseQuality();

			if (getSellIn() < 11 && getQuality() < 50) {
				increaseQuality();
			}
			if (getSellIn() < 6 && getQuality() < 50) {
				increaseQuality();
			}
			if (getSellIn() < 0 && getQuality() < 50) {
				setQuality(0);
			}
		}
	}

	@Override
	public void updateSellIn() {
		decreaseSellIn();
	}
}
