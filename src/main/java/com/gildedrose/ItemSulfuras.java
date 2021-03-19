package com.gildedrose;

public class ItemSulfuras extends ItemAdaptor implements ItemInterface{

    private static final Integer MAX_QUALITY = 80;
    private Item item;

    public ItemSulfuras(Item item) {
        super(item);
    }

    @Override
    public void update() {
        // never changes in quality but drops in sellIn
        item.setSellIn(item.getSellIn() - 1);
    }
}