package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Youtube_searched_for: ImageVector
    get() {
        if (_Youtube_searched_for != null) return _Youtube_searched_for!!
        
        _Youtube_searched_for = ImageVector.Builder(
            name = "youtube_searched_for",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 640f)
                quadToRelative(-24f, 0f, -46.5f, -4f)
                reflectiveQuadTo(350f, 624f)
                quadToRelative(-16f, -6f, -22f, -22f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(8f, -15f, 23f, -19.5f)
                reflectiveQuadToRelative(32f, 0.5f)
                quadToRelative(13f, 5f, 27f, 7f)
                reflectiveQuadToRelative(28f, 2f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(-69f, 0f, -119.5f, 46.5f)
                reflectiveQuadTo(262f, 362f)
                lineToRelative(22f, -22f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-92f, 92f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-92f, -92f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(11f, -11f, 27f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(26f, 25f)
                quadToRelative(6f, -103f, 80f, -173.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(700f, 380f)
                quadToRelative(0f, 42f, -13f, 82f)
                reflectiveQuadToRelative(-39f, 70f)
                lineToRelative(202f, 202f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(592f, 588f)
                quadToRelative(-32f, 26f, -71f, 39f)
                reflectiveQuadToRelative(-81f, 13f)
                close()
            }
        }.build()
        
        return _Youtube_searched_for!!
    }

private var _Youtube_searched_for: ImageVector? = null

