package com.gildedrose;

public class ItemSulfuras implements ItemInterface{

    private static final Integer MAX_QUALITY = 80;
    private Item item;

    public ItemSulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        // never changes in quality but drops in sellIn
        item.sellIn -= 1;
    }
}