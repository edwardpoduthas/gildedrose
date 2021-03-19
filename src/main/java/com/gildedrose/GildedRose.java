package com.gildedrose;

class GildedRose {
    Item [] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.getName().equals("Aged Brie")
                    && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() > 0) {
                    if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                        changeQuality(item, -1);
                    }
                }
            } else {
                if (item.getQuality() < 50) {
                    changeQuality(item, 1);

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                changeQuality(item, 1);
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                changeQuality(item, 1);
                            }
                        }
                    }
                }
            }

            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if (!item.getName().equals("Aged Brie")) {
                    if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality() > 0) {
                            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                                changeQuality(item, -1);
                            }
                        }
                    } else {
                        changeQuality(item, -item.getQuality());
                    }
                } else {
                    if (item.getQuality() < 50) {
                        changeQuality(item, 1);
                    }
                }
            }
        }
    }

    private void changeQuality(Item item, int change) {
        item.setQuality(item.getQuality() + change);
    }

}