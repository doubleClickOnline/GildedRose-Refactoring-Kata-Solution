package com.gildedrose.items.types;

public class AgedBrie extends Item {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (getQuality() < 50) {
			setQuality(getQuality() + 1);

			if (getSellIn() < 0) {
				setQuality(getQuality() + 1);
			}
		}
	}

	@Override
	public void updateSellIn() {
		decreaseSellIn();
	}
}
