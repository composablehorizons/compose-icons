package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileSymlinkDirectory: ImageVector
    get() {
        if (_FileSymlinkDirectory != null) return _FileSymlinkDirectory!!
        
        _FileSymlinkDirectory = ImageVector.Builder(
            name = "file-symlink-directory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.5f)
                curveTo(1f, 3.11929f, 2.11929f, 2f, 3.5f, 2f)
                horizontalLineTo(5.58579f)
                curveTo(5.98361f, 2f, 6.36514f, 2.15804f, 6.64645f, 2.43934f)
                lineTo(8.20711f, 4f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 4f, 15f, 5.11929f, 15f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 12.8807f, 13.8807f, 14f, 12.5f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 13f, 14f, 12.3284f, 14f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.67157f, 13.3284f, 5f, 12.5f, 5f)
                horizontalLineTo(8.20711f)
                lineTo(6.64645f, 6.56066f)
                curveTo(6.36514f, 6.84197f, 5.98361f, 7f, 5.58579f, 7f)
                horizontalLineTo(1f)
                verticalLineTo(4.5f)
                close()
                moveTo(2f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(5.58579f)
                curveTo(5.71839f, 6f, 5.84557f, 5.94732f, 5.93934f, 5.85355f)
                lineTo(7.29289f, 4.5f)
                lineTo(5.93934f, 3.14645f)
                curveTo(5.84557f, 3.05268f, 5.71839f, 3f, 5.58579f, 3f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 3f, 2f, 3.67157f, 2f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 8f)
                curveTo(0.89543f, 8f, 0f, 8.89543f, 0f, 10f)
                verticalLineTo(14f)
                curveTo(0f, 15.1046f, 0.89543f, 16f, 2f, 16f)
                horizontalLineTo(6f)
                curveTo(7.1046f, 16f, 8f, 15.1046f, 8f, 14f)
                verticalLineTo(10f)
                curveTo(8f, 8.89543f, 7.1046f, 8f, 6f, 8f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 10.5f)
                curveTo(2f, 10.2239f, 2.2239f, 10f, 2.5f, 10f)
                horizontalLineTo(5.5f)
                curveTo(5.7761f, 10f, 6f, 10.2239f, 6f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(6f, 13.7761f, 5.7761f, 14f, 5.5f, 14f)
                curveTo(5.2239f, 14f, 5f, 13.7761f, 5f, 13.5f)
                verticalLineTo(11.7071f)
                lineTo(2.8536f, 13.8536f)
                curveTo(2.6583f, 14.0488f, 2.3417f, 14.0488f, 2.1464f, 13.8536f)
                curveTo(1.95118f, 13.6583f, 1.95118f, 13.3417f, 2.1464f, 13.1465f)
                lineTo(4.2929f, 11f)
                horizontalLineTo(2.5f)
                curveTo(2.2239f, 11f, 2f, 10.7761f, 2f, 10.5f)
                close()
            }
        }.build()
        
        return _FileSymlinkDirectory!!
    }

private var _FileSymlinkDirectory: ImageVector? = null

