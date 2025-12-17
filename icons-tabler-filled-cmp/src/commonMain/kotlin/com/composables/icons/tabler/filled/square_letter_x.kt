package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareLetterX: ImageVector
    get() {
        if (_SquareLetterX != null) return _SquareLetterX!!
        
        _SquareLetterX = ImageVector.Builder(
            name = "square-letter-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-4.553f, 5.106f)
                arcToRelative(1f, 1f, 0f, false, false, -1.341f, 0.447f)
                lineToRelative(-1.106f, 2.21f)
                lineToRelative(-1.106f, -2.21f)
                arcToRelative(1f, 1f, 0f, false, false, -1.234f, -0.494f)
                lineToRelative(-0.107f, 0.047f)
                arcToRelative(1f, 1f, 0f, false, false, -0.447f, 1.341f)
                lineToRelative(1.774f, 3.553f)
                lineToRelative(-1.775f, 3.553f)
                arcToRelative(1f, 1f, 0f, false, false, 0.345f, 1.283f)
                lineToRelative(0.102f, 0.058f)
                arcToRelative(1f, 1f, 0f, false, false, 1.341f, -0.447f)
                lineToRelative(1.107f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                arcToRelative(1f, 1f, 0f, false, false, 1.234f, 0.494f)
                lineToRelative(0.107f, -0.047f)
                arcToRelative(1f, 1f, 0f, false, false, 0.447f, -1.341f)
                lineToRelative(-1.776f, -3.553f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1f, 1f, 0f, false, false, -0.345f, -1.283f)
                close()
            }
        }.build()
        
        return _SquareLetterX!!
    }

private var _SquareLetterX: ImageVector? = null

