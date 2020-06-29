package xyz.ludoviko.lmore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LMTitaniumOre extends OreBlock {
    public LMTitaniumOre() {
        super(
                Block.Properties.create(Material.ROCK)
                        .hardnessAndResistance(3.0f, 3.0f)
                        .harvestLevel(1)
                        .harvestTool(ToolType.PICKAXE)
        );
    }
}
