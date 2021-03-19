package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        changeQuality(item, -1);
                    }
                }
            } else {
                if (item.quality < 50) {
                    changeQuality(item, 1);

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                changeQuality(item, 1);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                changeQuality(item, 1);
                            }
                        }
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                changeQuality(item, -1);
                            }
                        }
                    } else {
                        changeQuality(item, -item.quality);
                    }
                } else {
                    if (item.quality < 50) {
                        changeQuality(item, 1);
                    }
                }
            }
        }
    }

    private void changeQuality(Item item, int change) {
        item.quality = item.quality + change;
    }

}