package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FolderActive: ImageVector
    get() {
        if (_FolderActive != null) return _FolderActive!!
        
        _FolderActive = ImageVector.Builder(
            name = "folder-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(13.9853f, 7f, 16f, 9.01472f, 16f, 11.5f)
                curveTo(16f, 13.9853f, 13.9853f, 16f, 11.5f, 16f)
                curveTo(9.01472f, 16f, 7f, 13.9853f, 7f, 11.5f)
                curveTo(7f, 9.01472f, 9.01472f, 7f, 11.5f, 7f)
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
                moveTo(5.58594f, 2f)
                curveTo(5.98371f, 2.00004f, 6.36522f, 2.15818f, 6.64648f, 2.43945f)
                lineTo(8.20703f, 4f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 4f, 15f, 5.11929f, 15f, 6.5f)
                verticalLineTo(7.25684f)
                curveTo(14.6929f, 7.00326f, 14.3577f, 6.78247f, 14f, 6.59961f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.67157f, 13.3284f, 5f, 12.5f, 5f)
                horizontalLineTo(8.20703f)
                lineTo(6.64648f, 6.56055f)
                curveTo(6.36522f, 6.84182f, 5.98371f, 6.99996f, 5.58594f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.3284f, 2.67157f, 13f, 3.5f, 13f)
                horizontalLineTo(6.20703f)
                curveTo(6.30563f, 13.3486f, 6.43768f, 13.6832f, 6.59961f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 14f, 1f, 12.8807f, 1f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 3.11929f, 2.11929f, 2f, 3.5f, 2f)
                horizontalLineTo(5.58594f)
                close()
                moveTo(3.5f, 3f)
                curveTo(2.67157f, 3f, 2f, 3.67157f, 2f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(5.58594f)
                curveTo(5.71849f, 5.99996f, 5.84572f, 5.94725f, 5.93945f, 5.85352f)
                lineTo(7.29297f, 4.5f)
                lineTo(5.93945f, 3.14648f)
                curveTo(5.84572f, 3.05275f, 5.71849f, 3.00004f, 5.58594f, 3f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _FolderActive!!
    }

private var _FolderActive: ImageVector? = null

