package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleChevronsLeft: ImageVector
    get() {
        if (_CircleChevronsLeft != null) return _CircleChevronsLeft!!
        
        _CircleChevronsLeft = ImageVector.Builder(
            name = "circle-chevrons-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.927f, 2.133f)
                curveToRelative(5.494f, -0.04f, 9.992f, 4.359f, 10.073f, 9.852f)
                verticalLineToRelative(0.295f)
                curveToRelative(-0.081f, 5.493f, -4.579f, 9.893f, -10.073f, 9.852f)
                curveToRelative(-5.494f, -0.04f, -9.926f, -4.505f, -9.926f, -10f)
                curveToRelative(0f, -5.494f, 4.432f, -9.959f, 9.926f, -10f)
                moveToRelative(3.78f, 6.16f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-2.292f, -2.292f)
                lineToRelative(2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                moveToRelative(-4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-2.292f, -2.293f)
                lineToRelative(2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
            }
        }.build()
        
        return _CircleChevronsLeft!!
    }

private var _CircleChevronsLeft: ImageVector? = null

