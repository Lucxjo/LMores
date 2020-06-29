package xyz.ludoviko.lmore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import xyz.ludoviko.lmore.LMore;

public class LMBasicBlockItem extends BlockItem {
    public LMBasicBlockItem(Block blockIn) {
        super(blockIn, new Item.Properties().group(LMore.TAB));
    }
}
