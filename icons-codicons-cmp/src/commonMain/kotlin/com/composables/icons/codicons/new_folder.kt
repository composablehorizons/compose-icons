package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.NewFolder: ImageVector
    get() {
        if (_NewFolder != null) return _NewFolder!!
        
        _NewFolder = ImageVector.Builder(
            name = "new-folder",
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
                verticalLineTo(7.25716f)
                curveTo(14.6929f, 7.00353f, 14.3578f, 6.78261f, 14f, 6.59971f)
                verticalLineTo(6.5f)
                curveTo(14f, 5.67157f, 13.3284f, 5f, 12.5f, 5f)
                horizontalLineTo(8.20711f)
                lineTo(6.64645f, 6.56066f)
                curveTo(6.36514f, 6.84197f, 5.98361f, 7f, 5.58579f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.3284f, 2.67157f, 13f, 3.5f, 13f)
                horizontalLineTo(6.20703f)
                curveTo(6.30564f, 13.3486f, 6.43777f, 13.6832f, 6.59971f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 14f, 1f, 12.8807f, 1f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(16f, 11.5f)
                curveTo(16f, 13.9853f, 13.9853f, 16f, 11.5f, 16f)
                curveTo(9.01472f, 16f, 7f, 13.9853f, 7f, 11.5f)
                curveTo(7f, 9.01472f, 9.01472f, 7f, 11.5f, 7f)
                curveTo(13.9853f, 7f, 16f, 9.01472f, 16f, 11.5f)
                close()
                moveTo(12f, 9f)
                curveTo(12f, 8.72386f, 11.7761f, 8.5f, 11.5f, 8.5f)
                curveTo(11.2239f, 8.5f, 11f, 8.72386f, 11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                curveTo(8.72386f, 11f, 8.5f, 11.2239f, 8.5f, 11.5f)
                curveTo(8.5f, 11.7761f, 8.72386f, 12f, 9f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                curveTo(11f, 14.2761f, 11.2239f, 14.5f, 11.5f, 14.5f)
                curveTo(11.7761f, 14.5f, 12f, 14.2761f, 12f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                curveTo(14.2761f, 12f, 14.5f, 11.7761f, 14.5f, 11.5f)
                curveTo(14.5f, 11.2239f, 14.2761f, 11f, 14f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _NewFolder!!
    }

private var _NewFolder: ImageVector? = null

