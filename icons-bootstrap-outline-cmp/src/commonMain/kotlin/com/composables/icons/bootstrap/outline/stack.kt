package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Stack: ImageVector
    get() {
        if (_Stack != null) return _Stack!!
        
        _Stack = ImageVector.Builder(
            name = "stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.12f, 10.163f)
                lineToRelative(1.715f, 0.858f)
                curveToRelative(0.22f, 0.11f, 0.22f, 0.424f, 0f, 0.534f)
                lineTo(8.267f, 15.34f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.534f, 0f)
                lineTo(0.165f, 11.555f)
                arcToRelative(0.299f, 0.299f, 0f, false, true, 0f, -0.534f)
                lineToRelative(1.716f, -0.858f)
                lineToRelative(5.317f, 2.659f)
                curveToRelative(0.505f, 0.252f, 1.1f, 0.252f, 1.604f, 0f)
                lineToRelative(5.317f, -2.66f)
                close()
                moveTo(7.733f, 0.063f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.534f, 0f)
                lineToRelative(7.568f, 3.784f)
                arcToRelative(0.3f, 0.3f, 0f, false, true, 0f, 0.535f)
                lineTo(8.267f, 8.165f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.534f, 0f)
                lineTo(0.165f, 4.382f)
                arcToRelative(0.299f, 0.299f, 0f, false, true, 0f, -0.535f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.12f, 6.576f)
                lineToRelative(1.715f, 0.858f)
                curveToRelative(0.22f, 0.11f, 0.22f, 0.424f, 0f, 0.534f)
                lineToRelative(-7.568f, 3.784f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, -0.534f, 0f)
                lineTo(0.165f, 7.968f)
                arcToRelative(0.299f, 0.299f, 0f, false, true, 0f, -0.534f)
                lineToRelative(1.716f, -0.858f)
                lineToRelative(5.317f, 2.659f)
                curveToRelative(0.505f, 0.252f, 1.1f, 0.252f, 1.604f, 0f)
                close()
            }
        }.build()
        
        return _Stack!!
    }

private var _Stack: ImageVector? = null

