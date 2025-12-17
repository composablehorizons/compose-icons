package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0.278f)
                arcToRelative(0.77f, 0.77f, 0f, false, true, 0.08f, 0.858f)
                arcToRelative(7.2f, 7.2f, 0f, false, false, -0.878f, 3.46f)
                curveToRelative(0f, 4.021f, 3.278f, 7.277f, 7.318f, 7.277f)
                quadToRelative(0.792f, -0.001f, 1.533f, -0.16f)
                arcToRelative(0.79f, 0.79f, 0f, false, true, 0.81f, 0.316f)
                arcToRelative(0.73f, 0.73f, 0f, false, true, -0.031f, 0.893f)
                arcTo(8.35f, 8.35f, 0f, false, true, 8.344f, 16f)
                curveTo(3.734f, 16f, 0f, 12.286f, 0f, 7.71f)
                curveTo(0f, 4.266f, 2.114f, 1.312f, 5.124f, 0.06f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 0.278f)
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

