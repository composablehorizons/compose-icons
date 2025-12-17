package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Video_camera_back: ImageVector
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
                    lineToRelative(3.15f, 3.13f)
                    curveTo(21.46f, 16.97f, 22f, 16.74f, 22f, 16.3f)
                    verticalLineTo(7.7f)
                    curveToRelative(0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f)
                    lineTo(18f, 10.48f)
                    close()
                    moveTo(5.6f, 15.2f)
                    lineToRelative(1.38f, -1.83f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineTo(9f, 15f)
                    lineToRelative(2.23f, -2.97f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineToRelative(2.38f, 3.17f)
                    curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                    horizontalLineTo(6f)
                    curveTo(5.59f, 16f, 5.35f, 15.53f, 5.6f, 15.2f)
                    close()
                }
            }
        }.build()
        
        return _Video_camera_back!!
    }

private var _Video_camera_back: ImageVector? = null

