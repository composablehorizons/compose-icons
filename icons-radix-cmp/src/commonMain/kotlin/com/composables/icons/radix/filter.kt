package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!
        
        _Filter = ImageVector.Builder(
            name = "filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.60059f, 10.0098f)
                curveTo(9.82855f, 10.0563f, 10f, 10.2583f, 10f, 10.5f)
                curveTo(10f, 10.7417f, 9.82855f, 10.9437f, 9.60059f, 10.9902f)
                lineTo(9.5f, 11f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 11f, 5f, 10.7761f, 5f, 10.5f)
                curveTo(5f, 10.2239f, 5.22386f, 10f, 5.5f, 10f)
                horizontalLineTo(9.5f)
                lineTo(9.60059f, 10.0098f)
                close()
                moveTo(11.6006f, 7.00977f)
                curveTo(11.8286f, 7.05629f, 12f, 7.25829f, 12f, 7.5f)
                curveTo(12f, 7.74171f, 11.8286f, 7.94371f, 11.6006f, 7.99023f)
                lineTo(11.5f, 8f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 8f, 3f, 7.77614f, 3f, 7.5f)
                curveTo(3f, 7.22386f, 3.22386f, 7f, 3.5f, 7f)
                horizontalLineTo(11.5f)
                lineTo(11.6006f, 7.00977f)
                close()
                moveTo(13.5f, 4f)
                curveTo(13.7761f, 4f, 14f, 4.22386f, 14f, 4.5f)
                curveTo(14f, 4.77614f, 13.7761f, 5f, 13.5f, 5f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5f, 1f, 4.77614f, 1f, 4.5f)
                curveTo(1f, 4.22386f, 1.22386f, 4f, 1.5f, 4f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _Filter!!
    }

private var _Filter: ImageVector? = null

