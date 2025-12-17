package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cookie_off: ImageVector
    get() {
        if (_Cookie_off != null) return _Cookie_off!!
        
        _Cookie_off = ImageVector.Builder(
            name = "cookie_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 600f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 600f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(280f, -562f)
                quadToRelative(-2f, 44f, 24.5f, 78f)
                reflectiveQuadToRelative(64.5f, 39f)
                quadToRelative(13f, 2f, 22f, 11.5f)
                reflectiveQuadToRelative(9f, 22.5f)
                quadToRelative(0f, 44f, -8f, 86.5f)
                reflectiveQuadTo(847f, 639f)
                quadToRelative(-5f, 12f, -15f, 19f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-11f, 2f, -22.5f, -1.5f)
                reflectiveQuadTo(767f, 652f)
                lineTo(310f, 195f)
                quadToRelative(-10f, -10f, -13.5f, -22f)
                reflectiveQuadToRelative(-1.5f, -24f)
                quadToRelative(2f, -12f, 9f, -22f)
                reflectiveQuadToRelative(19f, -15f)
                quadToRelative(45f, -18f, 93.5f, -24.5f)
                reflectiveQuadTo(513f, 81f)
                quadToRelative(19f, 0f, 33f, 12f)
                reflectiveQuadToRelative(14f, 31f)
                quadToRelative(0f, 61f, 48f, 110.5f)
                reflectiveQuadTo(719f, 278f)
                quadToRelative(17f, -2f, 29.5f, 10.5f)
                reflectiveQuadTo(760f, 318f)
                close()
            }
        }.build()
        
        return _Cookie_off!!
    }

private var _Cookie_off: ImageVector? = null

