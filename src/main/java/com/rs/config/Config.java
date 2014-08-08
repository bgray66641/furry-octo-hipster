package com.etc.config;

import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * Created by bgray on 31/05/2014.
 */
public class Config
{
    public static Logger log;

    public static void load(){
        Configuration config;
        try
        {
            File configFile = new File(new File(getMinecraftDir(), "config"), "ETCConfig.cfg");

            config = new Configuration(configFile);
            config.load();

            log.info("Config loaded from " + configFile.getAbsolutePath());
        } catch (Exception e)
        {
            log.warn("Error while trying to access configuration! " + e);
            config = null;
        }

        if (config != null)
        {
			/*Property prop = config.get("general", "enableWorldGenWhite", enableWorldGenOreWhite);
			prop.comment = "Enable the world gen of White ore in the world";
			enableWorldGenOreWhite = prop.getBoolean(enableWorldGenOreWhite);*/

            if (config.hasChanged())
                config.save();
        }
    }

    public static File getMinecraftDir()
    {
        return new File(".");
    }
}
