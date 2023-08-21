package KAMKEEL.PluginMod.Config;

import java.io.File;

public class LoadConfiguration {
    public static File blocksConfig;
    public static File compatConfig;

    public static File compatItem;

    public static void init(String configpath)
    {
        blocksConfig = new File(configpath + "blocks.cfg");
        compatConfig = new File(configpath + "compat.cfg");
        compatItem = new File(configpath + "Item.cfg");


        ConfigBlocks.init(blocksConfig);
        ConfigCompat.init(compatConfig);
        ConfigItem.init(compatItem);
    }
}
