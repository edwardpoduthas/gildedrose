package com.gildedrose;

public class ItemAdaptor implements ItemInterface{

    private Item item;

    public ItemAdaptor(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        // implement this in subclass
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

}
