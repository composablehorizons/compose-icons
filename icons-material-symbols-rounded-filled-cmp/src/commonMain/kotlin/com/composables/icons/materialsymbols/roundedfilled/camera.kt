package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 360f)
                quadToRelative(-11f, 0f, -17f, -10f)
                reflectiveQuadToRelative(0f, -20f)
                lineToRelative(117f, -203f)
                quadToRelative(8f, -13f, 20f, -15.5f)
                reflectiveQuadToRelative(26f, 4.5f)
                quadToRelative(69f, 31f, 122f, 86.5f)
                reflectiveQuadTo(850f, 328f)
                quadToRelative(5f, 13f, -1.5f, 22.5f)
                reflectiveQuadTo(828f, 360f)
                horizontalLineTo(500f)
                close()
                moveToRelative(-143f, 49f)
                lineTo(237f, 201f)
                quadToRelative(-8f, -13f, -4f, -26f)
                reflectiveQuadToRelative(16f, -21f)
                quadToRelative(48f, -34f, 106.5f, -54f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(15f, 0f, 33f, 1.5f)
                reflectiveQuadToRelative(30f, 3.5f)
                quadToRelative(14f, 2f, 18.5f, 12f)
                reflectiveQuadToRelative(-2.5f, 22f)
                lineTo(392f, 409f)
                quadToRelative(-6f, 10f, -17.5f, 10f)
                reflectiveQuadTo(357f, 409f)
                close()
                moveTo(114f, 560f)
                quadToRelative(-11f, 0f, -20f, -7.5f)
                reflectiveQuadTo(83f, 534f)
                quadToRelative(-2f, -11f, -2.5f, -24f)
                reflectiveQuadToRelative(-0.5f, -30f)
                quadToRelative(0f, -63f, 20.5f, -125.5f)
                reflectiveQuadTo(164f, 236f)
                quadToRelative(11f, -14f, 25.5f, -14f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(168f, 293f)
                quadToRelative(6f, 10f, -0.5f, 20f)
                reflectiveQuadTo(362f, 560f)
                horizontalLineTo(114f)
                close()
                moveToRelative(200f, 284f)
                quadToRelative(-66f, -32f, -121f, -87f)
                reflectiveQuadToRelative(-83f, -125f)
                quadToRelative(-5f, -13f, 2f, -22.5f)
                reflectiveQuadToRelative(21f, -9.5f)
                horizontalLineToRelative(326f)
                quadToRelative(11f, 0f, 17f, 10f)
                reflectiveQuadToRelative(0f, 20f)
                lineTo(361f, 831f)
                quadToRelative(-8f, 13f, -20f, 17f)
                reflectiveQuadToRelative(-27f, -4f)
                close()
                moveToRelative(166f, 36f)
                quadToRelative(-14f, 0f, -31.5f, -1.5f)
                reflectiveQuadTo(418f, 875f)
                quadToRelative(-14f, -2f, -19f, -12f)
                reflectiveQuadToRelative(2f, -22f)
                lineToRelative(165f, -288f)
                quadToRelative(6f, -10f, 20f, -10f)
                reflectiveQuadToRelative(20f, 10f)
                lineToRelative(118f, 205f)
                quadToRelative(7f, 11f, 4.5f, 24f)
                reflectiveQuadTo(712f, 806f)
                quadToRelative(-46f, 34f, -107.5f, 54f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(271f, -155f)
                lineTo(581f, 430f)
                quadToRelative(-6f, -10f, 0.5f, -20f)
                reflectiveQuadToRelative(17.5f, -10f)
                horizontalLineToRelative(247f)
                quadToRelative(11f, 0f, 20f, 7.5f)
                reflectiveQuadToRelative(11f, 18.5f)
                quadToRelative(2f, 11f, 2.5f, 24f)
                reflectiveQuadToRelative(0.5f, 30f)
                quadToRelative(0f, 63f, -20.5f, 126.5f)
                reflectiveQuadTo(796f, 725f)
                quadToRelative(-8f, 11f, -23f, 11.5f)
                reflectiveQuadTo(751f, 725f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

