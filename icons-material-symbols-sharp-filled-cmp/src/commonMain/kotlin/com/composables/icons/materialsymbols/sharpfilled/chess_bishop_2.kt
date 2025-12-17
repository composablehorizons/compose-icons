package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_bishop_2: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Chess_bishop_2!!
    }

private var _Chess_bishop_2: ImageVector? = null

