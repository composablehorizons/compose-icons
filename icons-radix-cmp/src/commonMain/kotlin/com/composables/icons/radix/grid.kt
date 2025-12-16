package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Grid: ImageVector
    get() {
        if (_Grid != null) return _Grid!!
        
        _Grid = ImageVector.Builder(
            name = "grid",
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
                moveTo(2f, 8f)
                verticalLineTo(12.5f)
                curveTo(2f, 12.7761f, 2.22386f, 13f, 2.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                close()
                moveTo(8f, 8f)
                verticalLineTo(13f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 13f, 13f, 12.7761f, 13f, 12.5f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                close()
                moveTo(2.5f, 2f)
                curveTo(2.22386f, 2f, 2f, 2.22386f, 2f, 2.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(2.5f)
                close()
                moveTo(8f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.22386f, 12.7761f, 2f, 12.5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Grid!!
    }

private var _Grid: ImageVector? = null

