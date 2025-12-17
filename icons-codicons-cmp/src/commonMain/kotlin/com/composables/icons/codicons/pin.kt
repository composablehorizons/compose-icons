package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 3f)
                curveTo(13.303f, 3f, 13.109f, 3.038f, 12.923f, 3.114f)
                lineTo(8.481f, 4.967f)
                lineTo(5.659f, 4.026f)
                curveTo(5.505f, 3.976f, 5.339f, 4.001f, 5.209f, 4.095f)
                curveTo(5.078f, 4.189f, 5.001f, 4.339f, 5.001f, 4.5f)
                verticalLineTo(7f)
                horizontalLineTo(1.257f)
                lineTo(0.5f, 7.5f)
                lineTo(1.257f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(10.5f)
                curveTo(5f, 10.661f, 5.077f, 10.812f, 5.208f, 10.905f)
                curveTo(5.338f, 11f, 5.504f, 11.023f, 5.658f, 10.974f)
                lineTo(8.48f, 10.033f)
                lineTo(12.925f, 11.887f)
                curveTo(13.109f, 11.962f, 13.302f, 12f, 13.499f, 12f)
                curveTo(14.326f, 12f, 14.999f, 11.327f, 14.999f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(14.999f, 3.673f, 14.326f, 3f, 13.499f, 3f)
                horizontalLineTo(13.5f)
                close()
                moveTo(14f, 10.5f)
                curveTo(14f, 10.843f, 13.615f, 11.09f, 13.308f, 10.962f)
                lineTo(8.693f, 9.038f)
                curveTo(8.631f, 9.013f, 8.566f, 9f, 8.501f, 9f)
                curveTo(8.447f, 9f, 8.395f, 9.009f, 8.343f, 9.025f)
                lineTo(6.001f, 9.806f)
                verticalLineTo(5.193f)
                lineTo(8.343f, 5.974f)
                curveTo(8.457f, 6.011f, 8.581f, 6.007f, 8.694f, 5.961f)
                lineTo(13.306f, 4.038f)
                curveTo(13.629f, 3.902f, 14.001f, 4.156f, 14.001f, 4.499f)
                verticalLineTo(10.499f)
                lineTo(14f, 10.5f)
                close()
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

