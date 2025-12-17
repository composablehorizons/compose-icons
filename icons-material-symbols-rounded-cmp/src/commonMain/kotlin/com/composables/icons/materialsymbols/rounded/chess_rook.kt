package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_rook: ImageVector
    get() {
        if (_Chess_rook != null) return _Chess_rook!!
        
        _Chess_rook = ImageVector.Builder(
            name = "chess_rook",
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
                verticalLineToRelative(-85f)
                quadToRelative(0f, -17f, 7f, -32f)
                reflectiveQuadToRelative(20f, -26f)
                quadToRelative(68f, -62f, 103f, -131f)
                reflectiveQuadToRelative(50f, -126f)
                horizontalLineToRelative(-20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 120f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 400f)
                horizontalLineToRelative(-21f)
                quadToRelative(16f, 57f, 51f, 126f)
                reflectiveQuadToRelative(103f, 131f)
                quadToRelative(13f, 11f, 20f, 26.5f)
                reflectiveQuadToRelative(7f, 32.5f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-83f)
                quadToRelative(-86f, -78f, -126.5f, -163.5f)
                reflectiveQuadTo(536f, 400f)
                horizontalLineTo(423f)
                quadToRelative(-16f, 68f, -57f, 153.5f)
                reflectiveQuadTo(240f, 717f)
                verticalLineToRelative(83f)
                close()
                moveToRelative(80f, -480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineTo(360f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-320f)
                close()
                moveToRelative(160f, 480f)
                close()
            }
        }.build()
        
        return _Chess_rook!!
    }

private var _Chess_rook: ImageVector? = null

