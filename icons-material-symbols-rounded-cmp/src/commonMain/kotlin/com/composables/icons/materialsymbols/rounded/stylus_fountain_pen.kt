package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stylus_fountain_pen: ImageVector
    get() {
        if (_Stylus_fountain_pen != null) return _Stylus_fountain_pen!!
        
        _Stylus_fountain_pen = ImageVector.Builder(
            name = "stylus_fountain_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(338f, 640f)
                quadToRelative(-14f, 0f, -25f, -8.5f)
                reflectiveQuadTo(299f, 609f)
                lineToRelative(-73f, -306f)
                quadToRelative(-2f, -11f, 0.5f, -21f)
                reflectiveQuadToRelative(10.5f, -18f)
                lineToRelative(216f, -199f)
                quadToRelative(11f, -11f, 27f, -11f)
                reflectiveQuadToRelative(27f, 11f)
                lineToRelative(216f, 199f)
                quadToRelative(8f, 8f, 10.5f, 18f)
                reflectiveQuadToRelative(0.5f, 21f)
                lineToRelative(-73f, 306f)
                quadToRelative(-3f, 14f, -14f, 22.5f)
                reflectiveQuadToRelative(-25f, 8.5f)
                horizontalLineTo(338f)
                close()
                moveToRelative(32f, -80f)
                horizontalLineToRelative(220f)
                lineToRelative(61f, -253f)
                lineToRelative(-131f, -121f)
                verticalLineToRelative(106f)
                quadToRelative(14f, 10f, 22f, 25f)
                reflectiveQuadToRelative(8f, 33f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 350f)
                quadToRelative(0f, -18f, 8f, -33f)
                reflectiveQuadToRelative(22f, -25f)
                verticalLineToRelative(-106f)
                lineTo(309f, 307f)
                lineToRelative(61f, 253f)
                close()
                moveTo(215f, 840f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(177f, 787f)
                lineToRelative(5f, -12f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(5f, 12f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(745f, 840f)
                horizontalLineTo(215f)
                close()
            }
        }.build()
        
        return _Stylus_fountain_pen!!
    }

private var _Stylus_fountain_pen: ImageVector? = null

