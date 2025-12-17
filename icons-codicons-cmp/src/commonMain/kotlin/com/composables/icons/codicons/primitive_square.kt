package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PrimitiveSquare: ImageVector
    get() {
        if (_PrimitiveSquare != null) return _PrimitiveSquare!!
        
        _PrimitiveSquare = ImageVector.Builder(
            name = "primitive-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 5f)
                curveTo(5.22386f, 5f, 5f, 5.22386f, 5f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(5f, 10.7761f, 5.22386f, 11f, 5.5f, 11f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 11f, 11f, 10.7761f, 11f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(11f, 5.22386f, 10.7761f, 5f, 10.5f, 5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(4f, 5.5f)
                curveTo(4f, 4.67157f, 4.67157f, 4f, 5.5f, 4f)
                horizontalLineTo(10.5f)
                curveTo(11.3284f, 4f, 12f, 4.67157f, 12f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(12f, 11.3284f, 11.3284f, 12f, 10.5f, 12f)
                horizontalLineTo(5.5f)
                curveTo(4.67157f, 12f, 4f, 11.3284f, 4f, 10.5f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _PrimitiveSquare!!
    }

private var _PrimitiveSquare: ImageVector? = null

