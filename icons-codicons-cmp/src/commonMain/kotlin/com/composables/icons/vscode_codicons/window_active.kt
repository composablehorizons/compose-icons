package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.WindowActive: ImageVector
    get() {
        if (_WindowActive != null) return _WindowActive!!
        
        _WindowActive = ImageVector.Builder(
            name = "window-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(13.985f, 7f, 16f, 9.015f, 16f, 11.5f)
                curveTo(16f, 13.985f, 13.985f, 16f, 11.5f, 16f)
                curveTo(9.015f, 16f, 7f, 13.985f, 7f, 11.5f)
                curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
                close()
                moveTo(13.8535f, 10.1465f)
                curveTo(13.6583f, 9.95123f, 13.3417f, 9.95124f, 13.1465f, 10.1465f)
                lineTo(11f, 12.293f)
                lineTo(9.85352f, 11.1465f)
                curveTo(9.65826f, 10.9512f, 9.34175f, 10.9512f, 9.14648f, 11.1465f)
                curveTo(8.95122f, 11.3417f, 8.95122f, 11.6583f, 9.14648f, 11.8535f)
                lineTo(10.6465f, 13.3535f)
                curveTo(10.8417f, 13.5488f, 11.1583f, 13.5488f, 11.3535f, 13.3535f)
                lineTo(13.8535f, 10.8535f)
                curveTo(14.0488f, 10.6583f, 14.0488f, 10.3417f, 13.8535f, 10.1465f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                curveTo(13.657f, 1f, 15f, 2.343f, 15f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(14.6006f)
                curveTo(14.4027f, 6.86509f, 14.2138f, 6.71736f, 14f, 6.60742f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                curveTo(2f, 13.105f, 2.895f, 14f, 4f, 14f)
                horizontalLineTo(6.60742f)
                curveTo(6.71736f, 14.2148f, 6.86509f, 14.4027f, 7f, 14.6006f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveTo(2.343f, 15f, 1f, 13.657f, 1f, 12f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(12f)
                close()
                moveTo(4f, 2f)
                curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
                horizontalLineTo(14f)
                curveTo(14f, 2.895f, 13.105f, 2f, 12f, 2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _WindowActive!!
    }

private var _WindowActive: ImageVector? = null

