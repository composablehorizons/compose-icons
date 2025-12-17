package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rotate_90_degrees_cw: ImageVector
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
            }
            group {
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4.64f, 19.37f)
                            curveToRelative(3.03f, 3.03f, 7.67f, 3.44f, 11.15f, 1.25f)
                            lineToRelative(-1.46f, -1.46f)
                            curveToRelative(-2.66f, 1.43f, -6.04f, 1.03f, -8.28f, -1.21f)
                            curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                            curveTo(7.42f, 6.69f, 9.21f, 6.03f, 11f, 6.03f)
                            verticalLineTo(9f)
                            lineToRelative(4f, -4f)
                            lineToRelative(-4f, -4f)
                            verticalLineToRelative(3.01f)
                            curveToRelative(-2.3f, 0f, -4.61f, 0.87f, -6.36f, 2.63f)
                            curveTo(1.12f, 10.15f, 1.12f, 15.85f, 4.64f, 19.37f)
                            close()
                            moveTo(11f, 13f)
                            lineToRelative(6f, 6f)
                            lineToRelative(6f, -6f)
                            lineToRelative(-6f, -6f)
                            lineTo(11f, 13f)
                            close()
                            moveTo(17f, 16.17f)
                            lineTo(13.83f, 13f)
                            lineTo(17f, 9.83f)
                            lineTo(20.17f, 13f)
                            lineTo(17f, 16.17f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13.817249f, 12.994499f)
                            lineTo(16.992128f, 9.81962f)
                            lineTo(20.167006f, 12.994499f)
                            lineTo(16.992128f, 16.169378f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Rotate_90_degrees_cw!!
    }

private var _Rotate_90_degrees_cw: ImageVector? = null

