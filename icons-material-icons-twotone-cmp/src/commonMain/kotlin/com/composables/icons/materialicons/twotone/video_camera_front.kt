package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Video_camera_front: ImageVector
    get() {
        if (_Video_camera_front != null) return _Video_camera_front!!
        
        _Video_camera_front = ImageVector.Builder(
            name = "video_camera_front",
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
                        moveTo(10f, 12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        reflectiveCurveTo(8.9f, 12f, 10f, 12f)
                        close()
                        moveTo(14f, 15.43f)
                        curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                        curveTo(11.93f, 13.21f, 10.99f, 13f, 10f, 13f)
                        curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                        curveTo(6.48f, 13.9f, 6f, 14.62f, 6f, 15.43f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(15.43f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 18f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(9.69f)
                        verticalLineTo(6f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                        moveTo(10f, 8f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        reflectiveCurveTo(8.9f, 8f, 10f, 8f)
                        close()
                        moveTo(6f, 15.43f)
                        curveToRelative(0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                        curveTo(8.07f, 13.21f, 9.01f, 13f, 10f, 13f)
                        curveToRelative(0.99f, 0f, 1.93f, 0.21f, 2.78f, 0.58f)
                        curveTo(13.52f, 13.9f, 14f, 14.62f, 14f, 15.43f)
                        verticalLineTo(16f)
                        horizontalLineTo(6f)
                        verticalLineTo(15.43f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Video_camera_front!!
    }

private var _Video_camera_front: ImageVector? = null

