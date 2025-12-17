package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Opencollective: ImageVector
    get() {
        if (_Opencollective != null) return _Opencollective!!
        
        _Opencollective = ImageVector.Builder(
            name = "opencollective",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.995f, 8.195f)
                curveToRelative(0f, 0.937f, -0.312f, 1.912f, -0.78f, 2.693f)
                lineToRelative(1.99f, 1.99f)
                curveToRelative(0.976f, -1.327f, 1.6f, -2.966f, 1.6f, -4.683f)
                curveToRelative(0f, -1.795f, -0.624f, -3.434f, -1.561f, -4.76f)
                lineToRelative(-2.068f, 2.028f)
                curveToRelative(0.468f, 0.781f, 0.78f, 1.679f, 0.78f, 2.732f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13.151f)
                arcToRelative(4.995f, 4.995f, 0f, true, true, 0f, -9.99f)
                curveToRelative(1.015f, 0f, 1.951f, 0.273f, 2.732f, 0.82f)
                lineToRelative(1.95f, -2.03f)
                arcToRelative(7.805f, 7.805f, 0f, true, false, 0.04f, 12.449f)
                lineToRelative(-1.951f, -2.03f)
                arcToRelative(5.07f, 5.07f, 0f, false, true, -2.732f, 0.781f)
                close()
            }
        }.build()
        
        return _Opencollective!!
    }

private var _Opencollective: ImageVector? = null

