package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_pawn: ImageVector
    get() {
        if (_Chess_pawn != null) return _Chess_pawn!!
        
        _Chess_pawn = ImageVector.Builder(
            name = "chess_pawn",
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
                verticalLineToRelative(-79f)
                quadToRelative(0f, -20f, 9f, -37f)
                reflectiveQuadToRelative(24f, -29f)
                quadToRelative(69f, -56f, 103.5f, -113f)
                reflectiveQuadTo(345f, 440f)
                horizontalLineToRelative(-65f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                horizontalLineToRelative(50f)
                quadToRelative(-14f, -22f, -22f, -47f)
                reflectiveQuadToRelative(-8f, -53f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 260f)
                quadToRelative(0f, 28f, -8f, 53f)
                reflectiveQuadToRelative(-22f, 47f)
                horizontalLineToRelative(50f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 440f)
                horizontalLineToRelative(-65f)
                quadToRelative(14f, 45f, 48.5f, 102f)
                reflectiveQuadTo(767f, 655f)
                quadToRelative(15f, 12f, 24f, 29f)
                reflectiveQuadToRelative(9f, 37f)
                verticalLineToRelative(79f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                quadToRelative(-92f, -72f, -133f, -148.5f)
                reflectiveQuadTo(532f, 440f)
                horizontalLineTo(428f)
                quadToRelative(-14f, 55f, -55f, 131.5f)
                reflectiveQuadTo(240f, 720f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, -440f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, -100f)
                close()
                moveToRelative(0f, 540f)
                close()
            }
        }.build()
        
        return _Chess_pawn!!
    }

private var _Chess_pawn: ImageVector? = null

