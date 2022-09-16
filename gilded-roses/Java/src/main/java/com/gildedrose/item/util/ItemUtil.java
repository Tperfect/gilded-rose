package com.gildedrose.item.util;

import com.gildedrose.item.Item;
import com.gildedrose.item.ItemFactory;

public class ItemUtil {

    /**
     * 对物品列表进行转换
     * @param items
     * @return
     */
    public static Item[] itemTransform(com.gildedrose.Item[] items){
        Item[] newItems = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = ItemFactory.getItem(items[i]);
        }
        return newItems;
    }
}
