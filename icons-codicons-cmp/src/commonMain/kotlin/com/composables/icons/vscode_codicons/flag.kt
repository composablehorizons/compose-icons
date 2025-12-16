package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(12.0284f)
                lineTo(10.0931f, 5.70938f)
                curveTo(9.96896f, 5.88323f, 9.96896f, 6.11677f, 10.0931f, 6.29062f)
                lineTo(12.0284f, 9f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 10f)
                horizontalLineTo(13f)
                curveTo(13.4067f, 10f, 13.6432f, 9.54032f, 13.4069f, 9.20938f)
                lineTo(11.1145f, 6f)
                lineTo(13.4069f, 2.79062f)
                curveTo(13.6432f, 2.45968f, 13.4067f, 2f, 13f, 2f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(3f, 13.7761f, 3.22386f, 14f, 3.5f, 14f)
                curveTo(3.77614f, 14f, 4f, 13.7761f, 4f, 13.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

