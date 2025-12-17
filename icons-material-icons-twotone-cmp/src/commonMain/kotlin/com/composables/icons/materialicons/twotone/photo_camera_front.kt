package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Photo_camera_front: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.95f, 7f)
                        lineToRelative(-1.83f, -2f)
                        horizontalLineTo(9.88f)
                        lineTo(8.05f, 7f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(7f)
                        horizontalLineTo(15.95f)
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
                        horizontalLineToRelative(4.05f)
                        lineToRelative(1.83f, -2f)
                        horizontalLineToRelative(4.24f)
                        lineToRelative(1.83f, 2f)
                        horizontalLineTo(20f)
                        verticalLineTo(19f)
                        close()
                        moveTo(12f, 13f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        curveTo(10f, 12.1f, 10.9f, 13f, 12f, 13f)
                        close()
                        moveTo(14.78f, 14.58f)
                        curveTo(13.93f, 14.21f, 12.99f, 14f, 12f, 14f)
                        reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                        curveTo(8.48f, 14.9f, 8f, 15.62f, 8f, 16.43f)
                        verticalLineTo(17f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-0.57f)
                        curveTo(16f, 15.62f, 15.52f, 14.9f, 14.78f, 14.58f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Photo_camera_front!!
    }

private var _Photo_camera_front: ImageVector? = null

