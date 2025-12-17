package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flip_camera_android: ImageVector
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
                        moveTo(8f, 9f)
                        lineTo(8f, 9f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(5.09f)
                        curveTo(6.47f, 5.61f, 9.05f, 4f, 12f, 4f)
                        curveToRelative(3.49f, 0f, 6.45f, 2.24f, 7.54f, 5.36f)
                        curveTo(19.68f, 9.75f, 20.07f, 10f, 20.48f, 10f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.68f, 0f, 1.18f, -0.67f, 0.96f, -1.31f)
                        curveTo(20.07f, 4.79f, 16.36f, 2f, 12f, 2f)
                        curveTo(8.73f, 2f, 5.82f, 3.58f, 4f, 6.01f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(2.45f, 4f, 2f, 4.45f, 2f, 5f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveTo(7.55f, 10f, 8f, 9.55f, 8f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 15f)
                        lineTo(16f, 15f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1.91f)
                        curveToRelative(-1.38f, 2.39f, -3.96f, 4f, -6.91f, 4f)
                        curveToRelative(-3.49f, 0f, -6.45f, -2.24f, -7.54f, -5.36f)
                        curveTo(4.32f, 14.25f, 3.93f, 14f, 3.52f, 14f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.68f, 0f, -1.18f, 0.67f, -0.96f, 1.31f)
                        curveTo(3.93f, 19.21f, 7.64f, 22f, 12f, 22f)
                        curveToRelative(3.27f, 0f, 6.18f, -1.58f, 8f, -4.01f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveTo(16.45f, 14f, 16f, 14.45f, 16f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flip_camera_android!!
    }

private var _Flip_camera_android: ImageVector? = null

