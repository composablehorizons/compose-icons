package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_quote_off: ImageVector
    get() {
        if (_Format_quote_off != null) return _Format_quote_off!!
        
        _Format_quote_off = ImageVector.Builder(
            name = "format_quote_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 876f)
                lineTo(425f, 538f)
                lineToRelative(-94f, 162f)
                quadToRelative(-5f, 9f, -14f, 14.5f)
                reflectiveQuadToRelative(-20f, 5.5f)
                quadToRelative(-23f, 0f, -34.5f, -20f)
                reflectiveQuadToRelative(-0.5f, -40f)
                lineToRelative(58f, -100f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -27f, 8.5f, -51f)
                reflectiveQuadToRelative(23.5f, -44f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 876f)
                close()
                moveTo(699f, 586f)
                lineTo(539f, 426f)
                quadToRelative(-10f, -10f, -14.5f, -22f)
                reflectiveQuadToRelative(-4.5f, -25f)
                quadToRelative(0f, -26f, 15f, -52f)
                reflectiveQuadToRelative(39f, -47f)
                quadToRelative(21f, -19f, 48f, -29.5f)
                reflectiveQuadToRelative(58f, -10.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 21f, -5.5f, 41.5f)
                reflectiveQuadTo(818f, 480f)
                lineToRelative(-56f, 98f)
                quadToRelative(-10f, 17f, -29.5f, 19.5f)
                reflectiveQuadTo(699f, 586f)
                close()
            }
        }.build()
        
        return _Format_quote_off!!
    }

private var _Format_quote_off: ImageVector? = null

