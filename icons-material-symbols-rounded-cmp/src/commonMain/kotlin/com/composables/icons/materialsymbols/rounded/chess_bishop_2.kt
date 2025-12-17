package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_bishop_2: ImageVector
    get() {
        if (_Chess_bishop_2 != null) return _Chess_bishop_2!!
        
        _Chess_bishop_2 = ImageVector.Builder(
            name = "chess_bishop_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                quadToRelative(-41f, -51f, -60.5f, -118f)
                reflectiveQuadTo(160f, 447f)
                quadToRelative(0f, -74f, 65f, -149.5f)
                reflectiveQuadTo(409f, 156f)
                quadToRelative(-5f, -8f, -7f, -17.5f)
                reflectiveQuadToRelative(-2f, -18.5f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 120f)
                quadToRelative(0f, 8f, -2f, 16.5f)
                reflectiveQuadToRelative(-6f, 16.5f)
                quadToRelative(125f, 66f, 186.5f, 139.5f)
                reflectiveQuadTo(800f, 447f)
                quadToRelative(0f, 97f, -18.5f, 161f)
                reflectiveQuadTo(720f, 720f)
                horizontalLineTo(240f)
                close()
                moveToRelative(41f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(20f, -35f, 29.5f, -81.5f)
                reflectiveQuadTo(720f, 447f)
                quadToRelative(0f, -30f, -15.5f, -61f)
                reflectiveQuadTo(659f, 324.5f)
                quadToRelative(-30f, -30.5f, -74.5f, -60f)
                reflectiveQuadTo(482f, 207f)
                quadToRelative(-56f, 27f, -100.5f, 57.5f)
                reflectiveQuadToRelative(-76f, 61.5f)
                quadTo(274f, 357f, 257f, 388f)
                reflectiveQuadToRelative(-17f, 59f)
                quadToRelative(0f, 60f, 10f, 107.5f)
                reflectiveQuadToRelative(31f, 85.5f)
                close()
                moveTo(220f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 820f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 760f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 820f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 880f)
                horizontalLineTo(220f)
                close()
                moveToRelative(220f, -400f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 480f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(40f, 160f)
                close()
            }
        }.build()
        
        return _Chess_bishop_2!!
    }

private var _Chess_bishop_2: ImageVector? = null

