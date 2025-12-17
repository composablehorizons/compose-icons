package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cancel_schedule_send: ImageVector
    get() {
        if (_Cancel_schedule_send != null) return _Cancel_schedule_send!!
        
        _Cancel_schedule_send = ImageVector.Builder(
            name = "cancel_schedule_send",
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
                        moveTo(16.5f, 9f)
                        curveToRelative(-0.42f, 0f, -0.83f, 0.04f, -1.24f, 0.11f)
                        lineTo(2.4f, 3.6f)
                        curveTo(1.74f, 3.31f, 1.01f, 3.8f, 1.01f, 4.51f)
                        lineTo(1f, 9.2f)
                        curveToRelative(0f, 0.47f, 0.33f, 0.88f, 0.78f, 0.98f)
                        lineTo(10f, 12f)
                        lineToRelative(-8.22f, 1.83f)
                        curveTo(1.33f, 13.93f, 1f, 14.33f, 1f, 14.8f)
                        lineToRelative(0.01f, 4.68f)
                        curveToRelative(0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f)
                        lineToRelative(6.68f, -2.86f)
                        curveTo(9.59f, 21.19f, 12.71f, 24f, 16.5f, 24f)
                        curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                        reflectiveCurveTo(20.64f, 9f, 16.5f, 9f)
                        close()
                        moveTo(16.5f, 22f)
                        curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                        reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                        reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                        reflectiveCurveTo(19.53f, 22f, 16.5f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.62f, 14.38f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-1.41f, 1.41f)
                        lineToRelative(-1.41f, -1.41f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(-1.41f, 1.41f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(1.41f, 1.41f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(-1.41f, -1.41f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(18.82f, 14.89f, 18.82f, 14.57f, 18.62f, 14.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cancel_schedule_send!!
    }

private var _Cancel_schedule_send: ImageVector? = null

