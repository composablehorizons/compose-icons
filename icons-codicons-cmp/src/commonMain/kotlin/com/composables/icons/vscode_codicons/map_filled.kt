package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MapFilled: ImageVector
    get() {
        if (_MapFilled != null) return _MapFilled!!
        
        _MapFilled = ImageVector.Builder(
            name = "map-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2.22288f)
                lineTo(1.235f, 4.576f)
                curveTo(1.08881f, 4.66737f, 1f, 4.82761f, 1f, 5f)
                verticalLineTo(13.5f)
                curveTo(1f, 13.6818f, 1.09864f, 13.8492f, 1.25762f, 13.9373f)
                curveTo(1.41659f, 14.0254f, 1.61087f, 14.0203f, 1.765f, 13.924f)
                lineTo(5f, 11.9021f)
                verticalLineTo(2.22288f)
                close()
                moveTo(6f, 11.809f)
                lineTo(10f, 13.809f)
                verticalLineTo(4.19098f)
                lineTo(6f, 2.19098f)
                verticalLineTo(11.809f)
                close()
                moveTo(14.765f, 11.424f)
                lineTo(11f, 13.7771f)
                verticalLineTo(4.09788f)
                lineTo(14.235f, 2.076f)
                curveTo(14.3891f, 1.97967f, 14.5834f, 1.97457f, 14.7424f, 2.06268f)
                curveTo(14.9014f, 2.15079f, 15f, 2.31824f, 15f, 2.5f)
                verticalLineTo(11f)
                curveTo(15f, 11.1724f, 14.9112f, 11.3326f, 14.765f, 11.424f)
                close()
            }
        }.build()
        
        return _MapFilled!!
    }

private var _MapFilled: ImageVector? = null

