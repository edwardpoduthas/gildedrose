package com.gildedrose;

public class ItemBackstagePass implements ItemInterface{

    private static final Integer MAX_QUALITY = 50;
    private Item item;

    public ItemBackstagePass(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        // remove quality based on sellIn and sign
        if (item.quality < MAX_QUALITY) {
            item.quality += 1;
        }

        // always remove sellIn
        item.sellIn -= 1;
    }
}
