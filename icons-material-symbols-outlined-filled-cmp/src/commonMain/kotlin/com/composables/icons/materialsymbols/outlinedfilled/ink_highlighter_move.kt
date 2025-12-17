package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ink_highlighter_move: ImageVector
    get() {
        if (_Ink_highlighter_move != null) return _Ink_highlighter_move!!
        
        _Ink_highlighter_move = ImageVector.Builder(
            name = "ink_highlighter_move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(551f, 160f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(351f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(391f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(311f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(231f, 480f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(271f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(193f, -80f)
                lineToRelative(216f, 216f)
                lineToRelative(-200f, 200f)
                quadToRelative(-24f, 24f, -56f, 24f)
                reflectiveQuadToRelative(-56f, -24f)
                lineToRelative(-2f, -2f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(100f)
                lineToRelative(126f, -126f)
                lineToRelative(-2f, -2f)
                quadToRelative(-24f, -24f, -24f, -56f)
                reflectiveQuadToRelative(24f, -56f)
                lineToRelative(200f, -200f)
                close()
                moveToRelative(57f, -57f)
                lineToRelative(199f, -199f)
                quadToRelative(24f, -24f, 56f, -24f)
                reflectiveQuadToRelative(56f, 24f)
                lineToRelative(104f, 104f)
                quadToRelative(24f, 24f, 24f, 56f)
                reflectiveQuadToRelative(-24f, 56f)
                lineTo(697f, 559f)
                lineTo(481f, 343f)
                close()
            }
        }.build()
        
        return _Ink_highlighter_move!!
    }

private var _Ink_highlighter_move: ImageVector? = null

