package examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "examplemod", useMetadata = true)
public final class ExampleMod {
    @Mod.EventHandler
    private void preInit(final FMLPreInitializationEvent event) {
        // Configs, capabilities, networking
    }

    @Mod.EventHandler
    private void init(final FMLInitializationEvent event) {
        // World generation, ore dictionary, recipes
    }

    @Mod.EventHandler
    private void postInit(final FMLPostInitializationEvent event) {
        // Cross-mod compatibility
    }
}