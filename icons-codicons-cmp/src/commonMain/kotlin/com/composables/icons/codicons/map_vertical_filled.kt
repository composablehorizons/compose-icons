package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MapVerticalFilled: ImageVector
    get() {
        if (_MapVerticalFilled != null) return _MapVerticalFilled!!
        
        _MapVerticalFilled = ImageVector.Builder(
            name = "map-vertical-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.22288f, 5f)
                lineTo(4.576f, 1.235f)
                curveTo(4.66737f, 1.08881f, 4.82761f, 1f, 5f, 1f)
                lineTo(13.5f, 0.999999f)
                curveTo(13.6818f, 0.999999f, 13.8492f, 1.09864f, 13.9373f, 1.25762f)
                curveTo(14.0254f, 1.41659f, 14.0203f, 1.61086f, 13.924f, 1.765f)
                lineTo(11.9021f, 5f)
                lineTo(2.22288f, 5f)
                close()
                moveTo(11.809f, 6f)
                lineTo(13.809f, 10f)
                lineTo(4.19098f, 10f)
                lineTo(2.19098f, 6f)
                lineTo(11.809f, 6f)
                close()
                moveTo(11.424f, 14.765f)
                lineTo(13.7771f, 11f)
                lineTo(4.09788f, 11f)
                lineTo(2.076f, 14.235f)
                curveTo(1.97967f, 14.3891f, 1.97457f, 14.5834f, 2.06268f, 14.7424f)
                curveTo(2.15079f, 14.9014f, 2.31824f, 15f, 2.5f, 15f)
                lineTo(11f, 15f)
                curveTo(11.1724f, 15f, 11.3326f, 14.9112f, 11.424f, 14.765f)
                close()
            }
        }.build()
        
        return _MapVerticalFilled!!
    }

private var _MapVerticalFilled: ImageVector? = null

