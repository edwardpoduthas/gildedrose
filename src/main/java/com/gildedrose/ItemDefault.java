package com.gildedrose;

public class ItemDefault extends ItemAdaptor implements ItemInterface{

    private static final Integer MIN_QUALITY = 0;
    private Item item;

    public ItemDefault(Item item) {
       super(item);
    }

    @Override
    public void update() {
        // remove quality based on sellIn and sign
        if (item.getQuality() > MIN_QUALITY) {
            item.setQuality(item.getQuality() - 1);
        }

        // always remove sellIn
        item.setSellIn(item.getSellIn() - 1);
    }
}
