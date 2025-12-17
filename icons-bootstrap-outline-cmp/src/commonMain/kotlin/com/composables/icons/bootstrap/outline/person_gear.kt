package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonGear: ImageVector
    get() {
        if (_PersonGear != null) return _PersonGear!!
        
        _PersonGear = ImageVector.Builder(
            name = "person-gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(8f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(0.256f, 7f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -0.229f, -1.004f)
                horizontalLineTo(3f)
                curveToRelative(0.001f, -0.246f, 0.154f, -0.986f, 0.832f, -1.664f)
                curveTo(4.484f, 10.68f, 5.711f, 10f, 8f, 10f)
                quadToRelative(0.39f, 0f, 0.74f, 0.025f)
                curveToRelative(0.226f, -0.341f, 0.496f, -0.65f, 0.804f, -0.918f)
                quadTo(8.844f, 9.002f, 8f, 9f)
                curveToRelative(-5f, 0f, -6f, 3f, -6f, 4f)
                reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                close()
                moveToRelative(3.63f, -4.54f)
                curveToRelative(0.18f, -0.613f, 1.048f, -0.613f, 1.229f, 0f)
                lineToRelative(0.043f, 0.148f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.921f, 0.382f)
                lineToRelative(0.136f, -0.074f)
                curveToRelative(0.561f, -0.306f, 1.175f, 0.308f, 0.87f, 0.869f)
                lineToRelative(-0.075f, 0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.382f, 0.92f)
                lineToRelative(0.149f, 0.045f)
                curveToRelative(0.612f, 0.18f, 0.612f, 1.048f, 0f, 1.229f)
                lineToRelative(-0.15f, 0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.38f, 0.921f)
                lineToRelative(0.074f, 0.136f)
                curveToRelative(0.305f, 0.561f, -0.309f, 1.175f, -0.87f, 0.87f)
                lineToRelative(-0.136f, -0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.92f, 0.382f)
                lineToRelative(-0.045f, 0.149f)
                curveToRelative(-0.18f, 0.612f, -1.048f, 0.612f, -1.229f, 0f)
                lineToRelative(-0.043f, -0.15f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.921f, -0.38f)
                lineToRelative(-0.136f, 0.074f)
                curveToRelative(-0.561f, 0.305f, -1.175f, -0.309f, -0.87f, -0.87f)
                lineToRelative(0.075f, -0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.382f, -0.92f)
                lineToRelative(-0.148f, -0.045f)
                curveToRelative(-0.613f, -0.18f, -0.613f, -1.048f, 0f, -1.229f)
                lineToRelative(0.148f, -0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.382f, -0.921f)
                lineToRelative(-0.074f, -0.136f)
                curveToRelative(-0.306f, -0.561f, 0.308f, -1.175f, 0.869f, -0.87f)
                lineToRelative(0.136f, 0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.92f, -0.382f)
                close()
                moveTo(14f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
            }
        }.build()
        
        return _PersonGear!!
    }

private var _PersonGear: ImageVector? = null

