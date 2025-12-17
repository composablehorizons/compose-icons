package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Respiratory_rate: ImageVector
    get() {
        if (_Respiratory_rate != null) return _Respiratory_rate!!
        
        _Respiratory_rate = ImageVector.Builder(
            name = "respiratory_rate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(440f, 860f)
                verticalLineToRelative(-147f)
                lineToRelative(53f, -141f)
                quadToRelative(9f, -23f, 29.5f, -37.5f)
                reflectiveQuadTo(568f, 520f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(102f)
                lineToRelative(-54f, 54f)
                lineToRelative(28f, 28f)
                lineToRelative(66f, -67f)
                verticalLineToRelative(-197f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(197f)
                lineToRelative(66f, 67f)
                lineToRelative(28f, -28f)
                lineToRelative(-54f, -55f)
                verticalLineToRelative(-101f)
                horizontalLineToRelative(32f)
                quadToRelative(25f, 0f, 45.5f, 14.5f)
                reflectiveQuadTo(867f, 572f)
                lineToRelative(53f, 141f)
                verticalLineToRelative(147f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 920f)
                horizontalLineToRelative(-80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 860f)
                verticalLineToRelative(-110f)
                lineToRelative(-40f, -40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(110f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 551f)
                lineToRelative(-45f, -89f)
                quadToRelative(-5f, -10f, -14.5f, -16f)
                reflectiveQuadToRelative(-20.5f, -6f)
                horizontalLineTo(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(300f)
                horizontalLineTo(780f)
                verticalLineToRelative(-80f)
                horizontalLineTo(580f)
                verticalLineToRelative(81f)
                horizontalLineToRelative(-25f)
                lineToRelative(-79f, -159f)
                quadToRelative(-5f, -10f, -15f, -15f)
                reflectiveQuadToRelative(-21f, -5f)
                quadToRelative(-11f, 0f, -21f, 5f)
                reflectiveQuadToRelative(-15f, 15f)
                lineTo(280f, 551f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(95f)
                lineToRelative(69f, 138f)
                quadToRelative(5f, 11f, 14.5f, 16.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(315f, 658f)
                lineToRelative(125f, -248f)
                lineToRelative(40f, 81f)
                quadToRelative(-14f, 12f, -25.5f, 27f)
                reflectiveQuadTo(436f, 551f)
                lineToRelative(-56f, 151f)
                verticalLineToRelative(98f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Respiratory_rate!!
    }

private var _Respiratory_rate: ImageVector? = null

