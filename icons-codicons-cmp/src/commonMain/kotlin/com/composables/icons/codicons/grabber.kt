package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Grabber: ImageVector
    get() {
        if (_Grabber != null) return _Grabber!!
        
        _Grabber = ImageVector.Builder(
            name = "grabber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 9f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 9f, 14f, 9.22386f, 14f, 9.5f)
                curveTo(14f, 9.74546f, 13.8231f, 9.94961f, 13.5899f, 9.99194f)
                lineTo(13.5f, 10f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 10f, 2f, 9.77614f, 2f, 9.5f)
                curveTo(2f, 9.25454f, 2.17688f, 9.05039f, 2.41012f, 9.00806f)
                lineTo(2.5f, 9f)
                horizontalLineTo(13.5f)
                horizontalLineTo(2.5f)
                close()
                moveTo(2.5f, 6f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 6f, 14f, 6.22386f, 14f, 6.5f)
                curveTo(14f, 6.74546f, 13.8231f, 6.94961f, 13.5899f, 6.99194f)
                lineTo(13.5f, 7f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 7f, 2f, 6.77614f, 2f, 6.5f)
                curveTo(2f, 6.25454f, 2.17688f, 6.05039f, 2.41012f, 6.00806f)
                lineTo(2.5f, 6f)
                horizontalLineTo(13.5f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _Grabber!!
    }

private var _Grabber: ImageVector? = null

