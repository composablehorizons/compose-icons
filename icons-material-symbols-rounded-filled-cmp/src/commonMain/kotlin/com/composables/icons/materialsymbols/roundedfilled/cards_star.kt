package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cards_star: ImageVector
    get() {
        if (_Cards_star != null) return _Cards_star!!
        
        _Cards_star = ImageVector.Builder(
            name = "cards_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(228f, 875f)
                quadToRelative(-33f, 5f, -59.5f, -15.5f)
                reflectiveQuadTo(138f, 806f)
                lineTo(85f, 369f)
                quadToRelative(-4f, -33f, 16f, -59f)
                reflectiveQuadToRelative(53f, -30f)
                lineToRelative(46f, -6f)
                verticalLineToRelative(326f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                horizontalLineToRelative(372f)
                quadToRelative(-6f, 24f, -24f, 41.5f)
                reflectiveQuadTo(664f, 822f)
                lineTo(228f, 875f)
                close()
                moveToRelative(132f, -195f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(149f, -192f)
                lineToRelative(71f, -43f)
                lineToRelative(71f, 43f)
                quadToRelative(6f, 4f, 11.5f, 0f)
                reflectiveQuadToRelative(3.5f, -11f)
                lineToRelative(-19f, -81f)
                lineToRelative(62f, -54f)
                quadToRelative(5f, -5f, 3.5f, -10.5f)
                reflectiveQuadTo(704f, 325f)
                lineToRelative(-82f, -7f)
                lineToRelative(-33f, -76f)
                quadToRelative(-2f, -6f, -9f, -6f)
                reflectiveQuadToRelative(-9f, 6f)
                lineToRelative(-33f, 76f)
                lineToRelative(-82f, 7f)
                quadToRelative(-7f, 1f, -8.5f, 6.5f)
                reflectiveQuadTo(451f, 342f)
                lineToRelative(62f, 54f)
                lineToRelative(-19f, 81f)
                quadToRelative(-2f, 7f, 3.5f, 11f)
                reflectiveQuadToRelative(11.5f, 0f)
                close()
            }
        }.build()
        
        return _Cards_star!!
    }

private var _Cards_star: ImageVector? = null

