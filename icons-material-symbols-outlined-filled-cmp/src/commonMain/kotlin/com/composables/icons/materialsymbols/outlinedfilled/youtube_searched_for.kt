package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Youtube_searched_for: ImageVector
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
                moveTo(822f, 818f)
                lineTo(592f, 588f)
                quadToRelative(-32f, 26f, -71f, 39f)
                reflectiveQuadToRelative(-81f, 13f)
                quadToRelative(-42f, 0f, -80f, -12.5f)
                reflectiveQuadTo(290f, 592f)
                lineToRelative(58f, -58f)
                quadToRelative(20f, 12f, 43f, 19f)
                reflectiveQuadToRelative(49f, 7f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(-69f, 0f, -119.5f, 46.5f)
                reflectiveQuadTo(262f, 362f)
                lineToRelative(50f, -50f)
                lineToRelative(56f, 56f)
                lineToRelative(-148f, 148f)
                lineTo(72f, 368f)
                lineToRelative(56f, -56f)
                lineToRelative(54f, 52f)
                quadToRelative(6f, -103f, 80f, -173.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(700f, 380f)
                quadToRelative(0f, 42f, -13f, 82f)
                reflectiveQuadToRelative(-39f, 70f)
                lineToRelative(230f, 230f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Youtube_searched_for!!
    }

private var _Youtube_searched_for: ImageVector? = null

