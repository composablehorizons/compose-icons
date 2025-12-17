package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Key_off: ImageVector
    get() {
        if (_Key_off != null) return _Key_off!!
        
        _Key_off = ImageVector.Builder(
            name = "key_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(488f, 601f)
                quadToRelative(-32f, 54f, -87f, 86.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32.5f, -121f)
                reflectiveQuadToRelative(86.5f, -87f)
                lineToRelative(-75f, -75f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(678f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(140f, -397f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(788f, 611f)
                quadToRelative(-6f, 6f, -12.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                quadToRelative(-9f, 0f, -15.5f, -2.5f)
                reflectiveQuadTo(732f, 612f)
                lineToRelative(-52f, -52f)
                lineToRelative(-3f, 4f)
                lineToRelative(-164f, -164f)
                horizontalLineToRelative(311f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(12.5f, 8f)
                lineToRelative(39f, 39f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                close()
                moveTo(280f, 600f)
                quadToRelative(43f, 0f, 75f, -26.5f)
                reflectiveQuadToRelative(41f, -64.5f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-50f, -50f)
                lineToRelative(-50f, -50f)
                lineTo(251f, 364f)
                quadToRelative(-42f, 9f, -66.5f, 42.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()
        
        return _Key_off!!
    }

private var _Key_off: ImageVector? = null

