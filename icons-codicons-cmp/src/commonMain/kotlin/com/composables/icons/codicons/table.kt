package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Table: ImageVector
    get() {
        if (_Table != null) return _Table!!
        
        _Table = ImageVector.Builder(
            name = "table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                curveTo(1f, 2.11929f, 2.11929f, 1f, 3.5f, 1f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 1f, 15f, 2.11929f, 15f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(15f, 13.8807f, 13.8807f, 15f, 12.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 15f, 1f, 13.8807f, 1f, 12.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(6f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                lineTo(6f, 11f)
                verticalLineTo(14f)
                close()
                moveTo(5f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.3284f, 2.67157f, 14f, 3.5f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                close()
                moveTo(6f, 10f)
                lineTo(10f, 10f)
                verticalLineTo(6f)
                lineTo(6f, 6f)
                verticalLineTo(10f)
                close()
                moveTo(5f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
                moveTo(6f, 5f)
                lineTo(10f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 2f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 2f, 2f, 2.67157f, 2f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
                moveTo(14f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                close()
                moveTo(14f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 14f, 14f, 13.3284f, 14f, 12.5f)
                verticalLineTo(11f)
                close()
                moveTo(14f, 5f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.67157f, 13.3284f, 2f, 12.5f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        
        return _Table!!
    }

private var _Table: ImageVector? = null

