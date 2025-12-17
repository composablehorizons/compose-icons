package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Folder: ImageVector
    get() {
        if (_Folder != null) return _Folder!!
        
        _Folder = ImageVector.Builder(
            name = "folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(1f, 4.5f)
                curveTo(1f, 3.11929f, 2.11929f, 2f, 3.5f, 2f)
                horizontalLineTo(5.58579f)
                curveTo(5.98361f, 2f, 6.36514f, 2.15804f, 6.64645f, 2.43934f)
                lineTo(8.20711f, 4f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 4f, 15f, 5.11929f, 15f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 12.8807f, 13.8807f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 14f, 1f, 12.8807f, 1f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(2f, 7f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.3284f, 2.67157f, 13f, 3.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 13f, 14f, 12.3284f, 14f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.67157f, 13.3284f, 5f, 12.5f, 5f)
                horizontalLineTo(8.20711f)
                lineTo(6.64645f, 6.56066f)
                curveTo(6.36514f, 6.84197f, 5.98361f, 7f, 5.58579f, 7f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

