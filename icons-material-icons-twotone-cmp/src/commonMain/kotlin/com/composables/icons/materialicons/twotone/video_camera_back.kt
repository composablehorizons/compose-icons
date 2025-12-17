package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Video_camera_back: ImageVector
    get() {
        if (_Video_camera_back != null) return _Video_camera_back!!
        
        _Video_camera_back = ImageVector.Builder(
            name = "video_camera_back",
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
                        moveTo(4f, 18f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(6f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                        moveTo(7.38f, 12.83f)
                        lineTo(9f, 15f)
                        lineToRelative(2.62f, -3.5f)
                        lineTo(15f, 16f)
                        horizontalLineTo(5f)
                        lineTo(7.38f, 12.83f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.62f, 11.5f)
                        lineTo(9f, 15f)
                        lineTo(7.38f, 12.83f)
                        lineTo(5f, 16f)
                        lineTo(15f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 10.48f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4.48f)
                        lineToRelative(4f, 3.98f)
                        verticalLineToRelative(-11f)
                        lineTo(18f, 10.48f)
                        close()
                        moveTo(16f, 18f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Video_camera_back!!
    }

private var _Video_camera_back: ImageVector? = null

