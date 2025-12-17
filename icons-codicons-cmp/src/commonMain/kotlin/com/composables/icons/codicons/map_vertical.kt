package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MapVertical: ImageVector
    get() {
        if (_MapVertical != null) return _MapVertical!!
        
        _MapVertical = ImageVector.Builder(
            name = "map-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.076f, 5.235f)
                curveTo(1.98368f, 5.38271f, 1.97489f, 5.56781f, 2.05279f, 5.72361f)
                lineTo(4.42738f, 10.4728f)
                lineTo(2.076f, 14.235f)
                curveTo(1.97967f, 14.3891f, 1.97457f, 14.5834f, 2.06268f, 14.7424f)
                curveTo(2.15079f, 14.9014f, 2.31824f, 15f, 2.5f, 15f)
                lineTo(11f, 15f)
                curveTo(11.1724f, 15f, 11.3326f, 14.9112f, 11.424f, 14.765f)
                lineTo(13.924f, 10.765f)
                curveTo(14.0163f, 10.6173f, 14.0251f, 10.4322f, 13.9472f, 10.2764f)
                lineTo(11.5726f, 5.52721f)
                lineTo(13.924f, 1.765f)
                curveTo(14.0203f, 1.61086f, 14.0254f, 1.41659f, 13.9373f, 1.25762f)
                curveTo(13.8492f, 1.09864f, 13.6818f, 0.999999f, 13.5f, 0.999999f)
                lineTo(5f, 1f)
                curveTo(4.82761f, 1f, 4.66737f, 1.08881f, 4.576f, 1.235f)
                lineTo(2.076f, 5.235f)
                close()
                moveTo(10.691f, 6f)
                lineTo(12.691f, 10f)
                lineTo(5.30902f, 10f)
                lineTo(3.30902f, 6f)
                lineTo(10.691f, 6f)
                close()
                moveTo(3.40212f, 5f)
                lineTo(5.27712f, 2f)
                lineTo(12.5979f, 2f)
                lineTo(10.7229f, 5f)
                lineTo(3.40212f, 5f)
                close()
                moveTo(5.27712f, 11f)
                lineTo(12.5979f, 11f)
                lineTo(10.7229f, 14f)
                lineTo(3.40212f, 14f)
                lineTo(5.27712f, 11f)
                close()
            }
        }.build()
        
        return _MapVertical!!
    }

private var _MapVertical: ImageVector? = null

