package com.youcode.utils.app.Config;


import com.youcode.app.ui.helper.PalletGrouper;
import com.youcode.app.ui.guide.Pallet;
import com.youcode.libs.print.Emojis;
import com.youcode.utils.app.Enum.RunMoods;


public class AppConfig {
    public static final String APP_NAME = "Chess " + Emojis.emoji.get("chess_pawn") + " Royal Rivals " + Emojis.emoji.get("fire");
    public static final String APP_VERSION = "1.0.0";
    public static final String APP_AUTHOR = "ABDELLAH EL HILALY";
    public static final String RUN_MOOD = RunMoods.Development.name();


}
