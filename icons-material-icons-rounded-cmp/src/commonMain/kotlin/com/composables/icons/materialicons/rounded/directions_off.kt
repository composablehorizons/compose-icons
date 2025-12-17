package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
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
                            moveTo(21.71f, 11.29f)
                            lineToRelative(-9f, -9f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineTo(8.21f, 5.38f)
                            lineTo(13f, 10.17f)
                            lineToRelative(0f, -2.67f)
                            lineToRelative(3.15f, 3.15f)
                            curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                            lineToRelative(-0.98f, 0.98f)
                            lineToRelative(3.45f, 3.45f)
                            lineToRelative(3.09f, -3.09f)
                            curveTo(22.09f, 12.32f, 22.09f, 11.69f, 21.71f, 11.29f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6.79f, 6.79f)
                            lineTo(3.51f, 3.51f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(0f, 0f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(3.28f, 3.28f)
                            lineToRelative(-3.09f, 3.09f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(9f, 9f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(3.09f, -3.09f)
                            lineToRelative(3.28f, 3.28f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                            lineTo(6.79f, 6.79f)
                            close()
                            moveTo(9.99f, 14f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-3f)
                            curveToRelative(0f, -0.05f, 0.02f, -0.1f, 0.03f, -0.15f)
                            lineToRelative(1.97f, 1.97f)
                            verticalLineTo(14f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

