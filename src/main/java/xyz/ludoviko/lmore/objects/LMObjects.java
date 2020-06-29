package xyz.ludoviko.lmore.objects;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.ludoviko.lmore.objects.items.LMItems;
import xyz.ludoviko.lmore.util.R;

public abstract class LMObjects {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, R.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, R.MOD_ID);
    public static final DeferredRegister<Item> TOOLS = new DeferredRegister<>(ForgeRegistries.ITEMS, R.MOD_ID);

    public static final ItemGroup TAB = new ItemGroup("lmore") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(LMItems.TITANIUM_INGOT.get());
        }
    };
}
