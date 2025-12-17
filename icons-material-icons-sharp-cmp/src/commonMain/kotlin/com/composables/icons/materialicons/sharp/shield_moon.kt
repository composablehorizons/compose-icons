package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shield_moon: ImageVector
    get() {
        if (_Shield_moon != null) return _Shield_moon!!
        
        _Shield_moon = ImageVector.Builder(
            name = "shield_moon",
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
                    moveTo(12f, 2f)
                    lineTo(4f, 5f)
                    verticalLineToRelative(6.09f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                    verticalLineTo(5f)
                    lineTo(12f, 2f)
                    close()
                    moveTo(15.97f, 14.41f)
                    curveToRelative(-1.84f, 2.17f, -5.21f, 2.1f, -6.96f, -0.07f)
                    curveToRelative(-2.19f, -2.72f, -0.65f, -6.72f, 2.69f, -7.33f)
                    curveToRelative(0.34f, -0.06f, 0.63f, 0.27f, 0.51f, 0.6f)
                    curveToRelative(-0.46f, 1.23f, -0.39f, 2.64f, 0.32f, 3.86f)
                    curveToRelative(0.71f, 1.22f, 1.89f, 1.99f, 3.18f, 2.2f)
                    curveTo(16.05f, 13.72f, 16.2f, 14.14f, 15.97f, 14.41f)
                    close()
                }
            }
        }.build()
        
        return _Shield_moon!!
    }

private var _Shield_moon: ImageVector? = null

