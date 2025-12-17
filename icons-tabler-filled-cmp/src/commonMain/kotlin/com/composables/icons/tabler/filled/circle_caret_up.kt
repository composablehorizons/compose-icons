package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleCaretUp: ImageVector
    get() {
        if (_CircleCaretUp != null) return _CircleCaretUp!!
        
        _CircleCaretUp = ImageVector.Builder(
            name = "circle-caret-up",
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
                moveToRelative(-4.293f, 5.953f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 1.707f)
                horizontalLineToRelative(6f)
                curveToRelative(0.217f, 0f, 0.433f, -0.07f, 0.613f, -0.21f)
                lineToRelative(0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
            }
        }.build()
        
        return _CircleCaretUp!!
    }

private var _CircleCaretUp: ImageVector? = null

