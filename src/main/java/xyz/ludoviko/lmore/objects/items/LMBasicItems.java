package xyz.ludoviko.lmore.objects.items;

import net.minecraft.item.Item;
import xyz.ludoviko.lmore.objects.LMObjects;

public class LMBasicItems extends Item {
    public LMBasicItems() {
        super(new Item.Properties().group(LMObjects.TAB));
    }
}