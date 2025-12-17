package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ink_highlighter_move: ImageVector
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
                moveTo(100f, 840f)
                lineToRelative(126f, -126f)
                lineToRelative(-30f, -30f)
                verticalLineToRelative(-56f)
                lineToRelative(228f, -228f)
                lineToRelative(216f, 216f)
                lineToRelative(-228f, 228f)
                horizontalLineToRelative(-56f)
                lineToRelative(-30f, -30f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(100f)
                close()
                moveToRelative(381f, -497f)
                lineToRelative(255f, -255f)
                lineToRelative(216f, 216f)
                lineToRelative(-255f, 255f)
                lineToRelative(-216f, -216f)
                close()
                moveToRelative(70f, -183f)
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

