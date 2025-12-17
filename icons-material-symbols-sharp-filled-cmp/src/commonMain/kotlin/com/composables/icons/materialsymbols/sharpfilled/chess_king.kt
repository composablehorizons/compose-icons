package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_king: ImageVector
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
                verticalLineToRelative(-99f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(99f)
                quadToRelative(19f, -9f, 39f, -14f)
                reflectiveQuadToRelative(41f, -5f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(780f, 300f)
                quadToRelative(0f, 28f, -8f, 53f)
                reflectiveQuadToRelative(-22f, 47f)
                horizontalLineTo(210f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(130f)
                lineToRelative(10f, -80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(700f)
                lineToRelative(10f, 80f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Chess_king!!
    }

private var _Chess_king: ImageVector? = null

