package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.File: ImageVector
    get() {
        if (_File != null) return _File!!
        
        _File = ImageVector.Builder(
            name = "file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                curveTo(3.89543f, 1f, 3f, 1.89543f, 3f, 3f)
                verticalLineTo(13f)
                curveTo(3f, 14.1046f, 3.89543f, 15f, 5f, 15f)
                horizontalLineTo(11f)
                curveTo(12.1046f, 15f, 13f, 14.1046f, 13f, 13f)
                verticalLineTo(5.41421f)
                curveTo(13f, 5.01639f, 12.842f, 4.63486f, 12.5607f, 4.35355f)
                lineTo(9.64645f, 1.43934f)
                curveTo(9.36514f, 1.15804f, 8.98361f, 1f, 8.58579f, 1f)
                horizontalLineTo(5f)
                close()
                moveTo(4f, 3f)
                curveTo(4f, 2.44772f, 4.44772f, 2f, 5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.32843f, 8.67157f, 6f, 9.5f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                curveTo(12f, 13.5523f, 11.5523f, 14f, 11f, 14f)
                horizontalLineTo(5f)
                curveTo(4.44772f, 14f, 4f, 13.5523f, 4f, 13f)
                verticalLineTo(3f)
                close()
                moveTo(11.7929f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 5f, 9f, 4.77614f, 9f, 4.5f)
                verticalLineTo(2.20711f)
                lineTo(11.7929f, 5f)
                close()
            }
        }.build()
        
        return _File!!
    }

private var _File: ImageVector? = null

