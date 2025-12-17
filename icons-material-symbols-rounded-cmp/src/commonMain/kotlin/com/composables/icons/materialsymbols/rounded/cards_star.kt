package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cards_star: ImageVector
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
                moveTo(509f, 488f)
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
                moveTo(360f, 680f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(360f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(220f, -220f)
                close()
                moveTo(218f, 796f)
                close()
                moveToRelative(10f, 79f)
                quadToRelative(-33f, 4f, -59.5f, -16f)
                reflectiveQuadTo(138f, 806f)
                lineTo(85f, 369f)
                quadToRelative(-4f, -33f, 17f, -59f)
                reflectiveQuadToRelative(54f, -31f)
                horizontalLineToRelative(2f)
                quadToRelative(17f, -3f, 30.5f, 9f)
                reflectiveQuadToRelative(13.5f, 30f)
                quadToRelative(0f, 15f, -10.5f, 26f)
                reflectiveQuadTo(166f, 358f)
                horizontalLineToRelative(-1f)
                lineToRelative(54f, 438f)
                lineToRelative(474f, -58f)
                quadToRelative(17f, -2f, 30f, 8f)
                reflectiveQuadToRelative(15f, 27f)
                quadToRelative(2f, 17f, -8f, 29.5f)
                reflectiveQuadTo(703f, 817f)
                lineTo(228f, 875f)
                close()
            }
        }.build()
        
        return _Cards_star!!
    }

private var _Cards_star: ImageVector? = null

