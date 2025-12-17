package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Flip_camera_ios: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.83f, 5f)
                        lineTo(15f, 3f)
                        horizontalLineTo(9f)
                        lineTo(7.17f, 5f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(5f)
                        horizontalLineTo(16.83f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        horizontalLineTo(5f)
                        lineToRelative(2.5f, -2.5f)
                        lineTo(10f, 13f)
                        horizontalLineTo(8f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(0.58f, 0f, 1.13f, -0.13f, 1.62f, -0.35f)
                        lineToRelative(0.74f, 0.74f)
                        curveTo(13.65f, 17.76f, 12.86f, 18f, 12f, 18f)
                        close()
                        moveTo(16.5f, 15.5f)
                        lineTo(14f, 13f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        curveToRelative(-0.58f, 0f, -1.13f, 0.13f, -1.62f, 0.35f)
                        lineTo(9.64f, 8.62f)
                        curveTo(10.35f, 8.24f, 11.14f, 8f, 12f, 8f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        horizontalLineToRelative(2f)
                        lineTo(16.5f, 15.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flip_camera_ios!!
    }

private var _Flip_camera_ios: ImageVector? = null

