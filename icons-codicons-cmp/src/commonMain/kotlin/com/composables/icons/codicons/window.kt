package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Window: ImageVector
    get() {
        if (_Window != null) return _Window!!
        
        _Window = ImageVector.Builder(
            name = "window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1f)
                curveTo(2.34315f, 1f, 1f, 2.34315f, 1f, 4f)
                verticalLineTo(12f)
                curveTo(1f, 13.6569f, 2.34315f, 15f, 4f, 15f)
                horizontalLineTo(12f)
                curveTo(13.6569f, 15f, 15f, 13.6569f, 15f, 12f)
                verticalLineTo(4f)
                curveTo(15f, 2.34315f, 13.6569f, 1f, 12f, 1f)
                horizontalLineTo(4f)
                close()
                moveTo(2f, 4f)
                curveTo(2f, 2.89543f, 2.89543f, 2f, 4f, 2f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 2f, 14f, 2.89543f, 14f, 4f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                curveTo(14f, 13.1046f, 13.1046f, 14f, 12f, 14f)
                horizontalLineTo(4f)
                curveTo(2.89543f, 14f, 2f, 13.1046f, 2f, 12f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Window!!
    }

private var _Window: ImageVector? = null

