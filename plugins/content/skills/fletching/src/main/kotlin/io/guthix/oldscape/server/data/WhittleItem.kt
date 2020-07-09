package io.guthix.oldscape.server.data

import io.guthix.oldscape.server.id.ObjId

enum class WhittleItem(val id : Int, val level: Int, val logCount: Int = 1, val amount: Int = 1, val ticks: Int = 3, val fletchingExp: Double) {
    // Logs
    ARROW_SHAFT_15(id = ObjId.ARROWSHAFT_52, level = 1, amount = 15, fletchingExp = 0.5),
    JAVELIN_SHAFT(id = ObjId.JAVELINSHAFT_19584, level = 3, amount = 15, fletchingExp = 0.5),
    SHORTBOW_U(id = ObjId.SHORTBOWU_50, level = 5, fletchingExp = 5.0),
    LONGBOW_U(id = ObjId.LONGBOWU_48, level = 10, fletchingExp = 10.0),
    WOODEN_STOCK(id = ObjId.WOODENSTOCK_9440, level = 9, fletchingExp = 6.0),

    // Oak Logs
    ARROW_SHAFT_30(id = ObjId.ARROWSHAFT_52, level = 15, amount = 30, fletchingExp = 0.5),
    OAK_SHORTBOW_U(id = ObjId.OAKSHORTBOWU_54, level = 20, fletchingExp = 16.5),
    OAK_LONGBOW_U(id = ObjId.OAKLONGBOWU_56, level = 25, fletchingExp = 25.0),
    OAK_STOCK(id = ObjId.OAKSTOCK_9442, level = 24, fletchingExp = 16.0),
    OAK_SHIELD(id = ObjId.OAKSHIELD_22251, level = 27, ticks = 7, logCount = 2, fletchingExp = 50.0),

    // Achey Tree Logs
    OGRE_ARROW_SHAFT(id = ObjId.OGREARROWSHAFT_2864, level = 5, fletchingExp = 1.6),
    UNSTRUNG_COMP_BOW(id = ObjId.UNSTRUNGCOMPBOW_4825, level = 30, fletchingExp = 45.0),

    // Willow Logs
    ARROW_SHAFT_45(id = ObjId.ARROWSHAFT_52, level = 30, amount = 45, fletchingExp = 0.5),
    WILLOW_SHORTBOW_U(id = ObjId.WILLOWSHORTBOWU_60, level = 35, fletchingExp = 33.3),
    WILLOW_LONGBOW_U(id = ObjId.WILLOWLONGBOWU_58, level = 40, fletchingExp = 41.5),
    WILLOW_STOCK(id = ObjId.WILLOWSTOCK_9444, level = 39, fletchingExp = 22.0),
    WILLOW_SHIELD(id = ObjId.WILLOWSHIELD_22254, level = 42, ticks = 7, logCount = 2, fletchingExp = 83.0),

    // Teak Logs
    TEAK_STOCK(id = ObjId.TEAKSTOCK_9446, level = 46, fletchingExp = 27.0),

    // Maple Logs
    ARROW_SHAFT_60(id = ObjId.ARROWSHAFT_52, level = 45, amount = 60, fletchingExp = 0.5),
    MAPLE_SHORTBOW_U(id = ObjId.MAPLESHORTBOWU_64, level = 50, fletchingExp = 50.0),
    MAPLE_LONGBOW_U(id = ObjId.MAPLELONGBOWU_62, level = 55, fletchingExp = 58.3),
    MAPLE_STOCK(id = ObjId.MAPLESTOCK_9448, level = 54, fletchingExp = 32.0),
    MAPLE_SHIELD(id = ObjId.OAKSHIELD_22251, level = 57, ticks = 7, logCount = 2, fletchingExp = 116.5),

    // Mahogany Logs
    MAHOGANY_STOCK(id = ObjId.MAHOGANYSTOCK_9450, level = 61, fletchingExp = 41.0),

    // Yew Logs
    ARROW_SHAFT_75(id = ObjId.ARROWSHAFT_52, level = 60, amount = 75, fletchingExp = 0.5),
    YEW_SHORTBOW_U(id = ObjId.YEWSHORTBOWU_68, level = 65, fletchingExp = 67.5),
    YEW_LONGBOW_U(id = ObjId.YEWLONGBOWU_66, level = 70, fletchingExp = 75.0),
    YEW_STOCK(id = ObjId.YEWSTOCK_9452, level = 69, fletchingExp = 50.0),
    YEW_SHIELD(id = ObjId.YEWSHIELD_22260, level = 72, ticks = 7, logCount = 2, fletchingExp = 150.0),

    // Magic Logs
    ARROW_SHAFT_90(id = ObjId.ARROWSHAFT_52, level = 75, amount = 90, fletchingExp = 0.5),
    MAGIC_SHORTBOW_U(id = ObjId.MAGICSHORTBOWU_72, level = 80, fletchingExp = 83.3),
    MAGIC_LONGBOW_U(id = ObjId.MAGICLONGBOWU_70, level = 85, fletchingExp = 91.5),
    MAGIC_STOCK(id = ObjId.MAGICSTOCK_21952, level = 78, fletchingExp = 70.0),
    MAGIC_SHIELD(id = ObjId.MAGICSHIELD_22263, level = 87, ticks = 7, logCount = 2, fletchingExp = 183.0),

    // Redwood Logs
    ARROW_SHAFT_105(id = ObjId.ARROWSHAFT_52, level = 90, amount = 105, fletchingExp = 0.5),
    REDWOOD_SHIELD(id = ObjId.REDWOODSHIELD_22266, level = 92, ticks = 7, logCount = 2, fletchingExp = 216.0);
}