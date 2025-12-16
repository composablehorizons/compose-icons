package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.RulerSquare: ImageVector
    get() {
        if (_RulerSquare != null) return _RulerSquare!!
        
        _RulerSquare = ImageVector.Builder(
            name = "ruler-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.6006f, 0.00976562f)
                curveTo(14.8286f, 0.056292f, 15f, 0.258287f, 15f, 0.5f)
                verticalLineTo(4.5f)
                curveTo(15f, 4.77614f, 14.7761f, 5f, 14.5f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                curveTo(5f, 14.7761f, 4.77614f, 15f, 4.5f, 15f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 15f, 0f, 14.7761f, 0f, 14.5f)
                verticalLineTo(0.5f)
                lineTo(0.00976562f, 0.399414f)
                curveTo(0.056292f, 0.171447f, 0.258287f, 0f, 0.5f, 0f)
                horizontalLineTo(14.5f)
                lineTo(14.6006f, 0.00976562f)
                close()
                moveTo(1f, 4.9248f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12.9248f)
                horizontalLineTo(2.75f)
                curveTo(2.51529f, 12.9248f, 2.3252f, 12.7347f, 2.3252f, 12.5f)
                curveTo(2.32521f, 12.2653f, 2.5153f, 12.0752f, 2.75f, 12.0752f)
                horizontalLineTo(4f)
                verticalLineTo(10.9248f)
                horizontalLineTo(2.25f)
                curveTo(2.01529f, 10.9248f, 1.8252f, 10.7347f, 1.8252f, 10.5f)
                curveTo(1.82521f, 10.2653f, 2.0153f, 10.0752f, 2.25f, 10.0752f)
                horizontalLineTo(4f)
                verticalLineTo(8.9248f)
                horizontalLineTo(2.75f)
                curveTo(2.51529f, 8.92479f, 2.32519f, 8.73471f, 2.3252f, 8.5f)
                curveTo(2.32521f, 8.2653f, 2.5153f, 8.07521f, 2.75f, 8.0752f)
                horizontalLineTo(4f)
                verticalLineTo(6.9248f)
                horizontalLineTo(2.75f)
                curveTo(2.51528f, 6.9248f, 2.32519f, 6.73472f, 2.3252f, 6.5f)
                curveTo(2.3252f, 6.26528f, 2.51528f, 6.0752f, 2.75f, 6.0752f)
                horizontalLineTo(4f)
                verticalLineTo(4.9248f)
                horizontalLineTo(1f)
                close()
                moveTo(1f, 4.0752f)
                horizontalLineTo(4.0752f)
                verticalLineTo(1f)
                horizontalLineTo(1f)
                verticalLineTo(4.0752f)
                close()
                moveTo(4.9248f, 4f)
                horizontalLineTo(6.0752f)
                verticalLineTo(2.75f)
                curveTo(6.07523f, 2.51531f, 6.2653f, 2.3252f, 6.5f, 2.3252f)
                curveTo(6.7347f, 2.3252f, 6.92477f, 2.51531f, 6.9248f, 2.75f)
                verticalLineTo(4f)
                horizontalLineTo(8.0752f)
                verticalLineTo(2.75f)
                curveTo(8.07522f, 2.51531f, 8.2653f, 2.32521f, 8.5f, 2.3252f)
                curveTo(8.7347f, 2.3252f, 8.92478f, 2.5153f, 8.9248f, 2.75f)
                verticalLineTo(4f)
                horizontalLineTo(10.0752f)
                verticalLineTo(2.25f)
                curveTo(10.0752f, 2.01532f, 10.2653f, 1.82523f, 10.5f, 1.8252f)
                curveTo(10.7347f, 1.8252f, 10.9248f, 2.0153f, 10.9248f, 2.25f)
                verticalLineTo(4f)
                horizontalLineTo(12.0752f)
                verticalLineTo(2.75f)
                curveTo(12.0752f, 2.51533f, 12.2653f, 2.32523f, 12.5f, 2.3252f)
                curveTo(12.7347f, 2.3252f, 12.9248f, 2.5153f, 12.9248f, 2.75f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(1f)
                horizontalLineTo(4.9248f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _RulerSquare!!
    }

private var _RulerSquare: ImageVector? = null

