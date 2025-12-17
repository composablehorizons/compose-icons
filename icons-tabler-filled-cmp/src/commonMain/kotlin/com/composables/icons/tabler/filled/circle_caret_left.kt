package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleCaretLeft: ImageVector
    get() {
        if (_CircleCaretLeft != null) return _CircleCaretLeft!!
        
        _CircleCaretLeft = ImageVector.Builder(
            name = "circle-caret-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                arcToRelative(10f, 10f, 0f, true, true, 0f, -20f)
                moveToRelative(2f, 13f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1.707f, -0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.415f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                curveToRelative(0.14f, -0.18f, 0.21f, -0.396f, 0.21f, -0.613f)
            }
        }.build()
        
        return _CircleCaretLeft!!
    }

private var _CircleCaretLeft: ImageVector? = null

