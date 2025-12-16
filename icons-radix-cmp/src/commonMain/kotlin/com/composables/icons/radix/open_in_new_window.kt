package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.OpenInNewWindow: ImageVector
    get() {
        if (_OpenInNewWindow != null) return _OpenInNewWindow!!
        
        _OpenInNewWindow = ImageVector.Builder(
            name = "open-in-new-window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 6f)
                curveTo(8.53267f, 6f, 8.56549f, 6.00242f, 8.59766f, 6.00879f)
                curveTo(8.64875f, 6.01889f, 8.69602f, 6.03909f, 8.74023f, 6.06348f)
                curveTo(8.78055f, 6.08569f, 8.81933f, 6.1123f, 8.85352f, 6.14648f)
                curveTo(8.88737f, 6.18034f, 8.91343f, 6.21891f, 8.93555f, 6.25879f)
                curveTo(8.96008f, 6.30299f, 8.98f, 6.35024f, 8.99023f, 6.40137f)
                curveTo(8.99675f, 6.43389f, 9f, 6.46695f, 9f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(9f, 9.77614f, 8.77614f, 10f, 8.5f, 10f)
                curveTo(8.22386f, 10f, 8f, 9.77614f, 8f, 9.5f)
                verticalLineTo(7.70703f)
                lineTo(2.85352f, 12.8535f)
                curveTo(2.65825f, 13.0488f, 2.34175f, 13.0488f, 2.14648f, 12.8535f)
                curveTo(1.95122f, 12.6583f, 1.95122f, 12.3417f, 2.14648f, 12.1465f)
                lineTo(7.29297f, 7f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 7f, 5f, 6.77614f, 5f, 6.5f)
                curveTo(5f, 6.22386f, 5.22386f, 6f, 5.5f, 6f)
                horizontalLineTo(8.5f)
                close()
                moveTo(12f, 2f)
                curveTo(12.5523f, 2f, 13f, 2.44772f, 13f, 3f)
                verticalLineTo(12f)
                curveTo(13f, 12.5523f, 12.5523f, 13f, 12f, 13f)
                horizontalLineTo(8.5f)
                curveTo(8.22386f, 13f, 8f, 12.7761f, 8f, 12.5f)
                curveTo(8f, 12.2239f, 8.22386f, 12f, 8.5f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(6.5f)
                curveTo(3f, 6.77614f, 2.77614f, 7f, 2.5f, 7f)
                curveTo(2.22386f, 7f, 2f, 6.77614f, 2f, 6.5f)
                verticalLineTo(3f)
                curveTo(2f, 2.44772f, 2.44772f, 2f, 3f, 2f)
                horizontalLineTo(12f)
                close()
            }
        }.build()
        
        return _OpenInNewWindow!!
    }

private var _OpenInNewWindow: ImageVector? = null

