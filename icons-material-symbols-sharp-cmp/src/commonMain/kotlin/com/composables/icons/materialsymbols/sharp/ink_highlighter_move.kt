package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ink_highlighter_move: ImageVector
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
                moveTo(584f, 560f)
                lineToRelative(-52f, -52f)
                lineToRelative(-52f, -52f)
                lineToRelative(-200f, 200f)
                lineToRelative(104f, 104f)
                lineToRelative(200f, -200f)
                close()
                moveToRelative(-47f, -161f)
                lineToRelative(52f, 52f)
                lineToRelative(52f, 52f)
                lineToRelative(199f, -199f)
                lineToRelative(-104f, -104f)
                lineToRelative(-199f, 199f)
                close()
                moveTo(100f, 840f)
                lineToRelative(126f, -126f)
                lineToRelative(-30f, -30f)
                verticalLineToRelative(-56f)
                lineToRelative(257f, -257f)
                lineToRelative(216f, 216f)
                lineToRelative(-257f, 257f)
                horizontalLineToRelative(-56f)
                lineToRelative(-30f, -30f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(100f)
                close()
                moveToRelative(353f, -469f)
                lineToRelative(283f, -283f)
                lineToRelative(216f, 216f)
                lineToRelative(-283f, 283f)
                lineToRelative(-216f, -216f)
                close()
                moveToRelative(98f, -211f)
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
            }
        }.build()
        
        return _Ink_highlighter_move!!
    }

private var _Ink_highlighter_move: ImageVector? = null

