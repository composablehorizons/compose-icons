package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_bishop: ImageVector
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
                lineToRelative(-72f, -120f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-72f, 120f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-90f)
                quadToRelative(26f, 62f, 70.5f, 112f)
                reflectiveQuadToRelative(99.5f, 88f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
            }
        }.build()
        
        return _Chess_bishop!!
    }

private var _Chess_bishop: ImageVector? = null

