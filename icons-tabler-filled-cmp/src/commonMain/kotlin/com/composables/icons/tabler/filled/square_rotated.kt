package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRotated: ImageVector
    get() {
        if (_SquareRotated != null) return _SquareRotated!!
        
        _SquareRotated = ImageVector.Builder(
            name = "square-rotated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.793f, 2.893f)
                lineToRelative(-6.9f, 6.9f)
                curveToRelative(-1.172f, 1.171f, -1.172f, 3.243f, 0f, 4.414f)
                lineToRelative(6.9f, 6.9f)
                curveToRelative(1.171f, 1.172f, 3.243f, 1.172f, 4.414f, 0f)
                lineToRelative(6.9f, -6.9f)
                curveToRelative(1.172f, -1.171f, 1.172f, -3.243f, 0f, -4.414f)
                lineToRelative(-6.9f, -6.9f)
                curveToRelative(-1.171f, -1.172f, -3.243f, -1.172f, -4.414f, 0f)
                close()
            }
        }.build()
        
        return _SquareRotated!!
    }

private var _SquareRotated: ImageVector? = null

