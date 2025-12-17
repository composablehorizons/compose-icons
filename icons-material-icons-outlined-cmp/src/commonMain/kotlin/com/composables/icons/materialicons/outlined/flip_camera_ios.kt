package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Flip_camera_ios: ImageVector
    get() {
        if (_Flip_camera_ios != null) return _Flip_camera_ios!!
        
        _Flip_camera_ios = ImageVector.Builder(
            name = "flip_camera_ios",
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
                            moveTo(20f, 5f)
                            horizontalLineToRelative(-3.17f)
                            lineTo(15f, 3f)
                            horizontalLineTo(9f)
                            lineTo(7.17f, 5f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(16f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(7f)
                            curveTo(22f, 5.9f, 21.1f, 5f, 20f, 5f)
                            close()
                            moveTo(20f, 19f)
                            horizontalLineTo(4f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(3.17f)
                            horizontalLineToRelative(0.88f)
                            lineToRelative(0.59f, -0.65f)
                            lineTo(9.88f, 5f)
                            horizontalLineToRelative(4.24f)
                            lineToRelative(1.24f, 1.35f)
                            lineTo(15.95f, 7f)
                            horizontalLineToRelative(0.88f)
                            horizontalLineTo(20f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 17f)
                            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                            horizontalLineToRelative(2f)
                            lineToRelative(-2.5f, -2.5f)
                            lineTo(5f, 13f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                            curveToRelative(0.86f, 0f, 1.65f, -0.24f, 2.36f, -0.62f)
                            lineToRelative(-0.74f, -0.74f)
                            curveTo(13.13f, 16.87f, 12.58f, 17f, 12f, 17f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 8f)
                            curveToRelative(-0.86f, 0f, -1.65f, 0.24f, -2.36f, 0.62f)
                            lineToRelative(0.74f, 0.73f)
                            curveTo(10.87f, 9.13f, 11.42f, 9f, 12f, 9f)
                            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                            horizontalLineToRelative(-2f)
                            lineToRelative(2.5f, 2.5f)
                            lineTo(19f, 13f)
                            horizontalLineToRelative(-2f)
                            curveTo(17f, 10.24f, 14.76f, 8f, 12f, 8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Flip_camera_ios!!
    }

private var _Flip_camera_ios: ImageVector? = null

