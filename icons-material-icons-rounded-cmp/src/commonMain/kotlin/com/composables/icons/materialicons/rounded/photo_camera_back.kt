package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_camera_back: ImageVector
    get() {
        if (_Photo_camera_back != null) return _Photo_camera_back!!
        
        _Photo_camera_back = ImageVector.Builder(
            name = "photo_camera_back",
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
                    moveTo(20f, 5f)
                    horizontalLineToRelative(-3.17f)
                    lineToRelative(-1.24f, -1.35f)
                    curveTo(15.22f, 3.24f, 14.68f, 3f, 14.12f, 3f)
                    horizontalLineTo(9.88f)
                    curveTo(9.32f, 3f, 8.78f, 3.24f, 8.41f, 3.65f)
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
                    moveTo(17f, 17f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.41f, 0f, -0.65f, -0.47f, -0.4f, -0.8f)
                    lineToRelative(2f, -2.67f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineTo(11.25f, 16f)
                    lineToRelative(2.6f, -3.47f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineToRelative(2.75f, 3.67f)
                    curveTo(17.65f, 16.53f, 17.41f, 17f, 17f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Photo_camera_back!!
    }

private var _Photo_camera_back: ImageVector? = null

