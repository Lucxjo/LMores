package xyz.ludoviko.lmore.util;

import xyz.ludoviko.lmore.objects.blocks.LMBlocks;
import xyz.ludoviko.lmore.objects.items.LMItems;
import xyz.ludoviko.lmore.objects.tools.LMTools;

public class LMRegistryHandler {
    public static void init() {
        LMItems.init();
        LMBlocks.init();
        LMTools.init();
    }
}
