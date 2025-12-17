package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_bishop: ImageVector
    get() {
        if (_Chess_bishop != null) return _Chess_bishop!!
        
        _Chess_bishop = ImageVector.Builder(
            name = "chess_bishop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 9f, -39.5f)
                reflectiveQuadToRelative(26f, -31.5f)
                quadToRelative(43f, -35f, 77.5f, -78.5f)
                reflectiveQuadTo(330f, 480f)
                horizontalLineToRelative(-50f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineToRelative(32f)
                lineToRelative(-40f, -66f)
                quadToRelative(-14f, -23f, -11f, -50.5f)
                reflectiveQuadToRelative(23f, -47.5f)
                lineToRelative(168f, -168f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(168f, 168f)
                quadToRelative(20f, 20f, 23f, 47.5f)
                reflectiveQuadTo(688f, 334f)
                lineToRelative(-40f, 66f)
                horizontalLineToRelative(32f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 480f)
                horizontalLineToRelative(-50f)
                quadToRelative(23f, 51f, 57.5f, 94.5f)
                reflectiveQuadTo(765f, 653f)
                quadToRelative(16f, 14f, 25.5f, 32f)
                reflectiveQuadToRelative(9.5f, 39f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                quadToRelative(-60f, -48f, -104.5f, -108f)
                reflectiveQuadTo(545f, 480f)
                horizontalLineTo(416f)
                quadToRelative(-26f, 72f, -71f, 132f)
                reflectiveQuadTo(240f, 720f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(165f, -400f)
                horizontalLineToRelative(150f)
                lineToRelative(64f, -108f)
                lineToRelative(-139f, -139f)
                lineToRelative(-139f, 139f)
                lineToRelative(64f, 108f)
                close()
                moveToRelative(75f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(0f, -167f)
                close()
                moveToRelative(0f, 647f)
                close()
            }
        }.build()
        
        return _Chess_bishop!!
    }

private var _Chess_bishop: ImageVector? = null

