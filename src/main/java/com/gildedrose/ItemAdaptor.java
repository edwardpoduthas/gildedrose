package com.gildedrose;

public class ItemAdaptor implements ItemInterface{

    private Item item;
    private Integer minQuality;
    private Integer maxQuality;

    public ItemAdaptor(Item item, Integer minQuality, Integer maxQuality) {
        this.item = item;
        this.minQuality = minQuality;
        this.maxQuality = maxQuality;
    }

    @Override
    public void update() {

    }
}
