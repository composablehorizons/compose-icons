package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleNumber0: ImageVector
    get() {
        if (_CircleNumber0 != null) return _CircleNumber0!!
        
        _CircleNumber0 = ImageVector.Builder(
            name = "circle-number-0",
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
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                close()
                moveToRelative(0f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, false, false, 5.99f, 0f)
                lineToRelative(0.005f, -0.176f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, false, -2.995f, -2.824f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, -1.986f, 0f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _CircleNumber0!!
    }

private var _CircleNumber0: ImageVector? = null

