package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Mobile: ImageVector
    get() {
        if (_Mobile != null) return _Mobile!!
        
        _Mobile = ImageVector.Builder(
            name = "mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                curveTo(11.3284f, 1f, 12f, 1.67157f, 12f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(12f, 13.3284f, 11.3284f, 14f, 10.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.67157f, 14f, 3f, 13.3284f, 3f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(3f, 1.67157f, 3.67157f, 1f, 4.5f, 1f)
                horizontalLineTo(10.5f)
                close()
                moveTo(4.5f, 2f)
                curveTo(4.22386f, 2f, 4f, 2.22386f, 4f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(4f, 12.7761f, 4.22386f, 13f, 4.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 13f, 11f, 12.7761f, 11f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(11f, 2.22386f, 10.7761f, 2f, 10.5f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveTo(9.07031f, 11.6572f)
                curveTo(9.2299f, 11.6898f, 9.34961f, 11.8308f, 9.34961f, 12f)
                curveTo(9.34961f, 12.1692f, 9.2299f, 12.3102f, 9.07031f, 12.3428f)
                lineTo(9f, 12.3496f)
                horizontalLineTo(6f)
                curveTo(5.8067f, 12.3496f, 5.65039f, 12.1933f, 5.65039f, 12f)
                curveTo(5.65039f, 11.8067f, 5.8067f, 11.6504f, 6f, 11.6504f)
                horizontalLineTo(9f)
                lineTo(9.07031f, 11.6572f)
                close()
            }
        }.build()
        
        return _Mobile!!
    }

private var _Mobile: ImageVector? = null

