package com.gildedrose.items.types;

import com.gildedrose.items.ItemWrapper;

public class BackstagePassesTAFKAL80ETConcert extends ItemWrapper {

	public BackstagePassesTAFKAL80ETConcert(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		increaseQuality();

		if (getSellIn() < 11) {
			increaseQuality();
		} 
		if (getSellIn() < 6) {
			increaseQuality();
		} 
		if (getSellIn() < 0) {
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
