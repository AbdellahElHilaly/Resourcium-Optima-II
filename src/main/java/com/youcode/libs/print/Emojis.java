package com.youcode.libs.print;

import java.util.Map;

public class Emojis {

    protected static String tempEmoji;
    protected static String tempStatus;

    public static final Map<String, String> emoji = Map.of(
            "info", "\uD83D\uDCAC",
            "warning", "\u26A0\uFE0F",
            "error", "\u274C",
            "success", "\u2705",
            "chess_pawn", "\u265F",
            "rocket", "\uD83D\uDE80",
            "fire", "\uD83D\uDD25",
            "heart", "\u2764\uFE0F",
            "star", "\u2B50\uFE0F",
            "clap", "\uD83D\uDC4F"
    );

}
