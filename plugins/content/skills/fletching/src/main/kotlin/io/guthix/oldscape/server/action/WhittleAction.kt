package io.guthix.oldscape.server.action

import io.guthix.oldscape.server.data.Log
import io.guthix.oldscape.server.id.ObjId

class WhittleAction(private val defs: ObjId) {
    private val logNames = Log.logDefinitions.keys.associate { it to defs.get(ObjId::class.java, it).name.toLowerCase() }

    private val whittleNames = Log.logDefinitions.flatMap { it.value.values }.distinct().associate { it.id to defs.get(ObjId::class.java, it.id).name.toLowerCase() }

    companion object {

        /**
         * The animation played when whittling a log
         */
        const val WHITTLE_ANIM = 1248

        /**
         * The sound played when whittling a log
         */
        const val WHITTLE_SOUND = -1
    }
}