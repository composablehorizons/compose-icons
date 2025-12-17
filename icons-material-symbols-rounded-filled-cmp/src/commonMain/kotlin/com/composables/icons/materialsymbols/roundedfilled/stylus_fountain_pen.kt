package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus_fountain_pen: ImageVector
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
                horizontalLineToRelative(284f)
                quadToRelative(14f, 0f, 25f, -8.5f)
                reflectiveQuadToRelative(14f, -22.5f)
                lineToRelative(73f, -306f)
                quadToRelative(2f, -11f, -0.5f, -21f)
                reflectiveQuadTo(723f, 264f)
                lineTo(554f, 108f)
                quadToRelative(-10f, -9f, -22f, -3.5f)
                reflectiveQuadTo(520f, 123f)
                verticalLineToRelative(169f)
                quadToRelative(14f, 10f, 22f, 25f)
                reflectiveQuadToRelative(8f, 33f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 350f)
                quadToRelative(0f, -18f, 8f, -33f)
                reflectiveQuadToRelative(22f, -25f)
                verticalLineToRelative(-169f)
                quadToRelative(0f, -13f, -12f, -18.5f)
                reflectiveQuadToRelative(-22f, 3.5f)
                lineTo(237f, 264f)
                quadToRelative(-8f, 8f, -10.5f, 18f)
                reflectiveQuadToRelative(-0.5f, 21f)
                lineToRelative(73f, 306f)
                quadToRelative(3f, 14f, 14f, 22.5f)
                reflectiveQuadToRelative(25f, 8.5f)
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

