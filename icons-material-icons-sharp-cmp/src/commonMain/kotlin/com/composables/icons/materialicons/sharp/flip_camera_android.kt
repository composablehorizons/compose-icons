package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Flip_camera_android: ImageVector
    get() {
        if (_Flip_camera_android != null) return _Flip_camera_android!!
        
        _Flip_camera_android = ImageVector.Builder(
            name = "flip_camera_android",
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
                        moveTo(9f, 12f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                        reflectiveCurveTo(9f, 10.34f, 9f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 10f)
                        verticalLineTo(8f)
                        horizontalLineTo(5.09f)
                        curveTo(6.47f, 5.61f, 9.05f, 4f, 12f, 4f)
                        curveToRelative(3.72f, 0f, 6.85f, 2.56f, 7.74f, 6f)
                        horizontalLineToRelative(2.06f)
                        curveToRelative(-0.93f, -4.56f, -4.96f, -8f, -9.8f, -8f)
                        curveTo(8.73f, 2f, 5.82f, 3.58f, 4f, 6.01f)
                        verticalLineTo(4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 14f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2.91f)
                        curveToRelative(-1.38f, 2.39f, -3.96f, 4f, -6.91f, 4f)
                        curveToRelative(-3.72f, 0f, -6.85f, -2.56f, -7.74f, -6f)
                        horizontalLineTo(2.2f)
                        curveToRelative(0.93f, 4.56f, 4.96f, 8f, 9.8f, 8f)
                        curveToRelative(3.27f, 0f, 6.18f, -1.58f, 8f, -4.01f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flip_camera_android!!
    }

private var _Flip_camera_android: ImageVector? = null

