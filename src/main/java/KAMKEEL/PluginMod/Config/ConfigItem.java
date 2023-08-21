package KAMKEEL.PluginMod.Config;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

import java.io.File;


public class ConfigItem {

    public static Configuration config;

    public final static String GENERAL = "General";

    /**
     * General Properties
     **/
    public static Property CardsProperty;
    public static boolean Cards = true;

    public static Property PillsProperty;
    public static boolean Pills = true;

    public static Property EyesProperty;
    public static boolean Eyes = true;

    public static Property BallsProperty;
    public static boolean Balls = true;

    public static Property ArtifactsProperty;
    public static boolean Artifacts = true;

    public static Property EnergyAttacksProperty;
    public static boolean EnergyAttacks = true;

    public static Property ApplesProperty;
    public static boolean Apples = true;
    public static Property MISCPProperty;
    public static boolean MISC = true;
    public static Property TreasureMapProperty;
    public static boolean TreasureMap = true;
    public static Property PaperBombProperty;
    public static boolean PaperBomb = true;
    public static Property VoidRasenshurikenProperty;
    public static boolean VoidRasenshuriken = true;
    public static Property MassiveRasenganProperty;
    public static boolean MassiveRasengan = true;
    public static Property MassiveRasenganSpinProperty;
    public static boolean MassiveRasenganSpin = true;


    public static void init(File configFile) {
        config = new Configuration(configFile);

        try {
            config.load();

            // General
            CardsProperty = config.get(GENERAL, "Cards", true);
            Cards = CardsProperty.getBoolean(true);

            PillsProperty = config.get(GENERAL, "Pills", true);
            Pills = PillsProperty.getBoolean(true);

            EyesProperty = config.get(GENERAL, "Eyes", true);
            Eyes = EyesProperty.getBoolean(true);

            BallsProperty = config.get(GENERAL, "Balls", true);
            Balls = BallsProperty.getBoolean(true);

            ArtifactsProperty = config.get(GENERAL, "Artifacts", true);
            Artifacts = ArtifactsProperty.getBoolean(true);

            EnergyAttacksProperty = config.get(GENERAL, "EnergyAttacks", true);
            EnergyAttacks = EnergyAttacksProperty.getBoolean(true);

            PaperBombProperty = config.get(GENERAL, "PaperBomb", true);
            PaperBomb = PaperBombProperty.getBoolean(true);

            TreasureMapProperty = config.get(GENERAL, "TreasureMap", true);
            TreasureMap = TreasureMapProperty.getBoolean(true);

            VoidRasenshurikenProperty = config.get(GENERAL, "VoidRasenShuriken", true);
            VoidRasenshuriken = VoidRasenshurikenProperty.getBoolean(true);

            MassiveRasenganProperty = config.get(GENERAL, "MassiveRasenganShuriken", true);
            MassiveRasengan = MassiveRasenganProperty.getBoolean(true);

            MassiveRasenganSpinProperty = config.get(GENERAL, "MassiveRasenganSpinShuriken", true);
            MassiveRasenganSpin = MassiveRasenganSpinProperty.getBoolean(true);

        } catch (Exception e) {
            FMLLog.log(Level.ERROR, e, "PluginMod has had a problem loading its main configuration");
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }
}


