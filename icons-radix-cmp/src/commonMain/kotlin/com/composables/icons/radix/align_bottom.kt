package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) return _AlignBottom!!
        
        _AlignBottom = ImageVector.Builder(
            name = "align-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveTo(8.55228f, 2f, 9f, 2.44772f, 9f, 3f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 14f, 14f, 14.2239f, 14f, 14.5f)
                curveTo(14f, 14.7761f, 13.7761f, 15f, 13.5f, 15f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 15f, 1f, 14.7761f, 1f, 14.5f)
                curveTo(1f, 14.2239f, 1.22386f, 14f, 1.5f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                curveTo(6f, 2.44772f, 6.44772f, 2f, 7f, 2f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _AlignBottom!!
    }

private var _AlignBottom: ImageVector? = null

