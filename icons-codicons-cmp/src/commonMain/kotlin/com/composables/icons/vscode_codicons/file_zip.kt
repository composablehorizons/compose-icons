package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileZip: ImageVector
    get() {
        if (_FileZip != null) return _FileZip!!
        
        _FileZip = ImageVector.Builder(
            name = "file-zip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                verticalLineTo(4.5f)
                curveTo(2f, 3.67157f, 2.67157f, 3f, 3.5f, 3f)
                horizontalLineTo(5.58579f)
                curveTo(5.71839f, 3f, 5.84557f, 3.05268f, 5.93934f, 3.14645f)
                lineTo(7.29289f, 4.5f)
                lineTo(5.93934f, 5.85355f)
                curveTo(5.84557f, 5.94732f, 5.71839f, 6f, 5.58579f, 6f)
                horizontalLineTo(2f)
                close()
                moveTo(3.5f, 2f)
                curveTo(2.11929f, 2f, 1f, 3.11929f, 1f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(1f, 12.8807f, 2.11929f, 14f, 3.5f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 14f, 15f, 12.8807f, 15f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(15f, 5.11929f, 13.8807f, 4f, 12.5f, 4f)
                horizontalLineTo(8.20711f)
                lineTo(6.64645f, 2.43934f)
                curveTo(6.36514f, 2.15804f, 5.98361f, 2f, 5.58579f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(9f, 5f)
                verticalLineTo(7.5f)
                curveTo(9f, 7.77614f, 9.22386f, 8f, 9.5f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 9f, 9f, 9.22386f, 9f, 9.5f)
                curveTo(9f, 9.77614f, 9.22386f, 10f, 9.5f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 11f, 9f, 11.2239f, 9f, 11.5f)
                curveTo(9f, 11.7761f, 9.22386f, 12f, 9.5f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 13f, 2f, 12.3284f, 2f, 11.5f)
                verticalLineTo(7f)
                horizontalLineTo(5.58579f)
                curveTo(5.98361f, 7f, 6.36514f, 6.84197f, 6.64645f, 6.56066f)
                lineTo(8.20711f, 5f)
                horizontalLineTo(9f)
                close()
                moveTo(11f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 11f, 12f, 10.7761f, 12f, 10.5f)
                curveTo(12f, 10.2239f, 11.7761f, 10f, 11.5f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 8f, 12f, 7.77614f, 12f, 7.5f)
                verticalLineTo(5f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 5f, 14f, 5.67157f, 14f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.3284f, 13.3284f, 13f, 12.5f, 13f)
                horizontalLineTo(11f)
                close()
                moveTo(11f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _FileZip!!
    }

private var _FileZip: ImageVector? = null

