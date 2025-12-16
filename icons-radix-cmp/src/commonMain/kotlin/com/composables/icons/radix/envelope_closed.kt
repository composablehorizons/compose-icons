package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.EnvelopeClosed: ImageVector
    get() {
        if (_EnvelopeClosed != null) return _EnvelopeClosed!!
        
        _EnvelopeClosed = ImageVector.Builder(
            name = "envelope-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                curveTo(14.5523f, 2f, 15f, 2.44772f, 15f, 3f)
                verticalLineTo(12f)
                curveTo(15f, 12.5523f, 14.5523f, 13f, 14f, 13f)
                horizontalLineTo(1f)
                curveTo(0.447715f, 13f, 4.02659E-9f, 12.5523f, 0f, 12f)
                verticalLineTo(3f)
                curveTo(6.4426E-8f, 2.44772f, 0.447715f, 2f, 1f, 2f)
                horizontalLineTo(14f)
                close()
                moveTo(7.74121f, 8.87988f)
                curveTo(7.61228f, 8.96171f, 7.45211f, 8.9717f, 7.31543f, 8.91016f)
                lineTo(7.25879f, 8.87988f)
                lineTo(1f, 4.90723f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(4.90723f)
                lineTo(7.74121f, 8.87988f)
                close()
                moveTo(1f, 3.9248f)
                curveTo(1.05352f, 3.92477f, 1.10746f, 3.93448f, 1.15918f, 3.9541f)
                lineTo(1.24121f, 3.99512f)
                lineTo(7.5f, 7.9668f)
                lineTo(13.7588f, 3.99512f)
                curveTo(13.8337f, 3.94756f, 13.9174f, 3.92472f, 14f, 3.9248f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineTo(3.9248f)
                close()
            }
        }.build()
        
        return _EnvelopeClosed!!
    }

private var _EnvelopeClosed: ImageVector? = null

