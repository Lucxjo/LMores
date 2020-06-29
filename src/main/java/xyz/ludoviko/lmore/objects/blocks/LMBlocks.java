package xyz.ludoviko.lmore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.ludoviko.lmore.objects.LMObjects;

public class LMBlocks extends LMObjects {

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", LMTitaniumBlock::new);

    // BlockItems
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new LMBasicBlockItem(TITANIUM_BLOCK.get()));
}
