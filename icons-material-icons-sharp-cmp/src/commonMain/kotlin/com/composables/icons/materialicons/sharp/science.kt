package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Science: ImageVector
    get() {
        if (_Science != null) return _Science!!
        
        _Science = ImageVector.Builder(
            name = "science",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.8f, 18.4f)
                    lineTo(14f, 10.67f)
                    verticalLineTo(6.5f)
                    lineToRelative(1.35f, -1.69f)
                    curveTo(15.61f, 4.48f, 15.38f, 4f, 14.96f, 4f)
                    horizontalLineTo(9.04f)
                    curveTo(8.62f, 4f, 8.39f, 4.48f, 8.65f, 4.81f)
                    lineTo(10f, 6.5f)
                    verticalLineToRelative(4.17f)
                    lineTo(4.2f, 18.4f)
                    curveTo(3.71f, 19.06f, 4.18f, 20f, 5f, 20f)
                    horizontalLineToRelative(14f)
                    curveTo(19.82f, 20f, 20.29f, 19.06f, 19.8f, 18.4f)
                    close()
                }
            }
        }.build()
        
        return _Science!!
    }

private var _Science: ImageVector? = null

