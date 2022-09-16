package com.gildedrose.item;

import com.gildedrose.item.util.ItemUtil;

public class RefactorTest {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        com.gildedrose.Item[] items = new com.gildedrose.Item[] {
            new com.gildedrose.Item("+5 Dexterity Vest", 10, 20), //
            new com.gildedrose.Item("Aged Brie", 2, 0), //
            new com.gildedrose.Item("Elixir of the Mongoose", 5, 7), //
            new com.gildedrose.Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new com.gildedrose.Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new com.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new com.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new com.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            new com.gildedrose.Item("Conjured Mana Cake", 3, 6) };

        com.gildedrose.item.Item[] newItems = ItemUtil.itemTransform(items);

        int days = 20;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }
        ReGildedRose reGildedRose = new ReGildedRose(newItems);
        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (com.gildedrose.item.Item newItem : newItems) {
                System.out.println(newItem);
            }
            System.out.println();
            reGildedRose.updateQuality();
        }
    }
}
