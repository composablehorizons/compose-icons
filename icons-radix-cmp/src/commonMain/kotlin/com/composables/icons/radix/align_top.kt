package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignTop: ImageVector
    get() {
        if (_AlignTop != null) return _AlignTop!!
        
        _AlignTop = ImageVector.Builder(
            name = "align-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 7.62939E-6f)
                curveTo(13.7761f, 7.82267E-6f, 14f, 0.223865f, 14f, 0.500008f)
                curveTo(14f, 0.77615f, 13.7761f, 1.00001f, 13.5f, 1.00001f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                curveTo(9f, 12.5523f, 8.55228f, 13f, 8f, 13f)
                horizontalLineTo(7f)
                curveTo(6.44772f, 13f, 6f, 12.5523f, 6f, 12f)
                verticalLineTo(1.00001f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 1.00001f, 1f, 0.77615f, 1f, 0.500008f)
                curveTo(1f, 0.223865f, 1.22386f, 7.63946E-6f, 1.5f, 7.62939E-6f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _AlignTop!!
    }

private var _AlignTop: ImageVector? = null

