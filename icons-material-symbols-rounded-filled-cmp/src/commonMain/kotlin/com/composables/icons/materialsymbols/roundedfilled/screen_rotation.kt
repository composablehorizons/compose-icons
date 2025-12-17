package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Screen_rotation: ImageVector
    get() {
        if (_Screen_rotation != null) return _Screen_rotation!!
        
        _Screen_rotation = ImageVector.Builder(
            name = "screen_rotation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 778f)
                lineTo(182f, 464f)
                quadToRelative(-23f, -23f, -23f, -54f)
                reflectiveQuadToRelative(23f, -54f)
                lineToRelative(174f, -174f)
                quadToRelative(23f, -23f, 54f, -23f)
                reflectiveQuadToRelative(54f, 23f)
                lineToRelative(314f, 314f)
                quadToRelative(23f, 23f, 23f, 54f)
                reflectiveQuadToRelative(-23f, 54f)
                lineTo(604f, 778f)
                quadToRelative(-23f, 23f, -54f, 23f)
                reflectiveQuadToRelative(-54f, -23f)
                close()
                moveToRelative(63f, -691f)
                lineToRelative(77f, 77f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(410f, 50f)
                quadToRelative(-12f, -12f, -6.5f, -28f)
                reflectiveQuadToRelative(22.5f, -19f)
                quadToRelative(14f, -2f, 27f, -2.5f)
                reflectiveQuadToRelative(27f, -0.5f)
                quadToRelative(99f, 0f, 186.5f, 37.5f)
                reflectiveQuadToRelative(153f, 103f)
                quadToRelative(65.5f, 65.5f, 103f, 153f)
                reflectiveQuadTo(960f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, -71f, -24f, -136f)
                reflectiveQuadToRelative(-66.5f, -117f)
                quadTo(747f, 175f, 688f, 138.5f)
                reflectiveQuadTo(559f, 87f)
                close()
                moveTo(401f, 873f)
                lineToRelative(-77f, -77f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineTo(550f, 910f)
                quadToRelative(12f, 12f, 6.5f, 28.5f)
                reflectiveQuadTo(534f, 957f)
                quadToRelative(-14f, 2f, -27f, 2.5f)
                reflectiveQuadTo(480f, 960f)
                quadToRelative(-99f, 0f, -186.5f, -37.5f)
                reflectiveQuadToRelative(-153f, -103f)
                quadTo(75f, 754f, 37.5f, 666.5f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(40f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, 71f, 24f, 136f)
                reflectiveQuadToRelative(66.5f, 117f)
                quadTo(213f, 785f, 272f, 821.5f)
                reflectiveQuadTo(401f, 873f)
                close()
            }
        }.build()
        
        return _Screen_rotation!!
    }

private var _Screen_rotation: ImageVector? = null

