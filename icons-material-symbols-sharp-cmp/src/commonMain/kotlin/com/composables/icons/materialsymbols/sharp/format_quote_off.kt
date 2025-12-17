package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_quote_off: ImageVector
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
                moveTo(791f, 904f)
                lineTo(425f, 538f)
                lineTo(320f, 720f)
                horizontalLineToRelative(-92f)
                lineToRelative(92f, -160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -27f, 8.5f, -51f)
                reflectiveQuadToRelative(23.5f, -44f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(-55f, -281f)
                lineTo(520f, 407f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 42.5f)
                reflectiveQuadTo(818f, 480f)
                lineToRelative(-82f, 143f)
                close()
                moveTo(320f, 460f)
                quadToRelative(6f, 0f, 12f, -1f)
                reflectiveQuadToRelative(11f, -3f)
                lineToRelative(-79f, -79f)
                quadToRelative(-2f, 5f, -3f, 11f)
                reflectiveQuadToRelative(-1f, 12f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(320f, 460f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 400f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 340f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 460f)
                close()
                moveToRelative(-374f, -41f)
                close()
                moveToRelative(374f, -19f)
                close()
            }
        }.build()
        
        return _Format_quote_off!!
    }

private var _Format_quote_off: ImageVector? = null

