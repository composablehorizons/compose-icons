package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleLetterY: ImageVector
    get() {
        if (_CircleLetterY != null) return _CircleLetterY!!
        
        _CircleLetterY = ImageVector.Builder(
            name = "circle-letter-y",
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
                moveToRelative(2.371f, 5.072f)
                arcToRelative(1f, 1f, 0f, false, false, -1.3f, 0.557f)
                lineToRelative(-1.071f, 2.678f)
                lineToRelative(-1.072f, -2.678f)
                arcToRelative(1f, 1f, 0f, false, false, -1.856f, 0.742f)
                lineToRelative(1.928f, 4.823f)
                verticalLineToRelative(2.806f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2.809f)
                lineToRelative(1.928f, -4.82f)
                arcToRelative(1f, 1f, 0f, false, false, -0.45f, -1.25f)
                close()
            }
        }.build()
        
        return _CircleLetterY!!
    }

private var _CircleLetterY: ImageVector? = null

