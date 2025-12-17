package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -60f, 17f, -115.5f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -104.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(2f, -284f)
                lineTo(362f, 476f)
                lineToRelative(-93f, 195f)
                quadToRelative(-5f, 10f, 2.5f, 17.5f)
                reflectiveQuadTo(289f, 691f)
                lineToRelative(193f, -95f)
                close()
                moveToRelative(-2f, -516f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 42f, -8.5f, 82.5f)
                reflectiveQuadTo(846f, 641f)
                quadToRelative(-6f, 14f, -17.5f, 20.5f)
                reflectiveQuadTo(803f, 668f)
                quadToRelative(-10f, 0f, -19f, -3.5f)
                reflectiveQuadTo(767f, 653f)
                lineTo(616f, 502f)
                quadToRelative(-9f, -9f, -11f, -22f)
                reflectiveQuadToRelative(4f, -24f)
                lineToRelative(82f, -167f)
                quadToRelative(5f, -10f, -2.5f, -17.5f)
                reflectiveQuadTo(671f, 269f)
                lineToRelative(-167f, 82f)
                quadToRelative(-11f, 6f, -24f, 4f)
                reflectiveQuadToRelative(-22f, -11f)
                lineTo(307f, 193f)
                quadToRelative(-8f, -8f, -11.5f, -16.5f)
                reflectiveQuadTo(292f, 158f)
                quadToRelative(0f, -14f, 7f, -25.5f)
                reflectiveQuadToRelative(20f, -18.5f)
                quadToRelative(38f, -17f, 78.5f, -25.5f)
                reflectiveQuadTo(480f, 80f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

