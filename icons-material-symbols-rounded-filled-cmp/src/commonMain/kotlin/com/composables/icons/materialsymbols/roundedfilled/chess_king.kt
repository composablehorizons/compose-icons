package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chess_king: ImageVector
    get() {
        if (_Chess_king != null) return _Chess_king!!
        
        _Chess_king = ImageVector.Builder(
            name = "chess_king",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(210f, 400f)
                quadToRelative(-14f, -22f, -22f, -47f)
                reflectiveQuadToRelative(-8f, -53f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(21f, 0f, 41f, 4.5f)
                reflectiveQuadToRelative(39f, 14.5f)
                verticalLineToRelative(-59f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(59f)
                quadToRelative(19f, -9f, 39f, -14f)
                reflectiveQuadToRelative(41f, -5f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(780f, 300f)
                quadToRelative(0f, 28f, -8f, 53f)
                reflectiveQuadToRelative(-22f, 47f)
                horizontalLineTo(210f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(50f)
                lineToRelative(10f, -80f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 560f)
                horizontalLineTo(700f)
                lineToRelative(10f, 80f)
                horizontalLineToRelative(50f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Chess_king!!
    }

private var _Chess_king: ImageVector? = null

