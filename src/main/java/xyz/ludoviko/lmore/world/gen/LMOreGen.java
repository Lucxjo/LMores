package xyz.ludoviko.lmore.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.ludoviko.lmore.objects.blocks.LMBlocks;

public class LMOreGen {
    public static void genOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.NETHER) {
                ConfiguredPlacement customConf = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 5, 10, 25));
                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NETHERRACK,
                                        LMBlocks.TITANIUM_ORE.get().getDefaultState(),
                                        10
                                )
                        ).withPlacement(customConf)
                );
            }
        }
    }
}
