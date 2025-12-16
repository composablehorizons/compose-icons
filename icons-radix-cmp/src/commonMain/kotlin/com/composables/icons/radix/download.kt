package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Download: ImageVector
    get() {
        if (_Download != null) return _Download!!
        
        _Download = ImageVector.Builder(
            name = "download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 10.0002f)
                curveTo(12.7761f, 10.0002f, 13f, 10.224f, 13f, 10.5002f)
                verticalLineTo(12.0002f)
                curveTo(12.9999f, 13.1042f, 12.106f, 14.0002f, 11.001f, 14.0002f)
                horizontalLineTo(3.99609f)
                curveTo(2.89012f, 14f, 2.0001f, 13.103f, 2f, 12.0002f)
                verticalLineTo(10.5002f)
                curveTo(2f, 10.224f, 2.22386f, 10.0002f, 2.5f, 10.0002f)
                curveTo(2.77614f, 10.0002f, 3f, 10.224f, 3f, 10.5002f)
                verticalLineTo(12.0002f)
                curveTo(3.0001f, 12.5539f, 3.44557f, 13f, 3.99609f, 13.0002f)
                horizontalLineTo(11.001f)
                curveTo(11.5527f, 13.0002f, 11.9999f, 12.5529f, 12f, 12.0002f)
                verticalLineTo(10.5002f)
                curveTo(12f, 10.224f, 12.2239f, 10.0002f, 12.5f, 10.0002f)
                close()
                moveTo(7.5f, 1.04999f)
                curveTo(7.74853f, 1.04999f, 7.9502f, 1.25165f, 7.9502f, 1.50018f)
                verticalLineTo(8.41327f)
                lineTo(10.1816f, 6.18182f)
                curveTo(10.3574f, 6.00609f, 10.6426f, 6.00609f, 10.8184f, 6.18182f)
                curveTo(10.994f, 6.35757f, 10.9941f, 6.64283f, 10.8184f, 6.81854f)
                lineTo(7.81836f, 9.81854f)
                curveTo(7.64264f, 9.99413f, 7.35734f, 9.99416f, 7.18164f, 9.81854f)
                lineTo(4.18164f, 6.81854f)
                curveTo(4.00595f, 6.64285f, 4.00603f, 6.35757f, 4.18164f, 6.18182f)
                curveTo(4.35738f, 6.00609f, 4.64262f, 6.00609f, 4.81836f, 6.18182f)
                lineTo(7.0498f, 8.41327f)
                verticalLineTo(1.50018f)
                curveTo(7.0498f, 1.25167f, 7.25149f, 1.05001f, 7.5f, 1.04999f)
                close()
            }
        }.build()
        
        return _Download!!
    }

private var _Download: ImageVector? = null

