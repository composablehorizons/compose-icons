package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6533f, 8.00781f)
                curveTo(13.4097f, 8.08461f, 14f, 8.72334f, 14f, 9.5f)
                verticalLineTo(11.5f)
                lineTo(13.9922f, 11.6533f)
                curveTo(13.9205f, 12.3593f, 13.3593f, 12.9205f, 12.6533f, 12.9922f)
                lineTo(12.5f, 13f)
                horizontalLineTo(2.5f)
                lineTo(2.34668f, 12.9922f)
                curveTo(1.64069f, 12.9205f, 1.07949f, 12.3593f, 1.00781f, 11.6533f)
                lineTo(1f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(1f, 8.72334f, 1.59028f, 8.08461f, 2.34668f, 8.00781f)
                lineTo(2.5f, 8f)
                horizontalLineTo(12.5f)
                lineTo(12.6533f, 8.00781f)
                close()
                moveTo(2.5f, 9f)
                curveTo(2.22386f, 9f, 2f, 9.22386f, 2f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 11.7761f, 2.22386f, 12f, 2.5f, 12f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 12f, 13f, 11.7761f, 13f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(13f, 9.22386f, 12.7761f, 9f, 12.5f, 9f)
                horizontalLineTo(2.5f)
                close()
                moveTo(3.5f, 10f)
                curveTo(3.77614f, 10f, 4f, 10.2239f, 4f, 10.5f)
                curveTo(4f, 10.7761f, 3.77614f, 11f, 3.5f, 11f)
                curveTo(3.22386f, 11f, 3f, 10.7761f, 3f, 10.5f)
                curveTo(3f, 10.2239f, 3.22386f, 10f, 3.5f, 10f)
                close()
                moveTo(12.6533f, 2.00781f)
                curveTo(13.4097f, 2.08461f, 14f, 2.72334f, 14f, 3.5f)
                verticalLineTo(5.5f)
                lineTo(13.9922f, 5.65332f)
                curveTo(13.9205f, 6.35931f, 13.3593f, 6.92051f, 12.6533f, 6.99219f)
                lineTo(12.5f, 7f)
                horizontalLineTo(2.5f)
                lineTo(2.34668f, 6.99219f)
                curveTo(1.64069f, 6.92051f, 1.07949f, 6.35931f, 1.00781f, 5.65332f)
                lineTo(1f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 2.72334f, 1.59028f, 2.08461f, 2.34668f, 2.00781f)
                lineTo(2.5f, 2f)
                horizontalLineTo(12.5f)
                lineTo(12.6533f, 2.00781f)
                close()
                moveTo(2.5f, 3f)
                curveTo(2.22386f, 3f, 2f, 3.22386f, 2f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(2f, 5.77614f, 2.22386f, 6f, 2.5f, 6f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 6f, 13f, 5.77614f, 13f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 3.22386f, 12.7761f, 3f, 12.5f, 3f)
                horizontalLineTo(2.5f)
                close()
                moveTo(3.5f, 4f)
                curveTo(3.77614f, 4f, 4f, 4.22386f, 4f, 4.5f)
                curveTo(4f, 4.77614f, 3.77614f, 5f, 3.5f, 5f)
                curveTo(3.22386f, 5f, 3f, 4.77614f, 3f, 4.5f)
                curveTo(3f, 4.22386f, 3.22386f, 4f, 3.5f, 4f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

