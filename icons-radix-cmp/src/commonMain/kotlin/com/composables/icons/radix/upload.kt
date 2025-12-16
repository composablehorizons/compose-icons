package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Upload: ImageVector
    get() {
        if (_Upload != null) return _Upload!!
        
        _Upload = ImageVector.Builder(
            name = "upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 10.0002f)
                curveTo(12.7761f, 10.0002f, 13f, 10.2241f, 13f, 10.5002f)
                verticalLineTo(12.0002f)
                curveTo(12.9998f, 13.1042f, 12.1059f, 14.0002f, 11.001f, 14.0002f)
                horizontalLineTo(3.99609f)
                curveTo(2.89017f, 14.0001f, 2.00018f, 13.103f, 2f, 12.0002f)
                verticalLineTo(10.5002f)
                curveTo(2f, 10.2241f, 2.22386f, 10.0002f, 2.5f, 10.0002f)
                curveTo(2.77614f, 10.0002f, 3f, 10.2241f, 3f, 10.5002f)
                verticalLineTo(12.0002f)
                curveTo(3.00018f, 12.5539f, 3.44563f, 13.0001f, 3.99609f, 13.0002f)
                horizontalLineTo(11.001f)
                curveTo(11.5526f, 13.0002f, 11.9998f, 12.5529f, 12f, 12.0002f)
                verticalLineTo(10.5002f)
                curveTo(12f, 10.2241f, 12.2239f, 10.0002f, 12.5f, 10.0002f)
                close()
                moveTo(7.18164f, 1.18188f)
                curveTo(7.35738f, 1.00615f, 7.64262f, 1.00615f, 7.81836f, 1.18188f)
                lineTo(10.8184f, 4.18188f)
                curveTo(10.994f, 4.35762f, 10.9941f, 4.64289f, 10.8184f, 4.8186f)
                curveTo(10.6426f, 4.99417f, 10.3573f, 4.9942f, 10.1816f, 4.8186f)
                lineTo(7.9502f, 2.58618f)
                verticalLineTo(9.50024f)
                curveTo(7.95001f, 9.74861f, 7.74841f, 9.94946f, 7.5f, 9.94946f)
                curveTo(7.25161f, 9.94943f, 7.04999f, 9.74859f, 7.0498f, 9.50024f)
                verticalLineTo(2.58618f)
                lineTo(4.81836f, 4.8186f)
                curveTo(4.64264f, 4.99417f, 4.35734f, 4.9942f, 4.18164f, 4.8186f)
                curveTo(4.00595f, 4.64291f, 4.00604f, 4.35763f, 4.18164f, 4.18188f)
                lineTo(7.18164f, 1.18188f)
                close()
            }
        }.build()
        
        return _Upload!!
    }

private var _Upload: ImageVector? = null

