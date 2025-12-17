package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chess_bishop: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-200f)
                quadToRelative(55f, -38f, 99.5f, -88f)
                reflectiveQuadTo(330f, 480f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(72f)
                lineToRelative(-40f, -66f)
                quadToRelative(-14f, -23f, -11f, -50.5f)
                reflectiveQuadToRelative(23f, -47.5f)
                lineToRelative(196f, -196f)
                lineToRelative(196f, 196f)
                quadToRelative(20f, 20f, 23f, 47.5f)
                reflectiveQuadTo(688f, 334f)
                lineToRelative(-40f, 66f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-90f)
                quadToRelative(26f, 62f, 70.5f, 112f)
                reflectiveQuadToRelative(99.5f, 88f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
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
                moveToRelative(0f, 480f)
                close()
                moveToRelative(0f, -647f)
                close()
            }
        }.build()
        
        return _Chess_bishop!!
    }

private var _Chess_bishop: ImageVector? = null

