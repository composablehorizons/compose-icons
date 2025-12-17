package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_rook: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-200f)
                quadToRelative(81f, -65f, 122f, -141f)
                reflectiveQuadToRelative(58f, -139f)
                horizontalLineTo(240f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(320f)
                horizontalLineTo(619f)
                quadToRelative(17f, 63f, 58f, 139f)
                reflectiveQuadToRelative(123f, 141f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Chess_rook!!
    }

private var _Chess_rook: ImageVector? = null

