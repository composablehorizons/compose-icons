package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleChevronDown: ImageVector
    get() {
        if (_CircleChevronDown != null) return _CircleChevronDown!!
        
        _CircleChevronDown = ImageVector.Builder(
            name = "circle-chevron-down",
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
                moveToRelative(-2.293f, 8.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 0.083f)
                lineToRelative(-2.294f, 2.292f)
                close()
            }
        }.build()
        
        return _CircleChevronDown!!
    }

private var _CircleChevronDown: ImageVector? = null

