package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Recenter: ImageVector
    get() {
        if (_Recenter != null) return _Recenter!!
        
        _Recenter = ImageVector.Builder(
            name = "recenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 753f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                verticalLineToRelative(-127f)
                lineToRelative(-16f, 16f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(368f, 768f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(84f, -84f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(84f, 84f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(592f, 768f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(536f, 769f)
                lineToRelative(-16f, -16f)
                close()
                moveTo(207f, 520f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(127f)
                lineToRelative(-16f, -16f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(84f, 84f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(192f, 592f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(191f, 536f)
                lineToRelative(16f, -16f)
                close()
                moveToRelative(546f, 0f)
                lineToRelative(16f, 16f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(768f, 592f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-84f, -84f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(84f, -84f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(768f, 368f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(769f, 424f)
                lineToRelative(-16f, 16f)
                horizontalLineToRelative(127f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(753f)
                close()
                moveToRelative(-273f, 20f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(-40f, -333f)
                verticalLineToRelative(-127f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(127f)
                lineToRelative(16f, -16f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-84f, -84f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(368f, 192f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(424f, 191f)
                lineToRelative(16f, 16f)
                close()
            }
        }.build()
        
        return _Recenter!!
    }

private var _Recenter: ImageVector? = null

