package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chess_king: ImageVector
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
                moveTo(480f, 274f)
                lineToRelative(-54f, -48f)
                quadToRelative(-14f, -12f, -30.5f, -19f)
                reflectiveQuadToRelative(-35.5f, -7f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                horizontalLineTo(210f)
                quadToRelative(-14f, -22f, -22f, -47f)
                reflectiveQuadToRelative(-8f, -53f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(360f, 120f)
                quadToRelative(21f, 0f, 41f, 4.5f)
                reflectiveQuadToRelative(39f, 14.5f)
                verticalLineToRelative(-99f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(99f)
                quadToRelative(19f, -9f, 39f, -14f)
                reflectiveQuadToRelative(41f, -5f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(780f, 300f)
                quadToRelative(0f, 28f, -8f, 53f)
                reflectiveQuadToRelative(-22f, 47f)
                horizontalLineTo(600f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-19f, 0f, -35.5f, 6.5f)
                reflectiveQuadTo(534f, 226f)
                lineToRelative(-54f, 48f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(50f)
                lineToRelative(20f, -160f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(690f)
                lineToRelative(20f, 160f)
                horizontalLineToRelative(50f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(130f, -160f)
                horizontalLineToRelative(299f)
                lineToRelative(-20f, -160f)
                horizontalLineTo(350f)
                lineToRelative(-20f, 160f)
                close()
                moveToRelative(150f, 160f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Chess_king!!
    }

private var _Chess_king: ImageVector? = null

