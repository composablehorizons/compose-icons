package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.RulerHorizontal: ImageVector
    get() {
        if (_RulerHorizontal != null) return _RulerHorizontal!!
        
        _RulerHorizontal = ImageVector.Builder(
            name = "ruler-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.6006f, 4.00977f)
                curveTo(14.8286f, 4.05629f, 15f, 4.25829f, 15f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(15f, 10.7761f, 14.7761f, 11f, 14.5f, 11f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 11f, 0f, 10.7761f, 0f, 10.5f)
                verticalLineTo(4.5f)
                lineTo(0.00976562f, 4.39941f)
                curveTo(0.056292f, 4.17145f, 0.258287f, 4f, 0.5f, 4f)
                horizontalLineTo(14.5f)
                lineTo(14.6006f, 4.00977f)
                close()
                moveTo(1f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(12.9248f)
                verticalLineTo(6.5f)
                curveTo(12.9248f, 6.73472f, 12.7347f, 6.9248f, 12.5f, 6.9248f)
                curveTo(12.2653f, 6.9248f, 12.0752f, 6.73472f, 12.0752f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(10.9248f)
                verticalLineTo(6.5f)
                curveTo(10.9248f, 6.73472f, 10.7347f, 6.9248f, 10.5f, 6.9248f)
                curveTo(10.2653f, 6.9248f, 10.0752f, 6.73472f, 10.0752f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(8.9248f)
                verticalLineTo(7.5f)
                curveTo(8.9248f, 7.73472f, 8.73472f, 7.9248f, 8.5f, 7.9248f)
                curveTo(8.26528f, 7.9248f, 8.0752f, 7.73472f, 8.0752f, 7.5f)
                verticalLineTo(5f)
                horizontalLineTo(6.9248f)
                verticalLineTo(6.5f)
                curveTo(6.9248f, 6.73472f, 6.73472f, 6.9248f, 6.5f, 6.9248f)
                curveTo(6.26528f, 6.9248f, 6.0752f, 6.73472f, 6.0752f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(4.9248f)
                verticalLineTo(6.5f)
                curveTo(4.9248f, 6.73472f, 4.73472f, 6.9248f, 4.5f, 6.9248f)
                curveTo(4.26528f, 6.9248f, 4.0752f, 6.73472f, 4.0752f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(2.9248f)
                verticalLineTo(7.5f)
                curveTo(2.9248f, 7.73472f, 2.73472f, 7.9248f, 2.5f, 7.9248f)
                curveTo(2.26528f, 7.9248f, 2.0752f, 7.73472f, 2.0752f, 7.5f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _RulerHorizontal!!
    }

private var _RulerHorizontal: ImageVector? = null

