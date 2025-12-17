package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_knight: ImageVector
    get() {
        if (_Chess_knight != null) return _Chess_knight!!
        
        _Chess_knight = ImageVector.Builder(
            name = "chess_knight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-209f)
                lineToRelative(240f, -121f)
                verticalLineToRelative(-70f)
                lineToRelative(-139f, 69f)
                quadToRelative(-12f, 6f, -25f, 9f)
                reflectiveQuadToRelative(-26f, 3f)
                quadToRelative(-31f, 0f, -58.5f, -16f)
                reflectiveQuadTo(149f, 499f)
                quadToRelative(-14f, -27f, -12f, -57.5f)
                reflectiveQuadToRelative(19f, -56.5f)
                lineToRelative(124f, -185f)
                lineToRelative(-80f, -120f)
                horizontalLineToRelative(240f)
                quadToRelative(133f, 0f, 226.5f, 93f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(480f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Chess_knight!!
    }

private var _Chess_knight: ImageVector? = null

