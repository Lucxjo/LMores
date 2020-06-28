package xyz.ludoviko.lmore.util;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.ludoviko.lmore.objects.items.ModItems;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, R.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ModItems::new);
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ModItems::new);
}
