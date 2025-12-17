package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Details: ImageVector
    get() {
        if (_Details != null) return _Details!!
        
        _Details = ImageVector.Builder(
            name = "details",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.13f, 4.57f)
                lineToRelative(-8.3f, 14.94f)
                curveTo(2.46f, 20.18f, 2.94f, 21f, 3.7f, 21f)
                horizontalLineToRelative(16.6f)
                curveToRelative(0.76f, 0f, 1.24f, -0.82f, 0.87f, -1.49f)
                lineToRelative(-8.3f, -14.94f)
                curveTo(12.49f, 3.89f, 11.51f, 3.89f, 11.13f, 4.57f)
                close()
                moveTo(13f, 8.92f)
                lineTo(18.6f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(8.92f)
                close()
                moveTo(11f, 8.92f)
                verticalLineTo(19f)
                horizontalLineTo(5.4f)
                lineTo(11f, 8.92f)
                close()
            }
            group {
                group {
                    group {
                    }
                }
            }
        }.build()
        
        return _Details!!
    }

private var _Details: ImageVector? = null

