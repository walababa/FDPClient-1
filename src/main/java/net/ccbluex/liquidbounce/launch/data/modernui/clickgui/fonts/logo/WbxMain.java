/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.launch.data.modernui.clickgui.fonts.logo;

import net.ccbluex.liquidbounce.launch.data.modernui.clickgui.fonts.api.FontManager;
import net.ccbluex.liquidbounce.launch.data.modernui.clickgui.fonts.impl.SimpleFontManager;
import net.ccbluex.liquidbounce.launch.data.modernui.clickgui.style.styles.newdropdown.SideGui.SideGui;

public class WbxMain {
    public static String Name = "FDPCLIENT";
    public static String Rank = "";
    public static long playTimeStart = 0;
    public static String version = "";
    public static String username;
    private final SideGui sideGui = new SideGui();
    private static WbxMain INSTANCE;

    public  SideGui getSideGui() {
        return sideGui;
    }
    public static WbxMain getInstance() {
        try {
            if (INSTANCE == null) INSTANCE = new WbxMain();
            return INSTANCE;
        } catch (Throwable t) {
            //    ClientUtils.getLogger().warn(t);
            throw t;
        }
    }
    public static FontManager fontManager = SimpleFontManager.create();
    public static FontManager getFontManager() {
        return fontManager;
    }
}