package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Note: ImageVector
    get() {
        if (_Note != null) return _Note!!
        
        _Note = ImageVector.Builder(
            name = "note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                curveTo(3.11929f, 2f, 2f, 3.11929f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.8807f, 3.11929f, 14f, 4.5f, 14f)
                horizontalLineTo(8.17157f)
                curveTo(8.83461f, 14f, 9.4705f, 13.7366f, 9.93934f, 13.2678f)
                lineTo(13.2678f, 9.93934f)
                curveTo(13.7366f, 9.4705f, 14f, 8.83461f, 14f, 8.17157f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.11929f, 12.8807f, 2f, 11.5f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 3.67157f, 3.67157f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 3f, 13f, 3.67157f, 13f, 4.5f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                curveTo(9.11929f, 8f, 8f, 9.11929f, 8f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(3.67157f, 13f, 3f, 12.3284f, 3f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(9f, 12.7505f)
                verticalLineTo(10.5f)
                curveTo(9f, 9.67157f, 9.67157f, 9f, 10.5f, 9f)
                horizontalLineTo(12.7505f)
                curveTo(12.6955f, 9.08295f, 12.6321f, 9.16082f, 12.5607f, 9.23223f)
                lineTo(9.23223f, 12.5607f)
                curveTo(9.16082f, 12.6321f, 9.08295f, 12.6955f, 9f, 12.7505f)
                close()
            }
        }.build()
        
        return _Note!!
    }

private var _Note: ImageVector? = null

