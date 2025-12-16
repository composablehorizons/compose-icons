package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChromeRestore: ImageVector
    get() {
        if (_ChromeRestore != null) return _ChromeRestore!!
        
        _ChromeRestore = ImageVector.Builder(
            name = "chrome-restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.08496f, 4f)
                curveTo(5.29088f, 3.4174f, 5.8465f, 3f, 6.49961f, 3f)
                horizontalLineTo(9.99961f)
                curveTo(11.6565f, 3f, 12.9996f, 4.34315f, 12.9996f, 6f)
                verticalLineTo(9.5f)
                curveTo(12.9996f, 10.1531f, 12.5822f, 10.7087f, 11.9996f, 10.9146f)
                verticalLineTo(6f)
                curveTo(11.9996f, 4.89543f, 11.1042f, 4f, 9.99961f, 4f)
                horizontalLineTo(5.08496f)
                close()
                moveTo(4.5f, 5f)
                horizontalLineTo(9.5f)
                curveTo(10.3284f, 5f, 11f, 5.67157f, 11f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(11f, 12.3284f, 10.3284f, 13f, 9.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(3.67157f, 13f, 3f, 12.3284f, 3f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(3f, 5.67157f, 3.67157f, 5f, 4.5f, 5f)
                close()
                moveTo(4.5f, 6f)
                curveTo(4.22386f, 6f, 4f, 6.22386f, 4f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.7761f, 4.22386f, 12f, 4.5f, 12f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 12f, 10f, 11.7761f, 10f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(10f, 6.22386f, 9.77614f, 6f, 9.5f, 6f)
                horizontalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _ChromeRestore!!
    }

private var _ChromeRestore: ImageVector? = null

