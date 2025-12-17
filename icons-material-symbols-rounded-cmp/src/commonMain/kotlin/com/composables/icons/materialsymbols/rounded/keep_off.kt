package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keep_off: ImageVector
    get() {
        if (_Keep_off != null) return _Keep_off!!
        
        _Keep_off = ImageVector.Builder(
            name = "keep_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 200f)
                horizontalLineTo(400f)
                verticalLineToRelative(87f)
                lineTo(290f, 177f)
                quadToRelative(-5f, -5f, -7.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -12f)
                quadToRelative(0f, -13f, 9f, -23.5f)
                reflectiveQuadToRelative(24f, -10.5f)
                horizontalLineToRelative(327f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                quadToRelative(0f, 16f, -14.5f, 22.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(-240f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(296f)
                quadToRelative(-25f, 0f, -40f, -17.5f)
                reflectiveQuadTo(241f, 583f)
                quadToRelative(0f, -11f, 4.5f, -22f)
                reflectiveQuadToRelative(14.5f, -21f)
                lineToRelative(60f, -60f)
                verticalLineToRelative(-46f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(818f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(762f, 876f)
                lineTo(526f, 640f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(-86f, -320f)
                horizontalLineToRelative(92f)
                lineToRelative(-44f, -44f)
                lineToRelative(-2f, -2f)
                lineToRelative(-46f, 46f)
                close()
                moveToRelative(126f, -193f)
                close()
                moveToRelative(-78f, 149f)
                close()
            }
        }.build()
        
        return _Keep_off!!
    }

private var _Keep_off: ImageVector? = null

