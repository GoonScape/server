package io.guthix.oldscape.server.data

import io.guthix.oldscape.server.id.ObjId

enum class Log(val id: Int, val whittleOptions: Array<WhittleItem>) {
    LOGS(id=ObjId.LOGS_1511, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_15, WhittleItem.JAVELIN_SHAFT, WhittleItem.SHORTBOW_U, WhittleItem.LONGBOW_U, WhittleItem.WOODEN_STOCK)),
    OAK(id=ObjId.OAKLOGS_1521, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_30, WhittleItem.OAK_SHORTBOW_U, WhittleItem.OAK_LONGBOW_U, WhittleItem.OAK_STOCK, WhittleItem.OAK_SHIELD)),
    ACHEY(id=ObjId.ACHEYTREELOGS_2862, whittleOptions = arrayOf(WhittleItem.OGRE_ARROW_SHAFT, WhittleItem.UNSTRUNG_COMP_BOW)), // This does not include ogre arrow shafts
    WILLOW(id=ObjId.WILLOWLOGS_1519, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_45, WhittleItem.WILLOW_SHORTBOW_U, WhittleItem.WILLOW_LONGBOW_U, WhittleItem.WILLOW_STOCK, WhittleItem.WILLOW_SHIELD)),
    TEAK(id=ObjId.TEAKLOGS_6333, whittleOptions = arrayOf(WhittleItem.TEAK_STOCK)),
    MAPLE(id=ObjId.MAPLELOGS_1517, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_60, WhittleItem.MAPLE_SHORTBOW_U, WhittleItem.MAPLE_LONGBOW_U, WhittleItem.MAPLE_STOCK, WhittleItem.MAPLE_SHIELD)),
    MAHOGANY(id=ObjId.MAHOGANYLOGS_6332, whittleOptions = arrayOf(WhittleItem.MAHOGANY_STOCK)),
    YEW(id=ObjId.YEWLOGS_1515, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_75, WhittleItem.YEW_SHORTBOW_U, WhittleItem.YEW_LONGBOW_U, WhittleItem.YEW_STOCK, WhittleItem.YEW_SHIELD)),
    MAGIC(id=ObjId.MAGICLOGS_1513, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_90, WhittleItem.MAGIC_SHORTBOW_U, WhittleItem.MAGIC_LONGBOW_U, WhittleItem.MAGIC_STOCK, WhittleItem.MAGIC_SHIELD)),
    REDWOOD(id=ObjId.REDWOODLOGS_19669, whittleOptions = arrayOf(WhittleItem.ARROW_SHAFT_105, WhittleItem.REDWOOD_SHIELD));

    companion object {
        /**
         * The map of log ids to a map of whittleItem ids to their definitions
         */
        val logDefinitions = values().associate { log ->
            log.id to log.whittleOptions.associate { whittleOption ->
                whittleOption.id to whittleOption
            }
        }
    }
}