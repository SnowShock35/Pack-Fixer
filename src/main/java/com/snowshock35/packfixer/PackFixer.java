package com.snowshock35.packfixer;

import com.snowshock35.packfixer.utils.MetadataHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.snowshock35.packfixer.PackFixer.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, acceptedMinecraftVersions = ACCEPTED_MC_VERSION)
public class PackFixer {

    public static final String MOD_ID = "mesa";
    public static final String MOD_NAME = "PackFixer";
    public static final String MC_VERSION = "1.7.10";
    public static final String MOD_VERSION = MC_VERSION + "-1.0.1";
    public static final String ACCEPTED_MC_VERSION = "[" + MC_VERSION + "]";
    public static final String MOD_DESC = "Quick Pack Fix Mod for 1.7.10";
    public static final String MOD_CREDITS = "Credits to MinecraftForge Team for MinecraftForge";
    public static final String MOD_URL = "http://minecraft.curseforge.com/pack-fixer";
    public static final String MOD_LOGO_PATH = "assets/mesa/textures/misc/logo.png";

    @Mod.Instance(MOD_ID)
    public static PackFixer instance;

    @Mod.Metadata(MOD_ID)
    public static ModMetadata metadata;

    @SidedProxy(clientSide = "com.snowshock35.packfixer.ClientProxy", serverSide = "com.snowshock35.packfixer.CommonProxy")
    public static CommonProxy proxy;

    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.log(Level.INFO, "Pre Initialization: Starting...");

        metadata = MetadataHelper.transformMetadata(metadata);
        proxy.preInit();

        LOGGER.log(Level.INFO, "Pre Initialization: Complete");
    }
}
