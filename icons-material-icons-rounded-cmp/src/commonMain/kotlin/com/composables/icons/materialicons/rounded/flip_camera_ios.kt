package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flip_camera_ios: ImageVector
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
                        moveTo(20f, 5f)
                        horizontalLineToRelative(-3.17f)
                        lineToRelative(-1.24f, -1.35f)
                        curveTo(15.22f, 3.24f, 14.68f, 3f, 14.12f, 3f)
                        horizontalLineTo(9.88f)
                        curveToRelative(-0.56f, 0f, -1.1f, 0.24f, -1.48f, 0.65f)
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
                        moveTo(13.67f, 17.7f)
                        curveTo(13.15f, 17.89f, 12.59f, 18f, 12f, 18f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        horizontalLineTo(5f)
                        lineToRelative(2.5f, -2.5f)
                        lineTo(10f, 13f)
                        horizontalLineTo(8f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(0.46f, 0f, 0.91f, -0.08f, 1.32f, -0.23f)
                        curveToRelative(0.19f, -0.07f, 0.39f, -0.03f, 0.53f, 0.11f)
                        curveTo(14.11f, 17.14f, 14.01f, 17.57f, 13.67f, 17.7f)
                        close()
                        moveTo(16.5f, 15.5f)
                        lineTo(14f, 13f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        curveToRelative(-0.46f, 0f, -0.91f, 0.08f, -1.32f, 0.23f)
                        curveToRelative(-0.19f, 0.07f, -0.39f, 0.03f, -0.53f, -0.11f)
                        curveTo(9.89f, 8.86f, 9.99f, 8.43f, 10.33f, 8.3f)
                        curveTo(10.85f, 8.11f, 11.41f, 8f, 12f, 8f)
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

