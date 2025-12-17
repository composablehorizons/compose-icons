package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Shield_moon: ImageVector
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
                        moveTo(18f, 11.09f)
                        curveToRelative(0f, 4f, -2.55f, 7.7f, -6f, 8.83f)
                        curveToRelative(-3.45f, -1.13f, -6f, -4.82f, -6f, -8.83f)
                        verticalLineToRelative(-4.7f)
                        lineToRelative(6f, -2.25f)
                        lineToRelative(6f, 2.25f)
                        verticalLineTo(11.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.01f, 14.33f)
                        curveToRelative(1.75f, 2.17f, 5.12f, 2.24f, 6.96f, 0.07f)
                        curveToRelative(0.23f, -0.27f, 0.08f, -0.68f, -0.26f, -0.74f)
                        curveToRelative(-1.29f, -0.21f, -2.48f, -0.98f, -3.18f, -2.2f)
                        curveToRelative(-0.71f, -1.22f, -0.78f, -2.63f, -0.32f, -3.86f)
                        curveToRelative(0.12f, -0.33f, -0.16f, -0.66f, -0.51f, -0.6f)
                        curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.01f, 14.33f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Shield_moon!!
    }

private var _Shield_moon: ImageVector? = null

