package xyz.ludoviko.lmore.util;

import xyz.ludoviko.lmore.objects.blocks.LMBlocks;
import xyz.ludoviko.lmore.objects.items.LMItems;

public class LMRegistryHandler {
    public static void init() {
        LMItems.init();
        LMBlocks.init();
    }
}