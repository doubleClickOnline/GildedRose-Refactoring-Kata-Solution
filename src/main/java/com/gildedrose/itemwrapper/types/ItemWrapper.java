package com.gildedrose.itemwrapper.types;

import com.gildedrose.Item;

public class ItemWrapper {

	private Item item;

	public ItemWrapper(String name, int sellIn, int quality) {
		this.item = new Item(name, sellIn, quality);
	}
	
	public String getName() {
		return item.getName();
	}

	public void setName(String name) {
		item.setName(name);
	}

	public int getSellIn() {
		return item.getSellIn();
	}

	public void setSellIn(int sellIn) {
		item.setSellIn(sellIn);
	}

	public int getQuality() {
		return item.getQuality();
	}

	public void setQuality(int quality) {
		item.setQuality(quality);
	}

	@Override
	public String toString() {
		return item.toString();
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
		if (getQuality() > 0) {
			item.setQuality(item.getQuality() - 1);
		}
	}

	public void increaseQuality() {
		item.setQuality(item.getQuality() + 1);
	}

	public void decreaseSellIn() {
		item.setSellIn(getSellIn() - 1);
	}
	
	public void increaseSellIn() {
		item.setSellIn(item.getSellIn() + 1);
	}
	
	@Override
	public boolean equals(Object obj) {
		return item.equals(obj);
	}
}
