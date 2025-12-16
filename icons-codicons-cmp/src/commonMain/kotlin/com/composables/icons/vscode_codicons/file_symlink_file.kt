package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileSymlinkFile: ImageVector
    get() {
        if (_FileSymlinkFile != null) return _FileSymlinkFile!!
        
        _FileSymlinkFile = ImageVector.Builder(
            name = "file-symlink-file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                curveTo(3.89543f, 1f, 3f, 1.89543f, 3f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                curveTo(4f, 2.44772f, 4.44772f, 2f, 5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.32843f, 8.67157f, 6f, 9.5f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                curveTo(12f, 13.5523f, 11.5523f, 14f, 11f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                curveTo(12.1046f, 15f, 13f, 14.1046f, 13f, 13f)
                verticalLineTo(5.41421f)
                curveTo(13f, 5.01639f, 12.842f, 4.63486f, 12.5607f, 4.35355f)
                lineTo(9.64645f, 1.43934f)
                curveTo(9.36514f, 1.15804f, 8.98361f, 1f, 8.58579f, 1f)
                horizontalLineTo(5f)
                close()
                moveTo(11.7929f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 5f, 9f, 4.77614f, 9f, 4.5f)
                verticalLineTo(2.20711f)
                lineTo(11.7929f, 5f)
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
        
        return _FileSymlinkFile!!
    }

private var _FileSymlinkFile: ImageVector? = null

