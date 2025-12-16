package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AspectRatio: ImageVector
    get() {
        if (_AspectRatio != null) return _AspectRatio!!
        
        _AspectRatio = ImageVector.Builder(
            name = "aspect-ratio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6533f, 1.00781f)
                curveTo(13.4097f, 1.08461f, 14f, 1.72334f, 14f, 2.5f)
                verticalLineTo(12.5f)
                lineTo(13.9922f, 12.6533f)
                curveTo(13.9205f, 13.3593f, 13.3593f, 13.9205f, 12.6533f, 13.9922f)
                lineTo(12.5f, 14f)
                horizontalLineTo(2.5f)
                lineTo(2.34668f, 13.9922f)
                curveTo(1.64069f, 13.9205f, 1.07949f, 13.3593f, 1.00781f, 12.6533f)
                lineTo(1f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(1f, 1.72334f, 1.59028f, 1.08461f, 2.34668f, 1.00781f)
                lineTo(2.5f, 1f)
                horizontalLineTo(12.5f)
                lineTo(12.6533f, 1.00781f)
                close()
                moveTo(2.5f, 2f)
                curveTo(2.22386f, 2f, 2f, 2.22386f, 2f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 12.7761f, 2.22386f, 13f, 2.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 13f, 13f, 12.7761f, 13f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.22386f, 12.7761f, 2f, 12.5f, 2f)
                horizontalLineTo(2.5f)
                close()
                moveTo(7.5f, 7f)
                curveTo(7.77614f, 7f, 8f, 7.22386f, 8f, 7.5f)
                curveTo(8f, 7.77614f, 7.77614f, 8f, 7.5f, 8f)
                curveTo(7.22386f, 8f, 7f, 7.77614f, 7f, 7.5f)
                curveTo(7f, 7.22386f, 7.22386f, 7f, 7.5f, 7f)
                close()
                moveTo(9.5f, 7f)
                curveTo(9.77614f, 7f, 10f, 7.22386f, 10f, 7.5f)
                curveTo(10f, 7.77614f, 9.77614f, 8f, 9.5f, 8f)
                curveTo(9.22386f, 8f, 9f, 7.77614f, 9f, 7.5f)
                curveTo(9f, 7.22386f, 9.22386f, 7f, 9.5f, 7f)
                close()
                moveTo(11.5f, 7f)
                curveTo(11.7761f, 7f, 12f, 7.22386f, 12f, 7.5f)
                curveTo(12f, 7.77614f, 11.7761f, 8f, 11.5f, 8f)
                curveTo(11.2239f, 8f, 11f, 7.77614f, 11f, 7.5f)
                curveTo(11f, 7.22386f, 11.2239f, 7f, 11.5f, 7f)
                close()
                moveTo(7.5f, 5f)
                curveTo(7.77614f, 5f, 8f, 5.22386f, 8f, 5.5f)
                curveTo(8f, 5.77614f, 7.77614f, 6f, 7.5f, 6f)
                curveTo(7.22386f, 6f, 7f, 5.77614f, 7f, 5.5f)
                curveTo(7f, 5.22386f, 7.22386f, 5f, 7.5f, 5f)
                close()
                moveTo(7.5f, 3f)
                curveTo(7.77614f, 3f, 8f, 3.22386f, 8f, 3.5f)
                curveTo(8f, 3.77614f, 7.77614f, 4f, 7.5f, 4f)
                curveTo(7.22386f, 4f, 7f, 3.77614f, 7f, 3.5f)
                curveTo(7f, 3.22386f, 7.22386f, 3f, 7.5f, 3f)
                close()
            }
        }.build()
        
        return _AspectRatio!!
    }

private var _AspectRatio: ImageVector? = null

