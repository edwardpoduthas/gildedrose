package com.gildedrose;

public class ItemBrie extends ItemAdaptor implements ItemInterface{

    private static final Integer MAX_QUALITY = 50;
    private Item item;

    public ItemBrie(Item item) {
        super(item);
    }

    @Override
    public void update() {
        // remove quality based on sellIn and sign
        if (item.getQuality() < MAX_QUALITY) {
                item.setQuality(item.getQuality() + 1);
        }

        // always remove sellIn
        item.setSellIn(item.getSellIn() - 1);
    }
}