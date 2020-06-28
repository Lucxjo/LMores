package xyz.ludoviko.lmore;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod(LMore.ID)
public class LMore{
    public static final String ID = "lmore";
    public static final Logger logger = LogManager.getLogger();
    public static LMore instance;

    public LMore() {
        final IEventBus modEB = FMLJavaModLoadingContext.get().getModEventBus();

        modEB.addListener(this::setup);
        modEB.addListener(this::enqueueIMC);
        modEB.addListener(this::processIMC);
        modEB.addListener(this::doClientStuff);

        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent e) {
        logger.info("LMores: Preinit phase");
    }

    private void doClientStuff(final FMLClientSetupEvent e) {
        logger.info("Got game settings {}", e.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent e) {
    }

    private void processIMC(final InterModProcessEvent e) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent e) {
        logger.info("LMores: Server Start Event");
    }
}
