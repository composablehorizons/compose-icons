package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rotate_90_degrees_cw: ImageVector
    get() {
        if (_Rotate_90_degrees_cw != null) return _Rotate_90_degrees_cw!!
        
        _Rotate_90_degrees_cw = ImageVector.Builder(
            name = "rotate_90_degrees_cw",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.86f, 18.46f)
                        curveToRelative(2.65f, 3.45f, 7.11f, 4.37f, 10.74f, 2.79f)
                        curveToRelative(0.61f, -0.27f, 0.74f, -1.09f, 0.27f, -1.56f)
                        lineToRelative(-0.05f, -0.05f)
                        curveToRelative(-0.29f, -0.29f, -0.72f, -0.35f, -1.1f, -0.19f)
                        curveToRelative(-2.96f, 1.24f, -6.59f, 0.37f, -8.58f, -2.62f)
                        curveToRelative(-1.58f, -2.37f, -1.55f, -5.37f, 0.05f, -7.73f)
                        curveTo(6.6f, 7.03f, 8.8f, 6.03f, 11f, 6.03f)
                        verticalLineToRelative(1.76f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.86f, 0.36f)
                        lineToRelative(2.79f, -2.79f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(-2.8f, -2.79f)
                        curveTo(11.54f, 1.54f, 11f, 1.76f, 11f, 2.21f)
                        verticalLineToRelative(1.8f)
                        curveToRelative(-2.76f, 0f, -5.52f, 1.25f, -7.34f, 3.78f)
                        curveTo(1.38f, 10.96f, 1.46f, 15.37f, 3.86f, 18.46f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.7f, 7.71f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-4.59f, 4.58f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(4.59f, 4.59f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(4.59f, -4.59f)
                            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                            lineTo(17.7f, 7.71f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Rotate_90_degrees_cw!!
    }

private var _Rotate_90_degrees_cw: ImageVector? = null

