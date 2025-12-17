package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nights_stay: ImageVector
    get() {
        if (_Nights_stay != null) return _Nights_stay!!
        
        _Nights_stay = ImageVector.Builder(
            name = "nights_stay",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.1f, 12.08f)
                            curveToRelative(-2f, -3.88f, -0.92f, -7.36f, 0.07f, -9.27f)
                            curveToRelative(0.19f, -0.36f, -0.12f, -0.77f, -0.53f, -0.72f)
                            curveTo(5.62f, 2.77f, 1.78f, 7.16f, 1.99f, 12.41f)
                            curveToRelative(0.01f, 0f, 0.01f, 0f, 0.01f, 0.01f)
                            curveTo(2.62f, 12.15f, 3.29f, 12f, 4f, 12f)
                            curveToRelative(1.66f, 0f, 3.18f, 0.83f, 4.1f, 2.15f)
                            curveTo(9.77f, 14.63f, 11f, 16.17f, 11f, 18f)
                            curveToRelative(0f, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f)
                            curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f)
                            curveToRelative(3.13f, 0f, 5.92f, -1.44f, 7.76f, -3.69f)
                            curveToRelative(0.26f, -0.32f, 0.04f, -0.79f, -0.37f, -0.82f)
                            curveTo(16.89f, 17.37f, 13.1f, 15.97f, 11.1f, 12.08f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 16f)
                        lineToRelative(-0.18f, 0f)
                        curveTo(6.4f, 14.84f, 5.3f, 14f, 4f, 14f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        curveToRelative(0.62f, 0f, 2.49f, 0f, 3f, 0f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveTo(9f, 16.9f, 8.1f, 16f, 7f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nights_stay!!
    }

private var _Nights_stay: ImageVector? = null

