package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleCaretDown: ImageVector
    get() {
        if (_CircleCaretDown != null) return _CircleCaretDown!!
        
        _CircleCaretDown = ImageVector.Builder(
            name = "circle-caret-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-2f, 6.66f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.708f, 1.707f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.415f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -0.613f, -0.21f)
            }
        }.build()
        
        return _CircleCaretDown!!
    }

private var _CircleCaretDown: ImageVector? = null

