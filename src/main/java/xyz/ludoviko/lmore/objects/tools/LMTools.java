package xyz.ludoviko.lmore.objects.tools;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.ludoviko.lmore.objects.LMObjects;

public class LMTools extends LMObjects {
    public static final RegistryObject<Item> TITANIUM_SWORD = TOOLS.register(
            "titanium_sword",
            () -> new SwordItem(ItemTier.IRON, 6, 1.6f,
                    new Item.Properties()
                            .group(TAB)
            )
    );
    public static final RegistryObject<Item> TITANIUM_SHOVEL = TOOLS.register(
            "titanium_shovel",
            () -> new ShovelItem(ItemTier.IRON, 4.5f, 1.0f,
                    new Item.Properties()
                            .group(TAB)
            )
    );
    public static final RegistryObject<Item> TITANIUM_PICK = TOOLS.register(
            "titanium_pick",
            () -> new PickaxeItem(ItemTier.IRON, 4, 0.9f,
                    new Item.Properties()
                            .group(TAB)
            )
    );
    public static final RegistryObject<Item> TITANIUM_AXE = TOOLS.register(
            "titanium_axe",
            () -> new AxeItem(ItemTier.IRON, 9.0f, 0.9f,
                    new Item.Properties()
                            .group(TAB)
            )
    );
    public static final RegistryObject<Item> TITANIUM_HOE = TOOLS.register(
            "titanium_hoe",
            () -> new HoeItem(ItemTier.IRON, 0.9f,
                    new Item.Properties()
                            .group(TAB)
            )
    );

    public static void init() {
        TOOLS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
