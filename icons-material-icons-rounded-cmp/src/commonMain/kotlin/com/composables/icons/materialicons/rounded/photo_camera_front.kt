package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_camera_front: ImageVector
    get() {
        if (_Photo_camera_front != null) return _Photo_camera_front!!
        
        _Photo_camera_front = ImageVector.Builder(
            name = "photo_camera_front",
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
                    moveTo(12f, 9f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    curveTo(10f, 9.9f, 10.9f, 9f, 12f, 9f)
                    close()
                    moveTo(16f, 17f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-0.57f)
                    curveToRelative(0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                    curveTo(10.07f, 14.21f, 11.01f, 14f, 12f, 14f)
                    reflectiveCurveToRelative(1.93f, 0.21f, 2.78f, 0.58f)
                    curveTo(15.52f, 14.9f, 16f, 15.62f, 16f, 16.43f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Photo_camera_front!!
    }

private var _Photo_camera_front: ImageVector? = null

