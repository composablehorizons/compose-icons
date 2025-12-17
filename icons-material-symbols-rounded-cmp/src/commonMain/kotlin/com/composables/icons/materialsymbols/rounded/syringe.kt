package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Syringe: ImageVector
    get() {
        if (_Syringe != null) return _Syringe!!
        
        _Syringe = ImageVector.Builder(
            name = "syringe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(156f, 447f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                lineToRelative(112f, -112f)
                lineToRelative(-43f, -43f)
                lineToRelative(-12f, 12f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(156f, 247f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(80f, -80f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-12f, 12f)
                lineToRelative(43f, 43f)
                lineToRelative(112f, -112f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(493f, 167f)
                lineToRelative(-27f, 26f)
                lineToRelative(295f, 295f)
                quadToRelative(23f, 23f, 23f, 56.5f)
                reflectiveQuadTo(761f, 601f)
                lineToRelative(-28f, 29f)
                lineToRelative(155f, 154f)
                quadToRelative(10f, 10f, 5f, 22f)
                reflectiveQuadToRelative(-19f, 12f)
                horizontalLineToRelative(-41f)
                quadToRelative(-12f, 0f, -23.5f, -5f)
                reflectiveQuadTo(790f, 800f)
                lineTo(676f, 686f)
                lineToRelative(-28f, 29f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(535f, 715f)
                lineTo(240f, 420f)
                lineToRelative(-27f, 27f)
                quadToRelative(-12f, 11f, -28.5f, 11f)
                reflectiveQuadTo(156f, 447f)
                close()
                moveToRelative(140f, -83f)
                lineToRelative(295f, 295f)
                lineToRelative(113f, -114f)
                lineToRelative(-60f, -61f)
                lineToRelative(-56f, 56f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(532f, 541f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(56f, -56f)
                lineToRelative(-60f, -60f)
                lineToRelative(-56f, 56f)
                quadToRelative(-12f, 11f, -28.5f, 11f)
                reflectiveQuadTo(415f, 424f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                lineToRelative(56f, -56f)
                lineToRelative(-61f, -61f)
                lineToRelative(-114f, 114f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(114f, -114f)
                lineToRelative(-114f, 114f)
                close()
            }
        }.build()
        
        return _Syringe!!
    }

private var _Syringe: ImageVector? = null

