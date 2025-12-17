package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Comment: ImageVector
    get() {
        if (_Comment != null) return _Comment!!
        
        _Comment = ImageVector.Builder(
            name = "comment",
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
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 2f, 15f, 3.11929f, 15f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(15f, 10.8807f, 13.8807f, 12f, 12.5f, 12f)
                horizontalLineTo(8.68787f)
                lineTo(5.62533f, 14.6797f)
                curveTo(4.99168f, 15.2342f, 4f, 14.7842f, 4f, 13.9422f)
                verticalLineTo(12f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 12f, 1f, 10.8807f, 1f, 9.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(3.5f, 3f)
                curveTo(2.67157f, 3f, 2f, 3.67157f, 2f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 10.3284f, 2.67157f, 11f, 3.5f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13.8981f)
                lineTo(8.31213f, 11f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 11f, 14f, 10.3284f, 14f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.67157f, 13.3284f, 3f, 12.5f, 3f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _Comment!!
    }

private var _Comment: ImageVector? = null

