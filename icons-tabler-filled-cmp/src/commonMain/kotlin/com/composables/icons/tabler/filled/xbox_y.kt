package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.XboxY: ImageVector
    get() {
        if (_XboxY != null) return _XboxY!!
        
        _XboxY = ImageVector.Builder(
            name = "xbox-y",
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
                moveToRelative(3.6f, 5.2f)
                arcToRelative(1f, 1f, 0f, false, false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.933f)
                lineToRelative(-2.2f, -2.933f)
                arcToRelative(1f, 1f, 0f, true, false, -1.6f, 1.2f)
                lineToRelative(2.81f, 3.748f)
                lineToRelative(-0.01f, 3.649f)
                arcToRelative(1f, 1f, 0f, false, false, 0.997f, 1.003f)
                lineToRelative(0.117f, -0.006f)
                arcToRelative(1f, 1f, 0f, false, false, 0.886f, -0.991f)
                lineToRelative(0.01f, -3.683f)
                lineToRelative(2.79f, -3.72f)
                arcToRelative(1f, 1f, 0f, false, false, -0.2f, -1.4f)
            }
        }.build()
        
        return _XboxY!!
    }

private var _XboxY: ImageVector? = null

