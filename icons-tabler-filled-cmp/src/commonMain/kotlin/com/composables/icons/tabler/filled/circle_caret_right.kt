package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleCaretRight: ImageVector
    get() {
        if (_CircleCaretRight != null) return _CircleCaretRight!!
        
        _CircleCaretRight = ImageVector.Builder(
            name = "circle-caret-right",
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
                moveToRelative(-5.293f, 4.953f)
                arcToRelative(1f, 1f, 0f, false, false, -1.707f, 0.707f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.217f, 0.07f, 0.433f, 0.21f, 0.613f)
                lineToRelative(0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
            }
        }.build()
        
        return _CircleCaretRight!!
    }

private var _CircleCaretRight: ImageVector? = null

