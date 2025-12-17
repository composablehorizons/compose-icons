package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Project: ImageVector
    get() {
        if (_Project != null) return _Project!!
        
        _Project = ImageVector.Builder(
            name = "project",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0.999512f)
                curveTo(2.34315f, 0.999512f, 1f, 2.34266f, 1f, 3.99951f)
                verticalLineTo(11.9995f)
                curveTo(1f, 13.6564f, 2.34315f, 14.9995f, 4f, 14.9995f)
                horizontalLineTo(12f)
                curveTo(13.6569f, 14.9995f, 15f, 13.6564f, 15f, 11.9995f)
                verticalLineTo(3.99951f)
                curveTo(15f, 2.34266f, 13.6569f, 0.999512f, 12f, 0.999512f)
                horizontalLineTo(4f)
                close()
                moveTo(2f, 3.99951f)
                curveTo(2f, 2.89494f, 2.89543f, 1.99951f, 4f, 1.99951f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 1.99951f, 14f, 2.89494f, 14f, 3.99951f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 4.99951f)
                horizontalLineTo(14f)
                verticalLineTo(11.9995f)
                curveTo(14f, 13.1041f, 13.1046f, 13.9995f, 12f, 13.9995f)
                horizontalLineTo(4f)
                curveTo(2.89543f, 13.9995f, 2f, 13.1041f, 2f, 11.9995f)
                verticalLineTo(4.99951f)
                close()
            }
        }.build()
        
        return _Project!!
    }

private var _Project: ImageVector? = null

