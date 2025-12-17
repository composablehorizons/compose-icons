package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
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
                    moveTo(10.67f, 21f)
                    lineTo(10.67f, 21f)
                    curveToRelative(-0.35f, 0f, -0.62f, -0.31f, -0.57f, -0.66f)
                    lineTo(11f, 14f)
                    horizontalLineTo(7.5f)
                    curveToRelative(-0.88f, 0f, -0.33f, -0.75f, -0.31f, -0.78f)
                    curveToRelative(1.26f, -2.23f, 3.15f, -5.53f, 5.65f, -9.93f)
                    curveToRelative(0.1f, -0.18f, 0.3f, -0.29f, 0.5f, -0.29f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.35f, 0f, 0.62f, 0.31f, 0.57f, 0.66f)
                    lineTo(13.01f, 10f)
                    horizontalLineToRelative(3.51f)
                    curveToRelative(0.4f, 0f, 0.62f, 0.19f, 0.4f, 0.66f)
                    curveToRelative(-3.29f, 5.74f, -5.2f, 9.09f, -5.75f, 10.05f)
                    curveTo(11.07f, 20.89f, 10.88f, 21f, 10.67f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

