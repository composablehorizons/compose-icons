package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Magic_tether: ImageVector
    get() {
        if (_Magic_tether != null) return _Magic_tether!!
        
        _Magic_tether = ImageVector.Builder(
            name = "magic_tether",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 496f)
                quadToRelative(75f, 0f, 142.5f, 23.5f)
                reflectiveQuadTo(745f, 585f)
                quadToRelative(20f, 15f, 20.5f, 40f)
                reflectiveQuadTo(748f, 668f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(661f, 672f)
                quadToRelative(-38f, -26f, -84f, -41f)
                reflectiveQuadToRelative(-97f, -15f)
                quadToRelative(-51f, 0f, -97f, 15f)
                reflectiveQuadToRelative(-84f, 41f)
                quadToRelative(-20f, 14f, -45f, 13.5f)
                reflectiveQuadTo(212f, 668f)
                quadToRelative(-17f, -18f, -17f, -42.5f)
                reflectiveQuadToRelative(20f, -39.5f)
                quadToRelative(55f, -42f, 122.5f, -66f)
                reflectiveQuadTo(480f, 496f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(125f, 0f, 235.5f, 41.5f)
                reflectiveQuadTo(914f, 413f)
                quadToRelative(20f, 17f, 20.5f, 42f)
                reflectiveQuadTo(917f, 498f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(830f, 500f)
                quadToRelative(-72f, -59f, -161f, -91.5f)
                reflectiveQuadTo(480f, 376f)
                quadToRelative(-100f, 0f, -189f, 32.5f)
                reflectiveQuadTo(130f, 500f)
                quadToRelative(-20f, 16f, -45f, 15f)
                reflectiveQuadToRelative(-42f, -18f)
                quadToRelative(-18f, -18f, -17.5f, -42.5f)
                reflectiveQuadTo(46f, 413f)
                quadToRelative(88f, -74f, 198.5f, -115.5f)
                reflectiveQuadTo(480f, 256f)
                close()
                moveToRelative(-50f, 610f)
                lineToRelative(-70f, -32f)
                quadToRelative(-12f, -5f, -12f, -18f)
                reflectiveQuadToRelative(12f, -18f)
                lineToRelative(70f, -32f)
                lineToRelative(32f, -70f)
                quadToRelative(5f, -12f, 18f, -12f)
                reflectiveQuadToRelative(18f, 12f)
                lineToRelative(32f, 70f)
                lineToRelative(70f, 32f)
                quadToRelative(12f, 5f, 12f, 18f)
                reflectiveQuadToRelative(-12f, 18f)
                lineToRelative(-70f, 32f)
                lineToRelative(-32f, 70f)
                quadToRelative(-5f, 12f, -18f, 12f)
                reflectiveQuadToRelative(-18f, -12f)
                lineToRelative(-32f, -70f)
                close()
            }
        }.build()
        
        return _Magic_tether!!
    }

private var _Magic_tether: ImageVector? = null

